package constantes_36;
public class Pruebas {
	public static void main(String[] args) {
		//creamos dos objetos o instancias (trabajador1 y trabajador2)
		Empleados trabajador1 = new Empleados("Ariel");
		Empleados trabajador2 = new Empleados("Oswaldo");
		trabajador1.cambia_seccion("Sistemas");
		trabajador2.cambia_seccion("Sistemas");
		//trabajador1.cambia_nombre("Ana");
		System.out.println(trabajador1.devuelveDatos());
		System.out.println(trabajador2.devuelveDatos());
	}	
}
class Empleados{
	private final String nombre;
	private String seccion;
	//constructor
	public Empleados(String nom){
		nombre=nom;
		seccion="Administracion";
	}
	//set
	public void cambia_seccion(String seccion){
		this.seccion=seccion;
	}
	//set
	/*public void cambia_nombre(String nombre){
		this.nombre=nombre;
	}*/
	//get
	public String devuelveDatos(){
		return "El nombre es: " + nombre + ", y la seccion es: " + seccion;
	}
}