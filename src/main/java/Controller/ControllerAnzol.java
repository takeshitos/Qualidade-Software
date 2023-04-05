package Controller;

import Dao.ProdutoDAO;
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
     public static void carregaTabela(DefaultTableModel modelo) {
        ProdutoDAO.carregaTabAnzol(modelo);
    }
}
