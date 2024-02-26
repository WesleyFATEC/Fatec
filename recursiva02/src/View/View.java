package View;
import Control.MenorValor;

public class View {

	
	public static void main(String[] args) {
			MenorValor mn = new MenorValor();
	        int[] vetor = {5, 1 , 9, 8};
	        int tamanho = vetor.length;

	        int menor = mn.MinValue(vetor, tamanho - 1);
	        System.out.println("O menor valor no vetor é: " + menor);
	    }

	

}
