package model;

import interfaceModel.Carro;

public class Ferrari implements Carro {

	@Override
	public void acelerar() {
		System.out.println("Ferrari Acelerando");
		
	}

	@Override
	public void freiar() {
		System.out.println("Ferrari Freiando");
	}

	@Override
	public void virarDireita() {
		System.out.println("Ferrari virando a Direita");
	}

	@Override
	public void virarEsquerda() {
		System.out.println("Ferrari virando a esquerda");
	}
	
	public Ferrari() {
		this.acelerar();
		this.virarDireita();
		this.virarEsquerda();
		this.freiar();
	}

}
