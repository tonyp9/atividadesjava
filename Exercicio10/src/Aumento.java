import java.util.Scanner;
import java.util.Locale;
public class Aumento {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		double salario,novoSalario;
		int valorPor;
		novoSalario = 0;
		valorPor = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite o salário da pessoa: ");
		salario = scanner.nextDouble();
		if (salario <= 1000) {
			novoSalario = salario*120/100;
			valorPor = 20;
		}
		else if(salario > 1000 && salario <= 3000) {
			novoSalario = salario * 115/100;
			valorPor = 15;
		}
		else if(salario > 3000 && salario <= 8000) {
			novoSalario = salario * 110/100;
			valorPor = 10;
		}
		else if (salario > 8000) {
			novoSalario = salario * 108/100;
			valorPor = 5;
		}
		System.out.printf("Novo Salário = R$ %.2f%n",novoSalario);
		System.out.printf("Aumento de Salário = R$ %.2f%n", (novoSalario - salario));
		System.out.println("Porcentagem = " + valorPor +"%");
		
		
		scanner.close();
	}

}
