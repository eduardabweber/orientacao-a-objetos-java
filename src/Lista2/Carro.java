package Lista2;

public class Carro {
	
	String modelo;
	String marca;
	String cor;
	int ano;
	int renavam;
	String chassi;
	String placa;
	
	public void ligar() {
		
		System.out.println(modelo + " está ligando.");
	}
	
	public void desligar() {
		
		System.out.println(modelo + " está desligando.");
		
	}
	
	public void acelerar() {
		
		System.out.println(modelo + " está acelerando.");
	}
	
	public void frear() {
		
		System.out.println(modelo + " está freando.");
	}
}