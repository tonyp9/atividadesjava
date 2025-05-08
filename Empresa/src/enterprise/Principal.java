package enterprise;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

import entities.Employees;

import java.util.Locale;

public class Principal {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		List<Employees> lista = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		System.out.print("How many employees will be registered? ");
		int n = scanner.nextInt();
		for (int i = 0; i < n; i++) {
			System.out.println("Employee #" + (i + 1) + ":");
			System.out.print("ID: ");
			int id = scanner.nextInt();
			System.out.print("Name: ");
			scanner.nextLine();
			String name = scanner.nextLine();
			System.out.print("Salary: ");
			double salary = scanner.nextDouble();
			Employees emp = new Employees(id, name, salary);
			lista.add(emp);

		}
		System.out.print("Enter the employee id that will have salary increase: ");
		int idsalary = scanner.nextInt();
		Integer pos = hasId(lista, idsalary);
		if (pos == null) {
			System.out.println("This id does not exist!");
		} else {
			System.out.print("Enter the percentage: ");
			double percent = scanner.nextDouble();
			lista.get(pos).increaseSalary(percent);
		}

		System.out.println("List of Employees:");
		System.out.println();
		for (Employees emp : lista) {
			System.out.println(emp);
		}

		scanner.close();

	}

	public static Integer hasId(List<Employees> list, int id) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getId() == id) {
				return i;
			}
		}
		return null;
	}
}