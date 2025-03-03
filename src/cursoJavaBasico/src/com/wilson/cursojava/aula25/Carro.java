package com.wilson.cursojava.aula25;

public class Carro {
	
	String marca;
	String modelo;
	
	int numPassageiros; 
	double capCombustivel; 
	double consumoCombustivel; 
	
	
	void exibirAutonomia() {
		
		System.out.println("A automonomia do carro é : " + capCombustivel * consumoCombustivel + " km");
		
	} 
	

}
