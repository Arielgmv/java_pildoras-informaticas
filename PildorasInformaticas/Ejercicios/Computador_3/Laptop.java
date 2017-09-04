package Computador_3;

public class Laptop extends Computador{
	private double tamanho;
	private double precio;
	//contructor
	public Laptop(String marca, String modelo, String procesador, int ram, int almacenamiento, double tamanho){
		//super("ASUS", "ROG", "Corei7", 16, 2000);
		super(marca, modelo, procesador, ram, almacenamiento);
		this.tamanho=tamanho;
		super.establecer_precio();
		precio=super.dime_precio();
	}
	//set
	public void establecer_precio_laptop(){
		if(tamanho>=15.6){
			precio+=60;
		}
	}
	//get
	public double dime_precio_laptop(){
		return precio;
	}
}