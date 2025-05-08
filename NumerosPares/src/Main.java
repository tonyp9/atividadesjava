import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int pares =  0;
		System.out.print("Quantos números você vai digitar? ");
		int n = scanner.nextInt();
		int vetor [] = new int[n];
		for (int i=0; i<vetor.length;i++) {
			System.out.print("Digite um número: ");
			vetor [i] = scanner.nextInt();
			if (vetor[i] % 2 ==0) {
				pares ++;
			}
		}
		System.out.println("NUMEROS PARES:");
		for (int i=0;i<vetor.length;i++) {
			if (vetor[i] % 2 == 0) {
				System.out.print(vetor[i] + " ");
			}
		}
		System.out.println();
		System.out.println("Quantidade de Pares = " + pares);
		
		
		scanner.close();
		
		

	}

}
