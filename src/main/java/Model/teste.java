/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import Dao.ConexaoBD;
import Dao.ProdutoDAO;
import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 *
 * @author ricar
 */
public class teste {
    public static void main(String []args) throws UniLotePeqException{
        Connection conn = ConexaoBD.getConnection();
        Anzol a = new Anzol();
        a.setCodigoLote(1);
        a.setUnidadesLote(12);
        a.setMarca("Marca");
        a.setModelo("modelo");
        a.setPreco(12.12);
        a.setTamanho(2);
        a.setUnidadesPacote(100);
        a.setFabri("1/1/1");
        
        String query = "INSERT INTO anzol VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        PreparedStatement pstm;

            try {
                pstm = conn.prepareStatement(query);
                pstm.setInt(1, a.getCodigoLote());
                pstm.setInt(2, a.getUnidadesLote());
                pstm.setString(3, a.getMarca());
                pstm.setString(4, a.getModelo());
                pstm.setDouble(5, a.getPreco());
                pstm.setDouble(6, a.getTamanho());
                pstm.setInt(7, a.getUnidadesPacote());
                pstm.setString(8, a.getFabri());

                pstm.execute();
                pstm.close();

            } catch (Exception erro) {
                System.out.println("ERRO DAO " + erro);
            }
    }
}
