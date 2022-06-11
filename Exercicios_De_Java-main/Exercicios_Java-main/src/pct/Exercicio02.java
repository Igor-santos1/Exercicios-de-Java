package pct;

import java.util.Scanner;

public class Exercicio02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um valor: ");
		int valor = sc.nextInt();
		
		if (valor % 10 == 0) {
			System.out.println("Divisivel por 10");
		} else if(valor % 5 == 0) {
			System.out.println("Divisivel por 5");
		} else if(valor % 2 == 0) {
			System.out.println("Divisivel por 2");
		} else {
			System.out.println("Não é divisivel nem por 10, 5 ou 2.");
		}
		
		sc.close();
	}
}
