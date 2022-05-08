package poo_II_28;

public class Uso_Coche {

	public static void main(String[] args) {
		// Ya realizamos la modularizacion al separar en dos archivos: Coche.java y UsoCoche.java (main)
		Coche renault=new Coche();//instanciar una clase, ejemplar de clase
		//renault.ruedas=3;
		
		System.out.println(renault.dime_largo());		
		//System.out.println("Este coche tiene "+renault.ruedas+" ruedas");
		System.out.println(renault.motor());
	}
}
