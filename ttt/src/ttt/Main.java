package ttt;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double A;
        double π;
        double R;
        π = 3.14159;
        Scanner scanner = new Scanner(System.in);
        R = scanner.nextDouble();
        if (R<=0) {
        	scanner.close();
        	throw new RuntimeException("Valor Inválido, tente novamente");
        }
        
        
        
        
        
        
        A = (π*R*R);
        System.out.printf("A=%.4f%n", A);
        scanner.close();
        

	}

}
