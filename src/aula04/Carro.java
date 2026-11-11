package aula04;

public class Carro {
	String modelo;
	String marca;
	String cor;
	int ano; 
	String renavam;
	String chassi;
	String placa;
	int velocidadeAtual = 0;
	
	public void ligar () {
		System.out.println(modelo + " está ligado.");
	}
	
	public void desligar () {
		System.out.println(modelo + " está desligado.");
	}
	
	public void acelerar (int velocidade) {
		
		velocidadeAtual = velocidadeAtual + velocidade;
		System.out.println("Velocidade atual: " + velocidadeAtual + " km/h.");
	}
	
	public void frear (int velocidade) {
		
		velocidadeAtual = velocidadeAtual - velocidade;
		System.out.println("Velocidade atual: " + velocidadeAtual + " km/h.");

	}
}