package Lista2;

public class Televisao {
	
	String marca;
	int polegadas;
	int resolucao;
	int canalAtual = 1;
	int volumeAtual = 0;
	boolean ligado = false;
	
	public void ligar () {
		if (ligado == false) {
			ligado = true;
			System.out.println(marca + " está ligada.");
		}
	}
	
	public void desligar () {
		if (ligado == true ) {
			ligado = false;
			System.out.println(marca + " está desligada.");
		}
	}
	
	public void canalParaCima () {
		if (ligado == true) {
			canalAtual++;
			
			if (canalAtual > 99) {
				canalAtual = 1;
			}
			
			System.out.println("Canal atual: " + canalAtual);
		}
	}
	
	public void canalParaBaixo () {
		if (ligado == true) {
			canalAtual--;
			
			if (canalAtual < 1) {
				canalAtual = 99;
			}
			
			System.out.println("Canal atual: " + canalAtual);
		}
	}
	
	public void aumentarVolume () {
		if (ligado == true) {
			
			if (volumeAtual < 30) {
				volumeAtual++;
			}
			
			System.out.println("Volume atual: " + volumeAtual);
		}
	}
						
	public void abaixarVolume () {
		if (ligado == true) {
			
			if (volumeAtual > 0) {
				volumeAtual--;
			}
			
			System.out.println("Volume atual:" + volumeAtual);
		}
	}
	
	public String toString () {
		
		return "======== RELATÓRIO ======== \n"
				+ "Marca: " + marca + "\n"
				+ "Polegadas: " + polegadas + "\n"
				+ "Resolução: " + resolucao + "\n"
				+ "Canal sintonizado: " + canalAtual + "\n"
				+ "Volume atual: " + volumeAtual + "\n";
	}
}