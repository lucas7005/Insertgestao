/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Telas.gerais.ConfigBanco;
import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDialog;
import javax.swing.JOptionPane;



/**
 * @author Lucas Borim
 */
public class ComandosBanco {
       
    //Dados para conexão com o banco de dados
    private static Connection conn;
    private static Statement stmt;
    private static ResultSet rs;
    private static String url;// = "jdbc:mysql://localhost:3306/insertgv";
    private static String user;// = "root";
    private static String password ;// = "123456";
    private static String driver = "com.mysql.jdbc.Driver";
    private boolean verificador = false;
    private static String branco = null;
    private static List<String> strList = new ArrayList<String>();
    PreparedStatement pstmt; 
    
    
    /**Preenche o jCombo box com os dados do banco com os códigos de usuário */
    public static List<String> getStrList() {
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(ComandosBanco.getUrl(), ComandosBanco.getUser(), ComandosBanco.getPassword());
            PreparedStatement pstmts = conn.prepareStatement("select id, usuario from tb_cadastro");
            rs = pstmts.executeQuery();
            strList.add(0, "Escolher");
            
            while(rs.next()){
                   strList.add(rs.getString("id") +" - "+ rs.getString("usuario"));
            }
        
            
            
        } catch (SQLException ex) {
            Logger.getLogger(ComandosBanco.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ComandosBanco.class.getName()).log(Level.SEVERE, null, ex);
        }
              
        
        return strList;
    }
    
    public static String getBranco() {
        branco = "";
        return branco;
    }
    
    //Desemcripta o endereço do banco de dados
    public static String getUrl() {
        
        try {
            Criptografia cripto = new Criptografia();
            FileReader arq = new FileReader(ConfigBanco.getCaminho());
            BufferedReader lerArq = new BufferedReader(arq);
            String ler = lerArq.readLine();
            url = cripto.desencripta(ler);
            
        } catch (Exception e) {
            
        }
       
        return url;
    }
    
    //Desemcripta o usuario do banco de dados
    public static String getUser() {
        int i = 0;
        try {
            Criptografia cripto = new Criptografia();
            FileReader arq = new FileReader(ConfigBanco.getCaminho());
            BufferedReader lerArq = new BufferedReader(arq);
            String ler = lerArq.readLine();
            
            while((ler = lerArq.readLine()) != null){
                
                i++;
                
                if(i == 1){
                    
                url = cripto.desencripta(ler);
                break;
                    
                }
                
            }
            
            
            
            
        } catch (Exception e) {
            
        }
                       
        return url;
    }
    
    //Desemcripta a senha do banco de dados
    public static String getPassword() {
        int i = 0;//Contador 
        try {
            Criptografia cripto = new Criptografia();
            FileReader arq = new FileReader(ConfigBanco.getCaminho());
            BufferedReader lerArq = new BufferedReader(arq);
            String ler = lerArq.readLine();
            
            while((ler = lerArq.readLine()) != null){
                i++;
                
                if(i == 2){
                    
                password = cripto.desencripta(ler);
                break;
                    
                }
                
            }
            
                     
        } catch (Exception e) {
            
        }
        
        return password;
    }
    

    
    /**Algoritmo para fazer a verificação do login*/
    public String login(String usuario, String senha) {  
        String tipo = "null"; 
        
        try{
            //Faz a conexão com o banco
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(ComandosBanco.getUrl(), ComandosBanco.getUser(), ComandosBanco.getPassword());
            String sql = "select usuario, senha, situacao, tipo from tb_cadastro where usuario = '"+usuario+"' ";
            pstmt = conn.prepareStatement(sql);
            rs = pstmt.executeQuery();
            
            while(rs.next()) {
                    int verificadorsituacao = rs.getInt("situacao"); //Busca no banco a situação do usuário

                    //Faz a verificação se o usuário está ativo
                    if (verificadorsituacao < 1){
                        JOptionPane.showMessageDialog(null, "Usuário Inativo");
                        tipo = "inativo";
                        break;                    
                        
                    } else{ //Verifica se a Senha está correta
                        
                        if(senha.equals(rs.getString("senha"))){
                            //System.out.println("Login relizado");
                            tipo = rs.getString("tipo");
                        } else{
                            JOptionPane.showMessageDialog(null, "Senha Incorreta");
                            tipo = "Senha incorreta";

                        }
                    }
                                 
            } 
            //Condição para usuário não encontrado no banco
            if(tipo.equals("null")){
            JOptionPane.showMessageDialog(null, "Usuário não encontrado"); 
            }
                     
        }

            catch (Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
            //e.printStackTrace();
        }   
        
            finally{
                if (conn != null){  
                    try {  
                        conn.close();  
                    
                    }         
                    catch (SQLException e1) {  
                    
                        System.out.print(e1.getStackTrace());  
                    
                    }  
                }  
            }  
        
        return tipo;
    }

    /** cria novo usuario*/
    public boolean novoUsuario(String nome, String email, int tipo, String responsavel, String cpf, boolean situacao, String usuario, String senha, String usuariocriacao) {  
        
        int situacao1 = 0;
        
        //Verifica  a situação do check que avalia se o cliente está com status ativo ou não
        if(situacao){
           situacao1 = 1; 
        }else{
           situacao1 = 0; 
        }

         try{
            //Faz a conexão com o banco
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(ComandosBanco.getUrl(), ComandosBanco.getUser(), ComandosBanco.getPassword());
            PreparedStatement pstmt;    
            //stmt = conn.createStatement();
            
            //Insere os dados no banco    
            pstmt = conn.prepareStatement("insert into tb_cadastro (nome, email, tipo, responsavel, cpf, situacao, usuario, senha, usuariocriacao, datacriacao) values(?,?,?,?,?,?,?,?,?,?)");
            pstmt.setString(1,nome);
            pstmt.setString(2,email);
            pstmt.setInt(3,tipo);
            pstmt.setString(4,responsavel);
            pstmt.setString(5,cpf);
            pstmt.setInt(6,situacao1);
            pstmt.setString(7,usuario);
            pstmt.setString(8,senha);
            pstmt.setString(9,usuariocriacao);
            pstmt.setString(10,ComandosGerais.formatoDataBanco.format(ComandosGerais.getDatas()));
            pstmt.execute();   


            //Cria tela de confirmação
            JOptionPane op = new JOptionPane("Usuario inserido com sucesso",JOptionPane.INFORMATION_MESSAGE);
            JDialog dialog = op.createDialog("Atenção");
            dialog.setAlwaysOnTop(true); //<-- this line
            dialog.setModal(true);
            dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
            dialog.setVisible(true);
        
        verificador = true; //retorna valor da tabela informando se houve sucesso ou não
        
                    

           
                   
        }
        
         //Trata os erros 
        catch (Exception e){
            
            //Trata o erro de intens únicos inseridos na tabela novamente
            
            if(e instanceof com.mysql.jdbc.exceptions.jdbc4.MySQLIntegrityConstraintViolationException){
                
                
                JOptionPane op = new JOptionPane("Esse usuário já existe",JOptionPane.INFORMATION_MESSAGE);
                JDialog dialog = op.createDialog("Atenção");
                dialog.setAlwaysOnTop(true); //<-- this line
                dialog.setModal(true);
                dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
                dialog.setVisible(true);
                
                
            //Trata o erro overflow no banco de dados
                
            }else if(e instanceof com.mysql.jdbc.MysqlDataTruncation){
                
                JOptionPane op = new JOptionPane("Limite de caracteres atingidos",JOptionPane.INFORMATION_MESSAGE);
                JDialog dialog = op.createDialog("Atenção");
                dialog.setAlwaysOnTop(true); //<-- this line
                dialog.setModal(true);
                dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
                dialog.setVisible(true);
                
                
            //erros gerais    
            } else{
                
                JOptionPane op = new JOptionPane("Erro, favor verificar com o desenvolvedor",JOptionPane.INFORMATION_MESSAGE);
                JDialog dialog = op.createDialog("Atenção");
                dialog.setAlwaysOnTop(true); //<-- this line
                dialog.setModal(true);
                dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
                dialog.setVisible(true);
               
                
                
            }
            
            //Ativa a mensagem de erro
            //JOptionPane.showMessageDialog(null, e.getMessage()); 
            //e.printStackTrace();
              
        }

      
        finally{
            if (conn != null){  
                try {  
                    conn.close();  

                }         
                catch (SQLException e) {  

                    System.out.print(e.getStackTrace());  

                }  
            }  
        }  
    
         return verificador;

    }    
    
    /** Cria novo cliente*/
    public boolean novoCliente(String cnpj, String email, String razao, String telefone, double limite, String usercadastro, int id) {  
        
       
         try{
            //Faz a conexão com o banco
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(ComandosBanco.getUrl(), ComandosBanco.getUser(), ComandosBanco.getPassword());
            PreparedStatement pstmt;    
            //stmt = conn.createStatement();
            
            //Insere os dados no banco    
            pstmt = conn.prepareStatement("insert into tb_cliente (cnpj, email, razao, data, telefone, limite, usercadastro, tb_cadastro_id) values(?,?,?,?,?,?,?,?)");
            pstmt.setString(1,cnpj);
            pstmt.setString(2,email);
            pstmt.setString(3,razao);
            pstmt.setString(4,ComandosGerais.formatoDataBanco.format(ComandosGerais.getDatas()));
            pstmt.setString(5,telefone);
            pstmt.setDouble(6,limite);
            pstmt.setString(7,usercadastro);
            pstmt.setInt(8,id);
            pstmt.execute();   


            //Cria tela de confirmação
            JOptionPane op = new JOptionPane("Cliente Inserido com Sucesso",JOptionPane.INFORMATION_MESSAGE);
            JDialog dialog = op.createDialog("Atenção");
            dialog.setAlwaysOnTop(true); //<-- this line
            dialog.setModal(true);
            dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
            dialog.setVisible(true);
        
            verificador = true;         
        }
        
         //Trata os erros 
        catch (Exception e){
            
            //Trata o erro de intens únicos inseridos na tabela novamente
            
            if(e instanceof com.mysql.jdbc.exceptions.jdbc4.MySQLIntegrityConstraintViolationException){
                
                
                JOptionPane op = new JOptionPane("Esse cliente já existe",JOptionPane.INFORMATION_MESSAGE);
                JDialog dialog = op.createDialog("Atenção");
                dialog.setAlwaysOnTop(true); //<-- this line
                dialog.setModal(true);
                dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
                dialog.setVisible(true);
                
                
            //Trata o erro overflow no banco de dados
                
            }else if(e instanceof com.mysql.jdbc.MysqlDataTruncation){
                
                JOptionPane op = new JOptionPane("Limite de caracteres atingidos",JOptionPane.INFORMATION_MESSAGE);
                JDialog dialog = op.createDialog("Atenção");
                dialog.setAlwaysOnTop(true); //<-- this line
                dialog.setModal(true);
                dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
                dialog.setVisible(true);
                e.printStackTrace();
            
            } else{//erros gerais 
                
                JOptionPane op = new JOptionPane("Erro, favor verificar com o desenvolvedor",JOptionPane.INFORMATION_MESSAGE);
                JDialog dialog = op.createDialog("Atenção");
                dialog.setAlwaysOnTop(true); //<-- this line
                dialog.setModal(true);
                dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
                dialog.setVisible(true);
                e.printStackTrace();
                
                
            }
            
            //Ativa a mensagem de erro
            //JOptionPane.showMessageDialog(null, e.getMessage()); 
            //e.printStackTrace();
              
        }

      
        finally{
            if (conn != null){  
                try {  
                    conn.close();  

                }         
                catch (SQLException e) {  

                    System.out.print(e.getStackTrace());  

                }  
            }  
        }  
    
         return verificador;

    }    
    
    /** Cria endereço do cliente*/
    public boolean novoEndereco(String endereco, String bairro, String cidade, String estado, String cep, int id) {  
        
       
         try{
            //Faz a conexão com o banco
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(ComandosBanco.getUrl(), ComandosBanco.getUser(), ComandosBanco.getPassword());
            PreparedStatement pstmt;    
            
            //Insere os dados no banco    
            pstmt = conn.prepareStatement("insert into tb_endereco (endereco, bairro, cidade, estado, cep, tb_cliente_id) values(?,?,?,?,?,?)");
            pstmt.setString(1,endereco);
            pstmt.setString(2,bairro);
            pstmt.setString(3,cidade);
            pstmt.setString(4,estado);
            pstmt.setString(5,cep);
            pstmt.setInt(6,id);
            pstmt.execute();   


            verificador = true;         
        }
        
         //Trata os erros 
        catch (Exception e){
            
            //Trata o erro de intens únicos inseridos na tabela novamente
            
            if(e instanceof com.mysql.jdbc.exceptions.jdbc4.MySQLIntegrityConstraintViolationException){
                
                
                JOptionPane op = new JOptionPane("Esse cliente já tem endereço",JOptionPane.INFORMATION_MESSAGE);
                JDialog dialog = op.createDialog("Atenção");
                dialog.setAlwaysOnTop(true); //<-- this line
                dialog.setModal(true);
                dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
                dialog.setVisible(true);
                
                
            //Trata o erro overflow no banco de dados
                
            }else if(e instanceof com.mysql.jdbc.MysqlDataTruncation){
                
                JOptionPane op = new JOptionPane("Limite de caracteres atingidos",JOptionPane.INFORMATION_MESSAGE);
                JDialog dialog = op.createDialog("Atenção");
                dialog.setAlwaysOnTop(true); //<-- this line
                dialog.setModal(true);
                dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
                dialog.setVisible(true);
                e.printStackTrace();
                
            //erros gerais    
            } else{
                
                JOptionPane op = new JOptionPane("Erro, favor verificar com o desenvolvedor",JOptionPane.INFORMATION_MESSAGE);
                JDialog dialog = op.createDialog("Atenção");
                dialog.setAlwaysOnTop(true); //<-- this line
                dialog.setModal(true);
                dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
                dialog.setVisible(true);
                e.printStackTrace();
                
                
            }
            
            //Ativa a mensagem de erro
            //JOptionPane.showMessageDialog(null, e.getMessage()); 
            //e.printStackTrace();
              
        }

      
        finally{
            if (conn != null){  
                try {  
                    conn.close();  

                }         
                catch (SQLException e) {  

                    System.out.print(e.getStackTrace());  

                }  
            }  
        }  
    
         return verificador;

    }  
    
    /**busca dados do usuario na tabela cadastro no banco de dados*/    
    public String buscaDados(String usuariobusca, String campo) {  
        String resultado = ""; 
        try{
            //Faz a conexão com o banco
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(ComandosBanco.getUrl(), ComandosBanco.getUser(), ComandosBanco.getPassword());
                      
            pstmt = conn.prepareStatement("SELECT * FROM tb_cadastro where usuario = ?");
            pstmt.setString(1, usuariobusca);
            rs = pstmt.executeQuery();           
            
            while(rs.next()) {
                rs.getString("usuario");
                resultado = rs.getString(campo);
               
            }
        

            
                     
        }

            catch (Exception e){
            //JOptionPane.showMessageDialog(null, "");
            e.printStackTrace();
        }   
        
            finally{
                if (conn != null){  
                    try {  
                        conn.close();  
                    
                    }         
                    catch (SQLException e1) {  
                    
                        System.out.print(e1.getStackTrace());  
                    
                    }  
                }  
            }  
        
        return resultado;
    }
    
    /**busca dados qualquer tabela do banco de dados*/   
    public String buscaDados2(String busca ,String coluna, String tabela ) {  
        String resultado = ""; 
        try{
            //Faz a conexão com o banco
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(ComandosBanco.getUrl(), ComandosBanco.getUser(), ComandosBanco.getPassword());
                      
            pstmt = conn.prepareStatement("SELECT "+coluna+" FROM "+tabela+" where id = "+busca+" or cnpj = "+ busca );
            rs = pstmt.executeQuery();           
            
            while(rs.next()) {
                rs.getString(coluna);
                resultado = rs.getString(coluna);
               
            }
        

            
                     
        }

            catch (Exception e){
            //JOptionPane.showMessageDialog(null, "");
            
            e.printStackTrace();
        }   
        
            finally{
                if (conn != null){  
                    try {  
                        conn.close();  
                    
                    }         
                    catch (SQLException e1) {  
                    
                        System.out.print(e1.getStackTrace());  
                    
                    }  
                }  
            }  
        
        return resultado;
    }
        
    /**Busca limite no formato correto*/   
    public String buscaLimite(String idcliente) {  
        String resultado = ""; 
        try{
            //Faz a conexão com o banco
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(ComandosBanco.getUrl(), ComandosBanco.getUser(), ComandosBanco.getPassword());
                      
            pstmt = conn.prepareStatement("SELECT format(limite,2,'de_DE') FROM tb_cliente where id =" +idcliente);
            rs = pstmt.executeQuery();           
            
            while(rs.next()) {
                
                resultado = rs.getString(1);
               
            }
        

            
                     
        }

            catch (Exception e){
            //JOptionPane.showMessageDialog(null, "");
            
            e.printStackTrace();
        }   
        
            finally{
                if (conn != null){  
                    try {  
                        conn.close();  
                    
                    }         
                    catch (SQLException e1) {  
                    
                        System.out.print(e1.getStackTrace());  
                    
                    }  
                }  
            }  
        
        return resultado;
    }
      
    /**busca dados do usuario na tabela endereço no banco de dados*/   
    public String buscaDadosEndereco(String busca ,String coluna, String tabela ) {  
        String resultado = ""; 
        try{
            //Faz a conexão com o banco
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(ComandosBanco.getUrl(), ComandosBanco.getUser(), ComandosBanco.getPassword());
                      
            pstmt = conn.prepareStatement("SELECT "+coluna+" FROM "+tabela+" where tb_cliente_id = "+busca);
            rs = pstmt.executeQuery();           
            
            while(rs.next()) {
                rs.getString(coluna);
                resultado = rs.getString(coluna);
               
            }
        

            
                     
        }

            catch (Exception e){
            //JOptionPane.showMessageDialog(null, "");
            
            
            e.printStackTrace();
        }   
        
            finally{
                if (conn != null){  
                    try {  
                        conn.close();  
                    
                    }         
                    catch (SQLException e1) {  
                    
                        System.out.print(e1.getStackTrace());  
                    
                    }  
                }  
            }  
        
        return resultado;
    }
    
    /**busca dados do usuario na tabela cadastro de responsável no banco de dados*/   
    public String buscaDadosResponsavel(String busca ,String coluna, String tabela ) {  
        String resultado = ""; 
        try{
            //Faz a conexão com o banco
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(ComandosBanco.getUrl(), ComandosBanco.getUser(), ComandosBanco.getPassword());
                      
            pstmt = conn.prepareStatement("SELECT "+coluna+" FROM "+tabela+" where id = "+busca);
            rs = pstmt.executeQuery();           
            
            while(rs.next()) {
                rs.getString(coluna);
                resultado = rs.getString(coluna);
               
            }
        

            
                     
        }

            catch (Exception e){
            //JOptionPane.showMessageDialog(null, "");
            
            
            e.printStackTrace();
        }   
        
            finally{
                if (conn != null){  
                    try {  
                        conn.close();  
                    
                    }         
                    catch (SQLException e1) {  
                    
                        System.out.print(e1.getStackTrace());  
                    
                    }  
                }  
            }  
        
        return resultado;
    }
    
    /**Atualiza dados do usuario na tabela cadastro no banco de dados*/    
    public String atualizaDadosCadastro(String usuariobusca, String campo, String novodado) {  
        String resultado = ""; 
        
        try{
           
            //Faz a conexão com o banco
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(ComandosBanco.getUrl(), ComandosBanco.getUser(), ComandosBanco.getPassword());
            String sql = "UPDATE tb_cadastro SET "+campo+" = '"+novodado+"' where usuario = ?";
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1,usuariobusca);
            pstmt.executeUpdate();           
            
            //resultado = "Alterado";
            //System.out.println(resultado);
                     
        }
            catch (Exception e){
            
            e.printStackTrace();
        }   
        
            finally{
                if (conn != null){  
                    try {  
                        conn.close();  
                    
                    }         
                    catch (SQLException e1) {  
                    
                        System.out.print(e1.getStackTrace());  
                    
                    }  
                }  
            }  
        
        return resultado;
    }
    
    /**Atualiza dados do usuario na tabela cliente no banco de dados. 1 = String, 2 = Double, 3 = int*/    
    public String atualizaDados(String dadobusca, String campo, String novodado, int tipodedado) {  
        String resultado = ""; 
        
        
        try{
           
            //Faz a conexão com o banco
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(ComandosBanco.getUrl(), ComandosBanco.getUser(), ComandosBanco.getPassword());
            
            
            switch (tipodedado){
            
                case 1:
                    String sql1 = "UPDATE tb_cliente SET "+campo+" = '"+novodado+"' where cnpj = ?" + "or id = ?";
                    pstmt = conn.prepareStatement(sql1);
                    pstmt.setString(1,dadobusca);
                    pstmt.setString(2,dadobusca);
                    pstmt.executeUpdate();
                    resultado = "Alterado";
                    break;
                    
                case 2:
                    double novodouble = Double.parseDouble(novodado);
                    String sql2 = "UPDATE tb_cliente SET "+campo+" = "+novodouble+" where cnpj = ?" + "or id = ?";
                    pstmt = conn.prepareStatement(sql2);
                    pstmt.setString(1,dadobusca);
                    pstmt.setString(2,dadobusca);
                    pstmt.executeUpdate(); 
                    resultado = "Alterado";
                    break;
                    
                /*case 3: NÃO ESTÁ FUNCIONANDO, NÃO PRECISA USAR POR ENQUANTO
                    int novoint = Integer.parseInt(novodado); 
                    String sql3 = "UPDATE tb_cliente SET "+campo+" = "+novoint+" where cnpj = ?" + "or id = ?";
                    pstmt = conn.prepareStatement(sql3);
                    pstmt.setString(1,dadobusca);
                    pstmt.setString(2,dadobusca);
                    pstmt.executeUpdate(); 
                    resultado = "Alterado";
                    break;*/
                    
            }
            
            //resultado = "Alterado";
            //System.out.println(resultado);
                     
        }
            catch (Exception e){
            
            e.printStackTrace();
        }   
        
            finally{
                if (conn != null){  
                    try {  
                        conn.close();  
                    
                    }         
                    catch (SQLException e1) {  
                    
                        System.out.print(e1.getStackTrace());  
                    
                    }  
                }  
            }  
        
        return resultado;
    }
    
    /**Atualiza dados do usuario na tabela cliente no banco de dados. 1 = String, 2 = Double, 3 = int*/    
    public String atualizaDadosEndereco(String dadobusca, String campo, String novodado) {  
        String resultado = ""; 
        
        
        try{
           
            //Faz a conexão com o banco
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(ComandosBanco.getUrl(), ComandosBanco.getUser(), ComandosBanco.getPassword());
            
            
            
            String sql1 = "UPDATE tb_endereco SET "+campo+" = '"+novodado+"' where tb_cliente_id = ?";
            pstmt = conn.prepareStatement(sql1);
            pstmt.setString(1,dadobusca);
            pstmt.executeUpdate();
                            
                    
            
            resultado = "Alterado";
            //resultado = "Alterado";
            //System.out.println(resultado);
                     
        }
            catch (Exception e){
            
            e.printStackTrace();
        }   
        
            finally{
                if (conn != null){  
                    try {  
                        conn.close();  
                    
                    }         
                    catch (SQLException e1) {  
                    
                        System.out.print(e1.getStackTrace());  
                    
                    }  
                }  
            }  
        
        return resultado;
    }
    
    /**Algoritmo que busca a posição do próximo auto increment do banco de dados*/    
    public static String buscaai() {  
        String tipo = "null"; 
        try{
            //Faz a conexão com o banco
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(ComandosBanco.getUrl(), ComandosBanco.getUser(), ComandosBanco.getPassword());
            stmt = conn.createStatement();
            rs = stmt.executeQuery("show table status like 'tb_cadastro'");
            
            
            while(rs.next()) {
              tipo =  rs.getString("Auto_increment");
               break; 
            }
            
  
                     
        }

            catch (Exception e){
            //JOptionPane.showMessageDialog(null, "Erro, verifique a conexão");
            e.printStackTrace();
        }   
        
            finally{
                if (conn != null){  
                    try {  
                        conn.close();  
                    
                    }         
                    catch (SQLException e1) {  
                    
                        System.out.print(e1.getStackTrace());  
                    
                    }  
                }  
            }  
        
        return tipo;
    }    
    
    

