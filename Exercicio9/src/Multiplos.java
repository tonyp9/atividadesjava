import java.util.Scanner;
import java.util.Locale;

public class Multiplos {

	public static void main(String[] args) {
		int primeiro, segundo;
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite dois números inteiros: ");
		primeiro = scanner.nextInt();
		segundo = scanner.nextInt();
		if (primeiro > segundo) {
			if (primeiro % segundo == 0) {
				System.out.println("São múltiplos");
			} else {
				System.out.println("Não são múltiplos");
			}

		} else {
			if (segundo % primeiro == 0) {
				System.out.println("São múltiplos");
			} else {
				System.out.println("Não são múltiplos");
			}
		}

		scanner.close();
	}

}
