
public class aula13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mamifero x = new Mamifero();
		x.emitirSom();
		Cachorro y = new Cachorro();
		y.emitirSom();
		y.reagir("Rolheiser");
		y.reagir(11, 45);
		y.reagir(19, 00);
		y.reagir(false);
		y.reagir(true);
	}

}
