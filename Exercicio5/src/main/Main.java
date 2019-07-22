package main;

import model.Iphone;
import model.Motorola;

public class Main {

	public static void main(String[] args) {
		Iphone i = new Iphone();
		i.setNome("iPhone");
		i.setCor("vermelho espacial");
		i.setModelo("X");
		i.setTipo("SmartPhone");
		i.setComunicacao("Internet e Redes de altas frequências");
		
		Motorola m = new Motorola();
		m.setNome("Motorola");
		m.setCor("preto");
		m.setModelo("Moto G6 Plus");
		m.setTipo("SmartPhone");
		m.setJogos("sim");
		
		imprimirIphone(i);
		imprimirMotorola(m);
	}
	public static void imprimirIphone(Iphone ip) {
		System.out.println("Nome: " + ip.getNome());
		System.out.println("Tipo de Comunicação: " + ip.getComunicacao());
	}
	
	public static void imprimirMotorola(Motorola mo) {
		System.out.println("Nome: " + mo.getNome());
		System.out.println("Tem Jogos? " + mo.getJogos());
	}

}
