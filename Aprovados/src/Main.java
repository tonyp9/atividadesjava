import java.util.Scanner;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		System.out.print("Quantos alunos serão digitados? ");
		int n = scanner.nextInt();
		Alunos vetor[] = new Alunos[n];
		for (int i = 0; i < vetor.length; i++) {
			System.out.println("Digite nome, primeira e segunda nota do " + (i + 1) + " aluno:");
			scanner.nextLine();
			String nome = scanner.nextLine();
			double nota1 = scanner.nextDouble();
			double nota2 = scanner.nextDouble();
			vetor[i] = new Alunos(nome, nota1, nota2);
		}
		System.out.println("Alunos aprovados:");
		for (int i = 0; i < vetor.length; i++) {
			double media = (vetor[i].getNota1() + vetor[i].getNota2()) / 2.0;
			if (media > 6.0) {
				System.out.println(vetor[i].getNome());
			}
		}
		scanner.close();

	}

}
