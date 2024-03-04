package control;

public class Quant_Alg {
	public int QuantAlg (int n, int a) {
		
		if (n<=0) {
			return 0; //condição de parada sempre q n for igual menor que zero
		}
		else if (n%10 != a) {
			return QuantAlg (n/10,a);// se o resto da divisao de n por 10 difere de /a/ retorna a funcao com n/10
		}
		else {
			return 1 + QuantAlg (n/10,a); // se o resto da divisao de n por 10 é igual /a/, soma 1 e retorna funcao com n/10
		}
	}
}
