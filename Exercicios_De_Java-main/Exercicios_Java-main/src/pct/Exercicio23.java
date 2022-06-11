package pct;

import java.util.Scanner;

public class Exercicio23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int valores[] = new int[21];
        int menores = 0, maiores = 0, meio = 0;

        for (int i = 1; i < 6; i++) {
            System.out.println(i + " valor: ");
            valores[i] = sc.nextInt();
        }

        for(Integer item: valores){
            if(item < 100){
                menores++;
            } else if(item > 200){
                maiores++;
            } else{
                meio++;
            }
        }

        System.out.println("Menores do que 100: " + menores);
        System.out.println("Entre 100 e 200: " + meio);
        System.out.println("Maiores do que 200: " + maiores);
        sc.close();
    }
}
