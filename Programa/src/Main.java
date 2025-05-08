import java.util.Scanner;
import java.util.Locale;
public class Main {
	public static void main (String []args ) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		System.out.println("Minutos de ligação ");
		int minutosLigados = sc.nextInt();
		double conta = 50;
		if (minutosLigados > 100) {
			conta += (minutosLigados - 100) * 2.0;
		}
		System.out.printf("Valor a pagar: R$ %.2f%n",conta);
		
		
		
		sc.close();

}
	}
			