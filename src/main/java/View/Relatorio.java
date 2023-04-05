package View;


import Controller.ControllerAnzol;
import Controller.ControllerCarretilha;
import Controller.ControllerLinha;
import Controller.ControllerVara;
import Model.Carretilha;
import Model.Linha;
import Model.Vara;
import Model.Anzol;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class Relatorio extends javax.swing.JFrame {

    private static Relatorio unicoRelatorio;   
    private Anzol a = new Anzol();
    private Carretilha c = new Carretilha();
    private Linha l = new Linha();
    private Vara v = new Vara();

    public static Relatorio getRelatorio(){

        if(unicoRelatorio== null){
            unicoRelatorio = new Relatorio();
        }
        return unicoRelatorio;
    }
    private Relatorio() {
        initComponents();
        this.setExtendedState(Relatorio.MAXIMIZED_BOTH);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane4 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        ANZOL = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbAnzol = new javax.swing.JTable();
        CARRETILHA = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbCarretilha = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbLinha = new javax.swing.JTable();
        LINHA = new javax.swing.JLabel();
        VARA = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tbVara = new javax.swing.JTable();
        consultar = new javax.swing.JLabel();
        jlCodigo = new javax.swing.JLabel();
        jtCodigo = new javax.swing.JTextField();
        btAnzol = new javax.swing.JToggleButton();
        btCarretilha = new javax.swing.JButton();
        btLinha = new javax.swing.JButton();
        btVara = new javax.swing.JButton();
        lbCodigoMostra = new javax.swing.JLabel();
        jtMostraCodigo = new javax.swing.JTextField();
        jlUniLoteMostra = new javax.swing.JLabel();
        jtMostraUni = new javax.swing.JTextField();
        jlMostraMarca = new javax.swing.JLabel();
        jtMostraMarca = new javax.swing.JTextField();
        jlMostraModelo = new javax.swing.JLabel();
        jtMostraModelo = new javax.swing.JTextField();
        jlPreco = new javax.swing.JLabel();
        jtMostraPreco = new javax.swing.JTextField();
        jlInfo = new javax.swing.JLabel();
        btSair = new javax.swing.JButton();
        btLimpar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("RELATÓRIO");
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });

        ANZOL.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        ANZOL.setText("PRODUTO: ANZOL");

        tbAnzol.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "CÓDIGO LOTE", "UNIDADES LOTE", "MARCA", "MODELO", "PREÇO", "PREÇO DESCONTO 10%", "TAMANHO", "UNIDADES PACOTE", "FABRICAÇÃO"
            }
        ));
        tbAnzol.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbAnzolMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbAnzol);
        if (tbAnzol.getColumnModel().getColumnCount() > 0) {
            tbAnzol.getColumnModel().getColumn(0).setMinWidth(100);
            tbAnzol.getColumnModel().getColumn(0).setMaxWidth(100);
            tbAnzol.getColumnModel().getColumn(1).setMinWidth(120);
            tbAnzol.getColumnModel().getColumn(1).setMaxWidth(120);
            tbAnzol.getColumnModel().getColumn(2).setMinWidth(80);
            tbAnzol.getColumnModel().getColumn(2).setMaxWidth(80);
            tbAnzol.getColumnModel().getColumn(3).setMinWidth(80);
            tbAnzol.getColumnModel().getColumn(3).setMaxWidth(80);
            tbAnzol.getColumnModel().getColumn(4).setMinWidth(70);
            tbAnzol.getColumnModel().getColumn(4).setMaxWidth(70);
            tbAnzol.getColumnModel().getColumn(5).setMinWidth(160);
            tbAnzol.getColumnModel().getColumn(5).setMaxWidth(160);
            tbAnzol.getColumnModel().getColumn(5).setHeaderValue("PREÇO DESCONTO 10%");
            tbAnzol.getColumnModel().getColumn(6).setMinWidth(80);
            tbAnzol.getColumnModel().getColumn(6).setMaxWidth(80);
            tbAnzol.getColumnModel().getColumn(7).setMinWidth(140);
            tbAnzol.getColumnModel().getColumn(7).setMaxWidth(140);
            tbAnzol.getColumnModel().getColumn(8).setMinWidth(85);
            tbAnzol.getColumnModel().getColumn(8).setMaxWidth(85);
        }

        CARRETILHA.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        CARRETILHA.setText("PRODUTO: CARRETILHA");

        tbCarretilha.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "CÓDIGO LOTE", "UNIDADES LOTE", "MARCA", "MODELO", "PREÇO", "PREÇO DESCONTO 10%", "CAPACIDADE LINHA(Metros)", "QUANTIDADE  ROLAMENTO", "PERFIL", "FABRICAÇÃO"
            }
        ));
        tbCarretilha.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbCarretilhaMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbCarretilha);
        if (tbCarretilha.getColumnModel().getColumnCount() > 0) {
            tbCarretilha.getColumnModel().getColumn(0).setMinWidth(100);
            tbCarretilha.getColumnModel().getColumn(0).setMaxWidth(100);
            tbCarretilha.getColumnModel().getColumn(1).setMinWidth(120);
            tbCarretilha.getColumnModel().getColumn(1).setMaxWidth(120);
            tbCarretilha.getColumnModel().getColumn(2).setMinWidth(80);
            tbCarretilha.getColumnModel().getColumn(2).setMaxWidth(80);
            tbCarretilha.getColumnModel().getColumn(3).setMinWidth(80);
            tbCarretilha.getColumnModel().getColumn(3).setMaxWidth(80);
            tbCarretilha.getColumnModel().getColumn(4).setMinWidth(70);
            tbCarretilha.getColumnModel().getColumn(4).setMaxWidth(70);
            tbCarretilha.getColumnModel().getColumn(5).setMinWidth(160);
            tbCarretilha.getColumnModel().getColumn(5).setMaxWidth(160);
            tbCarretilha.getColumnModel().getColumn(6).setMinWidth(180);
            tbCarretilha.getColumnModel().getColumn(6).setMaxWidth(180);
            tbCarretilha.getColumnModel().getColumn(7).setMinWidth(180);
            tbCarretilha.getColumnModel().getColumn(7).setMaxWidth(180);
            tbCarretilha.getColumnModel().getColumn(8).setMinWidth(70);
            tbCarretilha.getColumnModel().getColumn(8).setMaxWidth(70);
            tbCarretilha.getColumnModel().getColumn(9).setMinWidth(85);
            tbCarretilha.getColumnModel().getColumn(9).setMaxWidth(85);
        }

        tbLinha.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "CÓDIGO LOTE", "UNIDADES LOTE", "MARCA", "MODELO", "PREÇO", "PREÇO DESCONTO 10%", "COMPRIMENTO(Metros)", "ESPESSURA(mm)", "RESISTÊNCIA(Libras)", "COR", "FABRICAÇÃO"
            }
        ));
        tbLinha.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbLinhaMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tbLinha);
        if (tbLinha.getColumnModel().getColumnCount() > 0) {
            tbLinha.getColumnModel().getColumn(0).setMinWidth(100);
            tbLinha.getColumnModel().getColumn(0).setMaxWidth(100);
            tbLinha.getColumnModel().getColumn(1).setMinWidth(120);
            tbLinha.getColumnModel().getColumn(1).setMaxWidth(120);
            tbLinha.getColumnModel().getColumn(2).setMinWidth(80);
            tbLinha.getColumnModel().getColumn(2).setMaxWidth(80);
            tbLinha.getColumnModel().getColumn(3).setMinWidth(80);
            tbLinha.getColumnModel().getColumn(3).setMaxWidth(80);
            tbLinha.getColumnModel().getColumn(4).setMinWidth(70);
            tbLinha.getColumnModel().getColumn(4).setMaxWidth(70);
            tbLinha.getColumnModel().getColumn(5).setMinWidth(160);
            tbLinha.getColumnModel().getColumn(5).setMaxWidth(160);
            tbLinha.getColumnModel().getColumn(6).setMinWidth(150);
            tbLinha.getColumnModel().getColumn(6).setMaxWidth(150);
            tbLinha.getColumnModel().getColumn(7).setMinWidth(120);
            tbLinha.getColumnModel().getColumn(7).setMaxWidth(120);
            tbLinha.getColumnModel().getColumn(8).setMinWidth(130);
            tbLinha.getColumnModel().getColumn(8).setMaxWidth(130);
            tbLinha.getColumnModel().getColumn(9).setMinWidth(60);
            tbLinha.getColumnModel().getColumn(9).setMaxWidth(60);
            tbLinha.getColumnModel().getColumn(10).setMinWidth(85);
            tbLinha.getColumnModel().getColumn(10).setMaxWidth(85);
        }

        LINHA.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        LINHA.setText("PRODUTO: LINHA");

        VARA.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        VARA.setText("PRODUTO: VARA");

        tbVara.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "CÓDIGO LOTE", "UNIDADES LOTE", "MARCA", "MODELO", "PREÇO", "PREÇO DESCONTO 10%", "TAMANHO(Metros)", "AÇÃO", "RESISTÊNCIA(Libras)", "FABRICAÇÃO"
            }
        ));
        tbVara.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbVaraMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(tbVara);
        if (tbVara.getColumnModel().getColumnCount() > 0) {
            tbVara.getColumnModel().getColumn(0).setMinWidth(100);
            tbVara.getColumnModel().getColumn(0).setMaxWidth(100);
            tbVara.getColumnModel().getColumn(1).setMinWidth(120);
            tbVara.getColumnModel().getColumn(1).setMaxWidth(120);
            tbVara.getColumnModel().getColumn(2).setMinWidth(70);
            tbVara.getColumnModel().getColumn(2).setMaxWidth(70);
            tbVara.getColumnModel().getColumn(3).setMinWidth(80);
            tbVara.getColumnModel().getColumn(3).setMaxWidth(80);
            tbVara.getColumnModel().getColumn(4).setMinWidth(70);
            tbVara.getColumnModel().getColumn(4).setMaxWidth(70);
            tbVara.getColumnModel().getColumn(5).setMinWidth(160);
            tbVara.getColumnModel().getColumn(5).setMaxWidth(160);
            tbVara.getColumnModel().getColumn(6).setMinWidth(130);
            tbVara.getColumnModel().getColumn(6).setMaxWidth(130);
            tbVara.getColumnModel().getColumn(7).setMinWidth(60);
            tbVara.getColumnModel().getColumn(7).setMaxWidth(60);
            tbVara.getColumnModel().getColumn(8).setMinWidth(140);
            tbVara.getColumnModel().getColumn(8).setMaxWidth(140);
            tbVara.getColumnModel().getColumn(9).setMinWidth(85);
            tbVara.getColumnModel().getColumn(9).setMaxWidth(85);
        }

        consultar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        consultar.setText("CONSULTAR:");

        jlCodigo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jlCodigo.setText("CÓDIGO LOTE:");

        btAnzol.setText("ANZOL");
        btAnzol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAnzolActionPerformed(evt);
            }
        });

        btCarretilha.setText("CARRETILHA");
        btCarretilha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCarretilhaActionPerformed(evt);
            }
        });

        btLinha.setText("LINHA");
        btLinha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLinhaActionPerformed(evt);
            }
        });

        btVara.setText("VARA");
        btVara.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVaraActionPerformed(evt);
            }
        });

        lbCodigoMostra.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbCodigoMostra.setText("CÓDIGO LOTE:");

        jlUniLoteMostra.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jlUniLoteMostra.setText("UNIDADES LOTE:");

        jlMostraMarca.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jlMostraMarca.setText("MARCA:");

        jlMostraModelo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jlMostraModelo.setText("MODELO:");

        jlPreco.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jlPreco.setText("PREÇO:");

        jlInfo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jlInfo.setText("INFORMAÇÕES");

        btSair.setText("SAIR");
        btSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSairActionPerformed(evt);
            }
        });

        btLimpar.setText("LIMPAR");
        btLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimparActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ANZOL)
                    .addComponent(LINHA)
                    .addComponent(CARRETILHA)
                    .addComponent(VARA)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1128, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 918, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(consultar)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jlCodigo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btAnzol)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btCarretilha)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btLinha)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btVara)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jtMostraUni, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jlUniLoteMostra)
                                            .addComponent(lbCodigoMostra)
                                            .addComponent(jlMostraMarca))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jtMostraCodigo)
                                            .addComponent(jtMostraMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(59, 59, 59)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jlPreco)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jlMostraModelo)
                                        .addGap(3, 3, 3)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jtMostraModelo, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
                                    .addComponent(jtMostraPreco)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(198, 198, 198)
                                .addComponent(jlInfo))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btSair)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btLimpar))
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 1022, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 1164, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 125, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ANZOL)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(CARRETILHA)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(LINHA)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(VARA)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbCodigoMostra)
                            .addComponent(jtMostraCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlMostraModelo)
                            .addComponent(jtMostraModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlUniLoteMostra)
                            .addComponent(jtMostraUni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlPreco)
                            .addComponent(jtMostraPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(4, 4, 4)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlMostraMarca)
                            .addComponent(jtMostraMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(consultar)
                            .addComponent(jlInfo))
                        .addGap(34, 34, 34)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlCodigo)
                            .addComponent(jtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btAnzol)
                            .addComponent(btCarretilha)
                            .addComponent(btLinha)
                            .addComponent(btVara))))
                .addGap(346, 346, 346)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btSair)
                    .addComponent(btLimpar))
                .addContainerGap(126, Short.MAX_VALUE))
        );

        jScrollPane4.setViewportView(jPanel1);

        getContentPane().add(jScrollPane4, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        listaTABS();
    }//GEN-LAST:event_formWindowGainedFocus

    private void btAnzolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAnzolActionPerformed
        consulAnzol();
    }//GEN-LAST:event_btAnzolActionPerformed

    private void btSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairActionPerformed
        sair();
    }//GEN-LAST:event_btSairActionPerformed

    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed
        limpar();
    }//GEN-LAST:event_btLimparActionPerformed

    private void btCarretilhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCarretilhaActionPerformed
        consulCarretilha();
    }//GEN-LAST:event_btCarretilhaActionPerformed

    private void btLinhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLinhaActionPerformed
        consulLinha();
    }//GEN-LAST:event_btLinhaActionPerformed

    private void btVaraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVaraActionPerformed
        consulVara();
    }//GEN-LAST:event_btVaraActionPerformed

    private void tbAnzolMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbAnzolMouseClicked
        selectTab(1);
    }//GEN-LAST:event_tbAnzolMouseClicked

    private void tbCarretilhaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbCarretilhaMouseClicked
        selectTab(2);
    }//GEN-LAST:event_tbCarretilhaMouseClicked

    private void tbLinhaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbLinhaMouseClicked
        selectTab(3);
    }//GEN-LAST:event_tbLinhaMouseClicked

    private void tbVaraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbVaraMouseClicked
        selectTab(4);
    }//GEN-LAST:event_tbVaraMouseClicked
    
    public void selectTab(int i){
        if(i==1){
            String valLinTab = "";
            int posLin = tbAnzol.getSelectedRow();


            for(int coluna = 0;coluna < tbAnzol.getColumnCount(); coluna++ ){
                valLinTab += tbAnzol.getModel().getValueAt(posLin,coluna).toString() + "\n";


            }
            JOptionPane.showMessageDialog(
                    null,
                    "Valor escolhido: \n"+valLinTab,
                    "Seleção na tabela",
                    1
            );
        }
        if(i==2){
            String valLinTab = "";
            int posLin = tbCarretilha.getSelectedRow();


            for(int coluna = 0;coluna < tbCarretilha.getColumnCount(); coluna++ ){
                valLinTab += tbCarretilha.getModel().getValueAt(posLin,coluna).toString() + "\n";


            }
            JOptionPane.showMessageDialog(
                    null,
                    "Valor escolhido: \n"+valLinTab,
                    "Seleção na tabela",
                    1
            );
        }
        if(i==3){
            String valLinTab = "";
            int posLin = tbLinha.getSelectedRow();


            for(int coluna = 0;coluna < tbLinha.getColumnCount(); coluna++ ){
                valLinTab += tbLinha.getModel().getValueAt(posLin,coluna).toString() + "\n";


            }
            JOptionPane.showMessageDialog(
                    null,
                    "Valor escolhido: \n"+valLinTab,
                    "Seleção na tabela",
                    1
            );
        }
        if(i==4){
            String valLinTab = "";
            int posLin = tbVara.getSelectedRow();


            for(int coluna = 0;coluna < tbVara.getColumnCount(); coluna++ ){
                valLinTab += tbVara.getModel().getValueAt(posLin,coluna).toString() + "\n";


            }
            JOptionPane.showMessageDialog(
                    null,
                    "Valor escolhido: \n"+valLinTab,
                    "Seleção na tabela",
                    1
            );
        }
    }
    
    public void listaTABS(){
        DefaultTableModel modelo = (DefaultTableModel) tbAnzol.getModel();
        
        modelo.setNumRows(0);
        
        ControllerAnzol.carregaTabelaFull(modelo);
        
        DefaultTableModel modelo2 = (DefaultTableModel) tbCarretilha.getModel();
        modelo2.setNumRows(0);
        ControllerCarretilha.carregaTabelaFull(modelo2);
        DefaultTableModel modelo3 = (DefaultTableModel) tbLinha.getModel();
        modelo3.setNumRows(0);
        ControllerLinha.carregaTabelaFull(modelo3);
        DefaultTableModel modelo4 = (DefaultTableModel) tbVara.getModel();
        modelo4.setNumRows(0);
        ControllerVara.carregaTabelaFull(modelo4);
    }   

 
    
    public void consulAnzol(){
        a = new Anzol();
        a.setCodigoLote(Integer.parseInt(jtCodigo.getText()));
        a = ControllerAnzol.consulta(a);
        
        if(a != null){
            jtMostraCodigo.setText(Integer.toString(a.getCodigoLote()));
            jtMostraUni.setText(Integer.toString(a.getUnidadesLote()));
            jtMostraMarca.setText(a.getMarca());
            jtMostraModelo.setText(a.getModelo());
            jtMostraPreco.setText(Double.toString(a.getPreco()));
        }
        else{
                  JOptionPane.showMessageDialog(
                    null,
                    "Não existe um produto com este Código",
                    "Erro de Exclusão",
                    0
                );
               
        }
    }
    
    public void consulCarretilha(){
        c = new Carretilha();
        c.setCodigoLote(Integer.parseInt(jtCodigo.getText()));
        c = ControllerCarretilha.consulta(c);
        
        if(c != null){
            jtMostraCodigo.setText(Integer.toString(c.getCodigoLote()));
            jtMostraUni.setText(Integer.toString(c.getUnidadesLote()));
            jtMostraMarca.setText(c.getMarca());
            jtMostraModelo.setText(c.getModelo());
            jtMostraPreco.setText(Double.toString(c.getPreco()));
        }
        else{
                  JOptionPane.showMessageDialog(
                    null,
                    "Não existe um produto com este Código",
                    "Erro de Exclusão",
                    0
                );
               
        }
    }
    
    public void consulLinha(){
        l = new Linha();
        l.setCodigoLote(Integer.parseInt(jtCodigo.getText()));
        l = ControllerLinha.consulta(l);
        
        if(l != null){
            jtMostraCodigo.setText(Integer.toString(l.getCodigoLote()));
            jtMostraUni.setText(Integer.toString(l.getUnidadesLote()));
            jtMostraMarca.setText(l.getMarca());
            jtMostraModelo.setText(l.getModelo());
            jtMostraPreco.setText(Double.toString(l.getPreco()));
        }
        else{
                  JOptionPane.showMessageDialog(
                    null,
                    "Não existe um produto com este Código",
                    "Erro de Exclusão",
                    0
                );
               
        }
    }
    
    public void consulVara(){
        v = new Vara();
        v.setCodigoLote(Integer.parseInt(jtCodigo.getText()));
        v = ControllerVara.consulta(v);
        
        if(v != null){
            jtMostraCodigo.setText(Integer.toString(v.getCodigoLote()));
            jtMostraUni.setText(Integer.toString(v.getUnidadesLote()));
            jtMostraMarca.setText(v.getMarca());
            jtMostraModelo.setText(v.getModelo());
            jtMostraPreco.setText(Double.toString(v.getPreco()));
        }
        else{
                  JOptionPane.showMessageDialog(
                    null,
                    "Não existe um produto com este Código",
                    "Erro de Exclusão",
                    0
                );
               
        }
    }
    
    public void limpar(){
        jtCodigo.setText("");
        jtMostraCodigo.setText("");
        jtMostraUni.setText("");
        jtMostraPreco.setText("");
        jtMostraModelo.setText("");
        jtMostraMarca.setText("");
        jtCodigo.requestFocus();
    }
    public void sair(){
        int resp = JOptionPane.showConfirmDialog(
                    null,
                    "Deseja sair?",
                    "Saida",
                    JOptionPane.YES_NO_OPTION
                );
        if(resp == 0){
            dispose();
        }
        else{
            limpar();
        }
    }
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Relatorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Relatorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Relatorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Relatorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Relatorio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ANZOL;
    private javax.swing.JLabel CARRETILHA;
    private javax.swing.JLabel LINHA;
    private javax.swing.JLabel VARA;
    private javax.swing.JToggleButton btAnzol;
    private javax.swing.JButton btCarretilha;
    private javax.swing.JButton btLimpar;
    private javax.swing.JButton btLinha;
    private javax.swing.JButton btSair;
    private javax.swing.JButton btVara;
    private javax.swing.JLabel consultar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JLabel jlCodigo;
    private javax.swing.JLabel jlInfo;
    private javax.swing.JLabel jlMostraMarca;
    private javax.swing.JLabel jlMostraModelo;
    private javax.swing.JLabel jlPreco;
    private javax.swing.JLabel jlUniLoteMostra;
    private javax.swing.JTextField jtCodigo;
    private javax.swing.JTextField jtMostraCodigo;
    private javax.swing.JTextField jtMostraMarca;
    private javax.swing.JTextField jtMostraModelo;
    private javax.swing.JTextField jtMostraPreco;
    private javax.swing.JTextField jtMostraUni;
    private javax.swing.JLabel lbCodigoMostra;
    private javax.swing.JTable tbAnzol;
    private javax.swing.JTable tbCarretilha;
    private javax.swing.JTable tbLinha;
    private javax.swing.JTable tbVara;
    // End of variables declaration//GEN-END:variables
}
