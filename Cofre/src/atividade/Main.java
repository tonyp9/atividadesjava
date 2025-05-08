package atividade;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int option;

		System.out.println("COFRINHO:");
		System.out.println("1 - Adicionar Moeda");
		System.out.println("2 - Remover Moeda");
		System.out.println("3 - Listar Moedas");
		System.out.println("4 - Calcular total convertido para real");
		System.out.println("0 - Encerrar");
		option = sc.nextInt();

		switch (option) {
		case 1:
			System.out.println("Adicionar moeda");
		case 2:
			System.out.println(" Remover Moeda");
		case 3:
			System.out.println("Listar Moedas");
		case 4:
			System.out.println("Calcular Total");
		case 0:
			System.out.println("Encerrando...");
			sc.close();
		default:
			System.out.println("Opção inválida! Por favor, tente Novamente");

		}

	}

}
