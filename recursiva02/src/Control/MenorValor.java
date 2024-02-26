package Control;

public class MenorValor {
	public static int MinValue(int[] vetor, int tamanho) {
        // Parada: se o tamanho do vetor for 1, retorna o valor na posição 0
        if (tamanho == 0) {
            return vetor[0];
        }
        // Chamada dE passos: compara o valor na posição atual com o menor valor encontrado
        return Math.min(vetor[tamanho], MinValue(vetor, tamanho - 1));
    }
}
