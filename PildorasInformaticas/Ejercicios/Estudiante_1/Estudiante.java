package Estudiante_1;

public class Estudiante {
	private String nombre;
	private int edad;
	private int telefono;
	private int nota;
	private int aprobado;
	
	//constructor
	public Estudiante(){
		nombre="Ariel";
		edad=35;
		telefono=76702433;
	}
	
	//set
	public void establecer_nota(int nota){
		this.nota=nota;
	}
	
	//get
	public String dime_datos(){
		return ("El nombre del estudiante es: " + nombre + ", su edad es: " + edad +
				", su telefono es: " + telefono + ", y su nota es: " + this.nota);
	}
	
	//get
	public String dime_aprobacion(){
		if(this.nota>=51){
			return ("El estudiante aprobo");
		}else{
			return ("El estudiante reprobo");
		}
	}	
}
