package empresa;

public class Avaliacao {
	double nota1,nota2,nota3;
	public float media;
	float ponderada;
	
	Avaliacao(double nota1, double nota2, double nota3){
		this.nota1 = nota1;
		this.nota2 = nota2;
		this.nota3 = nota3;
	}
	
	
	
	public double  media() {
		return (this.nota1 + this.nota2+ this.nota3)/3;
	}
	public double ponderada() {
		return (this.nota1*2+this.nota2*3+this.nota3*4)/9;
	}
	
	
	
	
	

}
