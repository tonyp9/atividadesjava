import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Quantos valores vai ter cada vetor? ");
		int n = scanner.nextInt();
		VetorA[] num = new VetorA[n];
		System.out.println("Digite os valores do vetor A: ");
		for (int i = 0; i < num.length; i++) {
			int numero = scanner.nextInt();
			num[i] = new VetorA(numero);
		}
		System.out.println("Digite os valores do vetor B:");
		VetorB[] num2 = new VetorB[n];
		for (int i = 0; i < num2.length; i++) {
			int numeroB = scanner.nextInt();
			num2[i] = new VetorB(numeroB);
		}
		System.out.println("VETOR RESULTANTE:");
		VetorC[] resultante = new VetorC[n];
		for (int i = 0; i < resultante.length; i++) {
			int res = num[i].getNum() + num2[i].getNum2();
			resultante[i] = new VetorC(res);
			System.out.println(resultante[i].getResultante());
		}

		scanner.close();
	}

}
