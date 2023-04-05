package Controller;

import Dao.ProdutoDAO;
import Model.Anzol;
import Model.UniLotePeqException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ricar
 */
public class ControllerAnzol {
    
    public static Anzol atualizaAnzol(Anzol c) throws UniLotePeqException{
        Anzol ca = null;
        ca = (Anzol) ProdutoDAO.pesquisaProdID(c);
        
        if(ca!=null){            
            int uni = Integer.parseInt(JOptionPane.showInputDialog(null,
                                        "Informe as Unidades do Lote:", 
                                        "Autalização", 
                                        JOptionPane.QUESTION_MESSAGE));

            double preco = Float.valueOf(JOptionPane.showInputDialog(null,
                                        "Informe o novo preço:", 
                                        "Autalização", 
                                        JOptionPane.QUESTION_MESSAGE));
            try{
                 ca.setPreco(preco);
                 ca.setUnidadesLote(uni);
                 ProdutoDAO.alterarProduto(ca);                    
            }
            catch(UniLotePeqException upe){
                upe.impUniLotePeq();
                ca = upe.corrigeUniLotePeq(ca);
                ProdutoDAO.alterarProduto(ca);
            }
            catch(NumberFormatException nfe){
                JOptionPane.showMessageDialog(
                        null,
                        "VALOR DA UNIDADES LOTE DEVE SER INTEIRO",
                        "Erro de Cadastro",
                        0
                );
            }
            return ca;
        }          
        return null;
    }
    
    public static void carregaTabela(DefaultTableModel modelo) {
        ProdutoDAO.carregaTabAnzol(modelo);
    }
    
    public static void carregaTabelaFull(DefaultTableModel modelo){
        ProdutoDAO.carregaRelaAnzol(modelo);
    }
     
    public static boolean cadastrarAnzol(Anzol a){
         return ProdutoDAO.cadPoduto(a);
    } 
    
    public static boolean verifica(Anzol a){
        return ProdutoDAO.pesquisarProdutoId(Integer.toString(a.getCodigoLote()), "anzol");
    }
    
    public static boolean excluir(Anzol a){
        return ProdutoDAO.drop(a);
    }
}
