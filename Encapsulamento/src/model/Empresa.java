package model;
import java.util.Date;
public class Empresa {
	private String nome;
	private String endereco;
	private String cnpj;
	private Date dataFundacao;
	private float faturamento;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public Date getDataFundacao() {
		return dataFundacao;
	}
	public void setDataFundacao(Date dataFundacao) {
		this.dataFundacao = dataFundacao;
	}
	public float getFaturamento() {
		return faturamento;
	}
	public void setFaturamento(float faturamento) {
		this.faturamento = faturamento;
	}

}
