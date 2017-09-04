package herencia_II_41;

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
		return "La plataforma del veh�culo tiene: " + ruedas + " ruedas" + 
		". Mide " + largo/1000 + " metros, con un ancho de " + ancho + 
		" cm y un peso de plataforma de " + peso_plataforma + " Kg.";
	}
	
	//set
	//colocamos un par�metro o argumento en los par�ntesis (zona de par�metros)
	public void establece_color(String color_coche){
		color=color_coche;
	}
	
	//get
	public String dime_color(){
		return "El color del coche es: " + color;
	}
	
	//set asientos cuero
	//this hace referencia a la propia clase, estamos haciendo referencia a la variable de la clase
	public void configura_asientos(String asientos_cuero){
		if(asientos_cuero.equalsIgnoreCase("si")){
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
	//set climatizador
	public void configura_climatizador(String climatizador){
		if(climatizador.equalsIgnoreCase("si")){
			this.climatizador=true;
		}else{
			this.climatizador=false;
		}
	}
	
	//get climatizador
	public String dime_climatizador(){
		if(climatizador==true){
			return "El coche incorpora climatizador";
		}else{
			return "El coche lleva aire acondicionado";
		}
	}
	//setter y getter (no recomendada), se est� estableciendo el valor de una variable,
	//y estamos obteniendo un dato (return)
	public String dime_peso_coche(){
		//ambito de esta variable es local, s�lo se ve en este m�todo
		int peso_carroceria=500;
		peso_total=peso_plataforma+peso_carroceria;
		if(asientos_cuero==true){
			peso_total=peso_total+50;
		}
		if(climatizador==true){
			peso_total=peso_total+20;
		}
		return "El peso del coche es: " + peso_total;
	}
	//getter
	public int precio_coche(){
		int precio_final=10000;
		if(asientos_cuero==true){
			precio_final+=2000;
		}
		if(climatizador==true){
			precio_final+=1500;
		}
		return precio_final;
	}
}