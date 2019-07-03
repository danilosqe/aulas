package model;

public class Conta {
	private String agencia;
	private int numero;
	private double saldo;
	
	public String getAgencia() {
		return agencia;
	}
	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public void deposito(double valor) {
		this.saldo += valor;
	}
	
	public void saque(double valor) {
		this.saldo -= valor;
	}
	
	public void saldo() {
		System.out.println("Seu saldo atual é de: " + this.saldo);
	}
	
}
