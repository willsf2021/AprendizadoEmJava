package com.wilson.cursojava.aula11;

public class VariavelChar {

	public static void main(String[] args) {
		
		/*
		 * char o = 'o';
		 * 
		 * char i = 'i';
		 */
		
		char o = 111;
		
		char i = 105;
		
		/* 
		Quando você declara um 'char', pode inicializar com um número, pois o JAVA vai 'procurar' a 
		correspondência na tabela ASCII/Unicode e retornar o caractere correspondente.
		*/
		
		
		
		System.out.println("" + o + i);
		
		// Incluindo "" ele concatena o próprio caractere retornado pelo Tabela ASCII, SEM "" ele faz a SOMA do valor correspondente na Tabela ASCII.
		
		char interrogacao = 0x003F;
		
		System.out.println("" + o + i + interrogacao);
	}

}
