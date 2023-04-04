package Model;


import Model.UniLotePeqException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class BdCarretilha {
    
    private Carretilha c = new Carretilha();
    
    private List<Carretilha> bdCarretilha = new ArrayList<Carretilha>();
    
    public List<Carretilha> getBdCarretilha(){
        return bdCarretilha;
    }
    
    public Carretilha cadCarretilha(Carretilha c){
        if(consCarretilha(c) == null){
            bdCarretilha.add(c);
            return c;
        }else{
            return null;
        }
    }
    
    public Carretilha consCarretilha(Carretilha c){
        for(int i=0; i<bdCarretilha.size(); i++){
            if(c.getCodigoLote() == bdCarretilha.get(i).getCodigoLote()){
                return bdCarretilha.get(i);
            }
        }
        return null;
    }	
    
    public Carretilha removeCarretilha(Carretilha c){
        c = consCarretilha(c);
        if(c != null){
            int x = JOptionPane.showConfirmDialog(null,
                                                      "Realmente deseja remover esse produto?",
                                                      "Confirmação de exclusão", 
                                                      JOptionPane.YES_NO_CANCEL_OPTION
                                                      );
            if(x==0){
                bdCarretilha.remove(c);
            }
            return c;
        }
        else{
            return c;
        }
    }
    
     public Carretilha atualizaCarretilha(Carretilha c){
        for(int i = 0; i < bdCarretilha.size(); i++){
            if(c.getCodigoLote() == bdCarretilha.get(i).getCodigoLote()){
                
                    int uni = Integer.parseInt(JOptionPane.showInputDialog(null,
                                                "Informe as Unidades do Lote:", 
                                                "Autalização", 
                                                JOptionPane.QUESTION_MESSAGE));
                    try{
                         bdCarretilha.get(i).setUnidadesLote(uni);
                    }
                    catch(UniLotePeqException upe){
                        upe.impUniLotePeq();
                        c = upe.corrigeUniLotePeq(c);
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

                    bdCarretilha.get(i).setPreco(preco); 
                    return bdCarretilha.get(i);
                }
            }  
        return null;
    }
}
