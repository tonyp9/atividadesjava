
public class Principal {

	public static void main(String[] args) {
		ContaBanco c1 = new ContaBanco();
		//c1.abrirConta();
		c1.abrirConta("CC");
		c1.setDono("Woody");
		c1.depositar(1200);
		c1.setnumConta(14762);
		c1.sacar(200);
		//c1.status();
		
		
		ContaBanco c2 = new ContaBanco();
		c2.abrirConta("CC");
		c2.setDono("Buzz");
		c2.depositar(1000);
		c2.setnumConta(12362);
		//c2.status();
		
		//c1.transferir(200, c2);
		//c2.depositar(200);
		c2.pagCorrente(c2); // Conta Corrente
		c2.fecharConta();
		c2.status();
		//Exercicio: transferir dinheiro(200) para Woody
		
		
		

	}

}
