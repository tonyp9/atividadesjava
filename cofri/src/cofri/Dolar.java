package cofri;

public class Dolar extends Moeda {

	@Override
	public void info() {
		System.out.println(getValor());
		
	}

	@Override
	public double converter(double qnt) {
		return this.valor*5.60;
		
		
	}
	
	

}
