package model;

public class Conta {
	
	protected String agencia;
	protected String numero;
	protected float saldo;
	
	public void saque(float valor) {
		if(this.saldo < valor) {
			System.out.println("Saldo insuficiente, saldo = " + this.saldo);
		}
		
	}
	
	public void getSaldo() {
		 System.out.println("O seu saldo é: " + saldo);
	}
	
	public void deposito(float valor) {
		saldo += valor;
	}

	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}
	
	public void saldo() {
		System.out.println("Seu Saldo é: " + saldo);
	}
	

}
