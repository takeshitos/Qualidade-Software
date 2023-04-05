/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import Dao.ProdutoDAO;

/**
 *
 * @author ricar
 */
public class teste {
    public static void main(String []args) throws UniLotePeqException{
        Anzol a = new Anzol();
        a.setCodigoLote(1);
        a.setUnidadesLote(12);
        a.setMarca("Marca");
        a.setModelo("modelo");
        a.setPreco(12.12);
        a.setTamanho(2);
        a.setUnidadesPacote(100);
        a.setFabri("1/1/1");
        ProdutoDAO.cadPoduto(a);
    }
}
