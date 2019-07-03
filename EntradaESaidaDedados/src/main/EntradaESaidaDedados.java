package main;

import java.util.Scanner;

public class EntradaESaidaDedados {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in); //declaração para entrada de dados...
		
		System.out.println("Digite um número");
		int number = input.nextInt(); // aguarda a digitação da entrada de dados...
		
		System.out.println("Número digitado é: " + number); // saída de dados..
	
	}

}
