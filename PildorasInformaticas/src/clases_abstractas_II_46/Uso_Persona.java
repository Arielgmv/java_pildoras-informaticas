package clases_abstractas_II_46;
import java.util.Date;
import java.util.GregorianCalendar;
public class Uso_Persona {
	public static void main(String[] args) {
		Persona[] lasPersonas=new Persona[2];
		lasPersonas[0]=new Empleado2("Luis Conde", 50000, 2009, 02, 25);
		lasPersonas[1]=new Alumno("Ana Lopez", "Biologicas");
		for(int i=0; i<lasPersonas.length; i++){
			System.out.println(lasPersonas[i].dameNombre()+", "+lasPersonas[i].dameDescripcion());
		}
		/*for(Persona p: lasPersonas){
			System.out.println(p.dameNombre()+", "+p.dameDescripcion());
		}*/
	}
}
abstract class Persona{
	private String nombre;
	public Persona(String nom){
		nombre=nom;
	}
	//get
	public String dameNombre(){
		return nombre;
	}
	//metodo abstracto
	public abstract String dameDescripcion();
}
class Empleado2 extends Persona{
	private double sueldo;
	private Date altaContrato;
	private int id;
	private static int idSiguiente=1;
	//constructor que recibe parámetros o argumentos
	public Empleado2(String nom, double sue, int agno, int mes, int dia){
		super(nom);
		sueldo=sue;
		GregorianCalendar calendario=new GregorianCalendar(agno, mes-1, dia);
		altaContrato=calendario.getTime();
		id=idSiguiente;
		idSiguiente++;
	}
	//
	public String dameDescripcion(){
		return "Este empleado tiene un ID="+id+" con un sueldo="+sueldo;
	}
	//getter
	public double dameSueldo(){
		return sueldo;
	}	
	//getter
	public Date dameFechaContrato(){
		return altaContrato;
	}
	//setter, para aumentar el sueldo
	public void subeSueldo(double porcentaje){
		double aumento=sueldo*porcentaje/100;
		sueldo+=aumento;
	}		 
}
class Alumno extends Persona{
	private String carrera;
	public Alumno(String nom, String car){
		super(nom);
		carrera=car;
	}
	public String dameDescripcion(){
		return "Este alumno esta estudiando la carrera de "+carrera;
	}
}