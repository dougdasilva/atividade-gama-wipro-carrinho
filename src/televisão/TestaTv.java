package televis�o;

public class TestaTv {

	public static void main(String[] args) {
		Televisao tv = new Televisao();
		
		tv.ligarEDesligar();
		
		tv.aumentarVolume();
		tv.mudarProximoCanal();
		tv.menu();
	}

}
