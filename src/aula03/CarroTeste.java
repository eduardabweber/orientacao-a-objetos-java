package aula03;

import java.util.Scanner;

public class CarroTeste {
	
	public static void main(String[] args) {
		
		Scanner entradaTeclado = new Scanner(System.in);
				
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
		
		System.out.println("Relatório do carro 1: ");
		System.out.println("Modelo: " + carro1.modelo);
		System.out.println("Marca: " + carro1.marca);
		System.out.println("Cor: " + carro1.cor);
		System.out.println("Ano: " + carro1.ano);
		System.out.println("Renavam: " + carro1.renavam);
		System.out.println("Chassi: " + carro1.chassi);
		System.out.println("Placa: " + carro1.placa);
		System.out.println("-------------------------");
		System.out.println("Relatório do carro 2: ");
		System.out.println("Modelo: " + carro2.modelo);
		System.out.println("Marca: " + carro2.marca);
		System.out.println("Cor: " + carro2.cor);
		System.out.println("Ano: " + carro2.ano);
		System.out.println("Renavam: " + carro2.renavam);
		System.out.println("Chassi: " + carro2.chassi);
		System.out.println("Placa: " + carro2.placa);
		System.out.println("-------------------------");
		System.out.println("Relatório do carro 3: ");
		System.out.println("Modelo: " + carro3.modelo);
		System.out.println("Marca: " + carro3.marca);
		System.out.println("Cor: " + carro3.cor);
		System.out.println("Ano: " + carro3.ano);
		System.out.println("Renavam: " + carro3.renavam);
		System.out.println("Chassi: " + carro3.chassi);
		System.out.println("Placa: " + carro3.placa);
	}
}