package aula04;

import java.util.Scanner;

public class Queda {
	
	final double gravidade = 9.8;
	
	public void calcularTempoQueda(double altura) {
		
		double tempoQueda = Math.sqrt((2 * altura) / gravidade);
		
		System.out.println("Tempo queda: " + tempoQueda + " m/s.");
		
	}
	
	public static void main(String[] args) {
		
		Scanner entradaTeclado = new Scanner(System.in);
		
		System.out.println("Informe a altura da queda: ");
		double altura = entradaTeclado.nextDouble();
		
		Queda queda1 = new Queda();
		
		queda1.calcularTempoQueda(altura);
	}
}