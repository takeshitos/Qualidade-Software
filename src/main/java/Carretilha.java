
final public class Carretilha extends Produto{
	private int capLinha;
	private int qtdRolamento;
	private String perfil;
	
	public Carretilha(){
		capLinha = 0;
		qtdRolamento = 0;
		perfil = "";
	}
	public int getCapLinha(){
		return capLinha;
	}
	public void setCapLinha(int capLinha){
		this.capLinha = capLinha;
	}
	public int getQtdRolamento(){
		return qtdRolamento;
	}
	public void setQtdRolamento(int qtdRolamento){
		this.qtdRolamento = qtdRolamento;
	}
	public String getPerfil(){
		return perfil;
	}
	public void setPerfil(String perfil){
		this.perfil = perfil;
	}
	//Polimorfismo por sobrescrita
	public String mostraClasse(){
		return "CARRETILHA";
	}
	public float desconto(){
		return super.precoDesconto();
	}
}