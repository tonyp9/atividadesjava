import java.util.Scanner;
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double a;
        double b;
        double MEDIA;
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextDouble();
        
        b = scanner.nextDouble();
        MEDIA = ((a*3.5)+(b*7.5))/11;
        System.out.println(a);
        System.out.println(b);
        scanner.close();
        System.out.println("MEDIA = "+ MEDIA);
		
		

	}

}
