import java.util.Date;

import model.Conta;
import model.Empresa;

public class principal {

	public static void main(String[] args) {
//		Exercicio 1 Encapsulamento
		Conta conta = new Conta();
		conta.setAgencia("1234");
		conta.setNumero(123);
		conta.saldo();
		conta.deposito(500.0);
		conta.saldo();
		conta.saque(200.0);
		conta.saldo();
		
//		Exercicio 2 Encapsulamento 
		
		Empresa emp = new Empresa();
		emp.setNome("Empresa 1");
		emp.setEndereco("Endereco 1");
		emp.setCnpj("0000000/0000-01");
		emp.setDataFundacao(new Date());
		emp.setFaturamento(10000.0f);
		imprimirEmpresa(emp);
		
	}
	
	public static void imprimirEmpresa(Empresa emp) {
		System.out.println("Nome da Empresa: " + emp.getNome());
		System.out.println("Endereco: " + emp.getEndereco());
		System.out.println("CNPJ: " + emp.getCnpj());
		System.out.println("Data de Fundação: " + emp.getDataFundacao());
		System.out.println("Faturamento: " + emp.getFaturamento());
	}

}
