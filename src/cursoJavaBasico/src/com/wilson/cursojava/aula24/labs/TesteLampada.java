package com.wilson.cursojava.aula24.labs;

public class TesteLampada {

	public static void main(String[] args) {
		
		Lampada lampada = new Lampada();
		
		lampada.marca = "Osram";
		lampada.cor = "Neutra";
		lampada.tensao = "Bivolt";
		
		lampada.potencia = 18;
		lampada.custo = 14;
		lampada.preco = 23;
		
		System.out.println("Marca: " + lampada.marca);
		System.out.println("Cor: " + lampada.cor);
		System.out.println("Tensão: " + lampada.tensao);
		System.out.println("Potência: " + lampada.potencia + "watts");
		System.out.println("Custo: " + lampada.custo);
		System.out.println("Preço: " + lampada.preco);
		
		

	}

}
