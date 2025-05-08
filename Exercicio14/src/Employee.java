
public class Employee {
	private String name;
	private double grossSalary;
	private double tax;
	
	
	public void increaseSalary(double percentage) {
		System.out.printf("$ %.2f",((this.getGrossSalary() *(percentage/100)) + this.getTax()));
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getGrossSalary() {
		return grossSalary;
	}
	public void setGrossSalary(double grossSalary) {
		this.grossSalary = grossSalary;
	}
	public double getTax() {
		return tax;
	}
	public void setTax(double tax) {
		this.tax = tax;
	}
	
	public double netSalary() {
		return tax = grossSalary - tax;
	}
	
	
	public void info() {
		System.out.printf("Employee %s, $ %.2f%n",this.getName(),this.netSalary());
		System.out.println();
		System.out.println(this.grossSalary);
	}
}
