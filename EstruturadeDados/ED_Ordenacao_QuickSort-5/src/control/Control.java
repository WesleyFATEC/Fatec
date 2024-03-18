package control;
import br.com.fatec.wesley.bbsort.Ordenar;

public class Control {
	public int [] Quick_Sort(int vet[]) 
	{	Ordenar rd = new Ordenar();
		vet = rd.QuickSort(vet);
		return vet;
	}
}
