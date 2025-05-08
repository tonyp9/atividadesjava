package empresa;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Avaliacao mario = new Avaliacao();
		mario.nota1 = 7;
		mario.nota2 = 4;
		mario.nota3 = 10;
		System.out.println("Media Aritimética de Mário: " + mario.media());
		System.out.println("Média Ponderada de Mário: " + mario.ponderada());
		
		Avaliacao luigi = new Avaliacao(8,3,7.5);
		System.out.println("média " + luigi.media);
		
		
		System.out.println("Media Aritimética de Mário: " + luigi.media());
		System.out.println("Média Ponderada de Mário: " + luigi.ponderada());

	}

}
