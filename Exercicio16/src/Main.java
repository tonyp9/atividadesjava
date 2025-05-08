import java.util.Scanner;
import java.util.Locale;
public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		Student student = new Student();
		student.name = scanner.nextLine();
		student.n1 = scanner.nextDouble();
		student.n2 = scanner.nextDouble();
		student.n3 = scanner.nextDouble();
		student.media();
		System.out.println(student.number);
		student.info();
		scanner.close();

	}

}
