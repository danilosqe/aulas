package model;

import java.util.List;

public class Garrafa {
	private String material;
	private double altura;
	private double largura;
	private double qtdMls;
	private List<Liquido> liquidos;
	
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public double getLargura() {
		return largura;
	}
	public void setLargura(double largura) {
		this.largura = largura;
	}
	public double getQtdMls() {
		return qtdMls;
	}
	public void setQtdMls(double qtdMls) {
		this.qtdMls = qtdMls;
	}
	public List<Liquido> getLiquidos() {
		return liquidos;
	}
	public void setLiquidos(List<Liquido> liquidos) {
		this.liquidos = liquidos;
	}
}
