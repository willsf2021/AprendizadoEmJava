package com.wilson.cursojava.aula12;

import java.util.Scanner;

public class LeituraDadosTeclado {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		/*
		  System.out.println("Digite seu nome completo:");
		  
		  String nomeCompleto = scan.nextLine();
		  
		  System.out.println("Seu nome completo é: " + nomeCompleto);
		  
		  System.out.println("Digite a sua idade:");
		  
		  int idade = scan.nextInt();
		  
		  System.out.println(idade);
		 */
		
		System.out.println("Digite o seu primeiro nome, idade, quantidade de filhos, altura e se tem bicho de estimação");
		
		String nome = scan.next();
		
		int idade2 = scan.nextInt();
		
		byte qtdFilhos = scan.nextByte();
		
		float altura = scan.nextFloat();
		
		boolean temPet = scan.nextBoolean();
		
		
		System.out.println("Você digitou os seguinte valores:");
		
		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade2 + " anos");
		System.out.println("Quantidade de filhos: " + qtdFilhos);
		System.out.println("Altura: " + altura);
		System.out.println("Tem bicho de estimação: " + (temPet ? "sim" : "não"));

	}

}
