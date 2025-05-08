import java.util.Scanner;
import java.util.Locale;
public class Principal {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		double sum = 0.0;
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		Product[] vetor = new Product[n];
		for (int i = 0; i<vetor.length;i++) {
			scanner.nextLine();
			String name = scanner.nextLine();
			double price = scanner.nextDouble();
			vetor[i] = new Product(name,price);
			sum += vetor[i].getPrice();
		}
		double avg = sum / n;
		System.out.printf("Average price: %.2f%n", avg);
		
		
		
		scanner.close();

	}

}
