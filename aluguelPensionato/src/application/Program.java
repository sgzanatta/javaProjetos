package application;

import java.util.Scanner;

import entitties.Aluguel;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Aluguel[] aluguel = new Aluguel[10];

		System.out.print("Quantos quartos serão alugados? "); // NUMERO DE ALUNOS QUE VAO ALUGAR QUARTOS
		int numero = sc.nextInt();

		for (int i = 0; i < numero; i++) {
			System.out.println("Aluguel #" + (i + 1) + ":");
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("Quarto: ");
			int quartos = sc.nextInt();
			aluguel[quartos] = new Aluguel(nome, email); // O VETOR PEGOU COMO POSICAO O NUMERO DE QUARTOS, PARA GERAR O
															// NOME E EMAIL

		}

		for (int i = 0; i < 10; i++) { // FAZENDO A VERIFICAÇÂO DE QUAIS QUARTOS ESTAO ALUGADOS
			if (aluguel[i] != null) {
				System.out.println(i + ": " + aluguel[i]);
			}
		}
		sc.close();

	}

}
