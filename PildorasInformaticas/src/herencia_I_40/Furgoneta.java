package herencia_I_40;

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
}
