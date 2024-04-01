package controller;
import control.Pilha;
public class PalindromoController {
	public Object[] invertePalavra(String word) {
		Pilha stack = new Pilha();
		String InvertWord = "";
		 for (int i = 0; i < word.length(); i++) 
		 {
	            stack.push(String.valueOf(word.charAt(i)));
	     }
		
		 while (!stack.isEmpty())
		 {
			 	try 
			 	{
			 		InvertWord += (stack.pop());
			 	}
			 	catch(Exception e)
			 	{
			 		System.out.println(e +"erro ao tentar inverter a palavra");
			 	}
	            
	     };
		 
	    boolean IsPalindromo = comparaPalavras(InvertWord,word);
	    Object[] resultado = {word, InvertWord, IsPalindromo};
        return resultado;
	}
	
	private boolean comparaPalavras (String invertWord, String word) {
		return invertWord.equals(word);
	}

}

