package Calcula_Comision_4;
//EmpleadoPorComision usa los m�todos para manipular sus
//variables de instacia private
public class EmpleadoPorComision {
	private String primerNombre;
	private String apellidoPaterno;
	private String numeroSeguroSocial;
	private double ventasBrutas;//ventas totales por semana
	private double tarifaComision;//porcentaje de comisi�n
	//constructor con cinco argumentos
	public EmpleadoPorComision(String nombre, String apellido, String nss, double ventas, double tarifa){
		primerNombre=nombre;
		apellidoPaterno=apellido;
		numeroSeguroSocial=nss;
		establecerVentasBrutas(ventas);//valida y almacena las ventas brutas
		establecerTarifaComision(tarifa);//valida y almacena la tarifa de comisi�n
	}
	//establece el primer nombre
	public void establecerPrimerNombre(String nombre){
		primerNombre=nombre;
	}
	//devuelve el primer nombre
	public String obtenerPrimerNombre(){
		return primerNombre;
	}
	//establece el apellido paterno
	public void establecerApellidoPaterno(String apellido){
		apellidoPaterno=apellido;
	}
	//devuelve el apellido paterno
	public String obtenerApellidoPaterno(){
		return apellidoPaterno;
	}
	//establece el n�mero de seguro social
	public void establecerNumeroSeguroSocial(String nss){
		numeroSeguroSocial=nss;
	}
	//devuelve el n�mero de seguro social
	public String obtenerNumeroSeguroSocial(){
		return numeroSeguroSocial;
	}
	//establece el monto de ventas brutas
	public void establecerVentasBrutas(double ventas){
		if(ventas>=0.0){
			ventasBrutas=ventas;
		}else{
			throw new IllegalArgumentException("Las ventas brutas deben ser >=0.0");
		}
	}
	//devuelve el monto de ventas brutas
	public double obtenerVentasBrutas(){
		return ventasBrutas;
	}
	//establece la tarifa por comisi�n
	public void establecerTarifaComision(double tarifa){
		if(tarifa>0.0 && tarifa<1.0){
			tarifaComision=tarifa;
		}else{
			throw new IllegalArgumentException("La tarifa de comisi�n deber ser > 0.0 y < 1.0");
		}
	}
	//devuelve la tarifa de comisi�n
	public double obtenerTarifaComision(){
		return tarifaComision;
	}
	//calcula los ingresos
	public double ingresos(){
		return obtenerTarifaComision()*obtenerVentasBrutas();
	}
	//devuelve representaci�n String del objeto EmpleadoPorComision
	@Override//indica que este m�todo sobrescribe el m�todo de la superclase
	public String toString(){
		return String.format("%s: %s %s\n%s: %s\n%s: %.2f\n%s: %.2f",
				"empleado por comisi�n", obtenerPrimerNombre(), obtenerApellidoPaterno(),
				"numero de seguro social", obtenerNumeroSeguroSocial(),
				"ventas brutas", obtenerVentasBrutas(),
				"tarifa de comisi�n", obtenerTarifaComision());
	}
}