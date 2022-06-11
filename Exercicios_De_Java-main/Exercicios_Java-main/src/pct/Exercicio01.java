package pct;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int prato = 0, bebida = 0, sobremesa = 0, caloria = 0;
		 
		System.out.println("1. Vegetariano");
		System.out.println("2. Peixe");
		System.out.println("3. Frango");
		System.out.println("4. Carne");
		int caloriaPrato = sc.nextInt();
		
		System.out.println("1. Abacaxi");
		System.out.println("2. Sorvete");
		System.out.println("3. Mouse");
		System.out.println("4. Mouse Chocolate");
		int caloriaSobremesa = sc.nextInt();
		
		System.out.println("1. Cha");
		System.out.println("2. Suco de Laranja");
		System.out.println("3. Suco de Melao");
		System.out.println("4. Refrigerante");
		int caloriaBebida = sc.nextInt();
		
		switch (caloriaPrato) {
			case 1 -> prato = 180;
			case 2 -> prato = 230;
			case 3 -> prato = 250;
			case 4 -> prato = 350;
		}
		switch (caloriaSobremesa) {
			case 1 -> sobremesa = 75;
			case 2 -> sobremesa = 110;
			case 3 -> sobremesa = 170;
			case 4 -> sobremesa = 200;
		}
		switch (caloriaBebida) {
			case 1 -> bebida = 20;
			case 2 -> bebida = 70;
			case 3 -> bebida = 100;
			case 4 -> bebida = 65;
		}
		
		caloria = prato + sobremesa + bebida; 
		System.out.println(caloria);
		
		sc.close();
	}

}
