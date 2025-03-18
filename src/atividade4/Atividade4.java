package atividade4;

import java.util.Locale;
import java.util.Scanner;

public class Atividade4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		scanner.useLocale(Locale.US);
		
		float n1, n2, n3, n4, diferenca;
		
		System.out.println("Por favor, insira os quatro valores: ");
		System.out.println("Número 1: ");
		n1 = scanner.nextFloat();
		
		System.out.println("Número 2: ");
		n2 = scanner.nextFloat();
		
		System.out.println("Número 3: ");
		n3 = scanner.nextFloat();
		
		System.out.println("Número 4: ");
		n4 = scanner.nextFloat();
		
		diferenca = (n1 * n2) - (n3 * n4);
		
		System.out.printf("DIFERENÇA: %.1f", diferenca);



	}

}
