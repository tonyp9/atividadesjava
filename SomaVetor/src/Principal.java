import java.util.Locale;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		double  soma = 0.0;
		System.out.print("Quantos números você vai digitar? ");
		int n = scanner.nextInt();
		double vetor[] = new double[n];
		for (int i=0; i<vetor.length; i++) {
			System.out.print("Digite um numero: ");
			double num = scanner.nextDouble();
			vetor[i] = num;
			soma += vetor[i];
		}
		System.out.println();
		System.out.print("VALORES  = ");
		for (int i=0; i<vetor.length; i++) {
			System.out.print(vetor[i] + "	");
		}
		System.out.println();
		System.out.printf("SOMA = %.2f%n", soma);
		System.out.printf("MEDIA = %.2f%n", soma/vetor.length);
		
		
		
		
		
		scanner.close();

	}

}
