package com.wilson.cursojava.aula19;

import java.util.Random;

public class Matrizes {

	public static void main(String[] args) {
		
		Random random = new Random();
		
		int qtdAlunos = 30;
		
		double[][] notasPorAluno = new double[qtdAlunos][4];
		double[] somaTotal = new double[notasPorAluno.length];
		
		System.out.println(notasPorAluno.length);
		
		
		for(int i = 0; i < notasPorAluno.length; i++) { // Primeiro Loop itera sobre a o Eixo X, ou seja, dos Alunos
			
			System.out.println("Aluno " + (i + 1));
			
			for(int h = 0; h < notasPorAluno[i].length; h++) { // Segundo Loop itera sobre a o Eixo Y, ou seja, das Notas
				
				notasPorAluno[i][h] = random.nextInt(10);
					
				somaTotal[i] += notasPorAluno[i][h];
				
				System.out.println((h + 1) + "ª Nota: " + notasPorAluno[i][h]);
			}
			
			System.out.println("Média do Aluno " + (i +  1) + "= " + (somaTotal[i] / notasPorAluno[i].length));
		}
	}
}
