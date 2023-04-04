package View;


import Model.Linha;
import Model.BdLinha;
import Model.UniLotePeqException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author ricar
 */
public class CadLinha extends javax.swing.JFrame {

    private static CadLinha unicoCadLinha;   
    private Linha l = new Linha();
    private static BdLinha gp = new BdLinha();

    public static CadLinha getCadLinha(BdLinha gp1){
        gp = gp1;
        if(unicoCadLinha == null){
            unicoCadLinha = new CadLinha();
        }
        return unicoCadLinha;
    }
    private CadLinha() {
        initComponents();
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jlInfo = new javax.swing.JLabel();
        jlFabri = new javax.swing.JLabel();
        jlCodigo = new javax.swing.JLabel();
        jlUnidades = new javax.swing.JLabel();
        jlMarca = new javax.swing.JLabel();
        jlModelo = new javax.swing.JLabel();
        jlPreco = new javax.swing.JLabel();
        jlComprimento = new javax.swing.JLabel();
        jlEspessura = new javax.swing.JLabel();
        jlResistencia = new javax.swing.JLabel();
        jlCor = new javax.swing.JLabel();
        jlDia = new javax.swing.JLabel();
        jlMes = new javax.swing.JLabel();
        jlAno = new javax.swing.JLabel();
        jtCodigo = new javax.swing.JTextField();
        jtUnidades = new javax.swing.JTextField();
        jtMarca = new javax.swing.JTextField();
        jtModelo = new javax.swing.JTextField();
        jtPreco = new javax.swing.JTextField();
        jtComprimento = new javax.swing.JTextField();
        jtEspessura = new javax.swing.JTextField();
        jtResistencia = new javax.swing.JTextField();
        jtCor = new javax.swing.JTextField();
        jtDia = new javax.swing.JTextField();
        jtMes = new javax.swing.JTextField();
        jtAno = new javax.swing.JTextField();
        btSair = new javax.swing.JToggleButton();
        btLimpar = new javax.swing.JButton();
        btCad = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbLinha = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("CADASTRAR LINHA");
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

        jlUnidades.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jlUnidades.setText("UNIDADES LOTE");

        jlMarca.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jlMarca.setText("MARCA");

        jlModelo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jlModelo.setText("MODELO");

        jlPreco.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jlPreco.setText("PREÇO");

        jlComprimento.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jlComprimento.setText("COMPRIMENTO(Metros)");

        jlEspessura.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jlEspessura.setText("ESPESSURA(mm)");

        jlResistencia.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jlResistencia.setText("RESISTÊNCIA(Libras)");

        jlCor.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jlCor.setText("COR");

        jlDia.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jlDia.setText("DIA");

        jlMes.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jlMes.setText("MÊS");

        jlAno.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jlAno.setText("ANO");

        jtMes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtMesActionPerformed(evt);
            }
        });

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

        btCad.setText("CADASTRAR");
        btCad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadActionPerformed(evt);
            }
        });

        tbLinha.setModel(new javax.swing.table.DefaultTableModel(
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
        tbLinha.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbLinhaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbLinha);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jlUnidades)
                            .addComponent(jlCodigo)
                            .addComponent(jlMarca)
                            .addComponent(jlComprimento)
                            .addComponent(jlModelo)
                            .addComponent(jlPreco)
                            .addComponent(jlResistencia)
                            .addComponent(jlCor, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlEspessura))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jtCodigo)
                            .addComponent(jtUnidades)
                            .addComponent(jtMarca)
                            .addComponent(jtModelo)
                            .addComponent(jtPreco)
                            .addComponent(jtComprimento)
                            .addComponent(jtEspessura)
                            .addComponent(jtResistencia, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                            .addComponent(jtCor)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addComponent(jlInfo)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jtDia, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jtMes, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jtAno, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(8, 8, 8)
                                    .addComponent(jlDia)
                                    .addGap(21, 21, 21)
                                    .addComponent(jlMes)
                                    .addGap(25, 25, 25)
                                    .addComponent(jlAno, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jlFabri)
                                    .addGap(18, 18, 18))))
                        .addGap(103, 103, 103))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btCad)
                .addGap(18, 18, 18)
                .addComponent(btLimpar)
                .addGap(18, 18, 18)
                .addComponent(btSair))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jlInfo)
                        .addGap(13, 13, 13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlCodigo)
                            .addComponent(jtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlUnidades)
                            .addComponent(jtUnidades, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jlFabri)
                        .addGap(7, 7, 7)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jlDia)
                                .addComponent(jlMes))
                            .addComponent(jlAno, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(4, 4, 4)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlMarca)
                            .addComponent(jtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlModelo)
                            .addComponent(jtModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlPreco)
                            .addComponent(jtPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlComprimento)
                            .addComponent(jtComprimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlEspessura)
                            .addComponent(jtEspessura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlResistencia)
                            .addComponent(jtResistencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlCor)
                    .addComponent(jtCor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btSair)
                    .addComponent(btLimpar)
                    .addComponent(btCad)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jtMesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtMesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtMesActionPerformed

    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed
        limpar();
    }//GEN-LAST:event_btLimparActionPerformed

    private void btSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairActionPerformed
        sair();
    }//GEN-LAST:event_btSairActionPerformed

    private void btCadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadActionPerformed
        cadLinha();
        listaTab();
    }//GEN-LAST:event_btCadActionPerformed

    private void tbLinhaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbLinhaMouseClicked
        selectTab();
    }//GEN-LAST:event_tbLinhaMouseClicked

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        listaTab();
    }//GEN-LAST:event_formWindowGainedFocus

     public void selectTab(){
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
    
    public void listaTab(){
        DefaultTableModel modelo = (DefaultTableModel) tbLinha.getModel();
        
        int posLin = 0;
        modelo.setRowCount(posLin);
        
        for(Linha l : gp.getBdLinha()){
            modelo.insertRow(posLin, new Object[]{l.getCodigoLote(), l.getUnidadesLote(), l.getModelo()});
            posLin++;
        }
    }
    
    public int cadLinha(){
        l = new Linha();
        l.setCodigoLote(Integer.parseInt(jtCodigo.getText()));
        try{
            l.setUnidadesLote(Integer.parseInt(jtUnidades.getText()));
        }
        catch(UniLotePeqException upe){
            upe.impUniLotePeq();
            l = upe.corrigeUniLotePeq(l);
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
        l.setMarca(jtMarca.getText());
        l.setModelo(jtModelo.getText());
        l.setPreco(Float.valueOf(jtPreco.getText()));
        l.setComprimento(Integer.parseInt(jtComprimento.getText()));
        l.setEspessura(Float.valueOf(jtEspessura.getText()));
        l.setResistencia(Integer.parseInt(jtResistencia.getText()));
        l.setCor(jtCor.getText());
        l.getFabri().setDia(Integer.parseInt(jtDia.getText()));
        l.getFabri().setMes(Integer.parseInt(jtMes.getText()));
        l.getFabri().setAno(Integer.parseInt(jtAno.getText()));
        
        l = gp.cadLinha(l);
       
       if(l != null){
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
        jtComprimento.setText("");
        jtEspessura.setText("");
        jtResistencia.setText("");
        jtCor.setText("");
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
            java.util.logging.Logger.getLogger(CadLinha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadLinha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadLinha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadLinha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadLinha().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCad;
    private javax.swing.JButton btLimpar;
    private javax.swing.JToggleButton btSair;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jlAno;
    private javax.swing.JLabel jlCodigo;
    private javax.swing.JLabel jlComprimento;
    private javax.swing.JLabel jlCor;
    private javax.swing.JLabel jlDia;
    private javax.swing.JLabel jlEspessura;
    private javax.swing.JLabel jlFabri;
    private javax.swing.JLabel jlInfo;
    private javax.swing.JLabel jlMarca;
    private javax.swing.JLabel jlMes;
    private javax.swing.JLabel jlModelo;
    private javax.swing.JLabel jlPreco;
    private javax.swing.JLabel jlResistencia;
    private javax.swing.JLabel jlUnidades;
    private javax.swing.JTextField jtAno;
    private javax.swing.JTextField jtCodigo;
    private javax.swing.JTextField jtComprimento;
    private javax.swing.JTextField jtCor;
    private javax.swing.JTextField jtDia;
    private javax.swing.JTextField jtEspessura;
    private javax.swing.JTextField jtMarca;
    private javax.swing.JTextField jtMes;
    private javax.swing.JTextField jtModelo;
    private javax.swing.JTextField jtPreco;
    private javax.swing.JTextField jtResistencia;
    private javax.swing.JTextField jtUnidades;
    private javax.swing.JTable tbLinha;
    // End of variables declaration//GEN-END:variables
}
