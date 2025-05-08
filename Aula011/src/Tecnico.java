
public final class Tecnico extends Aluno {
	int registroProfissional;
	
	
	
	
	public int getRegistroProfissional() {
		return registroProfissional;
	}




	public void setRegistroProfissional(int registroProfissional) {
		this.registroProfissional = registroProfissional;
	}




	public void Praticar(){
		System.out.println("O Aluno " + this.getNome() + " está praticando!");
		
		
	}

}
