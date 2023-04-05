/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Dao.ProdutoDAO;
import Model.Carretilha;
import Model.UniLotePeqException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ricar
 */
public class ControllerCarretilha {
    
    public static Carretilha consulta(Carretilha a){
        try {
            return (Carretilha) ProdutoDAO.pesquisaProdID(a);
        } catch (UniLotePeqException ex) {
            Logger.getLogger(ControllerCarretilha.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    
    public static boolean verifica(Carretilha a){
        return ProdutoDAO.pesquisarProdutoId(Integer.toString(a.getCodigoLote()), "carretilha", "idLoteCar");
    }
    
    public static Carretilha atualizaCarretilha(Carretilha c) throws UniLotePeqException{
        Carretilha ca = null;
        ca = (Carretilha) ProdutoDAO.pesquisaProdID(c);
        
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
        ProdutoDAO.carregaTabCarretilha(modelo);
    }
    
    public static void carregaTabelaFull(DefaultTableModel modelo) {
        ProdutoDAO.carregaRelaCar(modelo);
    }
    
    public static boolean cadastrarCar(Carretilha c){
        return ProdutoDAO.cadPoduto(c);
    }
    
     public static boolean excluir(Carretilha a){
        return ProdutoDAO.drop(a);
    }
}
