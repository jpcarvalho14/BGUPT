package biblioteca;

public class Bibliografia implements Livro{

	String tipoLivro;
	
	
	@Override
	public void cria() {
		// TODO Auto-generated method stub
		tipoLivro = "Bibliografia";
		System.out.println("Inside Bibliografia::cria() method");
	}

}
