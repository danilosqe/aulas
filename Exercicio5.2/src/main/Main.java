package main;

import model.Ferrari;
import model.GM;
import model.VW;

public class Main {

	public static void main(String[] args) {
		GM gm = new GM();
		Ferrari ferrari = new Ferrari();
		VW vw = new VW();
		
		gm.setCor("prata");
		gm.setMarca("General Motors");
		gm.setModelo("Cobalt");
		gm.setQtdPortas(5);
		gm.setQtdRodas(4);
		imprimirVeiculoGM(gm);
		
		ferrari.setCor("vermelha");
		ferrari.setPotencia("900 cavalos");
		ferrari.setQtdPortas(2);
		ferrari.setQtdRodas(4);
		ferrari.setZeroAcemPorSeg("35 segundos");
		imprimirVeiculoFerrari(ferrari);
		
		vw.setCor("azul");
		vw.setModelo("fusca");
		vw.setNivelInsulfilme("G5");
		vw.setQtdPortas(2);
		vw.setQtdRodas(4);
		imprimirVeiculoVW(vw);
		
	}
	
	public static void imprimirVeiculoVW(VW objeto) {
		System.out.println(objeto.getModelo());
		System.out.println(objeto.getCor());
		System.out.println(objeto.getNivelInsulfilme());
		System.out.println(objeto.getQtdPortas());
		System.out.println(objeto.getQtdRodas());
	}
	public static void imprimirVeiculoGM(GM objeto) {
		System.out.println(objeto.getModelo());
		System.out.println(objeto.getCor());
		System.out.println(objeto.getMarca());
		System.out.println(objeto.getQtdPortas());
		System.out.println(objeto.getQtdRodas());
	}
	public static void imprimirVeiculoFerrari(Ferrari objeto) {
		System.out.println(objeto.getPotencia());
		System.out.println(objeto.getCor());
		System.out.println(objeto.getZeroAcemPorSeg());
		System.out.println(objeto.getQtdPortas());
		System.out.println(objeto.getQtdRodas());
	}
	

}
