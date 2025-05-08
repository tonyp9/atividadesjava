import java.util.Locale;
import java.util.Scanner;

public class MenorDeTres {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		int menor = 0;
		System.out.println("Primeiro valor: ");
		int primeiro = scanner.nextInt();
		menor = primeiro;
		System.out.println("Segundo valor: ");
		int segundo = scanner.nextInt();
		if (segundo < menor) {
			menor = segundo;
		}
		System.out.println("Terceiro valor: ");
		int terceiro = scanner.nextInt();
		  if (terceiro < menor) {
			menor = terceiro;
		}
		System.out.println("MENOR = " + menor);

		scanner.close();

	}

}
