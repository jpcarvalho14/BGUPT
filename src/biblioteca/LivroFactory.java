package biblioteca;

public class LivroFactory {

	public Livro getTipo(String tipoLivro) {
		if(tipoLivro==null) {
			return null;
		}
		if(tipoLivro.equalsIgnoreCase("Cientifico")){
			return new Cientifico();
		}
		else if(tipoLivro.equalsIgnoreCase("Sebenta")) {
			return new Sebenta();
		}
		else if(tipoLivro.equalsIgnoreCase("Bibliografia")) {
			return new Bibliografia();
		}
		return null;
	}
}
