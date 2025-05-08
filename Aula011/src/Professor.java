
public class Professor extends Pessoa {
	private int salario;
	private String especialidade;
	public int getSalario() {
		return salario;
	}
	public void setSalario(int salario) {
		this.salario = salario;
	}
	public String getEspecialidade() {
		return especialidade;
	}
	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}

	public void receberAumento(int aumento) {
		int salarioAtual = this.getSalario();
		salarioAtual += aumento;
		this.setSalario(salarioAtual);
	}

}
