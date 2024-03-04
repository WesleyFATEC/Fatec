package Control;

public class Quant_Par {
	public int Qp (int [] vet, int tam) {
		if (tam < 0) {
			return 0;
		}
		else if (vet[tam]%2 != 0) {
			return Qp (vet, tam-1);
		}
		else {
			return 1 + Qp (vet, tam-1);
		}
	}
	
}
