package com.mycompany.gerenciadordetarefas;

import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import javax.swing.DefaultListModel;
import java.util.stream.Collectors;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import static com.mycompany.gerenciadordetarefas.TelaLogin.usuarioLogado;

public class TelaPrincipal extends javax.swing.JFrame {


    public TelaPrincipal() {
        initComponents();
    }


    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jButton1 = new javax.swing.JButton();
        jButtonCriarTarefa = new javax.swing.JButton();
        jButtonEditarTarefa = new javax.swing.JButton();
        jButtonRemoverTarefa = new javax.swing.JButton();
        jTextFieldBuscarTarefa = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButtonRemoverTarefa1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 204));
        setResizable(false);

        jList1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = {};
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(jList1);

        jButton1.setText("Sair");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButtonCriarTarefa.setText("Criar Tarefa");
        jButtonCriarTarefa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCriarTarefaActionPerformed(evt);
            }
        });

        jButtonEditarTarefa.setText("Editar Tarefa");
        jButtonEditarTarefa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditarTarefaActionPerformed(evt);
            }
        });

        jButtonRemoverTarefa.setText("Remover Tarefa");
        jButtonRemoverTarefa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRemoverTarefaActionPerformed(evt);
            }
        });

        jTextFieldBuscarTarefa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldBuscarTarefaActionPerformed(evt);
            }
        });

        jLabel1.setText("Buscar Tarefa");

        jButton2.setText("Buscar");

        jButtonRemoverTarefa1.setText("Listar Tarefas");
        jButtonRemoverTarefa1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRemoverTarefa1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(jButtonRemoverTarefa, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(jButtonCriarTarefa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(jButtonEditarTarefa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(jButtonRemoverTarefa1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(jTextFieldBuscarTarefa))
                                                .addGap(20, 20, 20))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(jButton2)
                                                .addGap(41, 41, 41))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(jLabel1)
                                                .addGap(41, 41, 41))))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 323, Short.MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(jButtonCriarTarefa)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonEditarTarefa)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonRemoverTarefa)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonRemoverTarefa1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldBuscarTarefa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton2)
                                .addGap(36, 36, 36)
                                .addComponent(jButton1)
                                .addContainerGap())
        );

        setSize(new java.awt.Dimension(585, 330));
        setLocationRelativeTo(null);
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        System.exit(0);
    }


    private void jButtonEditarTarefaActionPerformed(java.awt.event.ActionEvent evt) {


    }

    private void jButtonRemoverTarefaActionPerformed(java.awt.event.ActionEvent evt) {

    }

    private void jTextFieldBuscarTarefaActionPerformed(java.awt.event.ActionEvent evt) {
        String termoBusca = jTextFieldBuscarTarefa.getText();

        if (termoBusca != null && !termoBusca.isEmpty()) {
            List<Tarefa> tarefas = GerenciadorTarefas.carregarTarefas(usuarioLogado);

            if (tarefas != null) {
                DefaultListModel<String> model = new DefaultListModel<>();
                for (Tarefa tarefa : tarefas) {
                    // Verifica se a descrição ou o título contêm o termo de busca
                    if (tarefa.getDescricao().contains(termoBusca) || tarefa.getTitulo().contains(termoBusca)) {
                        // Adiciona título e data de conclusão à lista
                        model.addElement(tarefa.getTitulo() + " - " + tarefa.getDescricao() + " (Conclusão em: " + tarefa.getDataConclusao() + ")");
                    }
                }
                jList1.setModel(model);
            } else {
                // Lógica de tratamento de erro, se necessário
            }
        }
    }


    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
        String termoBusca = jTextFieldBuscarTarefa.getText();

        if (termoBusca != null && !termoBusca.isEmpty()) {
            List<Tarefa> tarefas = GerenciadorTarefas.carregarTarefas(usuarioLogado);

            if (tarefas != null) {
                DefaultListModel<String> model = new DefaultListModel<>();
                for (Tarefa tarefa : tarefas) {
                    // Verifica se a descrição ou o título contêm o termo de busca
                    if (tarefa.getDescricao().contains(termoBusca) || tarefa.getTitulo().contains(termoBusca)) {
                        // Adiciona título e data de conclusão à lista
                        model.addElement(tarefa.getTitulo() + " - " + tarefa.getDescricao() + " (Conclusão em: " + tarefa.getDataConclusao() + ")");
                    }
                }
                jList1.setModel(model);
            } else {
                // Lógica de tratamento de erro, se necessário
            }
        }
    }


    private void jButtonCriarTarefaActionPerformed(java.awt.event.ActionEvent evt) {
        Tcadastro telaCadastro = new Tcadastro();
        telaCadastro.setVisible(true);
    }



    public class GerenciadorTarefas {

        private static final String CAMINHO_ARQUIVO_JSON = "tarefas.json";


        public static List<Tarefa> carregarTarefas(String usuario) {
            try (FileReader reader = new FileReader(CAMINHO_ARQUIVO_JSON)) {
                TypeToken<List<Tarefa>> token = new TypeToken<List<Tarefa>>() {};
                List<Tarefa> todasAsTarefas = new Gson().fromJson(reader, token.getType());

                // Filtra as tarefas do usuário
                return todasAsTarefas.stream()
                        .filter(tarefa -> tarefa.getUsuario().equals(usuario))
                        .collect(Collectors.toList());

            } catch (IOException e) {
                e.printStackTrace();
                return null;
            }
        }
    }






    public class Tarefa {
        private String usuario;  // Adicione esta linha
        private String descricao;

        private String titulo;  // Adicione esta linha

        private String dataConclusao;  // Adicione esta linha

        // Outros campos e métodos necessários

        public String getDescricao() {
            return descricao;
        }

        public void setDescricao(String descricao) {
            this.descricao = descricao;
        }

        public String getUsuario() {
            return usuario;
        }

        // Adicione este método
        public void setUsuario(String usuario) {
            this.usuario = usuario;
        }

        public String getTitulo() {
            return titulo;
        }

        // Adicione este método
        public void setTitulo(String titulo) {
            this.titulo = titulo;
        }

        public String getDataConclusao() {
            return dataConclusao;
        }

        // Adicione este método
        public void setDataConclusao(String dataConclusao) {
            this.dataConclusao = dataConclusao;
        }
    }


    private void jButtonRemoverTarefa1ActionPerformed(java.awt.event.ActionEvent evt) {
        List<Tarefa> tarefas = GerenciadorTarefas.carregarTarefas(usuarioLogado);

        if (tarefas != null) {
            DefaultListModel<String> model = new DefaultListModel<>();
            for (Tarefa tarefa : tarefas) {
                // Adiciona título e data de conclusão à lista
                model.addElement(tarefa.getTitulo() + " - " + tarefa.getDescricao() + " (Conclusão em: " + tarefa.getDataConclusao() + ")");
            }
            jList1.setModel(model);
        } else {
            // Lógica de tratamento de erro, se necessário
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
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }


        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButtonCriarTarefa;
    private javax.swing.JButton jButtonEditarTarefa;
    private javax.swing.JButton jButtonRemoverTarefa;
    private javax.swing.JButton jButtonRemoverTarefa1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextFieldBuscarTarefa;

}