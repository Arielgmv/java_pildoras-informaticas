package poo_IV_30;

public class Uso_Coche {

	public static void main(String[] args) {
		Coche micoche = new Coche();
		micoche.establece_color("Verde");
		System.out.println(micoche.dime_color());
		micoche.establece_peso();
		System.out.println(micoche.dime_peso());
	}
}
