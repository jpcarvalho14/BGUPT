package biblioteca;

import java.util.ArrayList;
import java.util.Scanner;

public class GereBiblioteca {
	static Scanner input = new Scanner(System.in);		
	static LivroFactory factory = new LivroFactory();
	static ArrayList<Livro> biblioteca = new ArrayList<Livro>();
	
	public static void main(String[] args) {
		int op;
		
		System.out.println("-----BGUPT-----\n");
		System.out.println("1 - Registar Utilizador/Leitor\n");
		System.out.println("2 - Registar Publicacao\n");
		System.out.println("3 - Pesquisar Publicacao por Titulo\n");
		System.out.println("4 - Pesquisar Publicacao por Autor\n");
		System.out.println("5 - Pesquisar Publicacao por Editora\n");
		System.out.println("6 - Sair\n");
		System.out.println("Resposta: ");
		
		op = input.nextInt();
		if(op==6) {
			System.out.println("Saindo do sistema....");
		}
		
		while(op!=6) {
			
			switch(op) {	
			
			case 1:
				System.out.println("\n\nRegistar Utilizador:");
				System.out.println("Número de Aluno:\n");
				System.out.println("ID: ");
				String num = input.next();
				//cria aluno com factory
				//insere aluno no sistema
			break;	
			
			case 2:
				registarPublicacao();
			break;	
			
			case 3:
				pesquisarTitulo();				
			break;
			
			case 4:
				pesquisarAutor();
			break;	
			
			case 5:
				pesquisarEditora();
			break;
			
			case 6:
				System.out.println("A carregar....");
			break;	
			
			}
			
			
			System.out.println("-----BGUPT-----\n");
			System.out.println("1 - Registar Utilizador/Leitor\n");
			System.out.println("2 - Registar Publicacao\n");
			System.out.println("3 - Pesquisar Publicacao por Titulo\n");
			System.out.println("4 - Pesquisar Publicacao por Autor\n");
			System.out.println("5 - Pesquisar Publicacao por Editora\n");
			System.out.println("6 - Sair\n");
			System.out.println("Resposta: ");
			
			op = input.nextInt();
			if(op==6) {
				System.out.println("Saindo do sistema....");
			}
			
			}
		
}
				
	

	private static void pesquisarEditora() {
		System.out.println("Editora do Livro a Pesquisar:\n");
		System.out.print("Editora: ");
		String pesqE = input.next();
		
		for(int i=0;i<biblioteca.size();i++) {
			if(biblioteca.get(i).getEditora().equals(pesqE)) {
				System.out.println("Livro encontrado!");
				biblioteca.get(i).imprimeLivro();
				break;
			}
		}
		
	}



	private static void pesquisarTitulo() {
		System.out.println("Titulo do Livro a Pesquisar:\n");
		System.out.print("Titulo: ");
		String pesqT = input.next();
		
		for(int i=0;i<biblioteca.size();i++) {
			if(biblioteca.get(i).getTitulo().equals(pesqT)) {
				System.out.println("Livro encontrado!");
				biblioteca.get(i).imprimeLivro();
				break;
			}
		}
	}
	
	private static void pesquisarAutor() {
		System.out.println("Autor do Livro a Pesquisar:\n");
		System.out.print("Autor: ");
		String pesqA = input.next();
		
		for(int i=0;i<biblioteca.size();i++) {
			if(biblioteca.get(i).getAutor().equals(pesqA)) {
				System.out.println("Livro encontrado!");
				biblioteca.get(i).imprimeLivro();
				break;
			}
		}
	}



	private static void registarPublicacao() {
		System.out.println("\n\nRegistar Publicacao");
		System.out.println("Tipo de Livro: Cientifico, Sebenta,Bibliografia\n");
		String tipo = input.next();
		System.out.println("Titulo do Livro:\n");
		String titulo = input.next();
		System.out.println("Autor(a) do Livro:\n");
		String autor = input.next();
		System.out.println("Editor(a):\n");
		String editora = input.next();
		System.out.println("Ano de Publicacao:\n");
		String anoP = input.next();
		
		Livro l2 = factory.getTipo(tipo);
		l2.cria(titulo, autor, editora, anoP);
		biblioteca.add(l2);
		if(biblioteca.size()!=0) {
			System.out.println("Livro inserido com sucesso!");
		}
		else System.out.println("Livro nao inserido!");
		
	}	
}
