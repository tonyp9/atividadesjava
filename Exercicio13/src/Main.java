import java.util.Scanner;
import java.util.Locale;
public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter rectangle width and height: ");
		Rectangle rectangle = new Rectangle();
		double width = scanner.nextDouble();
		rectangle.setWidth(width);
		double height = scanner.nextDouble();
		rectangle.setHeight(height);
		System.out.println("AREA = " + rectangle.Area());
		System.out.println("PERIMETER = " + rectangle.Perimeter());
		System.out.println("DIAGONAL = " + rectangle.Diagonal());
		scanner.close();

	}

}
