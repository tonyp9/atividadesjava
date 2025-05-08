package jogos;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("=====================");
		System.out.println("JOGO DA ADIVINHAÇÃO");
		System.out.println("=====================");
		System.out.println("Para iniciar o jogo aperte 1");
		System.out.println("Para sair do jogo aperte 0");
		int n = scanner.nextInt();
		switch (n) {
		case 1:
			System.out.println("Jogo começa");
			System.out.print("Por favor digite um número de 0 a 9: ");
			int number = scanner.nextInt();
			int randomNum = (int)(Math.random() * 10);
			if (number == randomNum) {
				System.out.println("Congrats, you just got the right number!");
			}
			else {
				System.out.println("You didn't got the right number, the answer was " + randomNum);
			}
		
		case 0:
			System.out.println("Encerrando...");
			scanner.close();
			break;
		default:
			System.out.println("Opção inválida, tente novamente.");
		
		
		
		}
		
		
		
		
		
		

	}

}
