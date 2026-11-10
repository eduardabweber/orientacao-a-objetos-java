package aula03;

import java.util.Scanner;

public class NotebookTeste {
	
	public static void main(String[] args) {
		
		Scanner entradaTeclado = new Scanner(System.in);
		
		Notebook notebook1 = new Notebook();
		Notebook notebook2 = new Notebook();
		
		notebook1.marca = "Dell";
		notebook1.modelo = "Inspiron 1550";
		notebook1.polegadas = 15;
		notebook1.processador = "Intel Core i7";
		notebook1.memoria = 16;
		notebook1.armazenamento = 256; 
		
		notebook2.marca = "Sony";
		notebook2.modelo = "Vaio 5000";
		notebook2.polegadas = 13;
		notebook2.processador = "Intel Core i7";
		notebook2.memoria = 32;
		notebook2.armazenamento = 512;
		
		System.out.println("=========== NOTEBOOK 1 ===========");
		System.out.println("Marca: " + notebook1.marca);
		System.out.println("Modelo " + notebook1.modelo);
		System.out.println("Polegadas: " + notebook1.polegadas);
		System.out.println("Processador: " + notebook1.processador);
		System.out.println("Memoria: " + notebook1.memoria + "GB");
		System.out.println("Armazenamento: " + notebook1.armazenamento + "GB");
		
		System.out.println("=========== NOTEBOOK 2 ===========");
		System.out.println("Marca: " + notebook2.marca);
		System.out.println("Modelo " + notebook2.modelo);
		System.out.println("Polegadas: " + notebook2.polegadas);
		System.out.println("Processador: " + notebook2.processador);
		System.out.println("Memoria: " + notebook2.memoria + "GB");
		System.out.println("Armazenamento: " + notebook2.armazenamento + "GB");
	}
}