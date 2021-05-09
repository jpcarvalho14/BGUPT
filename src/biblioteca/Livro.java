package biblioteca;

public interface Livro {
	void cria(String t,String a, String e,String aP);
	
	void imprimeLivro();
	
	String getTitulo();
	
	String getAutor();
	
	String getEditora();
}
