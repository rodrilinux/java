package com.geretech.cursojava.aula10;

public class Variaveis {

	public static void main(String[] args) {
	
		//convenção Java
		int idade = 20;
		String nome = "Rodrigo";
		String nomeDoMeuCachorro = "Rock";
		String ano2014 = "2014";
		
		//aceito mas não utilizado.
		int _idade;
		int $idade;
		
		//não é covenção Java
		String nome_do_meu_cachorro;
		String NomeDoMeucachorro;
		String nomeDoMeucachorro;

		idade = 25;//atribuíndo outro valor a variável
		
		System.out.println("Idade = " + idade);
		System.out.println("Nome = " + nome);

		//Eu
		System.out.println("Cão = " + nomeDoMeuCachorro);
		
	}

}
