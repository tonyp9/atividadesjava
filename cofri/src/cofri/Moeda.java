package cofri;

public abstract class Moeda  {
	double valor;
	public void info() {
		System.out.println("====");
		System.out.println("Moeda: " + getValor());
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public abstract double converter(double qnt);
	
	
	
	

}
