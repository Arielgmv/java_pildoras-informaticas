package Calcula_Comision_4;
public class PruebaPolimorfismo {
	public static void main(String[] args) {
		//asigna la referencia a la superclase a una variable de la superclase, asignaci�n natural
		EmpleadoPorComision empleadoPorComision=new EmpleadoPorComision("Sue", "Jones", "222-22-2222", 10000, .06);
		//asigna la referencia a la subclase a una variable de la subclase, asignaci�n natural
		EmpleadoBaseMasComision empleadoBaseMasComision=new EmpleadoBaseMasComision("Bob", "Lewis", "333-33-3333", 5000, .04, 300);
		//invoca a toString en un objeto de la superclase, usando una variable de la superclase, invocar a toString de forma expl�cita
		System.out.printf("%s %s:\n\n%s \n\n", "Llamada a toString de EmpleadoPorComision con referencia de superclase ",
				"a un objeto de la superclase", empleadoPorComision.toString());
		//invoca a toString en un objeto de la subclase, usando una variable de la subclase, invocar a toString de forma expl�cita
		System.out.printf("%s %s:\n \n%s \n\n", "LLamada a toString de EmpleadoBaseMasComision con referencia",
				"de subclase a un objeto de la subclase", empleadoBaseMasComision.toString());
		//invoca a toString en un objeto de la subclase, usando una variable de la superclase, se hace una llamada a la versi�n del m�todo
		//de la subclase (llamada de un m�todo a trav�s de su variable)-vinculaci�n din�mica
		EmpleadoPorComision empleadoPorComision2=empleadoBaseMasComision;
		System.out.printf("%s %s:\n\n%s\n", "Llamada a toString de EmpleadoBaseMasComision con referencia de superclase",
				"a un objeto de la subclase", empleadoPorComision2.toString());
	}
}
