package control;

public class Fatorial {
	public int CalcFatorial (int n) {
		// Condição de parada: se n for 1, retorna 1
        if (n == 0 || n == 1) {
            return 1;
        }
        return n*CalcFatorial(n-1);
	}
}
