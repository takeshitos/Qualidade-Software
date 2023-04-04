package View;


import Model.BdCarretilha;
import Model.Carretilha;
import Model.BdVara;
import Model.BdAnzol;
import Model.Linha;
import Model.BdLinha;
import Model.Vara;
import Model.Anzol;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;



public class AlterarDeletar extends javax.swing.JFrame {

    private static AlterarDeletar unicoAltDel;   
    private Anzol a = new Anzol();
    private Carretilha c = new Carretilha();
    private Linha l = new Linha();
    private Vara v = new Vara();
    private static BdAnzol bda = new BdAnzol();
    private static BdCarretilha bdc = new BdCarretilha();
    private static BdLinha bdl = new BdLinha();
    private static BdVara bdv = new BdVara();

    public static AlterarDeletar getAltDel(BdAnzol bda1, BdCarretilha bdc1, BdLinha bdl1, BdVara bdv1){
        bda = bda1;
        bdc = bdc1;
        bdl = bdl1;
        bdv = bdv1;
        if(unicoAltDel== null){
            unicoAltDel = new AlterarDeletar();
        }
        return unicoAltDel;
    }
    private AlterarDeletar() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btSair = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbProd = new javax.swing.JTable();
        jlCodigo = new javax.swing.JLabel();
        jtCodigoAlt = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btAnzolAlt = new javax.swing.JButton();
        btCarretilhaAlt = new javax.swing.JButton();
        btLinhaAlt = new javax.swing.JToggleButton();
        btVaraAlt = new javax.swing.JButton();
        jlAlterar = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jtCodigoDel = new javax.swing.JTextField();
        btLimpar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        btAnzolDel = new javax.swing.JButton();
        btCarretilhaDel = new javax.swing.JButton();
        btLinhaDel = new javax.swing.JButton();
        btVaraDel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("ALTERAR E DELETAR PRODUTOS");
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

