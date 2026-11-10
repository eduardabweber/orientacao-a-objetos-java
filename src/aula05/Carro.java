package aula05;

public class Carro {
	
	String modelo;
	String marca;
	int ano;
	String placa;
	String cor;
	boolean ligado = false;
	int velocidade = 0;
	
	public void ligar() {
		if (ligado == false) {
			ligado = true;	
			System.out.println(modelo + " está ligando.");
		}
	}
	
	public void desligar() {
		if (velocidade == 0 && ligado == true) {
			ligado = false;
			System.out.println(modelo + " está desligando.");
		}
	}
	
	public void acelerar() {
		if (ligado == true && velocidade < 200) {
			velocidade += 10;
		}
		
		System.out.println(modelo + " está acelerando.");
		System.out.println("Velocidade: " + velocidade + " km/h");
	}
	
	public void frear() {
		if (ligado == true && velocidade > 0) {
			velocidade -= 10;
		}
		
		if (velocidade > 0) {
			velocidade = 0;
		}
		
		System.out.println(modelo + " está freando.");
		System.out.println("Velocidade: " + velocidade + " km/h");
	}
}