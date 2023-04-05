/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Dao.ProdutoDAO;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ricar
 */
public class ControllerProduto {
     public static void carregaTabela(DefaultTableModel modelo) {
        ProdutoDAO.carregaTabAltDel(modelo);
    }
     
    public static void carregaTabPrincipal(DefaultTableModel modelo){
        ProdutoDAO.carregaTabPrincipal(modelo);
    }
}
