package biblioteca;

public class Cientifico implements Livro{

	
	public String titulo;
	public String autor;
	public String editora;
	public String anoPublicacao;
	


	@Override
	public void cria(String t, String a, String e, String aP) {
		// TODO Auto-generated method stub
		this.titulo=t;
		this.autor=a;
		this.editora=e;
		this.anoPublicacao=aP;
		imprimeLivro();
	}



	public void imprimeLivro() {
		// TODO Auto-generated method stub
		System.out.println("Titulo: "+titulo+"\nAutor: "+autor+"\nEditora: "+editora+"\nAno Publicacao: "+anoPublicacao);
	}



	@Override
	public String getTitulo() {
		// TODO Auto-generated method stub
		return titulo;
	}



	@Override
	public String getAutor() {
		// TODO Auto-generated method stub
		return autor;
	}



	@Override
	public String getEditora() {
		// TODO Auto-generated method stub
		return editora;
	}
	
}
