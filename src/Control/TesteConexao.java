/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import com.mysql.jdbc.PreparedStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Lucas Borim
 */
public class TesteConexao {
    
    private Connection conn;
    private Statement stmt;
    private ResultSet rs;
    
    private String url = "mysql.hostinger.com.br";
    private String user = "u108125150_root";
    private String password = "123456";
    private String driver = "com.mysql.jdbc.Driver";
    
    
    //Algoritmo para fazer a verificação do login
    public void login() {  

        try{
            //Faz a conexão com o banco
            Class.forName(driver);
            conn = DriverManager.getConnection(url, user, password);
            stmt = conn.createStatement();
            rs = stmt.executeQuery("SELECT * FROM login");
            JOptionPane.showMessageDialog(null, "Conectado");  
        }

            catch (Exception e){
            JOptionPane.showMessageDialog(null, "Erro, verifique a conexão");
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
        
    }
    
    
    
    
    

public static void main(String[] args){
    
    
    
    
    

    
    
}





}
