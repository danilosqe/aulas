public class Empresa {
	String nome;
	String endereco = "Rua Dr. Odilon Bueno, 54";
	String cnpj = "12345/0001-13";
	String dataFundacao = "08/06/2019";
	String faturamento = "Conhecimento";
	
	public void imprimirEmpresa() {
		System.out.println("Nome da Empresa: " + this.nome);
		System.out.println("Endereco: " + this.endereco);
		System.out.println("CNPJ: " + this.cnpj);
		System.out.println("Data de Fundação: " + this.dataFundacao);
		System.out.println("Faturamento: " + this.faturamento);
	}
}
