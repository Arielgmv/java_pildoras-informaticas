package poo_V_31;

public class Uso_Coche {

	public static void main(String[] args) {
		Coche micoche = new Coche();
		micoche.establece_color("verde");
		System.out.println(micoche.dime_datos_generales());
		System.out.println(micoche.dime_color());
		
		micoche.configura_asientos("si");
		System.out.println(micoche.dime_asientos());
	}
}
