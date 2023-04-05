package View;


import Controller.ControllerVara;
import Model.UniLotePeqException;
import Model.Vara;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class CadVara extends javax.swing.JFrame {


    private static CadVara unicoCadVara;   
    private Vara v = new Vara();
  

    public static CadVara getCadVara(){
        if(unicoCadVara == null){
            unicoCadVara = new CadVara();
        }
        return unicoCadVara;
    }
    private CadVara() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jlInfo = new javax.swing.JLabel();
        jlFabri = new javax.swing.JLabel();
        jlCodigo = new javax.swing.JLabel();
        jlUniLote = new javax.swing.JLabel();
        jlMarca = new javax.swing.JLabel();
        jlModelo = new javax.swing.JLabel();
        jlPreco = new javax.swing.JLabel();
        jlTamanho = new javax.swing.JLabel();
        jlAcao = new javax.swing.JLabel();
        jlResistencia = new javax.swing.JLabel();
        jtCodigo = new javax.swing.JTextField();
        jtUnidades = new javax.swing.JTextField();
        jtModelo = new javax.swing.JTextField();
        jtMarca = new javax.swing.JTextField();
        jtPreco = new javax.swing.JTextField();
        jtTamanho = new javax.swing.JTextField();
        jtAcao = new javax.swing.JTextField();
        jtResistencia = new javax.swing.JTextField();
        jlDia = new javax.swing.JLabel();
        jlMes = new javax.swing.JLabel();
        jlAno = new javax.swing.JLabel();
        jtDia = new javax.swing.JTextField();
        jtMes = new javax.swing.JTextField();
        jtAno = new javax.swing.JTextField();
        brSair = new javax.swing.JButton();
        btLimpar = new javax.swing.JButton();
        btCadastrar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbVara = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("CADASTRAR VARA");
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });

        jlInfo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jlInfo.setText("INFORMAÇÕES:");

        jlFabri.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jlFabri.setText("FABRICAÇÃO:");

        jlCodigo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jlCodigo.setText("CÓDIGO LOTE");

        jlUniLote.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jlUniLote.setText("UNIDADES LOTE");

        jlMarca.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jlMarca.setText("MARCA");

        jlModelo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jlModelo.setText("MODELO");

        jlPreco.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jlPreco.setText("PREÇO");

        jlTamanho.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jlTamanho.setText("TAMANHO(Metros)");

        jlAcao.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jlAcao.setText("AÇÃO");

        jlResistencia.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jlResistencia.setText("RESISTÊNCIA(lLibras)");

        jlDia.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jlDia.setText("DIA");

        jlMes.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jlMes.setText("MÊS");

        jlAno.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jlAno.setText("ANO");

        brSair.setText("SAIR");
        brSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brSairActionPerformed(evt);
            }
        });

        btLimpar.setText("LIMPAR");
        btLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimparActionPerformed(evt);
            }
        });

        btCadastrar.setText("CADASTRAR");
        btCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadastrarActionPerformed(evt);
            }
        });

        tbVara.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "CÓDIGO LOTE", "UNIDADES LOTE", "MODELO"
            }
        ));
        tbVara.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbVaraMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbVara);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jlAcao)
                            .addComponent(jlTamanho)
                            .addComponent(jlResistencia)
                            .addComponent(jlUniLote)
                            .addComponent(jlCodigo)
                            .addComponent(jlModelo)
                            .addComponent(jlMarca)
                            .addComponent(jlPreco))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jtCodigo, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
                            .addComponent(jtUnidades)
                            .addComponent(jtModelo)
                            .addComponent(jtMarca)
                            .addComponent(jtPreco)
                            .addComponent(jtTamanho)
                            .addComponent(jtAcao)
                            .addComponent(jtResistencia)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addComponent(jlInfo)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(9, 9, 9)
                                        .addComponent(jlDia)
                                        .addGap(34, 34, 34)
                                        .addComponent(jlMes)
                                        .addGap(27, 27, 27)
                                        .addComponent(jlAno, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jtDia, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jtMes, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jtAno, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(93, 93, 93))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jlFabri)
                        .addGap(116, 116, 116))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btCadastrar)
                .addGap(18, 18, 18)
                .addComponent(btLimpar)
                .addGap(14, 14, 14)
                .addComponent(brSair)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jlInfo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlCodigo)
                            .addComponent(jtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlUniLote)
                            .addComponent(jtUnidades, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlModelo)
                            .addComponent(jtModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jlFabri, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jlDia)
                                    .addComponent(jlMes))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jlAno)
                                .addGap(8, 8, 8)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlMarca)
                            .addComponent(jtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlPreco)
                            .addComponent(jtPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlTamanho)
                            .addComponent(jtTamanho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlAcao)
                            .addComponent(jtAcao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlResistencia)
                    .addComponent(jtResistencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(brSair)
                    .addComponent(btLimpar)
                    .addComponent(btCadastrar)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void brSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brSairActionPerformed
        sair();
    }//GEN-LAST:event_brSairActionPerformed

    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed
        limpar();
    }//GEN-LAST:event_btLimparActionPerformed

    private void btCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadastrarActionPerformed
        cadVara();
        listaTab();
    }//GEN-LAST:event_btCadastrarActionPerformed

    private void tbVaraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbVaraMouseClicked
        selectTab();
    }//GEN-LAST:event_tbVaraMouseClicked

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        listaTab();
    }//GEN-LAST:event_formWindowGainedFocus

    public void selectTab(){
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
    
    public void listaTab(){
        DefaultTableModel modelo = (DefaultTableModel) tbVara.getModel();

        modelo.setNumRows(0);
        
        ControllerVara.carregaTabela(modelo);
    }
    
    public int cadVara(){
        v = new Vara();
        v.setCodigoLote(Integer.parseInt(jtCodigo.getText()));
        try{
            v.setUnidadesLote(Integer.parseInt(jtUnidades.getText()));
        }
        catch(UniLotePeqException upe){
            upe.impUniLotePeq();
            v = upe.corrigeUniLotePeq(v);
        }
        catch(NumberFormatException nfe){
            JOptionPane.showMessageDialog(
                    null,
                    "VALOR DA UNIDADES LOTE DEVE SER INTEIRO",
                    "Erro de Cadastro",
                    0
            );
            limpar();
        }
        v.setMarca(jtMarca.getText());
        v.setModelo(jtModelo.getText());
        v.setPreco(Double.valueOf(jtPreco.getText()));
        v.setTamanho(jtTamanho.getText());  
        v.setAcao(jtAcao.getText());
        v.setResistencia(jtResistencia.getText());
        v.setFabri(jtDia.getText()+"/"+jtMes.getText()+"/"+jtAno.getText());
        
        boolean feed = ControllerVara.cadastrarVara(v);
       
       if(feed){
                JOptionPane.showMessageDialog(
                    null,
                    "Produto cadastrada com sucesso!",
                    "Cadastro Ok",
                    1
                );
                limpar();
       }
       else{
                JOptionPane.showMessageDialog(
                    null,
                    "Já existe um produto com este código",
                    "Erro de Cadastro",
                    0
                );
                limpar();
       }
       return 0;
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
    
    public void limpar(){
        jtCodigo.setText("");
        jtUnidades.setText("");
        jtMarca.setText("");
        jtModelo.setText("");
        jtPreco.setText("");
        jtTamanho.setText("");
        jtAcao.setText("");
        jtResistencia.setText("");
        jtDia.setText("");
        jtMes.setText("");
        jtAno.setText("");
        jtCodigo.requestFocus();
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
            java.util.logging.Logger.getLogger(CadVara.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadVara.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadVara.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadVara.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadVara().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton brSair;
    private javax.swing.JButton btCadastrar;
    private javax.swing.JButton btLimpar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jlAcao;
    private javax.swing.JLabel jlAno;
    private javax.swing.JLabel jlCodigo;
    private javax.swing.JLabel jlDia;
    private javax.swing.JLabel jlFabri;
    private javax.swing.JLabel jlInfo;
    private javax.swing.JLabel jlMarca;
    private javax.swing.JLabel jlMes;
    private javax.swing.JLabel jlModelo;
    private javax.swing.JLabel jlPreco;
    private javax.swing.JLabel jlResistencia;
    private javax.swing.JLabel jlTamanho;
    private javax.swing.JLabel jlUniLote;
    private javax.swing.JTextField jtAcao;
    private javax.swing.JTextField jtAno;
    private javax.swing.JTextField jtCodigo;
    private javax.swing.JTextField jtDia;
    private javax.swing.JTextField jtMarca;
    private javax.swing.JTextField jtMes;
    private javax.swing.JTextField jtModelo;
    private javax.swing.JTextField jtPreco;
    private javax.swing.JTextField jtResistencia;
    private javax.swing.JTextField jtTamanho;
    private javax.swing.JTextField jtUnidades;
    private javax.swing.JTable tbVara;
    // End of variables declaration//GEN-END:variables
}
