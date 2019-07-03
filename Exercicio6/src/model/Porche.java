package model;

import interfaceModel.Carro;

public class Porche implements Carro{

	@Override
	public void acelerar() {
		System.out.println("Porche acelerando");
	}

	@Override
	public void freiar() {
		System.out.println("Porche freiando");
	}

	@Override
	public void virarDireita() {
		System.out.println("Porche virando a direita");
	}

	@Override
	public void virarEsquerda() {
		System.out.println("Porche virando a esquerda");
	}
	
	public Porche() {
		this.acelerar();
		this.virarEsquerda();
		this.acelerar();
		this.freiar();
		this.virarDireita();
		this.freiar();
		System.out.println("Porche estacionando");
	}

}
