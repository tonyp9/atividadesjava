import java.util.Scanner;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		int aDez = 0;
		int dezVinte = 0;
		int aVinte = 0;
		double valorTotalC = 0;
		double valorTotalV = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Serao digitados dados de quantos produtos? ");
		int n = scanner.nextInt();
		Comercio[] vetor = new Comercio[n];
		for (int i = 0; i < vetor.length; i++) {
			System.out.println("Produto " + (i + 1));
			System.out.print("Nome: ");
			String nome = scanner.next();
			System.out.print("Preco de compra: ");
			double pCompra = scanner.nextDouble();
			System.out.print("Preco de venda: ");
			double pVenda = scanner.nextDouble();
			vetor[i] = new Comercio(nome, pCompra, pVenda);
			valorTotalC += vetor[i].getpCompra();
			valorTotalV += vetor[i].getpVenda();
			double lucro = vetor[i].getpVenda() - vetor[i].getpCompra();
			if (lucro < vetor[i].getpCompra() * 10 / 100) {
				aDez++;
			} else if (lucro >= vetor[i].getpCompra() * 10 / 100 && lucro <= vetor[i].getpCompra() * 20 / 100) {
				dezVinte++;
			} else if (lucro > vetor[i].getpCompra() * 20 / 100) {
				aVinte++;
			}
		}

		System.out.println("RELATORIO:");
		System.out.println("Lucro abaixo de 10%: " + aDez);
		System.out.println("Lucro entre 10% e 20%: " + dezVinte);
		System.out.println("Lucro acima de 20%: " + aVinte);
		System.out.printf("Valor total de compra: %.2f%n", valorTotalC);
		System.out.printf("Valor total de venda: %.2f%n", valorTotalV);
		System.out.printf("Lucro total: %.2f%n", (valorTotalV - valorTotalC));

		scanner.close();

	}

}
