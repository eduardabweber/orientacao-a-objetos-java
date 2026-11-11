package aula04;

public class Pessoa {
	
	String nome;
	String dataNascimento;
	String telefone;
	String email;
	String estadoCivil;
	
	public String toString() {
		
		return "======== RELATÓRIO ======== \n" 
		+ "Nome: " + nome + "\n"
		+ "Data de nascimento: " + dataNascimento + "\n"
		+ "Telefone: " + telefone + "\n"
		+ "Email: " + email + "\n"
		+ "Estado civil: " + estadoCivil + "\n";
	}
}