package aula02;

import java.util.Scanner;

public class OperadorTernario {
	public static void main(String[] args) {
		
		Scanner entradaNumero = new Scanner (System.in);
		
		System.out.println("Informe o Num1: ");
		int NUM1 = entradaNumero.nextInt();
		System.out.println("Informe o Num2: ");
		int NUM2 = entradaNumero.nextInt();
		System.out.println("Informe o Num3: ");
		int NUM3 = entradaNumero.nextInt();
		System.out.println("----------------------");
		
		if (NUM1 >= NUM2 && NUM1 >= NUM3) {
			System.out.println("O maior número é: " + NUM1);
		} else if (NUM2 >= NUM1 && NUM2 >= NUM3) {
			System.out.println("O maior número é: " + NUM2);
		} else {
			System.out.println("O maior número é: " + NUM3);
		}
	}
}
