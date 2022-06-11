package pct;

import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int valor[] = new int[20];
        int soma = 0;

        for (int i = 1; i < 21; i++) {
            System.out.println(i + " idade: ");
            valor[i] = sc.nextInt();
            soma += valor[i];
        }

        System.out.println(soma);
        sc.close();
    }
}
