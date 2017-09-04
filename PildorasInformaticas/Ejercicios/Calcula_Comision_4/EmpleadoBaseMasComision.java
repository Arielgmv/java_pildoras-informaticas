package Calcula_Comision_4;
//La clase EmpleadoBaseMasComision hereda de EmpleadoPorComision y accede a los datos private de la superclase
//a través de los métodos public heredados
public class EmpleadoBaseMasComision extends EmpleadoPorComision{
	private double salarioBase;//salario base por semana
	//constructor con seis argumentos
	public EmpleadoBaseMasComision(String nombre, String apellido, String nss, double ventas, double tarifa,
		double salario){
		super(nombre, apellido, nss, ventas, tarifa);//valida y almacena el salario base
		establecerSalarioBase(salario);
	}
	//establece el salario base
	public void establecerSalarioBase(double salario){
		if(salario>=0.0){
			salarioBase=salario;
		}else{
			throw new IllegalArgumentException("El salario base debe ser >=0.0");
		}
	}
	//devuelve el salario base
	public double obtenerSalarioBase(){
		return salarioBase;
	}
	//calcula los ingresos
	@Override//indica que este método sobrescribe el método de la superclase
	public double ingresos(){
		return obtenerSalarioBase()+super.ingresos();
	}	
	//devuelve representación String de EmpleadoBaseMasComision
	@Override//indica que este método sobrescribe el método de la superclase
	public String toString(){
		return String.format("%s %s\n%s: %.2f",  "con sueldo base", super.toString(), "sueldo base", obtenerSalarioBase());
	}
}
