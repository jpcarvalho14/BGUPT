package biblioteca;

public class GereBiblioteca {

	public static void main(String[] args) {
		LivroFactory factory = new LivroFactory();
		
		
		Livro l1 = factory.getTipo("Cientifico");
		
		l1.cria();
		
		
	}
	
	
	
}