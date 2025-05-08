import java.util.Scanner;
public class AulaMat {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Calculando raízes de x...");
		System.out.println("Digite os valores de a,b e c. Respectivamente ");
		double a = scanner.nextDouble();
		double b = scanner.nextDouble();
		double c = scanner.nextDouble();
		System.out.println("A = " + a + " B = " + b + " C = " + c);
		double delta = Math.pow(b, 2.0) - 4*a*c;
		System.out.println("Valor de Delta = " + delta);
		System.out.println("Calculando o X...");
		double x1 = (-b + Math.sqrt(delta)) / (2.0*a);
		double x2 = (-b - Math.sqrt(delta)) / (2.0*a);
		System.out.println("Valor de X1 = " + x1 + " Valor de X2 = " + x2);
		
		
		
		
		
		scanner.close();

	}

}
