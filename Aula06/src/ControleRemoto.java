
public class ControleRemoto implements Controlador {
	private int volume;
	private boolean ligado;
	private boolean tocando;
	//Metodos Especiais
	public ControleRemoto() {
	this.volume = 50;
	this.ligado = false;
	this.tocando = false;
	}
	private int getVolume() {
		return volume;
	}
	private void setVolume(int volume) {
		this.volume = volume;
	}
	private boolean getLigado() {
		return ligado;
	}
	private void setLigado(boolean ligado) {
		this.ligado = ligado;
	}
	private boolean getTocando() {
		return tocando;
	}
	private void setTocando(boolean tocando) {
		this.tocando = tocando;
	}
	@Override
	public void ligar() {
		this.setLigado(true);
		// TODO Auto-generated method stub
		
	}
	@Override
	public void desligar() {
		this.setLigado(false);
		// TODO Auto-generated method stub
		
	}
	@Override
	public void abrirMenu() {
		System.out.println("------ MENU -------");
		System.out.println("Está ligado? " + this.getLigado());
		System.out.println("Está tocando? " + this.getTocando());
		System.out.print("Volume: " + this.getVolume());
		for (int i = 0; i <= this.getVolume(); i += 10) {
			System.out.print("|");
		}
		
		// TODO Auto-generated method stub
		
	}
	@Override
	public void fecharMenu() {
		// TODO Auto-generated method stub
		System.out.println("Fechando Menu...");
		
		
	}
	@Override
	public void maisVolume() {
		// TODO Auto-generated method stub
		if (this.getLigado()) {
			this.setVolume(this.getVolume()+5);
		}
		
	}
	@Override
	public void menosVolume() {
		// TODO Auto-generated method stub
		if (this.getLigado()) {
			this.setVolume(this.getVolume()-5);
		}
		
		
		
	}
	@Override
	public void ligarMudo() {
		// TODO Auto-generated method stub
		if (this.getLigado() && this.getVolume() > 0) {
			this.setVolume(0);
		}
		
	}
	@Override
	public void desligarMudo() {
		// TODO Auto-generated method stub
		if (this.getLigado() && this.getVolume() == 0){
			this.setVolume(50);
		}
		
		
	}
	@Override
	public void play() {
		if (this.getLigado() && !(this.getTocando())){
			this.setTocando(true);
		}
		// TODO Auto-generated method stub
		
	}
	@Override
	public void pause() {
		// TODO Auto-generated method stub
		if (this.getLigado() && this.getTocando()) {
			this.setTocando(false);
		}
		
	}
	
	// Metodos abstratos
	
	
	
	
	
	
}
