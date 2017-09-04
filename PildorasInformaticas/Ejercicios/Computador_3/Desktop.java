package Computador_3;
public class Desktop extends Computador{
	private boolean monitor;
	private double precio;
	//constructor
	public Desktop(String marca, String modelo, String procesador, int ram, int almacenamiento){
		//super("Dell", "Optiplex 3200", "Corei7", 16, 1000);
		super(marca, modelo, procesador, ram, almacenamiento);
		super.establecer_precio();
		precio=super.dime_precio();
	}
	//set
	public void establecer_monitor(String monitor){
		if(monitor.equalsIgnoreCase("Si")){
			this.monitor=true;
		}else{
			this.monitor=false;
		}
	}
	//get
	public String dime_monitor(){
		if(monitor=true){
			return ("El desktop tiene monitor");
		}else{
			return ("El desktop no tiene monitor");
		}
	}
	//set
	public void establecer_precio_desktop(){
		if(monitor=true){
			precio+=120;
		}
	}
	//get
	public double dime_precio_desktop(){
		return precio;
	}
}
