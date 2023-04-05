package Model;


import Model.Produto;


final public class Linha extends Produto{
	private String comprimento;
	private String espessura;
	private String resistencia;
	private String cor;
	
	public Linha(){
		comprimento = "";
		espessura = "";
		resistencia = "";
		cor = "";
	}
	
	public String getComprimento(){
		return comprimento;
	}
	public void setComprimento(String comprimento){
		this.comprimento = comprimento;
	}
	public String getEspessura(){
		return espessura;
	}
	public void setEspessura(String espessura){
		this.espessura = espessura;
	}
	public String getResistencia(){
		return resistencia;
	}
	public void setResistencia(String resistencia){
		this.resistencia = resistencia;
	}
	public String getCor(){
		return cor;
	}
	public void setCor(String cor){
		this.cor = cor;
	}
	//Polimorfismo por sobrescrita
	public String mostraClasse(){
		return "LINHA";
	}
        
	public float desconto(){
		return super.precoDesconto();
	}
}