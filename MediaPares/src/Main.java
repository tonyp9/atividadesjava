import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		double media = 0.0;
		int count = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Quantos elementos vai ter o vetor? ");
		int n = scanner.nextInt();
		int vetor[] = new int[n];
		for (int i = 0; i < vetor.length; i++) {
			System.out.print("Digite um número: ");
			vetor[i] = scanner.nextInt();
			if(vetor[i] % 2 == 0) {
				media += vetor[i];
				count ++;
			}
		}
		if (count > 0) {
			System.out.printf("MEDIA DOS PARES = %.1f%n", media / count);
		}
		else {
			System.out.println("NENHUM NUMERO PAR");
		}
		scanner.close();

	}

}
