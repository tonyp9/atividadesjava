package empresa;

public class Conta {
	int numero;
	String titular;
	double saldo;
	double limite;
	
	
	
	
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	public Conta(int numero, String titular, double saldo, double limite) {
		super();
		this.numero = numero;
		this.titular = titular;
		this.saldo = saldo;
		this.limite = limite;
	}

	boolean sacar(double valor) {
		if (valor>limite || valor > saldo || valor <=0) {
			return false;
						
		}
		saldo -= valor; // saldo = saldo - valor;
		return true;
		
		
		
	}
	
	boolean depositar(double valor) {
		if (valor <= 0) {
			return false;
		}
		
		saldo += valor;
		return true;
	}
	
	boolean transferir(double valor, Conta contaDestino, String nome) {
		if (valor <=0) {
			return false;
		}
		retirar(valor);
		System.out.println("Transferindo para " + nome);
		contaDestino.depositar(valor);
		
		
		
		
		return true;
	}
	boolean retirar(double valor) {
		saldo -= valor;
		return true;
	}
	
	
	
	
	
	
	
	void info() {
		System.out.println("Nome: " + titular);
		System.out.println("Numero: " + numero);
		System.out.println("Saldo: " + saldo);
		System.out.println("Limite: " + limite);
		
		
		
	}
	

}
