package com.wilson.cursojava.aula24;

public class TesteCarro {

	public static void main(String[] args) {
	
		
		Carro van = new Carro(); // Objeto instanciado
		
		van.marca = "Fiat";          // Definindo os valores dos atributos do objeto
		van.modelo = "Ducato";
		van.numPassageiros = 10;
		van.capCombustivel = 100;
		van.consumoCombustivel = 0.2;
		
		System.out.println(van.marca);
		System.out.println(van.modelo);
		
		Carro fusca = new Carro(); // Objeto instanciado
		
		fusca.marca = "Volkswagen"; // Definindo os valores dos atributos do objeto
		fusca.modelo = "Fusca";
		fusca.numPassageiros = 4;
		fusca.capCombustivel = 30;
		fusca.consumoCombustivel = 0.15;
		
		System.out.println(fusca.marca);
		System.out.println(fusca.modelo);

	}

}
