package com.geretech.cursojava.aula13;

public class CurtoCircuito {

	public static void main(String[] args) {

		boolean verdadeiro = true;
		boolean falso = false;
		boolean resultado1 = falso & 
				verdadeiro;//& e simples n�o utilizado no dia a dia da programa��o
		boolean resultado2 = falso && 
				verdadeiro;// && e curto circuito � utilizado
		System.out.println(resultado1);
		System.out.println(resultado2);
		
		
	}

}
