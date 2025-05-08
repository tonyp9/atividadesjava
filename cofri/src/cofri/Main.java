package cofri;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int a = 1;
		Scanner scanner = new Scanner(System.in);
		
		while (a >= 1){
			System.out.println("COFRINHO");
			System.out.println("1 - Adicionar Moeda");
			System.out.println("2 - Remover Moeda");
			System.out.println("3 - Listar Moeda");
			System.out.println("0 - Encerrar");
			System.out.println("Selecione uma opção: ");
			int choice = scanner.nextInt();
			switch (choice) {
			
			case 0:
				System.out.println("Encerrando...");
				a -= 1;
				scanner.close();
				break;
			case 1:
				System.out.println("Adicionar a moeda");
				System.out.println("1 - Real");
				System.out.println("2 - Dólar");
				System.out.println("3 - Euro");
				System.out.println("Selecione o tipo de moeda: ");
				int num = scanner.nextInt();
				if (num == 2) {
					Dolar d1 = new Dolar();
					System.out.println("Qual a quantidade? em dólar: ");
					double qnt = scanner.nextDouble();
					d1.converter(qnt);
					
				}
				break;
			case 2:
				System.out.println("Remover a moeda");
				break;
			case 3:
				System.out.println("Listar a moeda");
				
				break;
			default:
				System.out.println("Opção Inválida. Tente novamente");
				break;
			
			
			
			}
			
			
		}
		
		
		
		
		

	}

}
