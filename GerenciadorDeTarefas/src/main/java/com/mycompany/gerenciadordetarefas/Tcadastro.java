package com.mycompany.gerenciadordetarefas;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.stream.JsonReader;

import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static com.mycompany.gerenciadordetarefas.TelaLogin.usuarioLogado;

public class Tcadastro extends javax.swing.JFrame {


    private List<Tarefa> tarefas;
    public Tcadastro() {

        tarefas = new ArrayList<>();
        initComponents();
        buttonGroup1.add(jRadioButtonNaoConcluida);
        buttonGroup1.add(jRadioButtonConcluida);
        buttonGroup2.add(jRadioButtonBaixa);
        buttonGroup2.add(jRadioButtonMedia);
        buttonGroup2.add(jRadioButtonAlta);


    }

    @SuppressWarnings("unchecked")

    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldTitulo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jFormattedTextFieldData = new javax.swing.JFormattedTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jRadioButtonNaoConcluida = new javax.swing.JRadioButton();
        jRadioButtonConcluida = new javax.swing.JRadioButton();
        jRadioButtonBaixa = new javax.swing.JRadioButton();
        jRadioButtonMedia = new javax.swing.JRadioButton();
        jRadioButtonAlta = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de cliente ");
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("Importância");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(360, 190, 120, 16);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Título da tarefa");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(10, 10, 90, 16);

        jTextFieldTitulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldTituloActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldTitulo);
        jTextFieldTitulo.setBounds(10, 28, 240, 22);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Descrição da Tarefa");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(10, 60, 120, 16);

        jFormattedTextFieldData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedTextFieldDataActionPerformed(evt);
            }
        });
        getContentPane().add(jFormattedTextFieldData);
        jFormattedTextFieldData.setBounds(20, 210, 64, 22);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("Data de Conclusão");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(10, 190, 120, 16);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("Status da Tarefa");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(190, 190, 120, 16);

        jButton1.setText("Voltar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(440, 350, 72, 23);

        jButton2.setText("Concluir");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(20, 350, 73, 23);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(10, 80, 500, 86);

        jRadioButtonNaoConcluida.setText("Não Concluida");
        getContentPane().add(jRadioButtonNaoConcluida);
        jRadioButtonNaoConcluida.setBounds(180, 210, 110, 21);

        jRadioButtonConcluida.setText("Concluida");
        getContentPane().add(jRadioButtonConcluida);
        jRadioButtonConcluida.setBounds(180, 230, 76, 21);

        jRadioButtonBaixa.setText("Baixa");
        getContentPane().add(jRadioButtonBaixa);
        jRadioButtonBaixa.setBounds(350, 210, 60, 21);

        jRadioButtonMedia.setText("Media");
        getContentPane().add(jRadioButtonMedia);
        jRadioButtonMedia.setBounds(350, 230, 70, 21);

        jRadioButtonAlta.setText("Alta");
        getContentPane().add(jRadioButtonAlta);
        jRadioButtonAlta.setBounds(350, 250, 70, 21);

        setSize(new java.awt.Dimension(564, 431));
        setLocationRelativeTo(null);
    }

    private void jTextFieldTituloActionPerformed(java.awt.event.ActionEvent evt) {

    }

    private void jFormattedTextFieldDataActionPerformed(java.awt.event.ActionEvent evt) {

    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {

    }

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
        // Botão "Concluir"
        cadastrarTarefa(usuarioLogado);
        salvarTarefasEmJSON(usuarioLogado);
        this.dispose();
    }

    private void cadastrarTarefa(String usuario) {
        // Create a new task with the provided user information
        Tarefa novaTarefa = new Tarefa(
                usuario,
                jTextFieldTitulo.getText(),
                jTextArea1.getText(),
                jFormattedTextFieldData.getText(),
                jRadioButtonConcluida.isSelected(),
                obterImportanciaSelecionada()
        );

        // Add the new task to the list of tasks
        tarefas.add(novaTarefa);
    }



    private void carregarTarefasDoJSON() {
        try (FileReader reader = new FileReader("tarefas.json")) {
            // Use JsonReader.setLenient(true) para aceitar JSON malformado
            JsonReader jsonReader = new JsonReader(reader);
            jsonReader.setLenient(true);

            // Converte o JSON para a lista de tarefas
            Gson gson = new Gson();
            tarefas = gson.fromJson(jsonReader, ArrayList.class);

            // Se a lista estiver nula, inicializa uma nova lista
            if (tarefas == null) {
                tarefas = new ArrayList<>();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    private String obterImportanciaSelecionada() {
        if (jRadioButtonBaixa.isSelected()) {
            return "Baixa";
        } else if (jRadioButtonMedia.isSelected()) {
            return "Média";
        } else if (jRadioButtonAlta.isSelected()) {
            return "Alta";
        } else {
            return ""; // Valor padrão, se nenhum estiver selecionado
        }
    }

    public class Tarefa {
        private String usuario;
        private String titulo;
        private String descricao;
        private String dataConclusao;
        private boolean concluida;
        private String importancia;

        // Construtor e getters/setters aqui...

        // Exemplo de construtor:
        public Tarefa(String usuario, String titulo, String descricao, String dataConclusao, boolean concluida, String importancia) {
            this.usuario = usuario;
            this.titulo = titulo;
            this.descricao = descricao;
            this.dataConclusao = dataConclusao;
            this.concluida = concluida;
            this.importancia = importancia;
        }
    }

    private void salvarTarefasEmJSON(String usuario) {
        // Carrega as tarefas existentes do arquivo JSON
        carregarTarefasDoJSON();

        // Adiciona a nova tarefa à lista existente
        Tarefa novaTarefa = new Tarefa(
                usuario,
                jTextFieldTitulo.getText(),
                jTextArea1.getText(),
                jFormattedTextFieldData.getText(),
                jRadioButtonConcluida.isSelected(),
                obterImportanciaSelecionada()
        );

        tarefas.add(novaTarefa);

        // Converte a lista atualizada para formato JSON
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String json = gson.toJson(tarefas);

        // Salva o JSON no arquivo
        try (FileWriter writer = new FileWriter("tarefas.json")) {
            writer.write(json);
        } catch (IOException e) {
            e.printStackTrace();
        }
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
            java.util.logging.Logger.getLogger(Tcadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tcadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tcadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tcadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        Tcadastro tcadastro = new Tcadastro();
        tcadastro.carregarTarefasDoJSON();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tcadastro().setVisible(true);
            }
        });
    }

    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JFormattedTextField jFormattedTextFieldData;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JRadioButton jRadioButtonAlta;
    private javax.swing.JRadioButton jRadioButtonBaixa;
    private javax.swing.JRadioButton jRadioButtonConcluida;
    private javax.swing.JRadioButton jRadioButtonMedia;
    private javax.swing.JRadioButton jRadioButtonNaoConcluida;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextFieldTitulo;

}