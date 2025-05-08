import java.util.Scanner;
import java.util.Locale;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		Employee worker = new Employee();
		System.out.print("Name: ");
		worker.setName(scanner.nextLine());
		System.out.print("Gross salary: ");
		double wage = scanner.nextDouble();
		worker.setGrossSalary(wage);
		System.out.println("Tax");
		worker.setTax(scanner.nextDouble());
		worker.info();
		System.out.print("Which percentage to increase salary? ");
		double percentage = scanner.nextDouble();
		System.out.print("Updated data: " + worker.getName() +",");
		worker.increaseSalary(percentage);
		
		
	

	}

}
