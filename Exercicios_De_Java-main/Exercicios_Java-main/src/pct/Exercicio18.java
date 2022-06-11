package pct;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio18 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Integer> idades = new ArrayList<Integer>();
		int novo = 100;
		
		
		for (int i = 1; i < 11; i++) {
			System.out.println(i + " idade: ");
			idades.add(sc.nextInt());
		}

		for(Integer item: idades){
			if(item < novo) {
				novo = item;
			}
		}

		System.out.println(novo);
		
		sc.close();
		
	}

}
