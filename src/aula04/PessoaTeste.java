package aula04;

import java.util.Scanner;

public class PessoaTeste {
	
	public static void main(String[] args) {
		
		Scanner entradaTeclado = new Scanner(System.in);
		
		Pessoa pessoa1 = new Pessoa();
		
		System.out.println("Informe o nome da pessoa 1: ");
		pessoa1.nome = entradaTeclado.nextLine();
		System.out.println("Informe a data de nascimento da pessoa 1: ");
		pessoa1.dataNascimento = entradaTeclado.nextLine();
		System.out.println("Informe o telefone da pessoa 1: ");
		pessoa1.telefone = entradaTeclado.nextLine();
		System.out.println("Informe o e-mail da pessoa 1: ");
		pessoa1.email = entradaTeclado.nextLine();
		System.out.println("Informe o estado civil da pessoa 1: ");
		pessoa1.estadoCivil = entradaTeclado.nextLine();
		
		System.out.println("=======================");
		
		Pessoa pessoa2 = new Pessoa();
		
		System.out.println("Informe o nome da pessoa 2: ");
		pessoa2.nome = entradaTeclado.nextLine();
		System.out.println("Informe a data de nascimento da pessoa 2: ");
		pessoa2.dataNascimento = entradaTeclado.nextLine();
		System.out.println("Informe o telefone da pessoa 2: ");
		pessoa2.telefone = entradaTeclado.nextLine();
		System.out.println("Informe o e-mail da pessoa 2: ");
		pessoa2.email = entradaTeclado.nextLine();
		System.out.println("Informe o estado civil da pessoa 2: ");
		pessoa2.estadoCivil = entradaTeclado.nextLine();
		
		System.out.println("=======================");

		Pessoa pessoa3 = new Pessoa();
		
		System.out.println("Informe o nome da pessoa 3: ");
		pessoa3.nome = entradaTeclado.nextLine();
		System.out.println("Informe a data de nascimento da pessoa 3: ");
		pessoa3.dataNascimento = entradaTeclado.nextLine();
		System.out.println("Informe o telefone da pessoa 3: ");
		pessoa3.telefone = entradaTeclado.nextLine();
		System.out.println("Informe o e-mail da pessoa 3: ");
		pessoa3.email = entradaTeclado.nextLine();
		System.out.println("Informe o estado civil da pessoa 3: ");
		pessoa3.estadoCivil = entradaTeclado.nextLine();
		
		System.out.println("=======================");
		
		System.out.println(pessoa1);
		System.out.println(pessoa2);
		System.out.println(pessoa3);
	}
}
