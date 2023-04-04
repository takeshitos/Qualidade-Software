
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class BdAnzol {
    private Anzol a = new Anzol();
    
    private List<Anzol> bdAnzol = new ArrayList<Anzol>();
    
    public List<Anzol> getBdAnzol(){
        return bdAnzol;
    }
    
    public Anzol cadAnzol(Anzol a){      
        if(consAnzol(a) == null){
                bdAnzol.add(a);
                return a;
        }else{
                return null;
        }
    }
    
    public Anzol consAnzol(Anzol a){
        for(int i=0; i<bdAnzol.size(); i++){
                if(a.getCodigoLote() == bdAnzol.get(i).getCodigoLote()){
                    return bdAnzol.get(i);
            }
        }
        return null;
    }
    
    public Anzol removeAnzol(Anzol a){
        a = consAnzol(a);
        if(a != null){
            int x = JOptionPane.showConfirmDialog(null,
                                                      "Realmente deseja remover esse produto?",
                                                      "Confirmação de exclusão", 
                                                      JOptionPane.YES_NO_CANCEL_OPTION
                                                      );
            if(x==0){
                bdAnzol.remove(a);
            }
            return a;
        }
        else{
            return a;
        }
    }
    
    public Anzol atualizaAnzol(Anzol a){
        for(int i = 0; i < bdAnzol.size(); i++){
            if(a.getCodigoLote() == bdAnzol.get(i).getCodigoLote()){
                
                    int uni = Integer.parseInt(JOptionPane.showInputDialog(null,
                                                "Informe as Unidades do Lote:", 
                                                "Autalização", 
                                                JOptionPane.QUESTION_MESSAGE));
                    try{
                         bdAnzol.get(i).setUnidadesLote(uni);
                    }
                    catch(UniLotePeqException upe){
                        upe.impUniLotePeq();
                        a = upe.corrigeUniLotePeq(a);
                    }
                    catch(NumberFormatException nfe){
                        JOptionPane.showMessageDialog(
                                null,
                                "VALOR DA UNIDADES LOTE DEVE SER INTEIRO",
                                "Erro de Cadastro",
                                0
                        );
                    }

                    float preco = Float.valueOf(JOptionPane.showInputDialog(null,
                                                "Informe o novo preço:", 
                                                "Autalização", 
                                                JOptionPane.QUESTION_MESSAGE));

                    bdAnzol.get(i).setPreco(preco); 
                    return bdAnzol.get(i);
                }
            }  
        return null;
    }
}
  
