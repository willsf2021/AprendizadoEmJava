package com.wilson.cursojava.aula13;

public class OperadoresAritmeticos {

	public static void main(String[] args) {
		
		int resultado = 1 + 2;
		
		System.out.println(resultado);
		
		resultado = resultado - 1;
		System.out.println(resultado);
		
		resultado = resultado * 2;
		System.out.println(resultado);
		
		resultado = resultado / 2;
		System.out.println(resultado);
		
		resultado = resultado + 8;
		System.out.println(resultado);
		
		resultado = resultado % 7;
		System.out.println(resultado);

		
		String primeiroNome = "Esta é";
		String segundoNome = " uma String concatenada.";
		// + como concatenador
		String terceiroNome = primeiroNome + segundoNome;
		System.out.println(terceiroNome);
		
		
		
		resultado++;
		System.out.println(resultado);
		
		//4 -> Pós-incremento
		System.out.println(resultado++);
		// Mesma coisa de:
			// System.out.println(resultado)
			// resultado++
		
		//6 -> Pré-incremento
		System.out.println(++resultado);
		// Mesma coisa de:
			// resultado++
			// System.out.println(resultado)
					
		
	}

}
