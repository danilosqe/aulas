package model;

public class Funcionario extends Pessoa {
	
	private double salario;
	private int matricula;
	
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	
	public void imprimir(Funcionario f) {
		System.out.println("Nome " + f.getNome());
		System.out.println("Salario " + f.getSalario());
	}
	
}
