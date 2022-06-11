package pct;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o número: ");
		int n = sc.nextInt();
		
		System.out.printf("Antecessor %d \n", n-1);
		System.out.printf("Sucessor %d \n", n+1);
	
		sc.close();
	}

}