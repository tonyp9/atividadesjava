
public class ProjetoPessoas {

	public static void main(String[] args) {
		// Programa Principal
		Pessoa p1 = new Pessoa();
		Aluno p2 = new Aluno();
		Professor p3 = new Professor();
		Funcionario p4 = new Funcionario();
		p1.setNome("Pedro");
		p1.setSexo("M");
		p2.setNome("Maria");
		p2.setSexo("F");
		p2.setCurso("Astronomia");
		p3.setNome("Cláudio");
		p3.setSexo("M");
		p3.setEspecialidade("Filosofia");
		p4.setNome("Fabiana");
		
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		System.out.println(p3.toString());
		System.out.println(p4.toString());
		

	}

}

