/**
 * @author MelissaLobo mellobomel@gmail.com
 */

class Fatorial {
	int fat(int n){
		if(n<=1) //condi��o b�sica
			return 1;
		
		int r = fat(n-1)*n;
		return r;
		}
}
 
	public class FatorialRecursivo {
		
		
		public static void main (String [] args){ 
			System.out.println(new Fatorial().fat(7));
		
	}

}
