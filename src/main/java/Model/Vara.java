package Model;


final public class Vara extends Produto{
	private String tamanho;
	private String acao;
	private String resistencia;
	
	public Vara(){
		tamanho = "";
		acao = "";
		resistencia = "";
	}
	public String getTamanho(){
		return tamanho;
	}
	public void setTamanho(String tamanho){
		this.tamanho = tamanho;
	}
	public String getAcao(){
		return acao;
	}
	public void setAcao(String acao){
		this.acao = acao;
	}
	public String getResistencia(){
		return resistencia;
	} 	
	public void setResistencia(String resistencia){
		this.resistencia = resistencia;
	}
	//Polimorfismo por sobrescrita
	public String mostraClasse(){
		return "VARA";
	}
	
	public float desconto(){
		return super.precoDesconto();
	}
}