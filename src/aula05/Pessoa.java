package aula05;

public class Pessoa {
	
	String nome;
	int idade;
	double peso;
	
	public void andar() {
		
		System.out.println(nome + " está andando.");
	}
	
	public void correr() {
		
		System.out.println(nome + " está correndo.");
	}
	
	public void falar() {
		
		System.out.println(nome + " está falando.");
	}
	
	public String toString() {
		return "Nome: " + nome + "\n"
				+ "Idade: " + idade + "\n"
				+ "Peso: " + peso + "\n";
	}
}