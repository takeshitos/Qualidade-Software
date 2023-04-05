package Model;


import Model.Produto;


final public class Carretilha extends Produto{
	private String capLinha;
	private int qtdRolamento;
	private String perfil;
	
	public Carretilha(){
		capLinha = "0";
		qtdRolamento = 0;
		perfil = "";
	}
	public String getCapLinha(){
		return capLinha;
	}
	public void setCapLinha(String capLinha){
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