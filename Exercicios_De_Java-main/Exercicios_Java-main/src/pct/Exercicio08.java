package pct;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		double valor;
		
		System.out.println("Digite o IPI: ");
		double ipi = sc.nextDouble();
		
		System.out.println("Digite o código do produto 01. : ");
		int c1 = sc.nextInt();
		System.out.println("Digite o valor do produto 01. : ");
		double v1 = sc.nextDouble();
		System.out.println("Digite a quantidade do produto 01. : ");
		int q1 = sc.nextInt();
		
		System.out.println("Digite o código do produto 02. : ");
		int c2 = sc.nextInt();
		System.out.println("Digite o valor do produto 02. : ");
		double v2 = sc.nextDouble();
		System.out.println("Digite a quantidade do produto 02. : ");
		int q2 = sc.nextInt();
		
		valor = (v1*q1*v2*q2)*(ipi/100+1);
		
		System.out.println("Total: " + valor);
		
		sc.close();
	}

}
