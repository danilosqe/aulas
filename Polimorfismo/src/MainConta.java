import javax.swing.JOptionPane;

import model.Conta;
import model.ContaEspecial;
import model.ContaPoupanca;

public class MainConta {

	public static void main(String[] args) {
		float valor = 3000;
		Conta conta =  new Conta(); 
		conta.setAgencia("1234"); 
		conta.setNumero("1234"); 
		conta.deposito(valor); 

		ContaPoupanca contaPoupanca = new ContaPoupanca(); 
		contaPoupanca.setAgencia("1234"); 
		contaPoupanca.setNumero("1234"); 
		contaPoupanca.deposito(valor); 
		contaPoupanca.depositoPoupanca(1000);

		ContaEspecial contaEspecial= new ContaEspecial(); 
		contaEspecial.setAgencia("1234"); 
		contaEspecial.setNumero("1234"); 
		contaEspecial.deposito(3000); 
		contaEspecial.depositoContaEspecial(1000); 

		fazSaque(conta); 
		fazSaque(contaPoupanca); 
		fazSaque(contaEspecial); 
		
		System.out.println();
	}
	
	public static void fazSaque(Conta conta) {
		float valor =
				Float.parseFloat(
						JOptionPane.showInputDialog("Digite o valor do saque")
						);
		conta.saque(valor);
		conta.saldo();
	}

}
