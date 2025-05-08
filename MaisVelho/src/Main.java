import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Quantas pessoas voce vai digitar? ");
		int maior = 0;
		String maior_n = "";
 		int n = scanner.nextInt();
		Pessoas[] vetor = new Pessoas[n];
		for (int i=0;i<vetor.length;i++) {
			System.out.println("Dados da " +(i+1) + "a pessoa:");
			scanner.nextLine();
			System.out.print("Nome: ");
			String nome = scanner.nextLine();
			System.out.print("Idade: ");
			int idade = scanner.nextInt();
			vetor[i] = new Pessoas(nome,idade);
			if (vetor[i].getIdade() > maior) {
				maior = vetor[i].getIdade();
				maior_n = vetor[i].getNome();
			}
		}
		System.out.println("PESSOA MAIS VELHA: " + maior_n);

		scanner.close();
	}

}
