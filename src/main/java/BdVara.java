
import java.util.List;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class BdVara{

	private Vara v = new Vara();     
	
	private List<Vara> bdVara = new ArrayList<Vara>();
	 
        public List<Vara> getBdVara(){
            return bdVara;
        }
        
        public Vara cadVara(Vara v){
            if(consVara(v) == null){
                bdVara.add(v);
                return v;
            }else{
                return null;
            }
	}
        
        public Vara consVara(Vara v){
            for(int i=0; i<bdVara.size(); i++){
                if(v.getCodigoLote() == bdVara.get(i).getCodigoLote()){
                    return bdVara.get(i);
                }
            }
            return null;
	}
        
    public Vara removeVara(Vara v){
        v = consVara(v);
        if(v != null){
            int x = JOptionPane.showConfirmDialog(null,
                                                      "Realmente deseja remover esse produto?",
                                                      "Confirmação de exclusão", 
                                                      JOptionPane.YES_NO_CANCEL_OPTION
                                                      );
            if(x==0){
                bdVara.remove(v);
            }
            return v;
        }
        else{
            return v;
        }
    }
    
    public Vara atualizaVara(Vara v){
        for(int i = 0; i < bdVara.size(); i++){
            if(v.getCodigoLote() == bdVara.get(i).getCodigoLote()){
                
                    int uni = Integer.parseInt(JOptionPane.showInputDialog(null,
                                                "Informe as Unidades do Lote:", 
                                                "Autalização", 
                                                JOptionPane.QUESTION_MESSAGE));
                    try{
                         bdVara.get(i).setUnidadesLote(uni);
                    }
                    catch(UniLotePeqException upe){
                        upe.impUniLotePeq();
                        v = upe.corrigeUniLotePeq(v);
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

                    bdVara.get(i).setPreco(preco); 
                    return bdVara.get(i);
                }
            }  
        return null;
    }
     
        /*
	public void impAnzol(){
		for(Anzol an : bdAnzol){
			an.mostraClasse();
			System.out.println("TAMANHO: "+an.getTamanho());
			System.out.println("UNIDADES: "+an.getUnidadesPacote());
			System.out.println("MARCA: "+an.getMarca());
			System.out.println("MODELO: "+an.getModelo());
			System.out.println("PRECO: RS "+an.getPreco());
			an.desconto();
			System.out.println("CODIGO LOTE: "+an.getCodigoLote());
			System.out.println("UNIDADES LOTE: "+an.getUnidadesLote());
			System.out.println("FABRICACAO: "+an.getFabri().getDia()+"/"+an.getFabri().getMes()+"/"+an.getFabri().getAno());
		}

	}

	public void impOneAnzol(Anzol an){
		
		an.mostraClasse();
		System.out.println("TAMANHO: "+an.getTamanho());
		System.out.println("UNIDADES: "+an.getUnidadesPacote());
		System.out.println("MARCA: "+an.getMarca());
		System.out.println("MODELO: "+an.getModelo());
		System.out.println("PRECO: RS "+an.getPreco());
		an.desconto();
		System.out.println("CODIGO LOTE: "+an.getCodigoLote());
		System.out.println("UNIDADES LOTE: "+an.getUnidadesLote());
		System.out.println("FABRICACAO: "+an.getFabri().getDia()+"/"+an.getFabri().getMes()+"/"+an.getFabri().getAno());	

	}
	*/
		
	/*
	public void removeAnzolCod(Anzol a){
		bdAnzol.remove(a);
	}
	
	public void atualizaAnzolCod(Anzol a){
		boolean vai1 = true;
		while(vai1){
			try{
				a.setUnidadesLote(Integer.parseInt(le.entDados("UNIDADES LOTE: ")));
				vai1 = false;
			}	
			catch(UniLotePeqException upe){
				upe.impUniLotePeq();
				a = upe.corUniLotePeq(a); 
				vai1 = false;
			}
			catch(NumberFormatException nfe){
				System.out.println("O VALOR DEVE SER DO TIPO INTEIRO!");
				continue;
			}
			finally{
				if(vai1 == false){
					System.out.println("\tOPERACAO BEM SUCEDIDA!");
				}
			}
		}
		a.setPreco(Float.valueOf(le.entDados("PRECO: ")).floatValue());
		
		for(int i=0; i<bdAnzol.size(); i++){
			if(a.getCodigoLote() == bdAnzol.get(i).getCodigoLote()){
				bdAnzol.set(i, a);
			}
		}
	}
	//////////////////////////////////////////////////////////////////
	
	
	public void impVara(){
		for(Vara v : bdVara){
			v.mostraClasse();
			System.out.println("TAMANHO: "+v.getTamanho()+" metros");
			System.out.println("ACAO: "+v.getAcao());
			System.out.println("RESISTENCIA: "+v.getResistencia()+" libras");
			v.converte();
			System.out.println("MARCA: "+v.getMarca());
			System.out.println("MODELO: "+v.getModelo());
			System.out.println("PRECO: RS "+v.getPreco());
			v.desconto();
			System.out.println("CODIGO LOTE: "+v.getCodigoLote());
			System.out.println("UNIDADES LOTE: "+v.getUnidadesLote());
			System.out.println("FABRICACAO: "+v.getFabri().getDia()+"/"+v.getFabri().getMes()+"/"+v.getFabri().getAno());
		}
	
	}
	
	public void impOneVara(Vara v){
		v.mostraClasse();
		System.out.println("TAMANHO: "+v.getTamanho()+" metros");
		System.out.println("ACAO: "+v.getAcao());
		System.out.println("RESISTENCIA: "+v.getResistencia()+" libras");
		v.converte();
		System.out.println("MARCA: "+v.getMarca());
		System.out.println("MODELO: "+v.getModelo());
		System.out.println("PRECO: RS "+v.getPreco());
		v.desconto();
		System.out.println("CODIGO LOTE: "+v.getCodigoLote());
		System.out.println("UNIDADES LOTE: "+v.getUnidadesLote());
		System.out.println("FABRICACAO: "+v.getFabri().getDia()+"/"+v.getFabri().getMes()+"/"+v.getFabri().getAno());
	}

		

	public void removeVaraCod(Vara v){
		bdVara.remove(v);
	}

	public void atualizaVaraCod(Vara v){
		boolean vai3 = true;
		while(vai3){
			try{
				v.setUnidadesLote(Integer.parseInt(le.entDados("UNIDADES LOTE: ")));
				vai3 = false;
			}	
			catch(UniLotePeqException upe){
				upe.impUniLotePeq();
				v = upe.corUniLotePeq(v); 
				vai3 = false;
			}
			catch(NumberFormatException nfe){
				System.out.println("O VALOR DEVE SER DO TIPO INTEIRO!");
				continue;
			}
			finally{
				if(vai3 == false){
					System.out.println("\tOPERACAO BEM SUCEDIDA!");
				}
			}
		}
		v.setPreco(Float.valueOf(le.entDados("PRECO: ")).floatValue());
		
		for(int i=0; i<bdVara.size(); i++){
			if(v.getCodigoLote() == bdVara.get(i).getCodigoLote()){
				bdVara.set(i, v);
			}
		}
	}
	////////////////////////////////////////////////////////////////////////////////
        */
	
            /*
	public void impLinha(){
		for(Linha l : bdLinha){
			l.mostraClasse();
			System.out.println("COMPRIMENTO: "+l.getComprimento()+" metros");
			System.out.println("ESPESSURA: "+l.getEspessura()+" mm");
			System.out.println("RESISTENCIA: "+l.getResistencia()+" libras");
			l.converte();
			System.out.println("COR: "+l.getCor());
			System.out.println("MARCA: "+l.getMarca());
			System.out.println("MODELO: "+l.getModelo());
			System.out.println("PRECO: RS "+l.getPreco());
			l.desconto();
			System.out.println("CODIGO LOTE: "+l.getCodigoLote());
			System.out.println("UNIDADES LOTE: "+l.getUnidadesLote());
			System.out.println("FABRICACAO: "+l.getFabri().getDia()+"/"+l.getFabri().getMes()+"/"+l.getFabri().getAno());
		}
	}

	public void impOneLinha(Linha l){
		l.mostraClasse();
		System.out.println("COMPRIMENTO: "+l.getComprimento()+" metros");
		System.out.println("ESPESSURA: "+l.getEspessura()+" mm");
		System.out.println("RESISTENCIA: "+l.getResistencia()+" libras");
		l.converte();
		System.out.println("COR: "+l.getCor());
		System.out.println("MARCA: "+l.getMarca());
		System.out.println("MODELO: "+l.getModelo());
		System.out.println("PRECO: RS "+l.getPreco());
		l.desconto();
		System.out.println("CODIGO LOTE: "+l.getCodigoLote());
		System.out.println("UNIDADES LOTE: "+l.getUnidadesLote());
		System.out.println("FABRICACAO: "+l.getFabri().getDia()+"/"+l.getFabri().getMes()+"/"+l.getFabri().getAno());
	}
        */
		
        /*
	public void removeLinhaCod(Linha l){
		bdLinha.remove(l);
	}

	public void atualizaLinhaCod(Linha l){
		boolean vai2 = true;
		while(vai2){
			try{
				l.setUnidadesLote(Integer.parseInt(le.entDados("UNIDADES LOTE: ")));
				vai2 = false;
			}	
			catch(UniLotePeqException upe){
				upe.impUniLotePeq();
				l = upe.corUniLotePeq(l); 
				vai2 = false;
			}
			catch(NumberFormatException nfe){
				System.out.println("O VALOR DEVE SER DO TIPO INTEIRO!");
				continue;
			}
			finally{
				if(vai2 == false){
					System.out.println("\tOPERACAO BEM SUCEDIDA!");
				}
			}
		}
		l.setPreco(Float.valueOf(le.entDados("PRECO: ")).floatValue());
		
		for(int i=0; i<bdLinha.size(); i++){
			if(l.getCodigoLote() == bdLinha.get(i).getCodigoLote()){
				bdLinha.set(i, l);
			}
		}
		
	}
	/////////////////////////////////////////////////////////////////////////////
        */
	
        /*
	public void impCarretilha(){
		for(Carretilha c : bdCarretilha){
			c.mostraClasse();
			System.out.println("CAP.LINHA: "+c.getCapLinha());
			System.out.println("ROLAMENTOS: "+c.getQtdRolamento());
			System.out.println("PERFIL: "+c.getPerfil());
			System.out.println("MARCA: "+c.getMarca());
			System.out.println("MODELO: "+c.getModelo());
			System.out.println("PRECO: RS "+c.getPreco());
			c.desconto();
			System.out.println("CODIGO LOTE: "+c.getCodigoLote());
			System.out.println("UNIDADES LOTE: "+c.getUnidadesLote());
			System.out.println("FABRICACAO: "+c.getFabri().getDia()+"/"+c.getFabri().getMes()+"/"+c.getFabri().getAno());	
		}
	}

	public void impOneCarretilha(Carretilha c){
		c.mostraClasse();
		System.out.println("CAP.LINHA: "+c.getCapLinha());
		System.out.println("ROLAMENTOS: "+c.getQtdRolamento());
		System.out.println("PERFIL: "+c.getPerfil());
		System.out.println("MARCA: "+c.getMarca());
		System.out.println("MODELO: "+c.getModelo());
		System.out.println("PRECO: RS "+c.getPreco());
		c.desconto();
		System.out.println("CODIGO LOTE: "+c.getCodigoLote());
		System.out.println("UNIDADES LOTE: "+c.getUnidadesLote());
		System.out.println("FABRICACAO: "+c.getFabri().getDia()+"/"+c.getFabri().getMes()+"/"+c.getFabri().getAno());	
	}
        */
	
        /*
	public void removeCarretilhaCod(Carretilha c){
		bdCarretilha.remove(c);
	}

	public void atualizaCarretilhaCod(Carretilha c){
		boolean vai4 = true;
		while(vai4){
			try{
				c.setUnidadesLote(Integer.parseInt(le.entDados("UNIDADES LOTE: ")));
				vai4 = false;
			}	
			catch(UniLotePeqException upe){
				upe.impUniLotePeq();
				c = upe.corUniLotePeq(c); 
				vai4 = false;
			}
			catch(NumberFormatException nfe){
				System.out.println("O VALOR DEVE SER DO TIPO INTEIRO!");
				continue;
			}
			finally{
				if(vai4 == false){
					System.out.println("\tOPERACAO BEM SUCEDIDA!");
				}
			}
		}
		c.setPreco(Float.valueOf(le.entDados("PRECO: ")).floatValue());
		
		for(int i=0; i<bdCarretilha.size(); i++){
			if(c.getCodigoLote() == bdCarretilha.get(i).getCodigoLote()){
				bdCarretilha.set(i, c);
			}
		}
		
	}
	*/

}