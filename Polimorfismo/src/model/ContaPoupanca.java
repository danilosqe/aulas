package model;

public class ContaPoupanca extends Conta {
	
	private float saldoPoupanca;
	
	public void saque(float valor) {
		if(saldo + saldoPoupanca < valor) {
			System.out.println("Saldo insuficiente para saque");
		} else {
			if(saldo < valor) {
				valor -= saldo;
				saldo = 0;
				saldoPoupanca -= valor;
			} else {
				saldo -= valor;
			}
		}
	}
	
	public void depositoPoupanca(float valor) {
		saldoPoupanca += valor;
	}

	public float getSaldoPoupanca() {
		return saldoPoupanca;
	}

	public void setSaldoPoupanca(float saldoPoupanca) {
		this.saldoPoupanca = saldoPoupanca;
	}

}
