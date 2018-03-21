package meus_programas;

public class TiposPrimitivos {

	public static void main(String[] args) {
		
		int idade = 37;
		double preco = 12.45;
		char sexo = 'M';
		boolean casado = false;
		
		byte b = 127;// cem
		short s = 32_767;// 32 mil
		int i = 2_147_483_647;// 2 bilhões
		
		
		double d = 1.7976931348623157E+308;// Padrão IEEE 754
		
		
		/* Também podemos representar em forma binária.Quando escrevemos número na 
		 * forma binária é preciso começãr com o prefixo "0b" para mostrar ao 
		 * computador que o número está no formato binário
		*/
		
		byte bb = 0b01010101;// 8 bits / 1 byte
		short ss = 0b0101010101010101;// 16 bits / 2bytes
		int ii = 0b01010101010101010101010101010101;// 32 bits / 4 bytes
		
		
		System.out.println (idade);
		System.out.println (preco);
		System.out.println (sexo);
		System.out.println (casado);
		
			System.out.println (b);
			System.out.println (s);
			System.out.println (i);
			
			
				System.out.println (d);
				
					System.out.println (bb);
					System.out.println (ss);
					System.out.println (ii);
					
					
		

	}

}
