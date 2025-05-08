
public class ContaBanco {
	public int numConta;
	protected String tipo;
	private String dono; // nome da pessoa
	private int saldo;
	private boolean status;
	
	
	
	public void setStatus(boolean status) {
		this.status = status;
	}
	public int getSaldo() {
		return saldo;
	}

	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}

	public void setTipo(String Tipo) {
		this.tipo = Tipo;
		
	}
	
	public String getTipo() {
		return this.tipo;
	}
	public void setDono(String Dono) {
		this.dono = Dono;
	}
	
	public String getDono() {
		return this.dono;
	}
	
	
	
	public int getNumConta() {
		return this.numConta;
	}
	
	public void setnumConta(int numConta) {
		this.numConta = numConta;
	}
	
	public int depositar(int valor) {
		return saldo += valor;
	}
	
	
	
	public boolean transferir(int valor, ContaBanco conta) {
		saldo -= valor;
		conta.depositar(valor);
		return true;
	}
	
	
	
	
	
	
	public void abrirConta(String t) {
		if (t == "CC") {
			this.saldo = 50;
			this.setTipo("Corrente");
			this.setStatus(true);
		}
		else if (t == "CP") {
			this.saldo = 150;
			this.setTipo("Corrente");
			this.setStatus(true);
		}
		
	}
	
	public void fecharConta() {
		if (this.getSaldo() > 0) {
			System.out.println("Não pode fechar pois existe saldo");
		}
		else if (this.getSaldo() < 0) {
			System.out.println("Tá duro dorme filho, saldo em débito!");
		}
		else {
			this.setStatus(false);
		}
		
	}
	
	public int sacar(int valor) {
		return saldo -= valor;
	}
	
	
	public int pagarMensal(int valor) {
		return saldo -= valor;
	}
	
	public void pagCorrente(ContaBanco Conta) {
		Conta.pagarMensal(12);
	}
	
	public void pagPoupanca(ContaBanco Conta) {
		Conta.pagarMensal(12);
	}
	

	
	public void status() {
		System.out.println("Número de conta: " + numConta);
		System.out.println("Tipo de conta: " + tipo);
		System.out.println("Titular da Conta: " + dono);
		System.out.println("Saldo da conta: " + saldo);
		System.out.println("Conta aberta? " + status);
	}
	

	
	
	
	
	
	

}
