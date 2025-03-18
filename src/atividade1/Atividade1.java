package atividade1;

import java.util.Locale;
import java.util.Scanner;

public class Atividade1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.US);
		
		float salario, abono, novoSalario;
		
		System.out.println("Digite o SALÁRIO: ");
		salario = sc.nextFloat();
		
		System.out.println("Digite o ABONO: ");
		abono = sc.nextFloat();
		
		novoSalario = salario + abono;
		
		System.out.printf("O valor digitado para salário foi: R$ %.2f " , salario);
		System.out.printf("\nO valor digitado para abono foi: R$ %.2f " , abono);
		System.out.printf("\nParabéns, seu novo salário é: R$ %.2f " , novoSalario);

	}

}
