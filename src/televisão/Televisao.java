package televisão;

public class Televisao {
	private boolean ligado = false;
	private int volume;
	private int canal;
	
	
	public Televisao() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Televisao(boolean ligado, int volume, int canal) {
		this.ligado = ligado;
		this.volume = volume;
		this.canal = canal;
	}
	
	public boolean getLigado() {
		return ligado;
	}
	
	public void setLigado(boolean ligado) {
		this.ligado = ligado;
	}
	
	public int getVolume() {
		return volume;
	}
	public void setVolume(int volume) {
		this.volume = volume;
	}
	public int getCanal() {
		return canal;
	}
	public void setCanal(int canal) {
		this.canal = canal;
	}
	
	public void ligarEDesligar() {
		if(this.ligado == false) {
			
			this.setLigado(true);
			
			System.out.println("TV Ligada");
		}else {
			
			this.setLigado(false);
		}
	}
	
	public void mudarProximoCanal(){
		this.setCanal(this.getCanal() + 1);
	}
	
	
	public void mudarCanalAnterior(){
		this.setCanal(this.getCanal() - 1);
	}
	
	
	public void mudarCanalEspecifico(int canal){
		this.setCanal(canal);
	}
	
	public void aumentarVolume(){
		this.setCanal(this.getCanal() + 1);
	}
	
	public void diminuirVolume(){
		this.setCanal(this.getCanal() - 1);
	}
	
	public void menu() {
		System.out.println("Canal atual " + this.getCanal());
		System.out.println("Volume atual " + this.getVolume());
	}
}
