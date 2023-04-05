/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Dao.ProdutoDAO;
import Model.Linha;
import Model.UniLotePeqException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ricar
 */
public class ControllerLinha {
    
    public static Linha consulta(Linha a){
        try {
            return (Linha) ProdutoDAO.pesquisaProdID(a);
        } catch (UniLotePeqException ex) {
            Logger.getLogger(ControllerLinha.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public static boolean verifica(Linha a){
        return ProdutoDAO.pesquisarProdutoId(Integer.toString(a.getCodigoLote()), "linha", "idLoteLinha");
    }
    
    public static Linha atualizaLinha(Linha l) throws UniLotePeqException{
        Linha li = null;
        li = (Linha) ProdutoDAO.pesquisaProdID(l);
        
        if(li!=null){            
            int uni = Integer.parseInt(JOptionPane.showInputDialog(null,
                                        "Informe as Unidades do Lote:", 
                                        "Autalização", 
                                        JOptionPane.QUESTION_MESSAGE));

            double preco = Float.valueOf(JOptionPane.showInputDialog(null,
                                        "Informe o novo preço:", 
                                        "Autalização", 
                                        JOptionPane.QUESTION_MESSAGE));
            try{
                 li.setPreco(preco);
                 li.setUnidadesLote(uni);
                 ProdutoDAO.alterarProduto(li);                    
            }
            catch(UniLotePeqException upe){
                upe.impUniLotePeq();
                li = upe.corrigeUniLotePeq(li);
                ProdutoDAO.alterarProduto(li);  
            }
            catch(NumberFormatException nfe){
                JOptionPane.showMessageDialog(
                        null,
                        "VALOR DA UNIDADES LOTE DEVE SER INTEIRO",
                        "Erro de Cadastro",
                        0
                );
            }
            return li;
        }          
        return null;
    }
        
    public static boolean cadastrarLinha(Linha a){
         return ProdutoDAO.cadPoduto(a);
    } 
    
    public static boolean excluir(Linha a){
        return ProdutoDAO.drop(a);
    }
    
    public static void carregaTabela(DefaultTableModel modelo) {
        ProdutoDAO.carregaTabLinha(modelo);
    }
    
    public static void carregaTabelaFull(DefaultTableModel modelo) {
        ProdutoDAO.carregaRelaLinha(modelo);
    }
}
