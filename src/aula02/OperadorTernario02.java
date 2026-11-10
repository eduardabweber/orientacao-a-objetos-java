package aula02;

import java.util.Scanner;

public class OperadorTernario02 {
	public static void main(String[] args) {
		
		Scanner entradaTotal = new Scanner(System.in);
		
		System.out.println("Insira o valor total da compra: ");
		double valorTotal = entradaTotal.nextDouble();
		System.out.println("--------------");
		
		double desconto = (valorTotal >= 50) ? valorTotal * 0.10 : valorTotal * 0.05;
		
		System.out.println("Valor do desconto: R$" + desconto);
	}
}