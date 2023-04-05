package View;


import Controller.ControllerAnzol;
import Controller.ControllerCarretilha;
import Model.BdCarretilha;
import Model.Carretilha;
import Model.UniLotePeqException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class CadCarretilha extends javax.swing.JFrame {
    
    private static CadCarretilha unicoCadCarretilha;   
    private Carretilha c = new Carretilha();
    private static BdCarretilha gp = new BdCarretilha();

    public static CadCarretilha getCadCarretilha(BdCarretilha gp1){
        gp = gp1;
        if(unicoCadCarretilha == null){
            unicoCadCarretilha = new CadCarretilha();
        }
        return unicoCadCarretilha;
    }
    private CadCarretilha() {
        initComponents();
    }

    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btSair = new javax.swing.JButton();
        btLimpar = new javax.swing.JButton();
        btCadastrar = new javax.swing.JButton();
        lbInfo = new javax.swing.JLabel();
        lbFabri = new javax.swing.JLabel();
        lbCodigoLote = new javax.swing.JLabel();
        lbUnidadesLote = new javax.swing.JLabel();
        lbMarca = new javax.swing.JLabel();
        lbModelo = new javax.swing.JLabel();
        lbPreco = new javax.swing.JLabel();
        lbCApLinha = new javax.swing.JLabel();
        lbRolamentos = new javax.swing.JLabel();
        lbPerfil = new javax.swing.JLabel();
        jtUnidades = new javax.swing.JTextField();
        jtMarca = new javax.swing.JTextField();
        jtModelo = new javax.swing.JTextField();
        jtPreco = new javax.swing.JTextField();
        jtCapLinha = new javax.swing.JTextField();
        jtQtdRolamento = new javax.swing.JTextField();
        jtPerfil = new javax.swing.JTextField();
        jlDia = new javax.swing.JLabel();
        jlMes = new javax.swing.JLabel();
        jlAno = new javax.swing.JLabel();
        jtDia = new javax.swing.JTextField();
        jtMes = new javax.swing.JTextField();
        jtAno = new javax.swing.JTextField();
        jtCodigo = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbCarretilha = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("CADASTRAR CARRETILHA");
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
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

        btCadastrar.setText("CADASTRAR");
        btCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadastrarActionPerformed(evt);
            }
        });

        lbInfo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbInfo.setText("INFORMAÇÕES:");

        lbFabri.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbFabri.setText("FABRICAÇÃO:");

        lbCodigoLote.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbCodigoLote.setText("CÓDIGO LOTE");

        lbUnidadesLote.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbUnidadesLote.setText("UNIDADES LOTE");

        lbMarca.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbMarca.setText("MARCA");

        lbModelo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbModelo.setText("MODELO");

        lbPreco.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbPreco.setText("PREÇO");

        lbCApLinha.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbCApLinha.setText("CAPACIDADE LINHA(Metros)");

        lbRolamentos.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbRolamentos.setText("QUANTIDADE ROLAMENTO");

        lbPerfil.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbPerfil.setText("PERFIL");

        jlDia.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jlDia.setText("DIA");

        jlMes.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jlMes.setText("MÊS");

        jlAno.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jlAno.setText("ANO");

        tbCarretilha.setModel(new javax.swing.table.DefaultTableModel(
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
        tbCarretilha.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbCarretilhaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbCarretilha);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbMarca)
                            .addComponent(lbUnidadesLote)
                            .addComponent(lbCodigoLote))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jtUnidades, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
                            .addComponent(jtMarca)
                            .addComponent(jtCodigo)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lbInfo)
                        .addGap(59, 59, 59))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbPerfil)
                            .addComponent(lbPreco)
                            .addComponent(lbCApLinha)
                            .addComponent(lbRolamentos)
                            .addComponent(lbModelo))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtPerfil)
                            .addComponent(jtQtdRolamento)
                            .addComponent(jtCapLinha)
                            .addComponent(jtPreco)
                            .addComponent(jtModelo))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbFabri)
                        .addGap(108, 108, 108))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btCadastrar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btLimpar)
                                .addGap(11, 11, 11)
                                .addComponent(btSair))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(90, 90, 90)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(64, 64, 64)
                                            .addComponent(jtMes, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(10, 10, 10)
                                            .addComponent(jlDia)
                                            .addGap(39, 39, 39)
                                            .addComponent(jlMes))
                                        .addComponent(jtDia, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(18, 18, 18)
                                            .addComponent(jtAno, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(26, 26, 26)
                                            .addComponent(jlAno))))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(12, 12, 12)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(lbInfo)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lbCodigoLote)
                                    .addComponent(jtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lbUnidadesLote)
                                    .addComponent(jtUnidades, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lbMarca)
                                    .addComponent(jtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbFabri)
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jlMes)
                                            .addComponent(jlDia))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jtDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jtMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jtAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jlAno, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(28, 28, 28)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbModelo)
                            .addComponent(jtModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(4, 4, 4)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbPreco)
                            .addComponent(jtPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbCApLinha)
                            .addComponent(jtCapLinha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbRolamentos)
                            .addComponent(jtQtdRolamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbPerfil)
                            .addComponent(jtPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btSair)
                    .addComponent(btLimpar)
                    .addComponent(btCadastrar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed
        limpar();
    }//GEN-LAST:event_btLimparActionPerformed

    private void btSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairActionPerformed
        sair();
    }//GEN-LAST:event_btSairActionPerformed

    private void btCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadastrarActionPerformed
        cadCarretilha();
        listaTab();
    }//GEN-LAST:event_btCadastrarActionPerformed

    private void tbCarretilhaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbCarretilhaMouseClicked
        selectTab();
    }//GEN-LAST:event_tbCarretilhaMouseClicked

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        listaTab();
    }//GEN-LAST:event_formWindowGainedFocus
    
    public void selectTab(){
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
    
    public void listaTab(){
        DefaultTableModel modelo = (DefaultTableModel) tbCarretilha.getModel();
        modelo.setNumRows(0);
        
        ControllerCarretilha.carregaTabela(modelo);
    }
    
    public int cadCarretilha(){
        c = new Carretilha();
        c.setCodigoLote(Integer.parseInt(jtCodigo.getText()));
        try{
            c.setUnidadesLote(Integer.parseInt(jtUnidades.getText()));
        }	
        catch(UniLotePeqException upe){
                upe.impUniLotePeq();
                c = upe.corrigeUniLotePeq(c); 

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
        c.setCapLinha(jtCapLinha.getText());
        c.setQtdRolamento(Integer.parseInt(jtQtdRolamento.getText()));
        c.setPerfil(jtPerfil.getText());
        c.setMarca(jtMarca.getText());
        c.setModelo(jtModelo.getText());
        c.setPreco(Float.valueOf(jtPreco.getText()));
        c.setFabri(jtDia.getText()+"/"+jtMes.getText()+"/"+jtAno.getText());
        
        boolean feed = ControllerCarretilha.cadastrarCar(c);
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
        jtCapLinha.setText("");
        jtQtdRolamento.setText("");
        jtPerfil.setText("");
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
            java.util.logging.Logger.getLogger(CadCarretilha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadCarretilha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadCarretilha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadCarretilha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadCarretilha().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCadastrar;
    private javax.swing.JButton btLimpar;
    private javax.swing.JButton btSair;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jlAno;
    private javax.swing.JLabel jlDia;
    private javax.swing.JLabel jlMes;
    private javax.swing.JTextField jtAno;
    private javax.swing.JTextField jtCapLinha;
    private javax.swing.JTextField jtCodigo;
    private javax.swing.JTextField jtDia;
    private javax.swing.JTextField jtMarca;
    private javax.swing.JTextField jtMes;
    private javax.swing.JTextField jtModelo;
    private javax.swing.JTextField jtPerfil;
    private javax.swing.JTextField jtPreco;
    private javax.swing.JTextField jtQtdRolamento;
    private javax.swing.JTextField jtUnidades;
    private javax.swing.JLabel lbCApLinha;
    private javax.swing.JLabel lbCodigoLote;
    private javax.swing.JLabel lbFabri;
    private javax.swing.JLabel lbInfo;
    private javax.swing.JLabel lbMarca;
    private javax.swing.JLabel lbModelo;
    private javax.swing.JLabel lbPerfil;
    private javax.swing.JLabel lbPreco;
    private javax.swing.JLabel lbRolamentos;
    private javax.swing.JLabel lbUnidadesLote;
    private javax.swing.JTable tbCarretilha;
    // End of variables declaration//GEN-END:variables
}
