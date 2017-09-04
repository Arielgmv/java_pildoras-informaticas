package Laptop_2;
public class uso_Laptop {
	public static void main(String[] args) {
		Laptop[] laptop=new Laptop[4];
		laptop[0]=new Laptop("Dell", 8, 500, 2016, 8, 1);
		laptop[1]=new Laptop("HP", 16, 500, 2015, 12, 12);
		laptop[2]=new Laptop("ASUS", 16, 1500, 2014, 3, 4);
		laptop[3]=new Laptop("Lenovo");
		//laptop[0].cambia_marca("Lenovo");
		for(int i=0; i<laptop.length; i++){
			laptop[i].establecer_precio_hdd();
			laptop[i].establecer_precio_ram();
		}
		for(int i=0; i<laptop.length; i++){
			System.out.println("La laptop es de marca "+laptop[i].dime_marca()+", la memoria RAM es de "
								+laptop[i].dime_ram()+" GB, y el disco duro es de "+laptop[i].dime_hdd()+
								" GB. El precio final es de: "+laptop[i].dime_precio()+", la fecha de compra es: "+laptop[i].dime_fecha()
								+", el ID es: "+laptop[i].dime_id());
		}
		Tablet tablet=new Tablet(10, 300);
		System.out.println("La tablet es de marca: "+tablet.dime_marca()+", la memoria RAM es de: "
							+tablet.dime_ram()+" GB, el almacenamiento es de: "+tablet.dime_hdd()+" GB,  "+tablet.dime_datos_tablet()+", el ID es: "+tablet.dime_id());
	}
}