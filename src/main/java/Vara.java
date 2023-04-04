
final public class Vara extends Produto implements Calc{
	private float tamanho;
	private String acao;
	private int resistencia;
	
	public Vara(){
		tamanho = 0;
		acao = "";
		resistencia = 0;
	}
	public float getTamanho(){
		return tamanho;
	}
	public void setTamanho(float tamanho){
		this.tamanho = tamanho;
	}
	public String getAcao(){
		return acao;
	}
	public void setAcao(String acao){
		this.acao = acao;
	}
	public int getResistencia(){
		return resistencia;
	} 	
	public void setResistencia(int resistencia){
		this.resistencia = resistencia;
	}
	//Polimorfismo por sobrescrita
	public String mostraClasse(){
		return "VARA";
	}
	public float converte(){
		return ((float)(this.resistencia)/x);
	}
	public float desconto(){
		return super.precoDesconto();
	}
}