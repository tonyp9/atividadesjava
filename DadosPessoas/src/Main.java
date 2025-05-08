import java.util.Scanner;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		double menor = 0.0;
		double maior = 0.0;
		double mediaF = 0.0;
		int m = 0;
		int nm = 0;

		Scanner scanner = new Scanner(System.in);
		System.out.print("Quantas pessoas serao digitadas? ");
		int n = scanner.nextInt();
		Pessoas vetor[] = new Pessoas[n];
		for (int i = 0; i < vetor.length; i++) {
			System.out.print("Altura da " + (i + 1) + "a pessoa: ");
			double altura = scanner.nextDouble();
			System.out.print("Genero da " + (i + 1) + "a pessoa: [M/F]");
			char genero = scanner.next().charAt(0);
			vetor[i] = new Pessoas(altura, genero);
			if (vetor[i].getGenero() == 'M') {
				m++; // numero homens
			} else if (vetor[i].getGenero() == 'F') {
				mediaF += vetor[i].getAltura();
				nm++; // numero mulheres
			}
			if (vetor[i].getAltura() > maior) {
				maior = vetor[i].getAltura();
			}
		}
			menor = vetor[0].getAltura();
		for (int i = 0; i < vetor.length; i++) {
			if (menor > vetor[i].getAltura()) {
				menor = vetor[i].getAltura();
			}

		}
		System.out.printf("Menor altura = %.2f%n",menor);
		System.out.printf("Maior altura = %.2f%n",maior);
		System.out.printf("Media das alturas das mulheres = %.2f%n",mediaF/nm);
		System.out.printf("Numero de homens = %d%n",m);
		scanner.close();
		
		
		
	}

}
