package poo_IV_30;

public class Coche {
	private int ruedas;
	private int largo;
	private int ancho;
	private int motor;
	private int peso;
	private int peso_plataforma;
	
	//propiedades que pueden variar, estas propiedades deberan encapsularse (private)
	//para este ejemplo se dejo asi
	String color;
	int peso_total;
	boolean asientos_cuero, climatizador;
	
	//metodo constructor, metodo especial que se encarga de dar un estado inicial a nuestro objeto
	public Coche(){
		ruedas=4;
		largo=2000;
		ancho=300;
		//motor=1600;
		peso=500;
		peso_plataforma=500;
	}
	
	//metodo tipo setter, encargado de modificar el valor de una propiedad
	//void indica que el metodo no devuelve ningun valor
	public void establece_color(String color){
		this.color=color;
	}
	public void establece_peso(){
		this.peso_total=peso+peso_plataforma;
	}
	public void establece_motor(int motor){
		this.motor=motor;
	}
	
	//metodo tipo getter
	public String dime_color(){
		return "El color del coche es: " + color;
	}
	public String dime_peso(){
		return "El peso total del coche es: "+peso_total;
	}
	public String dime_motor(){
		return "La cilindrada del motor es: "+motor;
	}
	public int getruedas(){
		return ruedas;
	}
}