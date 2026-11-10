package Lista2;

public class PessoaTeste {
	
	public static void main(String[] args) {
		
		Pessoa pessoa1 = new Pessoa();
		Pessoa pessoa2 = new Pessoa();
		Pessoa pessoa3 = new Pessoa();
		
		pessoa1.nome = "João";
		pessoa1.sexo = "M";
		pessoa1.cpf = 127394780;
		pessoa1.idade = 25;
		pessoa1.altura = 1.75;
		pessoa1.peso = 68.5;
		
		pessoa2.nome = "Maria";
		pessoa2.sexo = "F";
		pessoa2.cpf = 1293994780;
		pessoa2.idade = 30;
		pessoa2.altura = 1.59;
		pessoa2.peso = 55.6;
		
		pessoa3.nome = "José";
		pessoa3.sexo = "M";
		pessoa3.cpf = 122993930;
		pessoa3.idade = 32;
		pessoa3.altura = 1.67; 
		pessoa3.peso = 62.4;
		
		pessoa1.andar();
		pessoa2.correr();
		pessoa3.falar();
	}
}
