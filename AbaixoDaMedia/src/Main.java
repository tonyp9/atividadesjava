import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		double soma = 0.0;
		System.out.print("Quantos elementos vai ter o vetor? ");
		int n = scanner.nextInt();
		double vetor[] = new double[n];
		for (int i = 0; i < vetor.length; i++) {
			System.out.print("Digite um número: ");
			vetor[i] = scanner.nextDouble();
			soma += vetor[i];
		}
		System.out.printf("MEDIA DO VETOR = %.3f%n", soma / vetor.length);
		System.out.println("ELEMENTOS ABAIXO DA MEDIA:");
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] < (soma / vetor.length)) {
				System.out.println(vetor[i]);
			}
		}

		scanner.close();
	}

}
