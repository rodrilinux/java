package com.geretech.cursojava.aula10;

public class Variaveis {

	public static void main(String[] args) {
	
		//conven��o Java
		int idade = 20;
		String nome = "Rodrigo";
		String nomeDoMeuCachorro = "Rock";
		String ano2014 = "2014";
		
		//aceito mas n�o utilizado.
		int _idade;
		int $idade;
		
		//n�o � coven��o Java
		String nome_do_meu_cachorro;
		String NomeDoMeucachorro;
		String nomeDoMeucachorro;

		idade = 25;//atribu�ndo outro valor a vari�vel
		
		System.out.println("Idade = " + idade);
		System.out.println("Nome = " + nome);

		//Eu
		System.out.println("C�o = " + nomeDoMeuCachorro);
		
	}

}