public static void main(String[] args) throws ParseException{ //Main para teste do código
    ComandosBanco conec = new ComandosBanco();
    //conec.atualizaDados("2", "site", "www.lucas.com.br",1);
    //System.out.println(conec.atualizaDadosEndereco(conec.buscaDados2("2", "cnpj" , "tb_cliente"), "tb_cliente_cnpj", "111111111111114", 1));
    System.out.println(conec.getUrl());
    //JFormattedTextField teste = new JFormattedTextField();
    
    //try {
    //teste.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
    //} catch (java.text.ParseException ex) {
    //ex.printStackTrace();
    //}
    
    //teste.setText("83302170");
    //double d = Double.parseDouble(teste.getText().replaceAll(",", "."));
    //Locale locBrazil = new Locale("pt", "BR");
    //NumberFormat nf = NumberFormat.getInstance(locBrazil);
    //Number d = nf.parse(teste.getText());
    //conec.atualizaDados("2", "limite", d.toString(), 2);
    //ystem.out.println(conec.buscaDadosEndereco("27", "cidade" , "tb_endereco"));
    //System.out.println(teste.getText().replace("-", ""));
    //System.out.println(conec.novoUsuario("gerente", "gerente@gerente", 3, "admin", "00000000077", false, "gerente", "gerente", "teste"));
    //System.out.println(conec.novoCliente("000000000000000", "cliente@cliente", "lucas LTDA", 30303030, 100.000, "Lucas",24));
    //System.out.println(conec.novoEndereco("Rua Goiania 377", "cajuru", "Curitiba", "PR", 83302-170, "000000000000000"));
   // System.out.println(conec.buscaDados("1", "email")); 
    
   //conec.atualizaDadosCadastro("lucas.borim","tipo","1");
}





}
