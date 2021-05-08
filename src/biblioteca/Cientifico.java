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
	}
	
}
