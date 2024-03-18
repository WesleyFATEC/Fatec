package View;
import Control.*;
public class view {

	public static void main(String[] args) {
		int[] VetBbS = new int [1500];
		int pos = VetBbS.length-1;
		
		for (int i=0 ; i < 1500; i++) {
			VetBbS [i]= pos;
			pos--;
		}
		int[] vetMergeSort = VetBbS.clone();
	    int[] vetQuickSort = VetBbS.clone();
			
		Control.Bb BbS = new Control.Bb();
		long inicio = System.nanoTime();
		int [] result = BbS.BubbleSort(VetBbS);
		long fim = System.nanoTime();
		
		System.out.println((fim-inicio)/1000 + "ms com BubbleSort");
		
		
		Control.Merge Mrg = new Control.Merge();
		inicio = System.nanoTime();
		result = Mrg.MergeSort(vetMergeSort);
		fim = System.nanoTime();
		
		System.out.println((fim-inicio)/1000 + "ms com MergeSort");
		
		Control.Quick Quick = new Control.Quick();
		inicio = System.nanoTime();
		result = Quick.QuickSort(vetQuickSort);
		fim = System.nanoTime();
		
		System.out.println((fim-inicio)/1000+ "ms com QuickSort");
	}

}
