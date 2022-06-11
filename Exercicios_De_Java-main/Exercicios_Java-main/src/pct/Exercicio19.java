package pct;

import java.util.Scanner;

public class Exercicio19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double real , dolar, conversao;

        System.out.println("Digite o valor em R$ ");
        real = sc.nextDouble();
        System.out.println("Digite o valor da cotação US$: ");
        dolar = sc.nextDouble();

        conversao = real / dolar;


        System.out.println("Você tem US$ " + conversao);

        sc.close();
    }
}
