package Model;


abstract public class Produto{
	private String marca;
	private String modelo;
	private double preco;
	private int codigoLote;
	private int unidadesLote;
	private String fabri;

	public Produto(){
		marca = "";
		modelo = "";
		preco = 0;
		codigoLote = 0;
		unidadesLote = 0;
		fabri = "";
	}

	public String getMarca(){
		return marca;
	}
	public void setMarca(String marca){
		this.marca = marca;
	}
	public String getModelo(){
		return modelo;
	}
	public void setModelo(String modelo){
		this.modelo = modelo;	
	}
	public double getPreco(){
		return preco;
	}
	public void setPreco(double preco){
		this.preco = preco;
	}
	public int getCodigoLote(){
		return codigoLote;
	}
	public void setCodigoLote(int codigoLote){
		this.codigoLote  = codigoLote;
	} 
	public int getUnidadesLote(){
		return unidadesLote;
	}

	public void setUnidadesLote(int unidadesLote) throws UniLotePeqException{
		if(unidadesLote > 0){
			this.unidadesLote = unidadesLote;
		}else{
			throw new UniLotePeqException();
		}
	}

	public String getFabri(){
		return fabri;
	}
	public void setFabri(String fabri){
		this.fabri = fabri;
	}
	public float precoDesconto(){
		return (float) (preco*0.9);
	}
	abstract String mostraClasse();
}