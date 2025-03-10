package com.wilson.cursojava.aula19.labs;

public class ExerciciosVetores {

	public static void main(String[] args) {
		// Para execução de determinado exercício apenas "descomente" o código referente
		// a ele.

		/*
		 * 
		 * Ex1 - Criar um vetor A com 5 elementos inteiros. Construir um vetor B de
		 * mesmo tipo e tamanho e com os "mesmos" elementos do vetor A, ou seja, B[i] =
		 * A[i].
		 * 
		 */

		// Início da Resolução do Exercício 1

		/*
		 * int[] a = new int[5]; int[] b = a;
		 * 
		 * for (int i = 0; i < a.length; i++) { a[i] = i + 2; b[i] = a[i];
		 * System.out.println("Vetor A: " + a[i]); System.out.println("Vetor B: " +
		 * b[i]); }
		 */
		  
		  
		/*
		 * for (int temp : a) { System.out.println("Vetor B: " + temp); }
		 */
		  
		
		// Fim da Resolução do Exercício 1

		/*
		 * 
		 * Ex2 - Criar um vetor A com 8 elementos inteiros. Construir um vetor B de
		 * mesmo tipo e tamanho e com os elementos do vetor A multiplicados por 2, ou
		 * seja: B[i] = A[i] * 2
		 * 
		 */

		// Início da Resolução do Exercício 2

		/*
		 * int[] a = new int[8];
		 * 
		 * int[] b = a;
		 * 
		 * for(int i = 0; i < a.length; i++) {
		 * 
		 * a[i] = i * 4; // Atribuindo de forma automática valores às posições do Vetor
		 * A. System.out.println("Vetor A: " + a[i]); // Mostrando o Vetor A; b[i] =
		 * a[i] * 2; // Núcleo do exercício, cada posição do Vetor B é igual a posição
		 * equivalente do Vetor A multiplicado por 2. }
		 * 
		 * // Mostrando o Vetor B
		 * 
		 * for(int temp : b) { System.out.println("Vetor B: " + temp); }
		 */
		
		
		
		// Fim da Resolução do Exercício 2
		
		
		/*
		 * 
		 * Ex3 - Criar um vetor A com 15 elementos inteiros. Construir um vetor B de
           mesmo tipo e tamanho, sendo que cada elemento do vetor B deverá
		   ser o quadrado do respectivo elemento de A, ou seja:
           B[i] = A[i] * A[I].
		 * 
		 */

		// Início da Resolução do Exercício 3
		
		
		
		/*
		 * int[] a = new int[15];
		 * 
		 * int[] b = new int[15];
		 * 
		 * // Atribuindo valores ao Vetor A e Vetor B e mostrando o Vetor A;
		 * 
		 * System.out.println("Vetor A");
		 * 
		 * for (int i = 0; i < a.length; i++) { a[i] = i * 3; b[i] = a[i] * a[i];
		 * System.out.println("Posição " + (i + 1) + ": " + a[i]); }
		 * 
		 * // Mostrando o Vetor B
		 * 
		 * System.out.println("Vetor B");
		 * 
		 * for (int i = 0; i < b.length; i++) {
		 * 
		 * System.out.println("Posição " + (i + 1) + ": " + b[i]); }
		 */
	
	
		
		
		// Fim da Resolução do Exercício 3
		
		/*
		 * 
		 * Ex4 - Criar um vetor A com 15 elementos inteiros. Construir um vetor B de
		   mesmo tamanho, sendo que cada elemento do vetor B deverá ser a
		   raiz quadrada do respectivo elemento de A, ou seja:
		   B[i] = sqrt(A[i]).
		 * 
		 */
		
		// Início da Resolução do Exercício 4
		
		
		  double[] a = new double[15];
		  
		  double[] b = new double[15];
		  
		 // Atribuindo valores ao Vetor A e Vetor B e mostrando o Vetor A;
		  
		  System.out.println("Vetor A");
		  
		 for (int i = 0; i < a.length; i++) { 
			 a[i] = i * i;
			 
			 b[i] = Math.sqrt(a[i]);
			 
			 System.out.println("Posição " + (i + 1) + ": " + a[i]); 
		 }
		  
		 // Mostrando o Vetor B
		  
		  System.out.println("Vetor B");
		  
		  for (int i = 0; i < b.length; i++) {
		  
		  System.out.println("Posição " + (i + 1) + ": " + b[i]); 
		  
		  }
		 
	
		
		// Fim da Resolução do Exercício 4

	}

}
