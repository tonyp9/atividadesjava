import java.util.Scanner;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		double maior = 0.0;
		System.out.print("Quantos números você vai digitar? ");
		int n = scanner.nextInt();
		double vetor[] = new double[n];
		for (int i = 0; i < vetor.length; i++) {
			System.out.print("Digite um número: ");
			vetor[i] = scanner.nextDouble();
			if (vetor[i] > maior) {
				maior = vetor[i];
			}
		}
		System.out.println("MAIOR VALOR = " + maior);
		for (int i = 0; i < vetor.length; i++) {
			if (maior == vetor[i]) {
				System.out.println("POSICAO DO MAIOR VALOR = " + i);
			}
		}
		scanner.close();

	}

}
