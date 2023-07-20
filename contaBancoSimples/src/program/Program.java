package program;

import java.util.Locale;
import java.util.Scanner;

import entities.ContaBanco;



public class Program {
	//Densenvolver um sistema simples que simule uma ação de um caixa eletronico

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		ContaBanco contaBanco; 

		System.out.print("Digite numero da conta: ");
		int numero = sc.nextInt();
		System.out.print("Digite nome do titular: ");
		sc.nextLine();
		String titular = sc.nextLine();
		System.out.println("Voce deseja fazer um deposito inicial (s/n)? ");
		char next = sc.next().charAt(0);
		if (next == 's') {
			System.out.print("Digite o valor do deposito inicial: ");
			double depositoInicial = sc.nextDouble();	
			contaBanco = new ContaBanco(numero, titular, depositoInicial);
		} else {
			contaBanco = new ContaBanco(numero, titular);
		}
		
		System.out.println();
		System.out.println("Dados da conta: ");
		System.out.print(contaBanco.toString());
		System.out.println();
		
		System.out.println();
		System.out.print("Digite o valor do deposito: ");
		contaBanco.depositar(sc.nextDouble());
		System.out.println("Dados da conta atualizados: ");
		System.out.println(contaBanco.toString());
		System.out.println();
		
		System.out.print("Digite quanto quer sacar: " );
		contaBanco.sacar(sc.nextDouble());
		System.out.println("Dados da conta atualizados: ");
		System.out.println(contaBanco.toString());
		
		
		
		sc.close();
		

	}

}