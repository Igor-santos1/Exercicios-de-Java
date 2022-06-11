package pct;

import java.util.Scanner;

public class Exercicio03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int media = 0;
		
		for (int i = 0; i < 12; i++) {
			System.out.println("Digite o valor do mês: " + i);
			media = sc.nextInt();
		}
		
		if(media < 500) {
			System.out.println("Nenhum crédito. Saldo médio: " + media);
		} else if(media >= 501 && media < 1000) {
			System.out.println("30% do valor do saldo médio.Saldo médio: " + media );
		} else if(media >= 1001 && media < 3000) {
			System.out.println("40% do valor do saldo médio. Saldo médio: " + media );
		} else {
			System.out.println("50% do valor do saldo médio. Saldo médio: " + media );
		}
		
		sc.close();
	}
}
