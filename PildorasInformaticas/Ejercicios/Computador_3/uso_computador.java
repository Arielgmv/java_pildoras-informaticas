package Computador_3;
public class uso_computador {
	public static void main(String[] args) {
		Desktop desktop1=new Desktop("Dell", "Optiplex 3200", "Corei7", 16, 1000);
		System.out.println(desktop1.dime_caracteristicas());
		desktop1.establecer_monitor("Si");
		System.out.println(desktop1.dime_monitor());
		desktop1.establecer_precio_desktop();
		System.out.println("El precio total del desktop es: "+desktop1.dime_precio_desktop());
		Laptop laptop1=new Laptop("ASUS", "ROG", "Corei7", 16, 2000, 17);
		System.out.println(laptop1.dime_caracteristicas());
		laptop1.establecer_precio_laptop();
		System.out.println("El precio de la laptop es: "+laptop1.dime_precio_laptop());
	}
}