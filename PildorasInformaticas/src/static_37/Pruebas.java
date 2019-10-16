package static_37;
public class Pruebas {
	public static void main(String[] args) {
		Empleados trabajador1 = new Empleados("Ariel");
		Empleados trabajador2 = new Empleados("Oswaldo");
		Empleados trabajador3 = new Empleados("Teodoro");
		Empleados trabajador4 = new Empleados("Dora");
		trabajador1.cambia_seccion("Sistemas");
		trabajador4.cambia_seccion("Enfermería");
		System.out.println(trabajador1.devuelveDatos());
		System.out.println(trabajador2.devuelveDatos());
		System.out.println(trabajador3.devuelveDatos());
		System.out.println(trabajador4.devuelveDatos());
	}	
}
class Empleados{
	private final String nombre;
	private String seccion;
	private int id;
	private static int idSiguiente=1;//eclipse pone en  cursiva lo que esta con static
	//constructor
	public Empleados(String nom){
		nombre=nom;
		seccion="Administracion";
		id=idSiguiente;
		idSiguiente++;
	}
	//set
	public void cambia_seccion(String seccion){
		this.seccion=seccion;
	}
	//get
	public String devuelveDatos(){
		return "El nombre es: "+nombre+", la seccion es: "+seccion+", y el ID es igual a: "+id;
	}
}