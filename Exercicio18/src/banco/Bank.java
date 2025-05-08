package banco;

public class Bank {
	private int accNumber;
	private String accName;
	private double accValue;
	public Bank(int accNumber, String accName){
		this.accNumber = accNumber;
		this.accName = accName;
	}
	public int getAccNumber() {
		return accNumber;
	}
	public String getAccName() {
		return accName;
	}
	public void setAccName(String accName) {
		this.accName = accName;
	}
	public double getAccValue() {
		return accValue;
	}
	public double addAccValue(double value) {
		return this.accValue += value;
	}
	public double remAccValue(double value) {
		return this.accValue  -= value;
	}
	
	public double withdrawValue(double value) {
		if (value <= 0 ) {
			return this.getAccValue();
		}
		else {
			value += 5.00;
			return this.accValue -= value;
			
		}
	}
	private int cont = 1;
	public void info() {
	
	if (cont == 1) {
		System.out.println("Account data:");
		System.out.printf("Account: %d, Holder: %s, Balance: $ %.2f%n",this.accNumber,this.accName,this.accValue);
		cont ++;
	}
	else if (cont >1) {
		System.out.println("Updated account data:");
		System.out.printf("Account: %d, Holder: %s, Balance: $ %.2f%n",this.accNumber,this.accName,this.accValue);
		cont ++;
	}
	}
	

}
