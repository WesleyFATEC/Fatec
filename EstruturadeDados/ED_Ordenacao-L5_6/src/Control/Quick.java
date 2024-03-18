package Control;
import br.com.fatec.wesley.bbsort.Ordenar;
public class Quick {

	public int [] QuickSort (int [] vet) {
		Ordenar Sort = new Ordenar();
		vet = Sort.QuickSort(vet);
		return vet;
	}
}
