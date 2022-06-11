package pct;

import java.util.*;

class Exercicio11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nome = sc.nextLine();
        Double salario = sc.nextDouble();
        Double totalVendas = sc.nextDouble();

        Double salarioFinal = calcSalario(salario, totalVendas, 15);

        
        System.out.println("Nome: " + nome);
        System.out.printf("Salario fixo: %.2f \n", salario);
        System.out.printf("Salario final: %.2f \n", salarioFinal);
        
        sc.close();    
    }

    public static Double calcSalario(Double salario, Double vendas, Integer comissao) {
        double bonus = ((vendas * 15) / 100);
        return salario + bonus;
    }
}

   