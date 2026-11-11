package aula04;

public class ContaBancaria {
	int numeroContaBancaria = 0;
	String nomeTitular;
	String saldo;
	static int quantidadeNumeroCB = 0;
	
	public void conferirContasBancarias () {
		
		numeroContaBancaria++;
		quantidadeNumeroCB++;
	}
}