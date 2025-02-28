package com.wilson.cursojava.aula19;

public class Vetores {

	public static void main(String[] args) {
		
		
		//Exemplo: Calcular a média de temperatura com base em todos os dias do ano.
		
		double tempDiaria001 = 31.3;
		double tempDiaria002 = 32;
		double tempDiaria003 = 33.7;
		double tempDiaria004 = 34;
		double tempDiaria005 = 33.1;
		//...
		
		double total = 0;
		
		double[] temperaturaDiaria = new double[365];
		
		// Boa prática declarar o tipo da variável e já colocar os colchetes indicativos de Array => double[], String[], int[], etc, e só depois o nome da variável.
		
		/*
		 * for(int i = 0; i < temperaturaDiaria.length; i++) { temperaturaDiaria[i] = i;
		 * total += temperaturaDiaria[i]; }
		 */
		
		for(double temp : temperaturaDiaria) {
			System.out.println(temp);
		}
		
		
		System.out.println("Média da temperatura anual é: " + (total / temperaturaDiaria.length));

	}

}
