import java.util.Locale;
import java.util.Scanner;

public class Temperatura {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		System.out.println("Você vai digitar a temperatura em qual escala? [C/F]? ");
		char escolhaTemp = scanner.next().charAt(0);
		double celsius, fah, tempCelsius, tempFah;

		switch (escolhaTemp) {
		case 'C':
			System.out.println("Você escolheu Celsius...");
			System.out.println("Digite a temperatura em Celsius: ");
			celsius = scanner.nextDouble();
			tempFah = (9 * celsius + 160) / 5; // (9C+ 160)/5 = F;
			System.out.printf("Temperatura equivalente em Fahrenheit: %.2f%n", tempFah);
		case 'F':
			System.out.println("Você escolheu Fahrenheit...");
			System.out.println("Digite a temperatura em Fahrenheit: ");
			fah = scanner.nextDouble();
			tempCelsius = (5 * fah - 5 * 32) / 9;
			System.out.printf("Temperatura equivalente em Celsius: %.2f%n", tempCelsius);
		}

		scanner.close();

	}

}
