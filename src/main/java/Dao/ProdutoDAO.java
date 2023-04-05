/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;

import Model.Anzol;
import Model.Carretilha;
import Model.Linha;
import Model.Produto;
import Model.UniLotePeqException;
import Model.Vara;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ricar
 */
public class ProdutoDAO {
    
    public static boolean cadPoduto(Produto p) {
        Connection conn = ConexaoBD.getConnection();
        if (p.getClass().getSimpleName().equalsIgnoreCase("ANZOL")) {
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
        
        } else if (p.getClass().getSimpleName().equalsIgnoreCase("CARRETILHA")) {
            Carretilha c = (Carretilha) p;
            String query = "INSERT INTO carretilha VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement pstm;

            try {           
                pstm = conn.prepareStatement(query);
                pstm.setInt(1, c.getCodigoLote());
                pstm.setInt(2, c.getUnidadesLote());
                pstm.setString(3, c.getMarca());
                pstm.setString(4, c.getModelo());
                pstm.setDouble(5, c.getPreco());
                pstm.setString(6, c.getCapLinha());
                pstm.setInt(7, c.getQtdRolamento());
                pstm.setString(8, c.getPerfil());
                pstm.setString(9, c.getFabri());

                pstm.execute();
                pstm.close();

                return true;

            } catch (Exception erro) {
                System.out.println("ERRO DAO " + erro);
            }

        } else if (p.getClass().getSimpleName().equalsIgnoreCase("LINHA")) {
            Linha l = (Linha) p;
            String query = "INSERT INTO linha VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement pstm;

            try {           
                pstm = conn.prepareStatement(query);
                pstm.setInt(1, l.getCodigoLote());
                pstm.setInt(2, l.getUnidadesLote());
                pstm.setString(3, l.getMarca());
                pstm.setString(4, l.getModelo());
                pstm.setDouble(5, l.getPreco());
                pstm.setString(6, l.getComprimento());
                pstm.setString(7, l.getEspessura());
                pstm.setString(8, l.getResistencia());
                pstm.setString(9, l.getCor());
                pstm.setString(10, l.getFabri());

                pstm.execute();
                pstm.close();

                return true;

            } catch (Exception erro) {
                System.out.println("ERRO DAO " + erro);
            }
            
        } else if (p.getClass().getSimpleName().equalsIgnoreCase("VARA")) {
            Vara v = (Vara) p;
            String query = "INSERT INTO vara VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement pstm;

            try {           
                pstm = conn.prepareStatement(query);
                pstm.setInt(1, v.getCodigoLote());
                pstm.setInt(2, v.getUnidadesLote());
                pstm.setString(3, v.getModelo());
                pstm.setString(4, v.getMarca());
                pstm.setDouble(5, v.getPreco());
                pstm.setString(6, v.getTamanho());
                pstm.setString(7, v.getAcao());
                pstm.setString(8, v.getResistencia());
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
        if (p.getClass().getSimpleName().equalsIgnoreCase("ANZOL")) {
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
        
        } else if (p.getClass().getSimpleName().equalsIgnoreCase("CARRETILHA")) {
            Carretilha c = (Carretilha) p;
            String query = "UPDATE carretilha set uniLoteCar = ?, marcaCar = ?, modeloCar = ?, precoCar = ?, capLinhaCar = ?, qtdRolCar = ?, perfilCar = ?, fabriCar = ? WHERE idLoteCar = ?";
            PreparedStatement pstm;

            try {           
                pstm = conn.prepareStatement(query);
                
                pstm.setInt(1, c.getUnidadesLote());
                pstm.setString(2, c.getMarca());
                pstm.setString(3, c.getModelo());
                pstm.setDouble(4, c.getPreco());
                pstm.setString(5, c.getCapLinha());
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

        } else if (p.getClass().getSimpleName().equalsIgnoreCase("LINHA")) {
            Linha l = (Linha) p;
            String query = "UPDATE linha set uniLoteLinha = ?, marcaLinha = ?, modeloLinha = ?, precoLinha = ?, compriLinha = ?, espLinha = ?, resistLinha = ?, corLinha = ?, fabriLinha = ? WHERE idLoteLinha = ?";
            PreparedStatement pstm;

            try {           
                pstm = conn.prepareStatement(query);
                
                pstm.setInt(1, l.getUnidadesLote());
                pstm.setString(2, l.getMarca());
                pstm.setString(3, l.getModelo());
                pstm.setDouble(4, l.getPreco());
                pstm.setString(5, l.getComprimento());
                pstm.setString(6, l.getEspessura());
                pstm.setString(7, l.getResistencia());
                pstm.setString(8, l.getCor());
                pstm.setString(9, l.getFabri());
                pstm.setInt(10, l.getCodigoLote());

                pstm.execute();
                pstm.close();

                return true;

            } catch (Exception erro) {
                System.out.println("ERRO DAO " + erro);
            }
            
        } else if (p.getClass().getSimpleName().equalsIgnoreCase("VARA")) {
            Vara v = (Vara) p;
            String query = "UPDATE vara set uniLoteVara = ?, modeloVara = ?, marcaVara = ?, precoVara = ?, tamVara = ?, acaoVara = ?, resisVara = ?, fabriVara = ? WHERE idLoteVara = ?";
            PreparedStatement pstm;

            try {           
                pstm = conn.prepareStatement(query);
                
                
                pstm.setInt(1, v.getUnidadesLote());
                pstm.setString(2, v.getModelo());
                pstm.setString(3, v.getMarca());
                pstm.setDouble(4, v.getPreco());
                pstm.setString(5, v.getTamanho());
                pstm.setString(6, v.getAcao());
                pstm.setString(7, v.getResistencia());
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
      
    public static boolean pesquisarProdutoId(String Id, String tipo, String coluna) {
        ResultSet pesquisa = null;
        pesquisa = ConexaoBD.getConexao().executarQueryBD("SELECT * FROM "+tipo+" WHERE "+coluna+" = '" + Id+ "'");                 
        try{
            if (pesquisa.isBeforeFirst()){
                System.out.println("TEM IDDD");
                return false; //Tem id

            }else
                return true; //Tem não id
        }catch (Exception e) {
            return false; //Deu erro, mas coloca que tem (evitar bug)
        }
    }
    
    public static Produto pesquisaProdID(Produto p) throws UniLotePeqException {
        if(p.getClass().getSimpleName().equalsIgnoreCase("ANZOL")){
            ResultSet pesquisa = ConexaoBD.getConexao().executarQueryBD("SELECT * FROM anzol WHERE idLoteAnzol = '" + Integer.toString(p.getCodigoLote()) + "'");
            Anzol a = null;
            try {
                if (pesquisa.isBeforeFirst()) {
                    a = new Anzol();

                    pesquisa.next();
                    a.setCodigoLote(Integer.parseInt(pesquisa.getString("idLoteAnzol")));
                    a.setUnidadesLote(Integer.parseInt(pesquisa.getString("uniLoteAnzol")));
                    a.setMarca(pesquisa.getString("marcaAnzol"));
                    a.setModelo(pesquisa.getString("modeloAnzol"));
                    a.setPreco(Double.parseDouble(pesquisa.getString("precoAnzol")));
                    a.setTamanho(Integer.parseInt(pesquisa.getString("tamanhoAnzol")));
                    a.setUnidadesPacote(Integer.parseInt(pesquisa.getString("uniPacAnzol")));
                    a.setFabri(pesquisa.getString("fabriAnzol"));
                } else {
                    a = null;
                }

            } catch (NumberFormatException | SQLException e) {
                System.out.println("ERRO NA FORMATAÇÃO => " + e);
            }
            return a;
        }else if(p.getClass().getSimpleName().equalsIgnoreCase("CARRETILHA")){
            ResultSet pesquisa = ConexaoBD.getConexao().executarQueryBD("SELECT * FROM carretilha WHERE idLoteCar = '" + Integer.toString(p.getCodigoLote()) + "'");
            Carretilha c = null;
            try {
                if (pesquisa.isBeforeFirst()) {
                    c = new Carretilha();

                    pesquisa.next();
                    c.setCodigoLote(Integer.parseInt(pesquisa.getString("idLoteCar")));
                    c.setUnidadesLote(Integer.parseInt(pesquisa.getString("uniLoteCar")));
                    c.setMarca(pesquisa.getString("marcaCar"));
                    c.setModelo(pesquisa.getString("modeloCar"));
                    c.setPreco(Double.parseDouble(pesquisa.getString("precoCar")));
                    c.setCapLinha(pesquisa.getString("capLinhaCar"));
                    c.setQtdRolamento(Integer.parseInt(pesquisa.getString("qtdRolCar")));
                    c.setPerfil(pesquisa.getString("perfilCar"));
                    c.setFabri(pesquisa.getString("fabriCar"));
                } else {
                    c = null;
                }

            } catch (NumberFormatException | SQLException e) {
                System.out.println("ERRO NA FORMATAÇÃO => " + e);
            }
            return c;
        }else if(p.getClass().getSimpleName().equalsIgnoreCase("VARA")){
            ResultSet pesquisa = ConexaoBD.getConexao().executarQueryBD("SELECT * FROM vara WHERE idLoteVara = '" + Integer.toString(p.getCodigoLote()) + "'");
            Vara v = null;
            try {
                if (pesquisa.isBeforeFirst()) {
                    v = new Vara();

                    pesquisa.next();
                    v.setCodigoLote(Integer.parseInt(pesquisa.getString("idLoteVara")));
                    v.setUnidadesLote(Integer.parseInt(pesquisa.getString("uniLoteVara")));                    
                    v.setModelo(pesquisa.getString("modeloVara"));
                    v.setMarca(pesquisa.getString("marcaVara"));
                    v.setPreco(Double.parseDouble(pesquisa.getString("precoVara")));
                    v.setTamanho(pesquisa.getString("tamanhoVara"));
                    v.setAcao(pesquisa.getString("acaoVara"));
                    v.setResistencia(pesquisa.getString("resisVara"));
                    v.setFabri(pesquisa.getString("fabriVara"));
                } else {
                    v = null;
                }

            } catch (NumberFormatException | SQLException e) {
                System.out.println("ERRO NA FORMATAÇÃO => " + e);
            }
            return v;
        }else if(p.getClass().getSimpleName().equalsIgnoreCase("LINHA")){
            ResultSet pesquisa = ConexaoBD.getConexao().executarQueryBD("SELECT * FROM linha WHERE idLoteLinha = '" + Integer.toString(p.getCodigoLote()) + "'");
            Linha l = null;
            try {
                if (pesquisa.isBeforeFirst()) {
                    l = new Linha();

                    pesquisa.next();
                    l.setCodigoLote(Integer.parseInt(pesquisa.getString("idLoteLinha")));
                    l.setUnidadesLote(Integer.parseInt(pesquisa.getString("uniLoteLinha")));  
                    l.setMarca(pesquisa.getString("marcaLinha"));
                    l.setModelo(pesquisa.getString("modeloLinha"));                   
                    l.setPreco(Double.parseDouble(pesquisa.getString("precoLinha")));
                    l.setComprimento(pesquisa.getString("compriLinha"));
                    l.setEspessura(pesquisa.getString("espLinha"));
                    l.setResistencia(pesquisa.getString("resistLinha"));
                    l.setCor(pesquisa.getString("corLinha"));
                    l.setFabri(pesquisa.getString("fabriLinha"));
                } else {
                    l = null;
                }

            } catch (NumberFormatException | SQLException e) {
                System.out.println("ERRO NA FORMATAÇÃO => " + e);
            }
            return l;
        }else{
           return null; 
        }
     }   
    
    public static boolean drop(Produto p) {
        Connection conn = ConexaoBD.getConnection();
            if(p.getClass().getSimpleName().equalsIgnoreCase("ANZOL")){
            String query = "DELETE FROM anzol WHERE idLoteAnzol = ?";
            PreparedStatement pstm;

            try {
                pstm = conn.prepareStatement(query);
                pstm.setString(1, Integer.toString(p.getCodigoLote()));

                pstm.execute();
                pstm.close();

                return true;

            } catch (Exception erro) {
                System.out.println("ERRO DAO " + erro);
            }

            return false;
        }else if(p.getClass().getSimpleName().equalsIgnoreCase("CARRETILHA")){
            String query = "DELETE FROM carretilha WHERE idLoteCar = ?";
            PreparedStatement pstm;

            try {
                pstm = conn.prepareStatement(query);
                pstm.setString(1, Integer.toString(p.getCodigoLote()));

                pstm.execute();
                pstm.close();

                return true;

            } catch (Exception erro) {
                System.out.println("ERRO DAO " + erro);
            }

            return false;
        }else if(p.getClass().getSimpleName().equalsIgnoreCase("LINHA")){
            String query = "DELETE FROM linha WHERE idLoteLinha = ?";
            PreparedStatement pstm;

            try {
                pstm = conn.prepareStatement(query);
                pstm.setString(1, Integer.toString(p.getCodigoLote()));

                pstm.execute();
                pstm.close();

                return true;

            } catch (Exception erro) {
                System.out.println("ERRO DAO " + erro);
            }

            return false;
        }else if(p.getClass().getSimpleName().equalsIgnoreCase("VARA")){
            String query = "DELETE FROM vara WHERE idLoteVara = ?";
            PreparedStatement pstm;

            try {
                pstm = conn.prepareStatement(query);
                pstm.setString(1, Integer.toString(p.getCodigoLote()));

                pstm.execute();
                pstm.close();

                return true;

            } catch (Exception erro) {
                System.out.println("ERRO DAO " + erro);
            }

            return false;
        }else{
            return false;
        }
    }
    
    public static void carregaTabAnzol(DefaultTableModel modelo) {
        ResultSet rs = null;
        
        try{
            rs = ConexaoBD.getConexao().executarQueryBD("SELECT * FROM anzol");

            while(rs.next()){
                modelo.addRow(new Object[]{
                    rs.getInt("idLoteAnzol"),
                    rs.getInt("uniLoteAnzol"), 
                    rs.getString("modeloAnzol")
                }); 
            }

        }catch(Exception e){
            System.out.println("Erro ao puxar tabela consulta");
        }
        
    }
    
    public static void carregaTabCarretilha(DefaultTableModel modelo) {
        ResultSet rs = null;
        
        try{
            rs = ConexaoBD.getConexao().executarQueryBD("SELECT * FROM carretilha");

            while(rs.next()){
                modelo.addRow(new Object[]{
                    rs.getInt("idLoteCar"),
                    rs.getInt("uniLoteCar"), 
                    rs.getString("modeloCar")
                }); 
            }

        }catch(Exception e){
            System.out.println("Erro ao puxar tabela consulta");
        }
        
    }
    
    public static void carregaTabLinha(DefaultTableModel modelo) {
        ResultSet rs = null;
        
        try{
            rs = ConexaoBD.getConexao().executarQueryBD("SELECT * FROM linha");

            while(rs.next()){
                modelo.addRow(new Object[]{
                    rs.getInt("idLoteLinha"),
                    rs.getInt("uniLoteLinha"), 
                    rs.getString("modeloLinha")
                }); 
            }

        }catch(Exception e){
            System.out.println("Erro ao puxar tabela consulta");
        }
        
    }
    
    public static void carregaTabVara(DefaultTableModel modelo) {
        ResultSet rs = null;
        
        try{
            rs = ConexaoBD.getConexao().executarQueryBD("SELECT * FROM vara");

            while(rs.next()){
                modelo.addRow(new Object[]{
                    rs.getInt("idLoteVara"),
                    rs.getInt("uniLoteVara"), 
                    rs.getString("modeloVara")
                }); 
            }

        }catch(Exception e){
            System.out.println("Erro ao puxar tabela consulta");
        }
        
    }
    
    public static void carregaTabAltDel(DefaultTableModel modelo) {
        ResultSet rs = null;       
        try{
            rs = ConexaoBD.getConexao().executarQueryBD("SELECT * FROM anzol");

            while(rs.next()){
                modelo.addRow(new Object[]{
                    "ANZOL",
                    rs.getInt("idLoteAnzol"),
                    rs.getInt("uniLoteAnzol"), 
                    rs.getString("marcaAnzol"),
                    rs.getString("modeloAnzol"),
                    rs.getString("precoAnzol")
                }); 
            }
        }catch(Exception e){
            System.out.println("Erro ao puxar tabela consulta");
        }
        rs = null;   
        try{
            rs = ConexaoBD.getConexao().executarQueryBD("SELECT * FROM carretilha");

            while(rs.next()){
                modelo.addRow(new Object[]{
                    "CARRETILHA",
                    rs.getInt("idLoteCar"),
                    rs.getInt("uniLoteCar"), 
                    rs.getString("marcaCar"),
                    rs.getString("modeloCar"),
                    rs.getString("precoCar")
                }); 
            }
        }catch(Exception e){
            System.out.println("Erro ao puxar tabela consulta");
        }
        rs = null;  
        try{
            rs = ConexaoBD.getConexao().executarQueryBD("SELECT * FROM linha");

            while(rs.next()){
                modelo.addRow(new Object[]{
                    "LINHA",
                    rs.getInt("idLoteLinha"),
                    rs.getInt("uniLoteLinha"), 
                    rs.getString("marcaLinha"),
                    rs.getString("modeloLinha"),
                    rs.getString("precoLinha")
                }); 
            }
        }catch(Exception e){
            System.out.println("Erro ao puxar tabela consulta");
        }
        rs = null;  
        try{
            rs = ConexaoBD.getConexao().executarQueryBD("SELECT * FROM vara");

            while(rs.next()){
                modelo.addRow(new Object[]{
                    "VARA",
                    rs.getInt("idLoteVara"),
                    rs.getInt("uniLoteVara"), 
                    rs.getString("marcaVara"),
                    rs.getString("modeloVara"),
                    rs.getString("precoVara")
                }); 
            }
        }catch(Exception e){
            System.out.println("Erro ao puxar tabela consulta");
        }
        
    }
    
    public static void carregaRelaAnzol(DefaultTableModel modelo) {
        ResultSet rs = null;       
        try{
            rs = ConexaoBD.getConexao().executarQueryBD("SELECT * FROM anzol");

            while(rs.next()){
                modelo.addRow(new Object[]{
                    rs.getInt("idLoteAnzol"),
                    rs.getInt("uniLoteAnzol"), 
                    rs.getString("marcaAnzol"),
                    rs.getString("modeloAnzol"),
                    rs.getString("precoAnzol"),
                    0.9*(rs.getDouble("precoAnzol")),
                    rs.getInt("tamanhoAnzol"),
                    rs.getInt("uniPacAnzol"),
                    rs.getString("fabriAnzol")
                }); 
            }
        }catch(Exception e){
            System.out.println("Erro ao puxar tabela consulta");
        }
    }
    
    public static void carregaRelaCar(DefaultTableModel modelo) {
        ResultSet rs = null;       
        try{
            rs = ConexaoBD.getConexao().executarQueryBD("SELECT * FROM carretilha");

            while(rs.next()){
                modelo.addRow(new Object[]{
                    rs.getInt("idLoteCar"),
                    rs.getInt("uniLoteCar"), 
                    rs.getString("marcaCar"),
                    rs.getString("modeloCar"),
                    rs.getString("precoCar"),
                    0.9*(rs.getDouble("precoCar")),
                    rs.getString("capLinhaCar"),
                    rs.getInt("qtdRolCar"),
                    rs.getString("perfilCar"),
                    rs.getString("fabriCar")
                }); 
            }
        }catch(Exception e){
            System.out.println("Erro ao puxar tabela consulta");
        }
    }
    
    public static void carregaRelaLinha(DefaultTableModel modelo) {
        ResultSet rs = null;       
        try{
            rs = ConexaoBD.getConexao().executarQueryBD("SELECT * FROM linha");

            while(rs.next()){
                modelo.addRow(new Object[]{
                    rs.getInt("idLoteLinha"),
                    rs.getInt("uniLoteLinha"), 
                    rs.getString("marcaLinha"),
                    rs.getString("modeloLinha"),
                    rs.getString("precoLinha"),
                    0.9*(rs.getDouble("precoLinha")),
                    rs.getString("compriLinha"),
                    rs.getString("espLinha"),
                    rs.getString("resistLinha"),
                    rs.getString("corLinha"),
                    rs.getString("fabriLinha")
                }); 
            }
        }catch(Exception e){
            System.out.println("Erro ao puxar tabela consulta");
        }
    }
    
    public static void carregaRelaVara(DefaultTableModel modelo) {
        ResultSet rs = null;       
        try{
            rs = ConexaoBD.getConexao().executarQueryBD("SELECT * FROM vara");

            while(rs.next()){
                modelo.addRow(new Object[]{
                    rs.getInt("idLoteVara"),
                    rs.getInt("uniLoteVara"), 
                    rs.getString("marcaVara"),
                    rs.getString("modeloVara"),
                    rs.getString("precoVara"),
                    0.9*(rs.getDouble("precoVara")),
                    rs.getString("tamVara"),
                    rs.getString("acaoVara"),
                    rs.getString("resisVara"),
                    rs.getString("fabriVara")
                    
                }); 
            }
        }catch(Exception e){
            System.out.println("Erro ao puxar tabela consulta");
        }
    }
    
    public static void carregaTabPrincipal(DefaultTableModel modelo) {
        ResultSet rs = null;       
        try{
            rs = ConexaoBD.getConexao().executarQueryBD("SELECT * FROM anzol");

            while(rs.next()){
                modelo.addRow(new Object[]{
                    "ANZOL",
                    rs.getString("modeloAnzol"),
                    rs.getInt("idLoteAnzol"),
                    rs.getInt("uniLoteAnzol"), 
                    rs.getString("precoAnzol")
                }); 
            }
        }catch(Exception e){
            System.out.println("Erro ao puxar tabela consulta");
        }
        rs = null;   
        try{
            rs = ConexaoBD.getConexao().executarQueryBD("SELECT * FROM carretilha");

            while(rs.next()){
                modelo.addRow(new Object[]{
                    "CARRETILHA",
                    rs.getString("modeloCar"),
                    rs.getInt("idLoteCar"),
                    rs.getInt("uniLoteCar"), 
                    rs.getString("precoCar")
                }); 
            }
        }catch(Exception e){
            System.out.println("Erro ao puxar tabela consulta");
        }
        rs = null;  
        try{
            rs = ConexaoBD.getConexao().executarQueryBD("SELECT * FROM linha");

            while(rs.next()){
                modelo.addRow(new Object[]{
                    "LINHA",
                    rs.getString("modeloLinha"),
                    rs.getInt("idLoteLinha"),
                    rs.getInt("uniLoteLinha"), 
                    rs.getString("precoLinha")
                }); 
            }
        }catch(Exception e){
            System.out.println("Erro ao puxar tabela consulta");
        }
        rs = null;  
        try{
            rs = ConexaoBD.getConexao().executarQueryBD("SELECT * FROM vara");

            while(rs.next()){
                modelo.addRow(new Object[]{
                    "VARA",
                    rs.getString("modeloVara"),
                    rs.getInt("idLoteVara"),
                    rs.getInt("uniLoteVara"), 
                    rs.getString("precoVara")
                }); 
            }
        }catch(Exception e){
            System.out.println("Erro ao puxar tabela consulta");
        }
        
    }
}
