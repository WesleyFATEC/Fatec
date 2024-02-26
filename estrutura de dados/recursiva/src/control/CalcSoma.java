package control;

public class CalcSoma {
	public int CalcularSoma(int n) {
        // Parada: se n for menor ou igual a 0, retorna 0
        if (n <= 0) {
            return 0;
        }
        // Relação de chamada dos passos: chama a função CalcularSoma com n-1
        return n + CalcularSoma(n - 1);
    }
}

