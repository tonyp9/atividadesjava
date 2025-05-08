import java.util.Locale;
import java.util.Scanner;
public class Dardo {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		double primeiro,segundo,terceiro, maior;
		Scanner scanner = new Scanner(System.in);
		maior = 0;
		System.out.println("Digite as três distâncias: ");
		primeiro = scanner.nextDouble();
		maior = primeiro;
		segundo = scanner.nextDouble();
		if (segundo > maior) {
			maior = segundo;
		}
		terceiro = scanner.nextDouble();
		if (terceiro > maior) {
			maior = terceiro;
		}
		System.out.printf("MAIOR DISTÂNCIA = %.2f%n",maior);
		
		scanner.close();
	}

}
