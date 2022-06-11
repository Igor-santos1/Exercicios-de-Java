package pct;

import java.util.Scanner;

public class Exercicio22 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int valor[] = new int[20];
		int valores = 0;
		
		for (int i = 1; i < 5; i++) {
			System.out.println(i + " valor: ");
			valor[i] = sc.nextInt();
		}
		for(Integer item: valor) {
			if(item >= 0 && item <= 100) {
				valores++;
			}
		}
		System.out.println(valores);
		
		sc.close();
	}

}
