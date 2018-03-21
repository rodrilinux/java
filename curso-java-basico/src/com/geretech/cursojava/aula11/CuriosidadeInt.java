package com.geretech.cursojava.aula11;

public class CuriosidadeInt {

	public static void main(String[] args) {
		
		int var1 = 2147483647;//valor máximo de um inteiro se colocar 2147483648 já dá erro

		int var2 = 1;
		
		System.out.println(var1 + var2); 
//soma 2147483647 + 1 = o próximo valor na "roleta" se exceder o limite será o menor valor ou seja = -2147483648

		
		/*Inteiro maior valor = 2147483647
		 * 
		 * Inteiro meno valor = -2147483648
		 */
	}

}
