package empresa;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Conta c1 = new Conta(111, "Mario", 2000, 500);
		
		c1.info();
		
		if(!c1.sacar(200)) {
			System.out.println("Problema ao sacar!");
		}
		if(c1.depositar(500)) {
			System.out.println("Problema ao depositar!");
		}
		c1.info();
		Conta c2 = new Conta(123, "Luigi", 3000, 550);
		
		System.out.println(c1.numero);
		
		
		c1.transferir(200,c2, "Luigi");
		c2.info();
		//c2.info();
		
		
		
		
		

	}

}
