import java.util.Scanner;
import java.util.Locale;
public class TrocoVerificado {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		System.out.println("Preço unitário do produto: ");
		double preco = scanner.nextDouble();
		System.out.println("Quantidade comprada: ");
		int quantidade = scanner.nextInt();
		System.out.println("Dinheiro Recebido: ");
		double dinheiro = scanner.nextDouble();
		double troco = (dinheiro - (preco*quantidade));
		if ((preco*quantidade) > dinheiro) {
			System.out.printf("DINHEIRO INSUFICIENTE. FALTAM R$ %.2f%n",(preco*quantidade)-dinheiro);
		}
		else {
			System.out.println("TROCO = " + troco);
		}
		scanner.close();
		
		
		
		
		

	}

}
