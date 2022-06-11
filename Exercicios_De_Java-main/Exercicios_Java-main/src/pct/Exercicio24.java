package pct;

import java.util.Scanner;

public class Exercicio24 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int valor = 0, soma = 0;

		while (valor >= 0){
			System.out.println("Digite o valor: ");
			valor = sc.nextInt();
			soma += valor;
		}
		System.out.println("Valor final: " + soma);
	}

}
