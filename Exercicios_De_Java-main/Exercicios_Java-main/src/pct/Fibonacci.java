package pct;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = 1, num2 = 0, valor = 0;

        System.out.println("Digite o até o valor final: ");
        valor = sc.nextInt();

        System.out.println(num1);

        for(int i = 0; i < valor; i++){
            num1 = num1 + num2;
            num2 = num1 - num2;
            System.out.println(num1);
        }
    }
}
