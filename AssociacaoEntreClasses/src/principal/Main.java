package principal;

import model.Carro;
import model.Pessoa;

public class Main {

	public static void main(String[] args) {
		Pessoa p = new Pessoa();
		p.setCpf("7676767676");
		p.setNome("dadssada");
		Carro carro = new Carro();
		carro.setCor("azul");
		p.setCarro(carro);
		imprimir(p);
	}
	
	public static void imprimir(Pessoa pessoa) {
		System.out.println("Nome da pessoa: " + pessoa.getNome());
		Carro carro = pessoa.getCarro();
		System.out.println("Dados do carro");
		System.out.println("Cor do Carro: " + carro.getCor());
		
	}

}
