package pct;

import java.util.Scanner;

public class Exercicio21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double valor, prestacao;

        System.out.println("Digite o valor da compra: ");
        valor = sc.nextDouble();

        prestacao = valor / 5;

        System.out.println("5x de R$ " + prestacao);
    }
}
