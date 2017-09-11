package poo_II_28;

public class Coche {
	//Se realiza la encapsulación colocando el private en los atributos, encapsulamos esta variable.. propiedad
	//Con esto no se puede modificar fuera de la clase
	private int ruedas;
	private int largo;
	private int ancho;
	private int motor;
	private int peso;
	
	//método constructor, método especial que se encarga de dar un estado inicial a nuestro objeto
	public Coche(){
		ruedas=4;
		largo=2000;
		ancho=300;
		motor=1600;
		peso=500;		
	}
	
	//método de tipo getter
	//modificador de acceso public permite utilizar este método en cualquier otra clase
	public String dime_largo(){
		return "El largo del coche es: " + largo;
	}
	public String motor(){
		return "El motor del coche es de: " +motor+" cc";
	}
}
