package aula05;

import java.util.Scanner;

public class CarroTeste {
	
	public static void main(String[] args) {
		
		Scanner entradaTeclado = new Scanner(System.in);
		
		Carro carro1 = new Carro();
		
		System.out.println("Informe o modelo do carro 1: ");
		carro1.modelo = entradaTeclado.nextLine();
		
		System.out.println("Informe a marca do carro 1: ");
		carro1.marca = entradaTeclado.nextLine();
		
		System.out.println("Informe o ano do carro 1: ");
		carro1.ano = entradaTeclado.nextInt();
		
		System.out.println("Informe a placa do carro 1:");
		entradaTeclado.nextLine(); // limpeza buffer
		carro1.placa = entradaTeclado.nextLine();
		
		System.out.println("Informe a cor do carro 1: ");
		carro1.cor = entradaTeclado.nextLine();
		
		carro1.ligar();
		
		carro1.acelerar();
		carro1.acelerar();
		carro1.acelerar();
		
		carro1.frear();
		
		carro1.desligar();
	}
}