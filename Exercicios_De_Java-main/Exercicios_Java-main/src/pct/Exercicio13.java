package pct;

import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        double fahr, temp;
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a temperatura ºC: ");
        temp = sc.nextDouble();

        fahr = (9*temp + 160) / 5;

        System.out.println("A conversão é: " + fahr + " ºF");

        sc.close();
    }
}
