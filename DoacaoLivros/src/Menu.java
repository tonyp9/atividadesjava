import java.util.Scanner;

public class Menu {
	int opcao;
	Scanner scanner = new Scanner(System.in);

	public void MostrarMenu() {
		do {
			System.out.println("BEM VINDO A DOAÇÃO DE LIVROS ");
			System.out.println("Escolha uma opção ");
			System.out.println("1 - Doar um livro ");
			System.out.println("2 - Ver livros cadastrados ");
			System.out.println("3 - Pedido de livro específico ");
			System.out.println("4 - Ver pedidos ");
			System.out.println("5 - Sair ");
			opcao = scanner.nextInt();
			
		}while(opcao !=5);
	}

}
