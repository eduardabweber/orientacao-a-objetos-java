package Lista2;

public class TelevisaoTeste {
	
	public static void main(String[] args) {
		
		Televisao tv1 = new Televisao();
		Televisao tv2 = new Televisao();
		Televisao tv3 = new Televisao();
		
		tv1.marca = "Samsung";
		tv1.polegadas = 55;
		tv1.resolucao = 2160;
		
		tv2.marca = "LG";
		tv2.polegadas = 43;
		tv2.resolucao = 1000;
		
		tv3.marca = "TCL";
		tv3.polegadas = 65;
		tv3.resolucao = 4320;
		
		tv1.ligar();
		tv1.canalParaCima();
		tv1.canalParaCima();
		tv1.canalParaCima();
		tv1.canalParaBaixo();
		tv1.canalParaBaixo();
		
		tv1.desligar();
		tv1.canalParaCima();
		
		tv1.ligar();
		tv1.aumentarVolume();
		tv1.aumentarVolume();
		tv1.abaixarVolume();
		tv1.abaixarVolume();
		tv1.abaixarVolume();

	}
}
