
public class Pessoa {
	String nome;
	String endereco;
	String rg;
	String cpf;
	String dataNascimento;
	
	public void imprimiPessoa() {
		System.out.println(this.nome);
		System.out.println(this.endereco);
		System.out.println(this.rg);
		System.out.println(this.cpf);
		System.out.println(this.dataNascimento);
		System.out.println();
		
	}
	
	public void imprimiPessoa(int num) {
		System.out.println("Aluno " + num);
		System.out.println(this.nome);
		System.out.println(this.endereco);
		System.out.println(this.rg);
		System.out.println(this.cpf);
		System.out.println(this.dataNascimento);
		System.out.println();
		
	}
}
