import java.util.Scanner;
import java.util.Locale;
public class Glicose {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite a medida da glicose: ");
		double glicose = scanner.nextDouble();
		if(glicose <= 100) {
			System.out.println("Classificação: Normal");
		}
		else if (glicose > 100 && glicose <= 140) {
			System.out.println("Classificação: Elevado");
		}
		else if (glicose > 140) {
			System.out.println("Classificação: Diabetes");
		}
		
		
		
		scanner.close();
	}

}
