package pct;

import java.util.Scanner;

public class Exercicio16 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int idade = 0, media = 0, soma = 0;
		
		for (int i = 1; i < 21; i++) {
			System.out.println(i + " idade: " );
			idade = sc.nextInt();
			soma += idade;
		}
		
		media = soma / 20;
		
		System.out.println(media);
		
		sc.close();
	}

}
