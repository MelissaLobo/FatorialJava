/**
 * @author MelissaLobo mellobomel@gmail.com
 */

import javax.swing.JOptionPane;


public class FatorialRecursivoInterativo {
	public static void main(String[] args) {  
        String numero = JOptionPane.showInputDialog("Calcular fatorial do numero:" );  
        int num = Integer.parseInt(numero);       
        JOptionPane.showMessageDialog(null,"Fatorial de " + num + " é " + fatorialDoNumero(num));         
    }  
      
    private static long fatorialDoNumero(int num) {  
        int anterior = num-1;  
        long fatorialDesteNumero = 0;  
          
        if (num <= 1) return 1;  
            else fatorialDesteNumero =  num * fatorialDoNumero(anterior); // Aqui está a recursividade no programa. O método "fatorialDoNumero" é chamado várias vezes dentro dele mesmo.  
          
        return fatorialDesteNumero;  
    }  
}
