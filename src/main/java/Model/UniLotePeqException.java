package Model;


import Model.Vara;
import Model.Anzol;
import javax.swing.JOptionPane;


public class UniLotePeqException extends Exception{
	public void impUniLotePeq(){
		JOptionPane.showMessageDialog(
                    null,
                    "A UNIDADE DO LOTE DEVE SER POSITIVA",
                    "Erro de Cadastro",
                    0
                );
	}
        public Anzol corrigeUniLotePeq(Anzol a1){
                try{
                    a1.setUnidadesLote(Integer.parseInt(JOptionPane.showInputDialog(
                                                         null, 
                                                         "DIGITE UM VALOR POSITIVO",
                                                         "UNDADES ERRO",
                                                         JOptionPane.PLAIN_MESSAGE)));             
                }
                catch(UniLotePeqException upe){
                    upe.impUniLotePeq();
                    a1 = upe.corrigeUniLotePeq(a1);              
                }
                catch(NumberFormatException nfe){
                    JOptionPane.showMessageDialog(
                        null,
                        "VALOR DA UNIDADES LOTE DEVE SER INTEIRO",
                        "Erro de Cadastro",
                        0
                     );
               }
            return a1;
        }
        
        public Carretilha corrigeUniLotePeq(Carretilha c1){
            try{
                c1.setUnidadesLote(Integer.parseInt(JOptionPane.showInputDialog(
                                                         null, 
                                                         "DIGITE UM VALOR POSITIVO",
                                                         "UNDADES ERRO",
                                                         JOptionPane.PLAIN_MESSAGE)));     
            }	
            catch(UniLotePeqException upe){
                    upe.impUniLotePeq();
                    c1 = upe.corrigeUniLotePeq(c1); 

            }
            catch(NumberFormatException nfe){
                    JOptionPane.showMessageDialog(
                        null,
                        "VALOR DA UNIDADES LOTE DEVE SER INTEIRO",
                        "Erro de Cadastro",
                        0
                );    
            }
            return c1;
        }
        public Linha corrigeUniLotePeq(Linha l1){
            try{
                l1.setUnidadesLote(Integer.parseInt(JOptionPane.showInputDialog(
                                                         null, 
                                                         "DIGITE UM VALOR POSITIVO",
                                                         "UNDADES ERRO",
                                                         JOptionPane.PLAIN_MESSAGE)));     
            }	
            catch(UniLotePeqException upe){
                    upe.impUniLotePeq();
                    l1 = upe.corrigeUniLotePeq(l1); 

            }
            catch(NumberFormatException nfe){
                    JOptionPane.showMessageDialog(
                        null,
                        "VALOR DA UNIDADES LOTE DEVE SER INTEIRO",
                        "Erro de Cadastro",
                        0
                );    
            }
            return l1;
        }
        
        public Vara corrigeUniLotePeq(Vara v1){
            try{
                v1.setUnidadesLote(Integer.parseInt(JOptionPane.showInputDialog(
                                                         null, 
                                                         "DIGITE UM VALOR POSITIVO",
                                                         "UNDADES ERRO",
                                                         JOptionPane.PLAIN_MESSAGE)));     
            }	
            catch(UniLotePeqException upe){
                    upe.impUniLotePeq();
                    v1 = upe.corrigeUniLotePeq(v1); 

            }
            catch(NumberFormatException nfe){
                    JOptionPane.showMessageDialog(
                        null,
                        "VALOR DA UNIDADES LOTE DEVE SER INTEIRO",
                        "Erro de Cadastro",
                        0
                );    
            }
            return v1;
        }
}