package poo_VIII_34;

import java.util.*;;

public class Uso_Empleado {

	//metodo de acceso public
	public static void main(String[] args) {
		// TODO Auto-generated method stub		
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
		sueldo=+aumento;
	}	
	private String nombre;
	private double sueldo;
	private Date altaContrato; 
}
