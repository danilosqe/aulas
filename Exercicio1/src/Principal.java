
public class Principal {

	public static void main(String[] args) {
		Pessoa p1 = new Pessoa();
		Pessoa p2 = new Pessoa();
		Pessoa p3 = new Pessoa();
		
		p1.nome = "Andréia Nascimento";
		p1.endereco = "Rua Java, 13";
		p1.rg = "12321312312-00";
		p1.cpf = "8423019840184";
		p1.dataNascimento = "20-12-00";
		p2.nome = "Fabiana Boaretti";
		p2.endereco = "Rua Java, 13";
		p2.rg = "12321312312-00";
		p2.cpf = "8423019840184";
		p2.dataNascimento = "20-12-00";
		p3.nome = "Marcelo Boaretti";
		p3.endereco = "Rua Java, 13";
		p3.rg = "12321312312-00";
		p3.cpf = "8423019840184";
		p3.dataNascimento = "20-12-00";
		
		p1.imprimiPessoa(1);
		p2.imprimiPessoa(2);
		p3.imprimiPessoa(3);
		
//		p1.imprimiPessoa();
//		p2.imprimiPessoa();
//		p3.imprimiPessoa();
	}

}
