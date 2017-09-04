package Estudiante_1;

import java.util.Scanner;

public class Uso_Estudiante {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Estudiante estudiante=new Estudiante();
		System.out.println("Ingrese la nota:");
		int nota;
		nota = sc.nextInt();
		estudiante.establecer_nota(nota);
		System.out.println(estudiante.dime_datos());
		System.out.println(estudiante.dime_aprobacion());
	}

}
