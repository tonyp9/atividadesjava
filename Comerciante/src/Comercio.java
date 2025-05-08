
public class Comercio {
	private String nome;
	private double pCompra;
	private double pVenda;

	public Comercio(String nome, double pCompra, double pVenda) {
		this.nome = nome;
		this.pCompra = pCompra;
		this.pVenda = pVenda;
	}

	public String getNome() {
		return nome;
	}

	public double getpCompra() {
		return pCompra;
	}

	public double getpVenda() {
		return pVenda;
	}

}
