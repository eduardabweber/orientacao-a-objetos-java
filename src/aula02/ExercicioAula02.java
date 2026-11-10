package aula02;

import java.util.Scanner;

public class ExercicioAula02 {
	public static void main(String[] args) {
		
		Scanner entradaTeclado = new Scanner(System.in);
		
		System.out.println("Nome completo:");
		String nomeCompleto = entradaTeclado.nextLine();
		System.out.println("Sexo (M/F):");
		String sexo = entradaTeclado.nextLine();
		System.out.println("Estado civil:");
		String estadoCivil = entradaTeclado.nextLine();
		System.out.println("Quantidade de filhos:");
		int quantidadeFilhos = entradaTeclado.nextInt();
		
		entradaTeclado.nextLine(); // limpeza buffer
		
		System.out.println("Escolaridade:");
		String escolaridade = entradaTeclado.nextLine();
		System.out.println("Renda mensal:");
		double rendaMensal = entradaTeclado.nextDouble();
		System.out.println("--------------------");
		
		System.out.println("Nome completo: " + nomeCompleto);
		System.out.println("Sexo: " + sexo);
		System.out.println("Estado civil: " + estadoCivil);
		System.out.println("Quantidade de filhos: " + quantidadeFilhos);
		System.out.println("Escolaridade: " + escolaridade);
		System.out.println("Renda mensal: " + rendaMensal);
	}
}