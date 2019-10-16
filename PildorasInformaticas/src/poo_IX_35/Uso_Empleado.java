package poo_IX_35;

import java.util.*;

public class Uso_Empleado {

	//metodo de acceso public
	public static void main(String[] args) {
		/*Empleado empleado1=new Empleado("Ariel", 85000, 1990, 12, 17);	
		Empleado empleado2=new Empleado("Ana", 95000, 1980, 3, 11);
		Empleado empleado3=new Empleado("Oswaldo", 55000, 2012, 7, 3);
		empleado1.subeSueldo(5);
		empleado2.subeSueldo(10);
		empleado3.subeSueldo(5);
		System.out.println("Nombre: "+empleado1.dameNombre()+" Sueldo: "+empleado1.dameSueldo()+
							" Fecha de alta: "+empleado1.dameFechaContrato());
		System.out.println("Nombre: "+empleado2.dameNombre()+" Sueldo: "+empleado2.dameSueldo()+
							" Fecha de alta: "+empleado2.dameFechaContrato());
		System.out.println("Nombre: "+empleado3.dameNombre()+" Sueldo: "+empleado3.dameSueldo()+
							" Fecha de alta: "+empleado3.dameFechaContrato());*/
		Empleado[] misEmpleados=new Empleado[3];
		misEmpleados[0]=new Empleado("Ariel", 85000, 1990, 12, 17);
		misEmpleados[1]=new Empleado("Ana", 95000, 1980, 3, 11);
		misEmpleados[2]=new Empleado("Oswaldo", 55000, 2012, 7, 3);
		
		/*for(int i=0; i<misEmpleados.length; i++){
			misEmpleados[i].subeSueldo(5);
		}*/
		for(Empleado e: misEmpleados){
			e.subeSueldo(5);
		}
		
		/*for(int i=0; i<misEmpleados.length; i++){
			System.out.println("Nombre: "+misEmpleados[i].dameNombre()+" Sueldo: "+
					misEmpleados[i].dameSueldo()+" Fecha de alta: "+misEmpleados[i].dameFechaContrato());
		}*/
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