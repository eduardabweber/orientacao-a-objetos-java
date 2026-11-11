package aula04;

public class ContaBancariaTeste {
	
	public static void main(String[] args) {
				
		ContaBancaria cb1 = new ContaBancaria();
		cb1.nomeTitular = "João";
		cb1.saldo = "2434355";
		cb1.conferirContasBancarias();
		
		ContaBancaria cb2 = new ContaBancaria();
		cb2.nomeTitular = "Maria";
		cb2.saldo = "132433";
		cb2.conferirContasBancarias();
		
		ContaBancaria cb3 = new ContaBancaria();
		cb3.nomeTitular = "Joana";
		cb3.saldo = "2133";
		cb3.conferirContasBancarias();
		
		System.out.println(cb1.nomeTitular);
		System.out.println("Número conta bancária: " + cb1.numeroContaBancaria);
		System.out.println("===================");
		System.out.println(cb2.nomeTitular);
		System.out.println("Número conta bancária: " + cb2.numeroContaBancaria);
		System.out.println("===================");
		System.out.println(cb3.nomeTitular);
		System.out.println("Número conta bancária: " + cb3.numeroContaBancaria);
		System.out.println("===================");
		System.out.println("Total de contas: " + ContaBancaria.quantidadeNumeroCB);
	}
}