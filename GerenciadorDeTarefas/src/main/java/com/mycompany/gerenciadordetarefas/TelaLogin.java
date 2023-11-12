
package com.mycompany.gerenciadordetarefas;

import javax.swing.JOptionPane;
import org.json.JSONArray;
import org.json.JSONObject;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.IOException;

public class TelaLogin extends javax.swing.JFrame {

    public TelaLogin() {
        initComponents();
    }
    private static String usuarioLogado;
    private static final String ARQUIVO_USUARIOS = "usuarios.json";
    @SuppressWarnings("unchecked")

    private void initComponents() {

        jButtonEntrar = new javax.swing.JButton();
        jButtonSair = new javax.swing.JButton();
        blusuario = new javax.swing.JLabel();
        lblsenha = new javax.swing.JLabel();
        jTextFieldUsuario = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jPasswordFieldSenha = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        setResizable(false);
        getContentPane().setLayout(null);

        jButtonEntrar.setText("Entrar");
        jButtonEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEntrarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonEntrar);
        jButtonEntrar.setBounds(80, 90, 80, 23);

        jButtonSair.setText("Sair");
        jButtonSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSairActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonSair);
        jButtonSair.setBounds(170, 90, 80, 23);

        blusuario.setText("Usuário");
        getContentPane().add(blusuario);
        blusuario.setBounds(20, 30, 70, 16);

        lblsenha.setText("Senha");
        getContentPane().add(lblsenha);
        lblsenha.setBounds(20, 60, 60, 16);

        jTextFieldUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldUsuario);
        jTextFieldUsuario.setBounds(80, 30, 170, 22);

        jButton3.setText("Cadastrar Usuário");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(80, 120, 170, 23);

        jPasswordFieldSenha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jPasswordFieldSenhaKeyPressed(evt);
            }
        });
        getContentPane().add(jPasswordFieldSenha);
        jPasswordFieldSenha.setBounds(80, 60, 170, 22);

        setSize(new java.awt.Dimension(290, 194));
        setLocationRelativeTo(null);
    }



    private void jTextFieldUsuarioActionPerformed(java.awt.event.ActionEvent evt) {
    }

    private void jButtonEntrarActionPerformed(java.awt.event.ActionEvent evt) {
        String usuario = jTextFieldUsuario.getText();
        String senha = new String(jPasswordFieldSenha.getPassword());

        // Lógica para validar o usuário e senha a partir de um arquivo JSON
        try {
            // Verifica se o arquivo de usuários existe
            if (Files.exists(Paths.get(ARQUIVO_USUARIOS))) {
                String usuariosJson = new String(Files.readAllBytes(Paths.get(ARQUIVO_USUARIOS)));
                JSONArray usuariosArray = new JSONArray(usuariosJson);

                // Verifica cada usuário no arquivo JSON
                for (int i = 0; i < usuariosArray.length(); i++) {
                    JSONObject usuarioObj = usuariosArray.getJSONObject(i);

                    // Compara usuário e senha
                    if (usuarioObj.getString("Usuario").equals(usuario) && usuarioObj.getString("Senha").equals(senha)) {
                        // Armazena o usuário logado
                        usuarioLogado = usuario;

                        // Se encontrado, exibe a TelaPrincipal e fecha a TelaLogin
                        TelaPrincipal tela = new TelaPrincipal();
                        tela.setVisible(true);
                        dispose();
                        return; // Sai do método se o usuário for válido
                    }
                }
            }

            // Exibe uma mensagem se a autenticação falhar
            JOptionPane.showMessageDialog(rootPane, "Acesso Negado!");

        } catch (IOException e) {
            // Exibe uma mensagem de erro em caso de falha na leitura do arquivo JSON
            JOptionPane.showMessageDialog(this, "Erro ao ler o arquivo JSON: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }


    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {
        // Abre a tela de cadastro de usuários
        TelaCadastroUsuario telaCadastro = new TelaCadastroUsuario();
        telaCadastro.setVisible(true);
    }



    private void jButtonSairActionPerformed(java.awt.event.ActionEvent evt) {
        System.exit(0);
    }

    private void jPasswordFieldSenhaKeyPressed(java.awt.event.KeyEvent evt) {

    }
        

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaLogin().setVisible(true);
            }
        });
    }

    private javax.swing.JLabel blusuario;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButtonEntrar;
    private javax.swing.JButton jButtonSair;
    private javax.swing.JPasswordField jPasswordFieldSenha;
    private javax.swing.JTextField jTextFieldUsuario;
    private javax.swing.JLabel lblsenha;

}
