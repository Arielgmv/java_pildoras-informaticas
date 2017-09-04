package metodos_static_sobrecarga_38;
public class Pruebas {
	public static void main(String[] args) {
		Empleados trabajador1 = new Empleados("Ariel");
		Empleados trabajador2 = new Empleados("Oswaldo");
		Empleados trabajador3 = new Empleados("Teodoro");
		trabajador1.cambia_seccion("Sistemas");
		System.out.println(trabajador1.devuelveDatos()+"\n"+
						trabajador2.devuelveDatos()+"\n"+trabajador3.devuelveDatos());
		//forma de llamar un método estático
		System.out.println(Empleados.dameIdSiguiente());
	}
}
class Empleados{
	private final String nombre;
	private String seccion;
	private int id;
	private static int idSiguiente=1;//eclipse pone en  cursiva lo que está con static
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
	//método static o método de clase
	public static String dameIdSiguiente(){
		return "El IdSiguiente es: "+idSiguiente;
	}
}