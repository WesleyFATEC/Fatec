package control;

public class Soma1FatN {
	public double Soma_1FatN(int x) {
		if (x<=1) {
			return 1;
			//condicaod de parada quando x o divisor for menor igual 1 retorna 1 e desenrola a funcao
		}
		else {
			return 1/ Fatorial(x) + Soma_1FatN(x-1);
			//divide 1 pelo fatorial de x e retorna a funcao com x-1;
		}
	}	
	private double Fatorial (int n) {
		if(n <= 1) {
			return 1;
			//condicao de parada: quando n for menor igual 1 retorna 1
		}
		else {
			return n*Fatorial(n-1);
			//  multiplica n por n-1 ate o ponto de parada
		}
	}
	}


