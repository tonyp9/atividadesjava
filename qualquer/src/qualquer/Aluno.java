package qualquer;

public class Aluno {
	String nome;
	String curso;
	double notas;
	double nota1;
	double nota2;
	
	public void setNome(String n) {
		this.nome = n;
	}
	public String getNome () {
		return this.nome;
		
	}
	public String getCurso() {
		return this.curso;
	}
	public void setCurso(String c) {
		this.curso = c;
	}
	
	
	
	
	
	public Aluno(String n, String c, double n1, double n2) {
		this.nome = n;
		this.curso = c;
		this.nota1 = n1;
		this.nota2 = n2;
		
		
		
		
	}
	
	
	
	public double avaliacao() {
		return(nota1+nota2)/2;
	}
	
	public void status() {
		System.out.println("Nome do Aluno: " + this.nome);
		System.out.println("Nome do Curso: " + this.curso);
		System.out.println("Notas médias: " + this.avaliacao());
	}
	

}
