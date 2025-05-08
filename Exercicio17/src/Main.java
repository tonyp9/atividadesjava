import java.util.Scanner;
import java.util.Locale;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		System.out.print("What is the dollar price? ");
		double dolar = scanner.nextDouble();
		System.out.print("How many dollars wil be bought? ");
		double quantity = scanner.nextDouble();
		System.out.printf("Amount to be paid in reais: %.2f%n",CurrencyConverter.converter(dolar, quantity));
		
		
		scanner.close();

	}

}
