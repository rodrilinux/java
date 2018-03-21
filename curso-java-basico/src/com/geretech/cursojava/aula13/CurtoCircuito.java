package com.geretech.cursojava.aula13;

public class CurtoCircuito {

	public static void main(String[] args) {

		boolean verdadeiro = true;
		boolean falso = false;
		boolean resultado1 = falso & 
				verdadeiro;//& e simples não utilizado no dia a dia da programação
		boolean resultado2 = falso && 
				verdadeiro;// && e curto circuito é utilizado
		System.out.println(resultado1);
		System.out.println(resultado2);
		
		
	}

}
