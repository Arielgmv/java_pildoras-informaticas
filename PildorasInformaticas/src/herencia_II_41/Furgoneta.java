package herencia_II_41;

//clase Coche se convierte en superclase (clase padre)
//la clase furgoneta se convierte en subclase (clase hijo)
public class Furgoneta extends Coche{
	private int capacidad_carga;
	private int plazas_extra;
	public Furgoneta(int plazas_extra, int capacidad_carga){
		//llama al contructor de la clase Coche (padre), con el objetivo de dar un
		//estado inicial
		super();
		this.capacidad_carga=capacidad_carga;
		this.plazas_extra=plazas_extra;
	}
	//get
	public String dime_datos_furgoneta(){
		return ("La capacidad de carga es: "+capacidad_carga+", y las plazas son: "+plazas_extra);
	}
}
