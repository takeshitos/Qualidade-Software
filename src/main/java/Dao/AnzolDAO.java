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
import java.sql.ResultSet;

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
      
      public static boolean alterarProduto(Produto p) {
        Connection conn = ConexaoBD.getConnection();
        if (p.getTipo().contains("ANZOL")) {
            Anzol a = (Anzol) p; 
            
            
            String query = "UPDATE anzol set uniLoteAnzol = ?, marcaAnzol = ?, modeloAnzol = ?, precoAnzol = ?, tamanhoAnzol = ?, uniPacAnzol = ?, fabriAnzol = ? WHERE idLoteAnzol = ?";
            PreparedStatement pstm;

            try {
                pstm = conn.prepareStatement(query);
                
                pstm.setInt(1, a.getUnidadesLote());
                pstm.setString(2, a.getMarca());
                pstm.setString(3, a.getModelo());
                pstm.setDouble(4, a.getPreco());
                pstm.setDouble(5, a.getTamanho());
                pstm.setInt(6, a.getUnidadesPacote());
                pstm.setString(7, a.getFabri());
                pstm.setInt(8, a.getCodigoLote());

                pstm.execute();
                pstm.close();

                return true;

            } catch (Exception erro) {
                System.out.println("ERRO DAO " + erro);
            }
        
        } else if (p.getTipo().contains("CARRETILHA")) {
            Carretilha c = (Carretilha) p;
            String query = "UPDATE carretilha set uniLoteCar = ?, marcaCar = ?, modeloCar = ?, precoCar = ?, capLinhaCar = ?, qtdRolCar = ?, perfilCar = ?, fabriCar = ? WHERE idLoteCar = ?";
            PreparedStatement pstm;

            try {           
                pstm = conn.prepareStatement(query);
                
                pstm.setInt(1, c.getUnidadesLote());
                pstm.setString(2, c.getMarca());
                pstm.setString(3, c.getModelo());
                pstm.setDouble(4, c.getPreco());
                pstm.setDouble(5, c.getCapLinha());
                pstm.setInt(6, c.getQtdRolamento());
                pstm.setString(7, c.getPerfil());
                pstm.setString(8, c.getFabri());
                pstm.setInt(9, c.getCodigoLote());
                
                pstm.execute();
                pstm.close();

                return true;

            } catch (Exception erro) {
                System.out.println("ERRO DAO " + erro);
            }

        } else if (p.getTipo().contains("LINHA")) {
            Linha l = (Linha) p;
            String query = "UPDATE linha set uniLoteLinha = ?, marcaLinha = ?, modeloLinha = ?, precoLinha = ?, compriLinha = ?, espLinha = ?, resisLinha = ?, corLinha = ?, fabriLinha = ? WHERE idLoteLinha = ?";
            PreparedStatement pstm;

            try {           
                pstm = conn.prepareStatement(query);
                
                pstm.setInt(1, l.getUnidadesLote());
                pstm.setString(2, l.getMarca());
                pstm.setString(3, l.getModelo());
                pstm.setDouble(4, l.getPreco());
                pstm.setDouble(5, l.getComprimento());
                pstm.setDouble(6, l.getEspessura());
                pstm.setDouble(7, l.getResistencia());
                pstm.setString(8, l.getCor());
                pstm.setString(9, l.getFabri());
                pstm.setInt(10, l.getCodigoLote());

                pstm.execute();
                pstm.close();

                return true;

            } catch (Exception erro) {
                System.out.println("ERRO DAO " + erro);
            }
            
        } else if (p.getTipo().contains("VARA")) {
            Vara v = (Vara) p;
            String query = "UPDATE vara set uniLoteVara = ?, modeloVara = ?, marcaVara = ?, precoVara = ?, tamVara = ?, acaoVara = ?, resisVara = ?, fabriVara = ? WHERE idLoteVara = ?";
            PreparedStatement pstm;

            try {           
                pstm = conn.prepareStatement(query);
                
                
                pstm.setInt(1, v.getUnidadesLote());
                pstm.setString(2, v.getModelo());
                pstm.setString(3, v.getMarca());
                pstm.setDouble(4, v.getPreco());
                pstm.setDouble(5, v.getTamanho());
                pstm.setString(6, v.getAcao());
                pstm.setDouble(7, v.getResistencia());
                pstm.setString(8, v.getFabri());
                pstm.setInt(9, v.getCodigoLote());
                                
                pstm.execute();
                pstm.close();

                return true;

            } catch (Exception erro) {
                System.out.println("ERRO DAO " + erro);
            }
        }

        return false;
    }
      
      public static boolean pesquisarProdutoId(String Id, String tipo) {
        
        if(tipo.contains("ANZOL")){
            ResultSet pesquisaAnzol = ConexaoBD.getConexao().executarQueryBD("SELECT * FROM anzol WHERE idLoteAnzol = '" + Id+ "'");
        }
        
        
        ResultSet pesquisaAte = ConexaoBD.getConexao().executarQueryBD("SELECT * FROM atendente WHERE ate_id = '" + Id + "'");
        ResultSet pesquisaEnf = ConexaoBD.getConexao().executarQueryBD("SELECT * FROM enfermeira WHERE enf_id = '" + Id + "'");
        ResultSet pesquisaMed = ConexaoBD.getConexao().executarQueryBD("SELECT * FROM medico WHERE med_id = '" + Id + "'");
        ResultSet pesquisaPac = ConexaoBD.getConexao().executarQueryBD("SELECT * FROM paciente WHERE pac_id = '" + Id + "'");
        try{
            if (pesquisaAnzol.isBeforeFirst() || pesquisaAte.isBeforeFirst() || pesquisaEnf.isBeforeFirst() || pesquisaMed.isBeforeFirst() || pesquisaPac.isBeforeFirst()) 
                return false; //Tem id

            else
                return true; //Tem não id
        }catch (Exception e) {
            return false; //Deu erro, mas coloca que tem (evitar bug)
        }
    }
}
