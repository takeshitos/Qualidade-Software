/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Dao.ProdutoDAO;
import Model.UniLotePeqException;
import Model.Vara;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ricar
 */
public class ControllerVara {
    
    public static boolean verifica(Vara a){
        return ProdutoDAO.pesquisarProdutoId(Integer.toString(a.getCodigoLote()), "vara");
    }
    
    public static Vara atualizaVara(Vara v) throws UniLotePeqException{
        Vara va = null;
        va = (Vara) ProdutoDAO.pesquisaProdID(v);
        
        if(va!=null){            
            int uni = Integer.parseInt(JOptionPane.showInputDialog(null,
                                        "Informe as Unidades do Lote:", 
                                        "Autalização", 
                                        JOptionPane.QUESTION_MESSAGE));

            double preco = Float.valueOf(JOptionPane.showInputDialog(null,
                                        "Informe o novo preço:", 
                                        "Autalização", 
                                        JOptionPane.QUESTION_MESSAGE));
            try{             
                 va.setPreco(preco);
                 va.setUnidadesLote(uni);
                 ProdutoDAO.alterarProduto(va);                    
            }
            catch(UniLotePeqException upe){
                upe.impUniLotePeq();
                va = upe.corrigeUniLotePeq(va);
                ProdutoDAO.alterarProduto(va); 
            }
            catch(NumberFormatException nfe){
                JOptionPane.showMessageDialog(
                        null,
                        "VALOR DA UNIDADES LOTE DEVE SER INTEIRO",
                        "Erro de Cadastro",
                        0
                );
            }
            return va;
        }          
        return null;
    }
    
    public static boolean cadastrarVara(Vara a){
         return ProdutoDAO.cadPoduto(a);
    } 
    
    public static void carregaTabela(DefaultTableModel modelo) {
        ProdutoDAO.carregaTabVara(modelo);
    }
    
    public static void carregaTabelaFull(DefaultTableModel modelo) {
        ProdutoDAO.carregaRelaVara(modelo);
    }
     public static boolean excluir(Vara a){
        return ProdutoDAO.drop(a);
    }
}
