package principal;

import java.util.ArrayList;
import java.util.List;

import model.Livro;
import model.Pessoa;

public class Principal {

	public static void main(String[] args) {
		Pessoa pessoa = new Pessoa();
		pessoa.setNome("Danilo");
		pessoa.setEndereço("Odilon Bueno");
		pessoa.setIdade(31);
		
		List<Livro> livros = new ArrayList<Livro>();
		
		Livro livro = new Livro();
		livro.setAutor("Stephen Hophikins");
		livro.setPaginas(30);
		livro.setTitulo("OCA");
		livros.add(livro);
		
		Livro livro2 = new Livro();
		livro2.setAutor("Desconhecido");
		livro2.setPaginas(25);
		livro2.setTitulo("OCP");
		livros.add(livro2);
		
		pessoa.setLivros(livros);
		
		imprimir(pessoa);
	}
	
	public static void imprimir(Pessoa p) {

		System.out.println(p.getNome());
		System.out.println(p.getIdade());
		System.out.println(p.getEndereço());
		System.out.println("** Dados do livro da Pessoa **");
		
		for(Livro livro : p.getLivros()) {
			System.out.println(livro.getTitulo());
			System.out.println(livro.getPaginas());
		}
		
	}

}
