package View;



import Controller.ControllerProduto;
import Model.Carretilha;
import Model.Linha;
import Model.Vara;
import Model.Anzol;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Principal extends javax.swing.JFrame {

    public Principal() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tabProd = new javax.swing.JTable();
        btSair = new javax.swing.JToggleButton();
        Menu = new javax.swing.JMenuBar();
        mnCadastrar = new javax.swing.JMenu();
        cdAnzol = new javax.swing.JMenuItem();
        cdCarretilha = new javax.swing.JMenuItem();
        cdLinha = new javax.swing.JMenuItem();
        cdVara = new javax.swing.JMenuItem();
        mnAlterar = new javax.swing.JMenu();
        mnAltDel = new javax.swing.JMenuItem();
        mnRelatório = new javax.swing.JMenu();
        relatorio = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("GERENCIAR ARMAZENAMENTO POR LOTES");
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });

        tabProd.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "TIPO PRODUTO", "MODELO", "CÓDIGO LOTE", "UNIDADES LOTE", "PREÇO"
            }
        ));
        tabProd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabProdMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabProd);

        btSair.setText("SAIR");
        btSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSairActionPerformed(evt);
            }
        });

        mnCadastrar.setText("Cadastrar");

        cdAnzol.setText("Anzol...");
        cdAnzol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cdAnzolActionPerformed(evt);
            }
        });
        mnCadastrar.add(cdAnzol);

        cdCarretilha.setText("Carretilha...");
        cdCarretilha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cdCarretilhaActionPerformed(evt);
            }
        });
        mnCadastrar.add(cdCarretilha);

        cdLinha.setText("Linha...");
        cdLinha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cdLinhaActionPerformed(evt);
            }
        });
        mnCadastrar.add(cdLinha);

        cdVara.setText("Vara...");
        cdVara.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cdVaraActionPerformed(evt);
            }
        });
        mnCadastrar.add(cdVara);

        Menu.add(mnCadastrar);

        mnAlterar.setText("Alterar/Deletar");

        mnAltDel.setText("Alterar/Deletar...");
        mnAltDel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnAltDelActionPerformed(evt);
            }
        });
        mnAlterar.add(mnAltDel);

        Menu.add(mnAlterar);

        mnRelatório.setText("Relatório");

        relatorio.setText("Relatório...");
        relatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                relatorioActionPerformed(evt);
            }
        });
        mnRelatório.add(relatorio);

        Menu.add(mnRelatório);

        setJMenuBar(Menu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 564, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btSair, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(10, 10, 10))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btSair))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cdAnzolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cdAnzolActionPerformed
        CadAnzol.getCadAnzol().setVisible(true);
    }//GEN-LAST:event_cdAnzolActionPerformed

    private void cdCarretilhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cdCarretilhaActionPerformed
        CadCarretilha.getCadCarretilha().setVisible(true);
    }//GEN-LAST:event_cdCarretilhaActionPerformed

    private void btSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairActionPerformed
        sair();
    }//GEN-LAST:event_btSairActionPerformed

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        listaTab();
    }//GEN-LAST:event_formWindowGainedFocus

    private void cdLinhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cdLinhaActionPerformed
        CadLinha.getCadLinha().setVisible(true);
    }//GEN-LAST:event_cdLinhaActionPerformed

    private void cdVaraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cdVaraActionPerformed
        CadVara.getCadVara().setVisible(true);
    }//GEN-LAST:event_cdVaraActionPerformed

    private void mnAltDelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnAltDelActionPerformed
        AlterarDeletar.getAltDel().setVisible(true);
    }//GEN-LAST:event_mnAltDelActionPerformed

    private void relatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_relatorioActionPerformed
        Relatorio.getRelatorio().setVisible(true);
    }//GEN-LAST:event_relatorioActionPerformed

    private void tabProdMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabProdMouseClicked
        selectTab();
    }//GEN-LAST:event_tabProdMouseClicked

   public void listaTab(){
        DefaultTableModel modelo = (DefaultTableModel) tabProd.getModel();
        
        modelo.setNumRows(0);
        
        ControllerProduto.carregaTabPrincipal(modelo);
    }
    public void selectTab(){
        String valLinTab = "";
        int posLin = tabProd.getSelectedRow();
          
        
        for(int coluna = 0;coluna < tabProd.getColumnCount(); coluna++ ){
            valLinTab += tabProd.getModel().getValueAt(posLin,coluna).toString() + "\n";
            
            
        }
        JOptionPane.showMessageDialog(
                null,
                "Valor escolhido: \n"+valLinTab,
                "Seleção na tabela",
                1
        );
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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar Menu;
    private javax.swing.JToggleButton btSair;
    private javax.swing.JMenuItem cdAnzol;
    private javax.swing.JMenuItem cdCarretilha;
    private javax.swing.JMenuItem cdLinha;
    private javax.swing.JMenuItem cdVara;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenuItem mnAltDel;
    private javax.swing.JMenu mnAlterar;
    private javax.swing.JMenu mnCadastrar;
    private javax.swing.JMenu mnRelatório;
    private javax.swing.JMenuItem relatorio;
    private javax.swing.JTable tabProd;
    // End of variables declaration//GEN-END:variables
}
