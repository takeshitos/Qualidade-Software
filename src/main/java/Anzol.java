
final public class Anzol extends Produto{
	private int tamanho;
	private int unidadesPacote;
	
	public Anzol(){
		tamanho = 0;
		unidadesPacote = 0;
	}
	
	public int getTamanho(){
		return tamanho;
	}
	public void setTamanho(int tamanho){
		this.tamanho = tamanho;
	}
	public int getUnidadesPacote(){
		return unidadesPacote;
	}
	public void setUnidadesPacote(int unidadesPacote){
		this.unidadesPacote = unidadesPacote;
	}
	//Polimorfismo por sobrescrita
	public String mostraClasse(){
		return "ANZOL";
	}
	public float desconto(){
		return super.precoDesconto();
	}
}