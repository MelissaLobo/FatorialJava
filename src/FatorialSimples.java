public class FatorialSimples {
	public static void main (String [] args){ 
		int fat = 1;
		int valor = 0; //Numero do qual iremos encontrar o fatorial
		if(valor == 0){
			fat = 1;
		}else{
			for(int i = 2; i<= valor; i++){
			fat *= i;
		}
	}
	System.out.println("O fatorial de " + valor + " é igual a " + fat ); 
	}
}
