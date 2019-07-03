package model;

public class Aluno extends Pessoa {
	private String registrAcademico;
	private String curso;
	private double mensalidade;
	
	public String getRegistrAcademico() {
		return registrAcademico;
	}
	public void setRegistrAcademico(String registrAcademico) {
		this.registrAcademico = registrAcademico;
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	public double getMensalidade() {
		return mensalidade;
	}
	public void setMensalidade(double mensalidade) {
		this.mensalidade = mensalidade;
	}
	
	public void imprimir(Aluno a) {
		System.out.println("Aluno " + a.getNome());
		System.out.println("Curso " + a.getCurso());
		System.out.println("Mensalidade " + a.getMensalidade());
	}
	
}
