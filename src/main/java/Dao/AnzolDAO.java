/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;

import Model.Anzol;
import Model.Carretilha;
import Model.Linha;
import Model.Produto;
import Model.Vara;
import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 *
 * @author ricar
 */
public class AnzolDAO {
    
      public static boolean cadPoduto(Produto p) {
        Connection conn = ConexaoBD.getConnection();
        if (p.getTipo().contains("ANZOL")) {
            Anzol a = (Anzol) p;
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

                return true;

            } catch (Exception erro) {
                System.out.println("ERRO DAO " + erro);
            }
        
        } else if (p.getTipo().contains("CARRETILHA")) {
            Carretilha c = (Carretilha) p;
            String query = "INSERT INTO atendente VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement pstm;

            try {           
                pstm = conn.prepareStatement(query);
                pstm.setInt(1, c.getCodigoLote());
                pstm.setInt(2, c.getUnidadesLote());
                pstm.setString(3, c.getMarca());
                pstm.setString(4, c.getModelo());
                pstm.setDouble(5, c.getPreco());
                pstm.setDouble(6, c.getCapLinha());
                pstm.setInt(7, c.getQtdRolamento());
                pstm.setString(8, c.getPerfil());
                pstm.setString(9, c.getFabri());

                pstm.execute();
                pstm.close();

                return true;

            } catch (Exception erro) {
                System.out.println("ERRO DAO " + erro);
            }

        } else if (p.getTipo().contains("LINHA")) {
            Linha l = (Linha) p;
            String query = "INSERT INTO enfermeira VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement pstm;

            try {           
                pstm = conn.prepareStatement(query);
                pstm.setInt(1, l.getCodigoLote());
                pstm.setInt(2, l.getUnidadesLote());
                pstm.setString(3, l.getMarca());
                pstm.setString(4, l.getModelo());
                pstm.setDouble(5, l.getPreco());
                pstm.setDouble(6, l.getComprimento());
                pstm.setDouble(7, l.getEspessura());
                pstm.setDouble(8, l.getResistencia());
                pstm.setString(9, l.getCor());
                pstm.setString(10, l.getFabri());

                pstm.execute();
                pstm.close();

                return true;

            } catch (Exception erro) {
                System.out.println("ERRO DAO " + erro);
            }
            
        } else if (p.getTipo().contains("VARA")) {
            Vara v = (Vara) p;
            String query = "INSERT INTO medico VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement pstm;

            try {           
                pstm = conn.prepareStatement(query);
                pstm.setInt(1, v.getCodigoLote());
                pstm.setInt(2, v.getUnidadesLote());
                pstm.setString(3, v.getModelo());
                pstm.setString(4, v.getMarca());
                pstm.setDouble(5, v.getPreco());
                pstm.setDouble(6, v.getTamanho());
                pstm.setString(7, v.getAcao());
                pstm.setDouble(8, v.getResistencia());
                pstm.setString(9, v.getFabri());
             
                pstm.execute();
                pstm.close();

                return true;

            } catch (Exception erro) {
                System.out.println("ERRO DAO " + erro);
            }
        }

        return false;
    }
}
