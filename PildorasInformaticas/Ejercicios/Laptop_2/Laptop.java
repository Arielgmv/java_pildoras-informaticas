package Laptop_2;
import java.util.*;
public class Laptop {
	private final String marca;
	private int ram;
	private int hdd;
	private double precio;
	private Date fecha_compra;
	private int id;
	private static int idSiguiente=1;
	//constructor
	public Laptop(String marca, int ram, int hdd, int anho, int mes, int dia){
		this.marca=marca;
		this.ram=ram;
		this.hdd=hdd;
		precio=800;
		GregorianCalendar calendario=new GregorianCalendar(anho, mes-1, dia);
		fecha_compra=calendario.getTime();
		id=idSiguiente;
		idSiguiente++;
	}
	//sobrecarga de constructores
	public Laptop(String marca){
		this(marca, 4, 500, 2016, 8, 23);
	}
	//set
	/*public void cambia_marca(String marca){
		this.marca=marca;
	}*/
	//get
	public String dime_marca(){
		return this.marca;
	}
	//set
	public void establecer_precio_ram(){
		if(ram>8){
			precio=precio+100;
		}
	}
	//get
	public double dime_ram(){
		return this.ram;
	}
	//set
	public void establecer_precio_hdd(){
		if(hdd>500){
			precio=precio+100;
		}
	}
	//get
	public int dime_hdd(){
		return this.hdd;
	}
	//get
	public double dime_precio(){
		return this.precio;
	}
	//get
	public Date dime_fecha(){
		return fecha_compra;
	}
	//get
	public int dime_id(){
		return id;
	}
}