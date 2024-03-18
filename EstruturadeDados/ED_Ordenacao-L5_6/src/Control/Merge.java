package Control;
import br.com.fatec.wesley.bbsort.Ordenar;
public class Merge {
	public int [] MergeSort (int [] vet) {
		Ordenar Sort = new Ordenar();
		vet = Sort.Merge_Sort(vet);
		return vet;
	}
}
