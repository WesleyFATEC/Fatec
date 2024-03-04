package control;

public class PosFibo {
	public int Pos_Fibo(int n) {
		if(n <= 2) {
			return 1;
			//condicao de parada: quando n for menor igual 2 retorna 1
		}
		else {
			return Pos_Fibo (n-1) + Pos_Fibo(n-2);
			//  soma os dois números fibonacci anteriores
		}
	}
}

