package pct;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite sua idade: ");
		int idade = sc.nextInt();
		
		if(idade < 16) {
			System.out.println("Não eleitor");
		} else if(idade >= 18 && idade <= 65) {
			System.out.println("Eleitor obrigatório");
		} else {
			System.out.println("Eleitor facultativo");
		}
		
		sc.close();
	}

}
