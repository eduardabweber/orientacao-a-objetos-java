package Lista2;

public class CarroTeste {
	
	public static void main(String[] args) {
		
		Carro carro1 = new Carro();
		Carro carro2 = new Carro();
		Carro carro3 = new Carro();
		
		carro1.modelo = "Gol";
		carro1.marca = "Volkswagen";
		carro1.cor = "Vermelho";
		carro1.ano = 2020;
		carro1.renavam = 123123;
		carro1.chassi = "93847927X82738";
		carro1.placa = "ABC-1834";
		
		carro2.modelo = "Onix";
		carro2.marca = "Chevrolet";
		carro2.cor = "Preto";
		carro2.ano = 2013;
		carro2.renavam = 987987;
		carro2.chassi = "238247DNSDNIV27";
		carro2.placa = "XYZ-1G45";
		
		carro3.modelo = "Ka";
		carro3.marca = "Ford";
		carro3.cor = "Prata";
		carro3.ano = 2015;
		carro3.renavam = 456456;
		carro3.chassi = "389472ASDBSKDJA7886";
		carro3.placa = "MNO-5D78";
		
		carro1.ligar();
		carro2.desligar();
		carro3.acelerar();
	}
}