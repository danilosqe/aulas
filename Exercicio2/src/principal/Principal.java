package principal;

import model.Animal;

public class Principal {

	public static void main(String[] args) {
		Animal animal = new Animal();
		animal.setClasse("ave");
		animal.setCor("marrom");
		animal.setEspecie("piriquito");
		animal.setGenero("masculino");
		animal.setIdade(2);
		animal.setNome("psittasidae");
		imprimir(animal);
	}
	
	public static void imprimir(Animal animal) {
		System.out.println("Nome: " + animal.getNome());
		System.out.println("Especie: " + animal.getEspecie());
		System.out.println("Idade: " + animal.getIdade());
		System.out.println("Genero: " + animal.getGenero());
		System.out.println("Cor: " + animal.getCor());
		System.out.println("Classe: " + animal.getClasse());
	}

}
