package aula04;

public class Aula04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Caneta c1 = new Caneta("NIC", 0.4f,"Amarelo" );
		// Quando o valor é float colocamos o 'f' depois
		// c1.ponta = 0.6f <- Deu erro pois está privado
		
		//System.out.println("Tenho uma caneta " + c1.getModelo());
		//System.out.println("De ponta " + c1.getPonta());
		c1.status();
		
		
		
		
		
		

	}

}
