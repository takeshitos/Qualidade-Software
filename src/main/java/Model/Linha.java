package Model;


import Model.Produto;


final public class Linha extends Produto implements Calc{
	private int comprimento;
	private float espessura;
	private int resistencia;
	private String cor;
	
	public Linha(){
		comprimento = 0;
		espessura = 0;
		resistencia = 0;
		cor = "";
	}
	
	public int getComprimento(){
		return comprimento;
	}
	public void setComprimento(int comprimento){
		this.comprimento = comprimento;
	}
	public float getEspessura(){
		return espessura;
	}
	public void setEspessura(float espessura){
		this.espessura = espessura;
	}
	public int getResistencia(){
		return resistencia;
	}
	public void setResistencia(int resistencia){
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
	public float converte(){
		return ((float)(this.resistencia)/x);
	}
	public float desconto(){
		return super.precoDesconto();
	}
}