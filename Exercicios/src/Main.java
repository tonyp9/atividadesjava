import java.util.Scanner;
import java.util.Locale;
public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite a primeira nota: ");
		double primeiraNota = scanner.nextDouble();
		System.out.println("Digite a segunda nota: ");
		double segundaNota = scanner.nextDouble();
		double notaFinal = primeiraNota + segundaNota;
		System.out.printf("NOTA FINAL = %.1f%n",notaFinal);
		if (notaFinal < 60.00) {
			System.out.println("REPROVADO");
		}
		scanner.close();
	}

}
