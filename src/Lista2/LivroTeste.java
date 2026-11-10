package Lista2;

public class LivroTeste {
	
	public static void main(String[] args) {
		
		Livro livro1 = new Livro();
		Livro livro2 = new Livro();
		Livro livro3 = new Livro();
		
		livro1.titulo = "O Iluminado";
		livro1.autor = "Stephen King";
		livro1.editora = "Suma";
		livro1.numeroPaginas = 520;
		livro1.anoPublicacao = 1977;
		livro1.situacao = true;
		
		livro2.titulo = "1984";
		livro2.autor = "George Orwell";
		livro2.editora = "Companhia das Letras";
		livro2.numeroPaginas = 416;
		livro2.anoPublicacao = 1949;
		livro2.situacao = false;
		
		livro3.titulo = "Eu, Robô";
		livro3.autor = "Isaac Asimov";
		livro3.editora = "Aleph";
		livro3.numeroPaginas = 320;
		livro3.anoPublicacao = 1950;
		livro3.situacao = true;
		
		livro1.emprestar();
		livro1.devolver();
		System.out.println(livro1); // método toString
		
		System.out.println(livro2); // método toString
	}
}
