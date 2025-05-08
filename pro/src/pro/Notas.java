package pro;

public class Notas {
	private int n1;
	private int n2;


	public int  resultado(int n1, int n2) {
		int calc = (n1+n2) / 2;
		int media = 7 - calc;
		System.out.println("Média da nota: " + calc);
		
		if ((n1+n2)/2 >= 7) {
			System.out.println("Aprovado");
			return 1;
			}
		else if ((n1+n2) / 2 < 7) {
			System.out.println("Nota abaixo da média 7 ");
			System.out.println("Para aprovar precisar de " + media + " pontos" );
			return 2;
		}
		
		else {
			System.out.println("Reprovado");
			return 0;
		}
	}
	
	public int getNota1() {
		return this.n1;
	}
	public int getNota2() {
		return this.n2;
	}
	public void setNota1(int n1) {
		this.n1 = n1;
		
	}
	public void setNota2(int n2) {
		this.n2 = n2;
	}
	
	
	
}