package poo_IV_30;

public class Coche {
	private int ruedas;
	private int largo;
	private int ancho;
	private int motor;
	private int peso;
	private int peso_plataforma;
	
	//propiedades que pueden variar, estas propiedades deber�n encapsularse (private)
	//para este ejemplo se dejo as�
	String color;
	int peso_total;
	boolean asientos_cuero, climatizador;
	
	public Coche(){
		ruedas=4;
		largo=2000;
		ancho=300;
		motor=1600;
		peso=500;
		peso_plataforma=500;
	}
	
	//m�todo tipo setter, encargado de modificar el valor de una propiedad
	//void indica que el m�todo no devuelve ning�n valor
	public void establece_color(){
		color="azul";
	}
	
	//m�todo tipo getter
	public String dime_color(){
		return "El color del coche es: " + color;
	}
}