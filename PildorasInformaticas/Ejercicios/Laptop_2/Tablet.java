package Laptop_2;

public class Tablet extends Laptop{
	double tamanho;
	double peso;
	//constructor
	public Tablet(double tamanho, double peso){
		super("Samsung", 8, 32, 2016, 8, 24);
		this.tamanho=tamanho;
		this.peso=peso;
	}
	//get
	public String dime_datos_tablet(){
		return ("El tamanho del tablet es: "+tamanho+" pulgadas, y su peso es: "+peso+" gramos");
	}
}
