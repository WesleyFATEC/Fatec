package view;
import controller.PalindromoController;
import javax.swing.JOptionPane;
public class Principal {

	public static void main(String[] args) {
		String word ="";
		while(word == "")
			{
			word = JOptionPane.showInputDialog("Digite uma palavra para saber se é palíndromo:");
			}
		PalindromoController pl = new PalindromoController();
		Object[] resultado = pl.invertePalavra(word);
	    String originalWord = (String) resultado[0];
	    String convertWord = (String) resultado[1];
	    boolean isPalindromo = (boolean) resultado[2];
	    
	    if(isPalindromo) {
	    	JOptionPane.showMessageDialog
	    	(null, "Palavra Original: '" + originalWord + "' , palavra invertida: '" + convertWord + "'\n - portanto é um palíndromo!");
        } else {
        	JOptionPane.showMessageDialog
	    	(null, "Palavra Original: '" + originalWord + "' , palavra invertida: '" + convertWord + "'\n - portanto não é um palíndromo!");
        }
	    
	}

}
