package aula03;

public class aula03 {

	public static void main(String[] args) {
		Caneta c1 = new Caneta();
		c1.modelo = "BIC Cristal";
		c1.cor = "Azul";
		//c1.ponta = 0.5f; <- ponta está privado
		c1.carga = 80;
		c1.tampada = true;
		c1.carregar();
		c1.status();
		
		
		

	}

}
