package Lista2;

public class Aluno {
	
	int numeroRA;
	String nome;
	String curso;
	String turno;
	int periodo;
	double coeficiente;
	String situacaoMatricula;
	
	public void responderChamada() {
		
		System.out.println(nome + " está respondendo a chamada.");
	}
	
	public void fazerAvaliacao() {
		
		System.out.println(nome + " está fazendo avaliação.");
	}
	
	public String toString () {
		
		return "======= RELATÓRIO ======= \n"
				+ "RA: " + numeroRA + "\n"
				+ "Nome: " + nome + "\n"
				+ "Curso: " + curso + "\n"
				+ "Turno: " + turno + "\n"
				+ "Periodo: " + periodo + "\n"
				+ "Coeficiente: " + coeficiente + "\n"
				+ "Situação matrícula: " + situacaoMatricula + "\n"; 
	}
}