package poo_V_31;

public class Coche {
	private int ruedas;
	private int largo;
	private int ancho;
	private int motor;
	private int peso;
	private int peso_plataforma;	
	private String color;
	private int peso_total;
	private boolean asientos_cuero, climatizador;
	
	public Coche(){
		ruedas=4;
		largo=2000;
		ancho=300;
		motor=1600;
		peso=500;
		peso_plataforma=500;
	}
	
	//get
	public String dime_datos_generales(){
		return "La plataforma del vehiculo tiene: " + ruedas + " ruedas" + 
		". Mide " + largo/1000 + " metros, con un ancho de " + ancho + 
		" cm y un peso de plataforma de " + peso_plataforma + " Kg.";
	}
	
	//set
	//colocamos un parametro o argumento en los parentesis (zona de parametros)
	public void establece_color(String color_coche){
		this.color=color_coche;
	}
	
	//get
	public String dime_color(){
		return "El color del coche es: " + color;
	}
	
	//set asientos cuero
	//this hace referencia a la propia clase, estamos haciendo referencia a la variable de la clase
	public void configura_asientos(String asientos_cuero){
		if(asientos_cuero=="si"){
			this.asientos_cuero=true;
		}else{
			this.asientos_cuero=false;
		}		
	}
	//get
	public String dime_asientos(){
		if(asientos_cuero==true){
			return "El coche tiene asientos de cuero";
		}else{
			return "El coche tiene asientos de serie";
		}
	}
}