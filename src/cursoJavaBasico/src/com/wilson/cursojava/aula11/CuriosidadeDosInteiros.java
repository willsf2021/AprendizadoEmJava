package com.wilson.cursojava.aula11;

public class CuriosidadeDosInteiros {

	public static void main(String[] args) {
		
		
		// int var1 está no intervalo de valores MÁXIMO permitido, o que acontece se eu somar o valor da mesma com int var2 = 100 e der o System.out.println?


		int var1 = 2_147_483_647;
		
		int var2 = 100;
		
		
		System.out.println(var1 + var2);
		
		/*
		 * 
		 O tipo primitivo int admite um intervalo de valores, se eu somar um valor aleatório que exceda este intervalo
		 o valor EXCEDENTE será somado ao INÍCIO do intervalo do int.
		
		 Exemplo, vamos supor que o intervalo do int fosse de -5 a 10 e que eu declarasse 
		 
		 int var1 = 9, 
		 
		 note que o valor máximo admitido é 10, ou seja, estou no 9 ainda, mas se eu somar 
		 
		 int var2 = 2 
		 
		 o valor resultante excederá o intervalo máximo do int em 1,
		 
		 pois 9 + 2 = 11
		 
		 e o valor máximo é 10
		 
		 esse 1 excedente 'voltará' ao início do intervalo incrementando-o.
		 
		 o início é -5, então o resultado será 
		 
		 
		 -5 + 1 que é igual a -4
		 
		 
		
		*/
	}

}
