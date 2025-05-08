package banco;

import java.util.Scanner;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		double value = 0;
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter account number: ");
		int accNumber = scanner.nextInt();
		System.out.print("Enter account holder: ");
		scanner.nextLine();
		String accName = scanner.nextLine();
		Bank bank = new Bank(accNumber, accName);
		System.out.print("Is there an initial deposit (y/n)? ");
		char choice = scanner.next().charAt(0);
		if (choice == 'y') {
			System.out.print("Enter initial deposit value: ");
			value = scanner.nextDouble();
			bank.addAccValue(value);
		}
		

		bank.info();
		System.out.print("Enter deposit value: ");
		value = scanner.nextDouble();
		bank.addAccValue(value);
		bank.info();
		System.out.print("Enter withdraw value: ");
		value = scanner.nextDouble();
		bank.withdrawValue(value);
		bank.info();
		scanner.close();

	}

}
