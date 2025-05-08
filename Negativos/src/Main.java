import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Quantos números você vai digitar? ");
		int n = scanner.nextInt();
		int vetor[] = new int[n];
		for (int i = 0; i < vetor.length; i++) {
			System.out.print("Digite um número: ");
			int num = scanner.nextInt();
			vetor[i] = num;

		}
		System.out.println("NUMEROS NEGATIVOS:");
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] < 0) {
				System.out.println(vetor[i]);
			}

		}

		scanner.close();

	}

}
