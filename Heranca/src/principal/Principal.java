package principal;

import model.Aluno;
import model.Funcionario;

public class Principal {

	public static void main(String[] args) {
		Funcionario f1 = new Funcionario();
		f1.setNome("F1");
		f1.setEndereco("End F1");
		f1.setCpf("123.456.789-00");
		f1.setMatricula(123);
		f1.setSalario(1000.00);
		//f1.imprimir(f1);
		
		Aluno a1 = new Aluno();
		a1.setNome("Danilo");
		a1.setMensalidade(500.00);
//		a1.imprimir(a1);
		
		imprimir(f1);
		imprimirAluno(a1);
	}
	
	public static void imprimir(Funcionario f) {
		System.out.println(f.getNome());
	}
	
	public static void imprimirAluno(Aluno a) {
		System.out.println(a.getNome());
	}
}
