package principal;

import java.util.ArrayList;
import java.util.List;

import model.Garrafa;
import model.Liquido;

public class Main {

	public static void main(String[] args) {
		Garrafa garrafa = new Garrafa();
		garrafa.setAltura(70.0);
		garrafa.setLargura(25.0);
		garrafa.setMaterial("Vidro");
		garrafa.setQtdMls(2000);
		List<Liquido> liquidos = new ArrayList<Liquido>();
		
		Liquido lq = new Liquido();
		lq.setTipoDeLiquido("Água");
		
		Liquido lq1 = new Liquido();
		lq1.setTipoDeLiquido("Refigerante");
		
		Liquido lq2 = new Liquido();
		lq2.setTipoDeLiquido("Suco");
		
		Liquido lq3 = new Liquido();
		lq3.setTipoDeLiquido("Cerveja");
		
		liquidos.add(lq);
		liquidos.add(lq1);
		liquidos.add(lq2);
		liquidos.add(lq3);
		garrafa.setLiquidos(liquidos);
		imprimir(garrafa);
	}
	
	public static void imprimir(Garrafa g) {
		System.out.println("Material da Garrafa " + g.getMaterial());
		System.out.println("Detalhes do liquidos que podem ir na Garrafa");
		for(Liquido item : g.getLiquidos()) {
			System.out.println("Tipo de Liquido da garrafa " + item.getTipoDeLiquido());
			System.out.println("*****************************************************");
		}
	}

}