        tbProd.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "TIPO PRODUTO", "CÓDIGO LOTE", "UNIDADES LOTE", "MARCA", "MODELO", "PREÇO"
            }
        ));
        tbProd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbProdMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbProd);

        jlCodigo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jlCodigo.setText("CÓDIGO LOTE");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("PESQUISAR:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("TIPO PRODUTO:");

        btAnzolAlt.setText("ANZOL");
        btAnzolAlt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAnzolAltActionPerformed(evt);
            }
        });

        btCarretilhaAlt.setText("CARRETILHA");
        btCarretilhaAlt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCarretilhaAltActionPerformed(evt);
            }
        });

        btLinhaAlt.setText("LINHA");
        btLinhaAlt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLinhaAltActionPerformed(evt);
            }
        });

        btVaraAlt.setText("VARA");
        btVaraAlt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVaraAltActionPerformed(evt);
            }
        });

        jlAlterar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jlAlterar.setText("ALTERAR");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setText("DELETAR");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setText("PESQUISAR:");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("CÓDIGO LOTE");

        jtCodigoDel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtCodigoDelActionPerformed(evt);
            }
        });

        btLimpar.setText("LIMPAR");
        btLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimparActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setText("TIPO PRODUTO:");

        btAnzolDel.setText("ANZOL");
        btAnzolDel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAnzolDelActionPerformed(evt);
            }
        });

        btCarretilhaDel.setText("CARRETILHA");
        btCarretilhaDel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCarretilhaDelActionPerformed(evt);
            }
        });

        btLinhaDel.setText("LINHA");
        btLinhaDel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLinhaDelActionPerformed(evt);
            }
        });

        btVaraDel.setText("VARA");
        btVaraDel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVaraDelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btLimpar)
                                .addGap(12, 12, 12)
                                .addComponent(btSair)))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jlAlterar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5)
                        .addGap(156, 156, 156))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jlCodigo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jtCodigoAlt, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(btLinhaAlt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btAnzolAlt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btCarretilhaAlt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btVaraAlt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(188, 188, 188)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtCodigoDel, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel7)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(btLinhaDel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btAnzolDel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btCarretilhaDel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btVaraDel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(0, 21, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlAlterar)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlCodigo)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel6)
                                .addComponent(jtCodigoDel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jtCodigoAlt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jLabel1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btAnzolAlt)
                    .addComponent(btCarretilhaAlt)
                    .addComponent(btAnzolDel)
                    .addComponent(btCarretilhaDel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btLinhaAlt)
                    .addComponent(btVaraAlt)
                    .addComponent(btLinhaDel)
                    .addComponent(btVaraDel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btSair)
                    .addComponent(btLimpar))
                .addGap(5, 5, 5))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btAnzolAltActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAnzolAltActionPerformed
        altAnzol();
    }//GEN-LAST:event_btAnzolAltActionPerformed

    private void jtCodigoDelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtCodigoDelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtCodigoDelActionPerformed

    private void btSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairActionPerformed
        sair();
    }//GEN-LAST:event_btSairActionPerformed

    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed
        limpar();
    }//GEN-LAST:event_btLimparActionPerformed

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        listaTab();
    }//GEN-LAST:event_formWindowGainedFocus

    private void btAnzolDelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAnzolDelActionPerformed
        excluiAnzol();
        listaTab();
    }//GEN-LAST:event_btAnzolDelActionPerformed

    private void btCarretilhaAltActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCarretilhaAltActionPerformed
        altCarretilha();
    }//GEN-LAST:event_btCarretilhaAltActionPerformed

    private void btLinhaAltActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLinhaAltActionPerformed
        altLinha();
    }//GEN-LAST:event_btLinhaAltActionPerformed

    private void btVaraAltActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVaraAltActionPerformed
        altVara();
    }//GEN-LAST:event_btVaraAltActionPerformed

    private void btCarretilhaDelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCarretilhaDelActionPerformed
        excluiCarretilha();
        listaTab();
    }//GEN-LAST:event_btCarretilhaDelActionPerformed

    private void btLinhaDelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLinhaDelActionPerformed
        excluiLinha();
        listaTab();
    }//GEN-LAST:event_btLinhaDelActionPerformed

    private void btVaraDelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVaraDelActionPerformed
        excluiVara();
        listaTab();
    }//GEN-LAST:event_btVaraDelActionPerformed

    private void tbProdMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbProdMouseClicked
        listaTab();
    }//GEN-LAST:event_tbProdMouseClicked

    public void listaTab(){
        DefaultTableModel modelo = (DefaultTableModel) tbProd.getModel();
        
        int posLin = 0;
        modelo.setRowCount(posLin);
        
        for(Anzol a : bda.getBdAnzol()){
            modelo.insertRow(posLin, new Object[]{a.mostraClasse(), a.getCodigoLote(), a.getUnidadesLote(),a.getMarca(),a.getModelo(), a.getPreco()});
            posLin++;
        }
        
        posLin = 0;
        
        for(Carretilha c : bdc.getBdCarretilha()){
            modelo.insertRow(posLin, new Object[]{c.mostraClasse(), c.getCodigoLote(), c.getUnidadesLote(),c.getMarca(),c.getModelo(), c.getPreco()});
            posLin++;
        }
        posLin = 0;
        for(Linha l : bdl.getBdLinha()){
            modelo.insertRow(posLin, new Object[]{l.mostraClasse(), l.getCodigoLote(), l.getUnidadesLote(),l.getMarca(),l.getModelo(),l.getPreco()});
            posLin++;
        }
        posLin = 0;
        for(Vara v : bdv.getBdVara()){
            modelo.insertRow(posLin, new Object[]{v.mostraClasse(), v.getCodigoLote(), v.getUnidadesLote(),v.getMarca(),v.getModelo(), v.getPreco()});
            posLin++;
        }
    }
    
    public void altAnzol(){
      a = new Anzol();
      a.setCodigoLote(Integer.parseInt(jtCodigoAlt.getText()));
      
      a = bda.atualizaAnzol(a);
       
      if(a != null){
            JOptionPane.showMessageDialog(
              null,
                    "Produto atualizada com sucesso!",
                    "Atualização OK",
                    1
                );
      }
      else{
                  JOptionPane.showMessageDialog(
                    null,
              "Não existe um produto com este Código",
              "Erro de Alteração",
              0
          );       
               
      }
      limpar();
    }
    
    public void altCarretilha(){
      c = new Carretilha();
      c.setCodigoLote(Integer.parseInt(jtCodigoAlt.getText()));
      
      c = bdc.atualizaCarretilha(c);
       
      if(c != null){
            JOptionPane.showMessageDialog(
              null,
                    "Produto atualizada com sucesso!",
                    "Atualização OK",
                    1
                );
      }
      else{
                  JOptionPane.showMessageDialog(
                    null,
              "Não existe um produto com este Código",
              "Erro de Alteração",
              0
          );       
               
      }
      limpar();
    }
    
    public void altLinha(){
      l = new Linha();
      l.setCodigoLote(Integer.parseInt(jtCodigoAlt.getText()));
      
      l = bdl.atualizaLinha(l);
       
      if(l != null){
            JOptionPane.showMessageDialog(
              null,
                    "Produto atualizada com sucesso!",
                    "Atualização OK",
                    1
                );
      }
      else{
                  JOptionPane.showMessageDialog(
                    null,
              "Não existe um produto com este Código",
              "Erro de Alteração",
              0
          );       
               
      }
      limpar();
    }
    
    public void altVara(){
      v = new Vara();
      v.setCodigoLote(Integer.parseInt(jtCodigoAlt.getText()));
      
      v = bdv.atualizaVara(v);
       
      if(v != null){
            JOptionPane.showMessageDialog(
              null,
                    "Produto atualizada com sucesso!",
                    "Atualização OK",
                    1
                );
      }
      else{
                  JOptionPane.showMessageDialog(
                    null,
              "Não existe um produto com este Código",
              "Erro de Alteração",
              0
          );       
               
      }
      limpar();
    }
    
    
    public void excluiAnzol(){
      a = new Anzol();
      a.setCodigoLote(Integer.parseInt(jtCodigoDel.getText()));
      
      a = bda.consAnzol(a);
       
      if(a != null){
            a = bda.removeAnzol(a);
      }
      else{
                  JOptionPane.showMessageDialog(
                    null,
                    "Não existe um produto com este Código",
                    "Erro de Exclusão",
                    0
                );
               
      }
      limpar();
    }
    
    public void excluiCarretilha(){
      c = new Carretilha();
      c.setCodigoLote(Integer.parseInt(jtCodigoDel.getText()));
      
      c = bdc.consCarretilha(c);
       
      if(c != null){
            c = bdc.removeCarretilha(c);
      }
      else{
                  JOptionPane.showMessageDialog(
                    null,
                    "Não existe um produto com este Código",
                    "Erro de Exclusão",
                    0
                );
               
      }
      limpar();
    }
    
    public void excluiLinha(){
      l = new Linha();
      l.setCodigoLote(Integer.parseInt(jtCodigoDel.getText()));
      
      l = bdl.consLinha(l);
       
      if(l != null){
            l = bdl.removeLinha(l);
      }
      else{
                  JOptionPane.showMessageDialog(
                    null,
                    "Não existe um produto com este Código",
                    "Erro de Exclusão",
                    0
                );
               
      }
      limpar();
    }
    
    public void excluiVara(){
      v = new Vara();
      v.setCodigoLote(Integer.parseInt(jtCodigoDel.getText()));
      
      v = bdv.consVara(v);
       
      if(v != null){
            v = bdv.removeVara(v);
      }
      else{
                  JOptionPane.showMessageDialog(
                    null,
                    "Não existe um produto com este Código",
                    "Erro de Exclusão",
                    0
                );
               
      }
      limpar();
    }
    
    public void limpar(){
        jtCodigoAlt.setText("");
        jtCodigoDel.setText("");
        jtCodigoAlt.requestFocus();
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
   
    public void selectTab(){
        String valLinTab = "";
        int posLin = tbProd.getSelectedRow();
          
        
        for(int coluna = 0;coluna < tbProd.getColumnCount(); coluna++ ){
            valLinTab += tbProd.getModel().getValueAt(posLin,coluna).toString() + "\n";
            
            
        }
        JOptionPane.showMessageDialog(
                null,
                "Valor escolhido: \n"+valLinTab,
                "Seleção na tabela",
                1
        );
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
            java.util.logging.Logger.getLogger(AlterarDeletar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AlterarDeletar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AlterarDeletar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AlterarDeletar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AlterarDeletar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAnzolAlt;
    private javax.swing.JButton btAnzolDel;
    private javax.swing.JButton btCarretilhaAlt;
    private javax.swing.JButton btCarretilhaDel;
    private javax.swing.JButton btLimpar;
    private javax.swing.JToggleButton btLinhaAlt;
    private javax.swing.JButton btLinhaDel;
    private javax.swing.JButton btSair;
    private javax.swing.JButton btVaraAlt;
    private javax.swing.JButton btVaraDel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jlAlterar;
    private javax.swing.JLabel jlCodigo;
    private javax.swing.JTextField jtCodigoAlt;
    private javax.swing.JTextField jtCodigoDel;
    private javax.swing.JTable tbProd;
    // End of variables declaration//GEN-END:variables
}
