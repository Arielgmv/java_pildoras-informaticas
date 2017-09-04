package Computador_3;
public class Computador {
	private String marca;
	private String modelo;
	private String procesador;
	private int ram;
	private int almacenamiento;
	private double precio;
	//constructor
	public Computador(String marca, String modelo, String procesador, int ram, int almacenamiento){
		this.marca=marca;
		this.modelo=modelo;
		this.procesador=procesador;
		this.ram=ram;
		this.almacenamiento=almacenamiento;
		precio=700;
	}
	//set
	public void establecer_precio(){
		if(procesador.equalsIgnoreCase("Corei7")){
			precio+=100;
		}
		if(ram>=8){
			precio+=100;
		}
		if(almacenamiento>=1000){
			precio+=100;
		}
	}
	//get
	public double dime_precio(){
		return precio;
	}
	//get
	public String dime_caracteristicas(){
		return("La marca es: "+marca+", el modelo es: "+modelo+", el procesador es: "+procesador+", la ram es: "+
				ram+" GB, el almacenamiento es: "+almacenamiento+" GB");
	}
	//get (metodo abstracto)
	public abstract String dime_diferencia();
}