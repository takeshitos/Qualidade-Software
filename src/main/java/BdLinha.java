
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;


public class BdLinha {
    private Linha l = new Linha();
    
    private List<Linha> bdLinha = new ArrayList<Linha>();
    
    public List<Linha> getBdLinha(){
        return bdLinha;
    }
    
    public Linha cadLinha(Linha l){
        if(consLinha(l) == null){
            bdLinha.add(l);
            return l;
        }else{
            return null;
        }
    }
    
    public Linha consLinha(Linha l){
        for(int i=0; i<bdLinha.size(); i++){
            if(l.getCodigoLote() == bdLinha.get(i).getCodigoLote()){
                return bdLinha.get(i);
            }
        }
        return null;
    }
    
     public Linha removeLinha(Linha l){
        l = consLinha(l);
        if(l != null){
            int x = JOptionPane.showConfirmDialog(null,
                                                      "Realmente deseja remover esse produto?",
                                                      "Confirmação de exclusão", 
                                                      JOptionPane.YES_NO_CANCEL_OPTION
                                                      );
            if(x==0){
                bdLinha.remove(l);
            }
            return l;
        }
        else{
            return l;
        }
    }
    
     public Linha atualizaLinha(Linha l){
        for(int i = 0; i < bdLinha.size(); i++){
            if(l.getCodigoLote() == bdLinha.get(i).getCodigoLote()){
                
                    int uni = Integer.parseInt(JOptionPane.showInputDialog(null,
                                                "Informe as Unidades do Lote:", 
                                                "Autalização", 
                                                JOptionPane.QUESTION_MESSAGE));
                    try{
                         bdLinha.get(i).setUnidadesLote(uni);
                    }
                    catch(UniLotePeqException upe){
                        upe.impUniLotePeq();
                        l = upe.corrigeUniLotePeq(l);
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

                    bdLinha.get(i).setPreco(preco); 
                    return bdLinha.get(i);
                }
            }  
        return null;
    }
}
