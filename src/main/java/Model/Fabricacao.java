package Model;


public class Fabricacao{
	private int dia;
	private int mes;	
	private int ano;
	
	public Fabricacao(){
		dia = 0;
		mes = 0;
		ano = 0;
	}
	
	public int getDia(){
		return dia;
	}
	public void setDia(int dia){
		this.dia = dia;
	}
	public int getMes(){
		return mes;
	}
	public void setMes(int mes){
		this.mes = mes;
	}
	public int getAno(){
		return ano;
	} 
	public void setAno(int ano){
		this.ano = ano;
	}
}