package atividade3;

import java.util.Locale;
import java.util.Scanner;

public class Atividade3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.US);
		
		float salarioBruto, adicionalNoturno, horasExtras, descontos, salarioLiquido;
		
		System.out.println("***FOLHA DE PAGAMENTO***");
		System.out.println("\nInforme o salário bruto: ");
		salarioBruto = sc.nextFloat();
		
		System.out.println("Informe o adicional noturno: ");
		adicionalNoturno = sc.nextFloat();
		
		System.out.println("Informe as horas extras: ");
		horasExtras = sc.nextFloat();
		
		System.out.println("Informe os descontos: ");
		descontos = sc.nextFloat();
		
		salarioLiquido = salarioBruto + adicionalNoturno + (horasExtras * 5) - descontos;
		
		System.out.printf("\nSeu SALÁRIO LÍQUIDO é: R$ %.2f", salarioLiquido);
		
	}

}
