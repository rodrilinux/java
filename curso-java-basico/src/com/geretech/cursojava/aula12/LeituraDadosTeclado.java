package com.geretech.cursojava.aula12;

import java.util.Scanner;

public class LeituraDadosTeclado {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		/*System.out.println("Digite seu nome completo:");
		String nomeCompleto = scan.nextLine();//lendo nomeCompleto
		System.out.println("Seu nome completo �: " + nomeCompleto);//imprimindo nomeCompleto
		
		System.out.println("Digite seu primeiro nome:");
		String primeiroNome = scan.nextLine();
		System.out.println("Seu primeiro nome �: " + primeiroNome);
		
		System.out.println("Digite a sua idade: ");
		int idade = scan.nextInt();
		System.out.println("Sua idade �: " + idade);
		
		System.out.println("Digite a sua altura: ");
		double altura = scan.nextDouble();
		System.out.println("A sua altura �: " + altura);*/
		
		System.out.println("Digite seu primeiro nome, idade, quantidade de filhos, altura e se tem bicho de estima��o: ");
		String primeiroNome = scan.next();
		int idade = scan.nextInt();
		byte qtdFilhos = scan.nextByte();
		float altura = scan.nextFloat();
		boolean temPet = scan.nextBoolean();
		
		System.out.println("Voc� digitou os seguintes valores: ");
		System.out.println("Primeiro nome: " + primeiroNome);
		System.out.println("Idade: " + idade);
		System.out.println("Quantidade de filhos: " + qtdFilhos);
		System.out.println("Altura: " + altura);
		System.out.println("Tem bicho de estima��o?: " + temPet);
		
		
		
		
		
				
				
		
	
		

	}

}
