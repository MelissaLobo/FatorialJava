/**
 * @author MelissaLobo mellobomel@gmail.com
 */

public class FatorialSimples {
	
	public static void main (String [] args){ 
		
		int fat = 1;
		int valor = 8; //Numero do qual iremos encontrar o fatorial
		
		for(int i = 2; i<= valor; i++){
			fat *= i;
		}
		
		System.out.println("O fatorial de " + valor + " é igual a " + fat );  

	}
	
}
