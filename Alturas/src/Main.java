import java.util.Scanner;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		double media = 0.0;
		double menor = 0.0;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Quantas pessoas serão digitadas? ");
		int n = scanner.nextInt();
		scanner.nextLine();
		Pessoas[] atletas = new Pessoas[n];
		for (int i = 0; i < atletas.length; i++) {
			System.out.println("Dados da " + (i + 1) + "a pessoa:");
			System.out.print("Nome: ");
			String nome = scanner.nextLine();
			System.out.print("Idade: ");
			int idade = scanner.nextInt();
			System.out.print("Altura: ");
			double altura = scanner.nextDouble();
			scanner.nextLine();
			atletas[i] = new Pessoas(nome, idade, altura);
			media += atletas[i].getAltura();
			if (atletas[i].getIdade() < 16) {
				menor += 1;
			}
			

		}

		System.out.printf("Altura média: %.2f%n", media / atletas.length);
		System.out.printf("Pessoas com menos de 16 anos: %.1f%%%n", (menor / atletas.length) * 100);
		for (int i = 0; i < atletas.length; i++) {
			if (atletas[i].getIdade() < 16) {
				System.out.println(atletas[i].getNome());
			}
		}

		scanner.close();
	}

}
