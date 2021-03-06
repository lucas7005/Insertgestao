/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Telas.gerais;

import Control.ComandosBanco;
import Control.ComandosGerais;
import Paineis.TelaApoio;
import java.awt.Dimension;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Lucas Borim
 */
public class UserConfig extends javax.swing.JInternalFrame {

    /**
     * Creates new form TesteFrame
     */
       
    private String branco = null;
    private boolean alternativa = true;
    ComandosBanco comandobanco = new ComandosBanco();
    private boolean alternativa2 = true;
    
    public UserConfig() {
        initComponents();
        setVisible(true);

    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        usuarionovo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        limpar = new javax.swing.JButton();
        concluir = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jLabel12 = new javax.swing.JLabel();
        senha = new javax.swing.JPasswordField();
        jLabel13 = new javax.swing.JLabel();
        nome = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        usuario = new javax.swing.JTextField();
        codigocliente = new javax.swing.JTextField();
        datadehoje = new javax.swing.JTextField();
        cpf = new javax.swing.JTextField();
        responsavel = new javax.swing.JTextField();
        usuariocriacao = new javax.swing.JTextField();
        alterarusuario = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        buscar = new javax.swing.JButton();
        concluiralteracao = new javax.swing.JButton();
        alterar = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jCheckBox2 = new javax.swing.JCheckBox();
        jLabel19 = new javax.swing.JLabel();
        senha1 = new javax.swing.JPasswordField();
        jLabel20 = new javax.swing.JLabel();
        nome1 = new javax.swing.JTextField();
        email1 = new javax.swing.JTextField();
        usuario1 = new javax.swing.JTextField();
        nomeusuario = new javax.swing.JTextField();
        datadehoje1 = new javax.swing.JTextField();
        cpf1 = new javax.swing.JTextField();
        responsavel1 = new javax.swing.JTextField();
        usuariocriacao1 = new javax.swing.JTextField();
        jComboBox4 = new javax.swing.JComboBox<>();
        tipo2 = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        ultimaalteracao = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setTitle("Configuração de Usuário");

        usuarionovo.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados"));

        jLabel1.setText("Código");

        jLabel2.setText("Tipo");

        jLabel4.setText("Nome");

        jLabel5.setText("Usuário");

        jLabel6.setText("Responsável");

        jLabel7.setText("E-mail");

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Consultor", "Gerente", "Apoio" }));

        limpar.setText("Limpar");
        limpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limparActionPerformed(evt);
            }
        });

        concluir.setText("Concluir");
        concluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                concluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(limpar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(concluir)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 10, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(limpar)
                    .addComponent(concluir)))
        );

        jLabel8.setText("Data Criação");

        jLabel10.setText("CPF");

        jCheckBox1.setText("Ativo");

        jLabel12.setText("Senha");

        jLabel13.setText("Usuario Criação");

        codigocliente.setEditable(false);

        datadehoje.setEditable(false);

        usuariocriacao.setEditable(false);

        javax.swing.GroupLayout usuarionovoLayout = new javax.swing.GroupLayout(usuarionovo);
        usuarionovo.setLayout(usuarionovoLayout);
        usuarionovoLayout.setHorizontalGroup(
            usuarionovoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(usuarionovoLayout.createSequentialGroup()
                .addGroup(usuarionovoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(usuarionovoLayout.createSequentialGroup()
                        .addGroup(usuarionovoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel8)
                            .addComponent(jLabel10)
                            .addComponent(jLabel1)
                            .addComponent(jLabel4))
                        .addGap(28, 28, 28)
                        .addGroup(usuarionovoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(usuarionovoLayout.createSequentialGroup()
                                .addComponent(codigocliente, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(email))
                            .addGroup(usuarionovoLayout.createSequentialGroup()
                                .addGroup(usuarionovoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nome, javax.swing.GroupLayout.PREFERRED_SIZE, 540, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(usuarionovoLayout.createSequentialGroup()
                                        .addGroup(usuarionovoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(usuario, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)
                                            .addComponent(datadehoje, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(cpf, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(responsavel))
                                        .addGap(28, 28, 28)
                                        .addGroup(usuarionovoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jCheckBox1)
                                            .addGroup(usuarionovoLayout.createSequentialGroup()
                                                .addComponent(jLabel12)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(senha, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(usuarionovoLayout.createSequentialGroup()
                                                .addComponent(jLabel13)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(usuariocriacao, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap(31, Short.MAX_VALUE))
            .addGroup(usuarionovoLayout.createSequentialGroup()
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        usuarionovoLayout.setVerticalGroup(
            usuarionovoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(usuarionovoLayout.createSequentialGroup()
                .addGroup(usuarionovoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(usuarionovoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7)
                        .addComponent(codigocliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1))
                    .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(usuarionovoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(usuarionovoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(usuarionovoLayout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel5))
                    .addGroup(usuarionovoLayout.createSequentialGroup()
                        .addGroup(usuarionovoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(senha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBox1))
                    .addGroup(usuarionovoLayout.createSequentialGroup()
                        .addComponent(cpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(usuarionovoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(responsavel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel13)
                    .addComponent(usuariocriacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(usuarionovoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(datadehoje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(usuarionovoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        codigocliente.setText(ComandosBanco.buscaai());
        Date dia = TelaApoio.getDatadehoje();
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        datadehoje.setText(sdf.format(dia));
        usuariocriacao.setText(x);

        jTabbedPane1.addTab("Novo", usuarionovo);

        alterarusuario.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados"));

        jLabel3.setText("Usuário");

        jLabel9.setText("Tipo");

        jLabel11.setText("Nome");

        jLabel14.setText("Usuário");

        jLabel15.setText("Responsável");

        jLabel16.setText("E-mail");

        buscar.setBackground(new java.awt.Color(0, 255, 204));
        buscar.setText("Buscar");
        buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarActionPerformed(evt);
            }
        });

        concluiralteracao.setBackground(new java.awt.Color(0, 255, 0));
        concluiralteracao.setText("Concluir");
        concluiralteracao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                concluiralteracaoalteracaoActionPerformed(evt);
            }
        });

        alterar.setBackground(new java.awt.Color(255, 255, 51));
        alterar.setText("Alterar");
        alterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alterarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(buscar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(alterar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(concluiralteracao)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 22, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buscar)
                    .addComponent(concluiralteracao)
                    .addComponent(alterar)))
        );

        jLabel17.setText("Data Criação");

        jLabel18.setText("CPF");

        jCheckBox2.setText("Ativo");

        jLabel19.setText("Senha");

        senha1.setEditable(false);

        jLabel20.setText("Usuario Criação");

        nome1.setEditable(false);

        email1.setEditable(false);

        usuario1.setEditable(false);

        datadehoje1.setEditable(false);

        cpf1.setEditable(false);

        responsavel1.setEditable(false);

        usuariocriacao1.setEditable(false);

        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Consultor", "Gerente", "Apoio" }));
        jComboBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox4ActionPerformed(evt);
            }
        });

        tipo2.setEditable(false);

        jLabel21.setText("Novo tipo");

        ultimaalteracao.setEditable(false);

        jLabel22.setText("Última Alter.");

        javax.swing.GroupLayout alterarusuarioLayout = new javax.swing.GroupLayout(alterarusuario);
        alterarusuario.setLayout(alterarusuarioLayout);
        alterarusuarioLayout.setHorizontalGroup(
            alterarusuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, alterarusuarioLayout.createSequentialGroup()
                .addGroup(alterarusuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(alterarusuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel9)
                        .addComponent(jLabel14)
                        .addComponent(jLabel15)
                        .addComponent(jLabel18)
                        .addComponent(jLabel3)
                        .addComponent(jLabel11)
                        .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addComponent(jLabel21))
                .addGap(29, 29, 29)
                .addGroup(alterarusuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, alterarusuarioLayout.createSequentialGroup()
                        .addComponent(nomeusuario, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(email1))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, alterarusuarioLayout.createSequentialGroup()
                        .addGroup(alterarusuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(alterarusuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jComboBox4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(nome1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 540, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, alterarusuarioLayout.createSequentialGroup()
                                    .addGroup(alterarusuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(usuario1, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)
                                        .addComponent(cpf1, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(responsavel1)
                                        .addComponent(datadehoje1, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(tipo2, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addGap(28, 28, 28)
                                    .addGroup(alterarusuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jCheckBox2)
                                        .addGroup(alterarusuarioLayout.createSequentialGroup()
                                            .addComponent(jLabel19)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(senha1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(alterarusuarioLayout.createSequentialGroup()
                                            .addGroup(alterarusuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addGroup(alterarusuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(ultimaalteracao, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(usuariocriacao1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(30, 30, 30))
        );
        alterarusuarioLayout.setVerticalGroup(
            alterarusuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(alterarusuarioLayout.createSequentialGroup()
                .addGroup(alterarusuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(alterarusuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel16)
                        .addComponent(nomeusuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3))
                    .addComponent(email1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(alterarusuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nome1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(alterarusuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(alterarusuarioLayout.createSequentialGroup()
                        .addComponent(jLabel18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel14))
                    .addGroup(alterarusuarioLayout.createSequentialGroup()
                        .addGroup(alterarusuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(senha1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel19))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBox2))
                    .addGroup(alterarusuarioLayout.createSequentialGroup()
                        .addComponent(cpf1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(usuario1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(alterarusuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(responsavel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15)
                    .addComponent(jLabel20)
                    .addComponent(usuariocriacao1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(alterarusuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(datadehoje1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17)
                    .addComponent(ultimaalteracao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(alterarusuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tipo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(alterarusuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        codigocliente.setText(ComandosBanco.buscaai());
        //ultimaalteracao.setText(x);

        jTabbedPane1.addTab("Alterar", alterarusuario);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void concluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_concluirActionPerformed
        // TODO add your handling code here:
        // TODO add your handling code here:
        

        //Faz a verificação se o cadastro está correto e limpa os campos após o envio de informações ao banco
        if(comandobanco.novoUsuario(nome.getText(), email.getText(), jComboBox2.getSelectedIndex(), responsavel.getText(), cpf.getText(), jCheckBox1.isSelected(), usuario.getText(), senha.getText(), x)){
            nome.setText("");
            email.setText("");
            usuario.setText("");
            senha.setText("");
            cpf.setText("");
            responsavel.setText("");
            codigocliente.setText(ComandosBanco.buscaai());
        }
    }//GEN-LAST:event_concluirActionPerformed

    private void limparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limparActionPerformed
        // TODO add your handling code here:

        senha.setText(branco);
        nome.setText(senha.getText());
        email.setText(senha.getText());
        usuario.setText(senha.getText());
        cpf.setText(senha.getText());
        responsavel.setText(senha.getText());
        jCheckBox1.setSelected(false);
        nome.setText(branco);
    }//GEN-LAST:event_limparActionPerformed

    private void buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarActionPerformed
        // faz busca do usuário e retorna dados do banco de dados
        
        if(comandobanco.buscaDados(nomeusuario.getText(), "nome").equals("")){
            JOptionPane.showMessageDialog(rootPane, "Usuário não encontrado");
            nome1.setText(branco);
            email1.setText(branco);
            cpf1.setText(branco);
            usuario1.setText(branco);
            responsavel1.setText(branco);
            datadehoje1.setText(branco);
            usuariocriacao1.setText(branco);
            senha1.setText(branco);
            ultimaalteracao.setText(branco);
            
        } else{
           
            nome1.setText(comandobanco.buscaDados(nomeusuario.getText(), "nome"));
            email1.setText(comandobanco.buscaDados(nomeusuario.getText(), "email"));
            cpf1.setText(comandobanco.buscaDados(nomeusuario.getText(), "cpf"));
            usuario1.setText(comandobanco.buscaDados(nomeusuario.getText(), "usuario"));
            responsavel1.setText(comandobanco.buscaDados(nomeusuario.getText(), "responsavel"));
            datadehoje1.setText(comandobanco.buscaDados(nomeusuario.getText(), "datacriacao"));
            usuariocriacao1.setText(comandobanco.buscaDados(nomeusuario.getText(), "usuariocriacao"));
            senha1.setText(comandobanco.buscaDados(nomeusuario.getText(), "senha"));
            ultimaalteracao.setText(comandobanco.buscaDados(nomeusuario.getText(), "ultimaalteracao"));
           
            if(comandobanco.buscaDados(nomeusuario.getText(), "situacao").equals("1")){
                jCheckBox2.setSelected(true);
                
            } else {
                jCheckBox2.setSelected(false);
            }
            
            if(comandobanco.buscaDados(nomeusuario.getText(), "tipo").equals("0")){
               tipo2.setText("Consultor");
            }else if(comandobanco.buscaDados(nomeusuario.getText(), "tipo").equals("1")){
               tipo2.setText("Gerente"); 
            } else{
               tipo2.setText("Apoio");  
            }
        }
        
        
        
        
        
    }//GEN-LAST:event_buscarActionPerformed
    
    //Conclui alteração no usuário
    private void concluiralteracaoalteracaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_concluiralteracaoalteracaoActionPerformed
        // TODO add your handling code here:
        //Compara valor do tipo de usuario para validar mudança
        String compara = String.valueOf(jComboBox4.getSelectedIndex());
        
        comandobanco.atualizaDadosCadastro(nomeusuario.getText(), "email", email1.getText());
        comandobanco.atualizaDadosCadastro(nomeusuario.getText(), "nome", nome1.getText());
        comandobanco.atualizaDadosCadastro(nomeusuario.getText(), "cpf", cpf1.getText());
        comandobanco.atualizaDadosCadastro(nomeusuario.getText(), "usuario", usuario1.getText());
        comandobanco.atualizaDadosCadastro(nomeusuario.getText(), "responsavel", responsavel1.getText());
        comandobanco.atualizaDadosCadastro(nomeusuario.getText(), "senha", senha1.getText());
        comandobanco.atualizaDadosCadastro(nomeusuario.getText(), "ultimaalteracao", x);
        
        if(jCheckBox2.isSelected()){
          comandobanco.atualizaDadosCadastro(nomeusuario.getText(), "situacao", "1");  
        } else{
          comandobanco.atualizaDadosCadastro(nomeusuario.getText(), "situacao", "0");   
        }
        
        if(tipo2.getText() != compara){
            
            comandobanco.atualizaDadosCadastro(nomeusuario.getText(), "tipo", compara);
            
        }
        
           nome1.setEditable(false);
           email1.setEditable(false);
           cpf1.setEditable(false);
           usuario1.setEditable(false);
           responsavel1.setEditable(false);
           senha1.setEditable(false);
        
       JOptionPane.showMessageDialog(rootPane, "Alterações realizadas com sucesso");
           
           
           
     
          
    }//GEN-LAST:event_concluiralteracaoalteracaoActionPerformed
    
    
    //Habilita edição
    private void alterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alterarActionPerformed
            
        if(alternativa){ //Habilita edição dos botões
           nome1.setEditable(true);
           email1.setEditable(true);
           cpf1.setEditable(true);
           usuario1.setEditable(true);
           responsavel1.setEditable(true);
           senha1.setEditable(true); 
        } else{ //Desabilita edição dos botões
           nome1.setEditable(false);
           email1.setEditable(false);
           cpf1.setEditable(false);
           usuario1.setEditable(false);
           responsavel1.setEditable(false);
           senha1.setEditable(false);
           
        }
        
        alternativa = !alternativa;   //inverte bolleano para efetuar opções alternadas 
        
    }//GEN-LAST:event_alterarActionPerformed

    private void jComboBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox4ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton alterar;
    private javax.swing.JPanel alterarusuario;
    private javax.swing.JButton buscar;
    private javax.swing.JTextField codigocliente;
    private javax.swing.JButton concluir;
    private javax.swing.JButton concluiralteracao;
    private javax.swing.JTextField cpf;
    private javax.swing.JTextField cpf1;
    private javax.swing.JTextField datadehoje;
    private javax.swing.JTextField datadehoje1;
    private javax.swing.JTextField email;
    private javax.swing.JTextField email1;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JButton limpar;
    private javax.swing.JTextField nome;
    private javax.swing.JTextField nome1;
    private javax.swing.JTextField nomeusuario;
    private javax.swing.JTextField responsavel;
    private javax.swing.JTextField responsavel1;
    private javax.swing.JPasswordField senha;
    private javax.swing.JPasswordField senha1;
    private javax.swing.JTextField tipo2;
    private javax.swing.JTextField ultimaalteracao;
    private javax.swing.JTextField usuario;
    private javax.swing.JTextField usuario1;
    private javax.swing.JTextField usuariocriacao;
    private javax.swing.JTextField usuariocriacao1;
    private javax.swing.JPanel usuarionovo;
    // End of variables declaration//GEN-END:variables

 public void setPosicao() { //Algoritmo para centralizar Jinternalframe
    Dimension d = this.getDesktopPane().getSize();
    this.setLocation((d.width - this.getSize().width) / 2, (d.height - this.getSize().height) / 2); 
    }


 //Pega o nome do usuário logado
String x = ComandosGerais.getHistorico();


}

