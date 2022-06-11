package pct;

import java.util.Scanner;

public class Exercicio17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int valor[] = new int[20];

        for (int i = 1; i < 21; i++) {
            System.out.println(i + " idade: ");
            valor[i] = sc.nextInt();
        }

        for (Integer item: valor){
            if(item >= 18) {
                valores++;
            }
        }

        System.out.println(valores);
        sc.close();
    }
}
