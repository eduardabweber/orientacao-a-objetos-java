package Lista2;

public class AlunoTeste {
	
	public static void main(String[] args) {
		
		Aluno aluno1 = new Aluno();
		Aluno aluno2 = new Aluno();
		Aluno aluno3 = new Aluno();
		
		aluno1.numeroRA = 20251001;
		aluno1.nome =  "João Silva";
		aluno1.curso = "ADS";
		aluno1.turno = "Noturno";
		aluno1.periodo = 3;
		aluno1.coeficiente = 0.53;
		aluno1.situacaoMatricula = "Ativo";
		
		aluno2.numeroRA = 20241002;
		aluno2.nome =  "Maria Oliveira";
		aluno2.curso = "Eng. Civil";
		aluno2.turno = "Matutino";
		aluno2.periodo = 5;
		aluno2.coeficiente = 0.92;
		aluno2.situacaoMatricula = "Ativo";
		
		aluno3.numeroRA = 20261003;
		aluno3.nome =  "Pedro Santos";
		aluno3.curso = "BCC";
		aluno3.turno = "Vespertino";
		aluno3.periodo = 1;
		aluno3.coeficiente = 0.78;
		aluno3.situacaoMatricula = "Trancado";
		
		aluno1.responderChamada();
		aluno2.fazerAvaliacao();
		System.out.println(aluno3); // método toString
	}
}