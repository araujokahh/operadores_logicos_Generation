package atividade2;

import java.util.Locale;
import java.util.Scanner;

public class Atividade2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.US);
		
		float nota1, nota2, nota3, nota4, media;
		
		System.out.println("Digite a NOTA 1: ");
		nota1 = sc.nextFloat();
		
		System.out.println("Digite a NOTA 2: ");
		nota2 = sc.nextFloat();

		System.out.println("Digite a NOTA 3: ");
		nota3 = sc.nextFloat();

		System.out.println("Digite a NOTA 4: ");
		nota4 = sc.nextFloat();
		
		media = (nota1 + nota2 + nota3 + nota4) / 4;
		
		System.out.printf("Sua média é: %.1f" , media);

	}

}
