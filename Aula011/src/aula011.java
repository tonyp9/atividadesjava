
public class aula011 {

	public static void main(String[] args) {
	//	Pessoa p1 = new Pessoa(); Abstract não se instancia!
		Visitante v1 = new Visitante();
		v1.setNome("Janios Quadros");
		v1.setIdade(30);
		v1.setSexo("M");
		System.out.println(v1.toString());
		Aluno a1 = new Aluno();
		a1.setNome("Juscelino");
		a1.setCurso("Ciência Política");
		a1.setIdade(22);
		a1.setSexo("M");
		a1.pagarMensalidade();
		Bolsista b1 = new Bolsista();
		b1.setMatricula(1122);
		b1.setNome("Jubileu");
		b1.setBolsa(12.5f);
		b1.setSexo("M");
		b1.pagarMensalidade();
		Tecnico t1 = new Tecnico();
		t1.setNome("John Kennedy");
		t1.setCurso("Química");
		t1.setRegistroProfissional(1236);
		t1.Praticar();
		Professor p1 = new Professor();
		p1.setSalario(1250);
		p1.receberAumento(250);
		System.out.println(p1.getSalario());
		
		
		

	}

}
