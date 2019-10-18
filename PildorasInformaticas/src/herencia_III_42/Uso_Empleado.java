package herencia_III_42;
import java.util.*;
public class Uso_Empleado {
	public static void main(String[] args) {
		Empleado[] misEmpleados=new Empleado[4];
		misEmpleados[0]=new Empleado("Ariel", 85000, 1990, 12, 17);
		misEmpleados[1]=new Empleado("Ana", 95000, 1980, 3, 11);
		misEmpleados[2]=new Empleado("Oswaldo", 55000, 2012, 7, 3);
		misEmpleados[3]=new Empleado("Rodrigo");
		for(Empleado e: misEmpleados){
			e.subeSueldo(5);
		}
		for(Empleado e: misEmpleados){
			System.out.println("Nombre: "+e.dameNombre()+" Sueldo: "+
					e.dameSueldo()+" Fecha de alta: "+e.dameFechaContrato());
		}
	}
}
class Empleado{
	//constructor que recibe parametros o argumentos
	public Empleado(String nom, double sue, int agno, int mes, int dia){
		nombre=nom;
		sueldo=sue;
		GregorianCalendar calendario=new GregorianCalendar(agno, mes-1, dia);
		altaContrato=calendario.getTime();
	}
	//si solo se conoce nombre
	public Empleado(String nom){
		//this esta llamando al otro constructor de la clase y pasarle los parametros correspondientes 
		this(nom, 30000, 2000, 01, 01);
	}
	//getter
	public String dameNombre(){
		return nombre;
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
	private String nombre;
	private double sueldo;
	private Date altaContrato; 
}

class Jefatura extends Empleado{
	public Jefatura(String nom, double sue, int agno, int mes, int dia){
		super(nom, sue, agno, mes, dia);
	}
	//set
	public void estable_incentivo(double b){
		incentivo=b;
	}
	//get
	public double dameSueldo(){
		double sueldoJefe=super.dameSueldo();//con super esta llamando a dameSueldo() de la clase Empleado
		return sueldoJefe+incentivo;
	}
	private double incentivo;
}