
public class Student {
	double n1,n2,n3;
	String name;
	double ideal = 60;
	double number = 0;
	public double media() {
		return number = (n1+n2+n3);
	}
	public void info() {
		System.out.printf("FINAL GRADE = %.2f%n",number);
		if (number >= ideal) {
			System.out.println("PASS");
		}
		else if(number < ideal) {
			System.out.println("FAILED");
			System.out.printf("MISSING %.2f POINTS",ideal-number);
		}
	}

}
