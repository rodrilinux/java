package com.geretech.cursojava.aula13;

public class OperadoresAritimeticos {

	public static void main(String[] args) {
		
		int resultado = 1 + 2;
		System.out.println(resultado);
		
		resultado = resultado -1;
		System.out.println(resultado);
		
		resultado = resultado *2;
		System.out.println(resultado);
		
		resultado = resultado /2;
		System.out.println(resultado);
		
		resultado = resultado + 8;
		System.out.println(resultado);
		
		resultado = resultado % 7;
		System.out.println(resultado);
		
		String primeiroNome = "Esta é";
		String segundoNome = " uma String concatenada.";
		String terceiroNome = primeiroNome + segundoNome;
		System.out.println(terceiroNome);
		
		resultado = resultado +1;//até aqui resultado vale 3 + 1 =4
		System.out.println(resultado);
		
		resultado++;//Até aqui resultado vale 4 ++ =5 (++ adiciona 1)
		System.out.println(resultado);
		
		//Até aqui o valor do resultado é 5
		System.out.println(resultado++);//primeiro imprimir o valor do resultado e depois adicionar 1 a ele
		//mesma coisa que
		//System.out.println(resultado);
		//resultado = resultado + 1;
		//resultado +=1;
		
		System.out.println(++resultado);//primeiro adiciona o valor a string pra depois fazer o output dela, tá valendo 6 =7
		//mesma coisa que
		//resultado +=1;
		//System.out.println(resultado);
		
		resultado--;//tira 1 =6
		System.out.println(resultado);
		
		System.out.println(resultado--);//primeiro imprime e depois retira 1 (Vai imprimir 6 e tirar 1 = 5)
		System.out.println(--resultado);//primeiro retira1 e depois imprime =4
		
		
	}

}
