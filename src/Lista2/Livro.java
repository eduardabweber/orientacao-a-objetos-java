package Lista2;

public class Livro {
	
	String titulo;
	String autor;
	String editora;
	int numeroPaginas;
	int anoPublicacao;
	boolean situacao = true;
	
	public void emprestar() {
		
		if (situacao == true) {
			situacao = false;
			
			System.out.println(titulo + " está sendo emprestado.");
		}
	}
	
	public void devolver() {
		
		if (situacao == false) {
			situacao = true;
			
			System.out.println(titulo + " está sendo devolvido.");
		}
	}
	
	public String toString() {
		
		String status;
		
		if (situacao == true) {
			status = "Disponível";
			
		} else {
			status = "Indisponível";
		}
	
		return "======= RELATÓRIO DO LIVRO ======= \n"
				+ titulo + " , " + autor + " , "
				+ editora + " , " + numeroPaginas + " , "
				+ anoPublicacao + " , " + status;
	}
}
