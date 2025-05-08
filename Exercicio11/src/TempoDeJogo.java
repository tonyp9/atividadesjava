import java.util.Scanner;
public class TempoDeJogo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int inicio,fim,duracao;
		System.out.println("Hora inicial: ");
		inicio = scanner.nextInt();
		System.out.println("Hora final: ");
		fim = scanner.nextInt();
		if(inicio < fim) {
			duracao = (fim-inicio);
		}
		else {
			duracao = (inicio-fim)-24;
		}
		
		System.out.println("O JOGO DUROU " + Math.abs(duracao) + " HORA(S)");
		scanner.close();
		

	}

}
