import java.util.Scanner;
import java.util.Locale;

public class Lanchonete {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		int codProd, quant;
		double valorPagar, valorProd;
		System.out.println("Código do produto comprado: ");
		codProd = scanner.nextInt();
		System.out.println("Quantidade comprada: ");
		quant = scanner.nextInt();

		switch (codProd) {
		case 1:
			valorProd = 5.0;
			valorPagar = valorProd * quant;
			System.out.printf("Valor a pagar: R$ %.2f%n",valorPagar);
			break;

		case 2:
			valorProd = 3.50;
			valorPagar = valorProd * quant;
			System.out.printf("Valor a pagar: R$ %.2f%n",valorPagar);
			break;
		case 3:
			valorProd = 4.80;
			valorPagar = valorProd * quant;
			System.out.printf("Valor a pagar: R$ %.2f%n",valorPagar);
			break;
		case 4:
			valorProd = 8.90;
			valorPagar = valorProd * quant;
			System.out.printf("Valor a pagar: R$ %.2f%n",valorPagar);
			break;
		case 5:
			valorProd = 7.32;
			valorPagar = valorProd * quant;
			System.out.printf("Valor a pagar: R$ %.2f%n",valorPagar);
			break;
		}
		scanner.close();

	}

}
