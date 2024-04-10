package control;
import main.Principal;

public class Controller {
	
	public int[][] Retirada(int valor, int[][] notasRetiradas, int i) throws Exception {
		int quantSaque = Principal.quantSaque;
		int  cx[][] = Principal.cx;
		int TotalCx = VerifTotalCx(cx);
		if (valor > TotalCx)
		{
			throw new Exception("Não há notas disponiveis para sacar esse Valor");
		}
		if (valor == 0)
		{
			Principal.quantSaque -= 1;
			Principal.cx = cx;
			return notasRetiradas;
		}
			else if (quantSaque <= 0)
			{
				throw new Exception("Quantidade de saque atingiu o limite");
			}
			else if (cx[1][i] > 0 && valor < 10 && valor % 2 == 0)
			{
				i = 0;
				int putvalue = valor / 2;
				notasRetiradas[1][i] += putvalue;
				valor = valor % 2;
				cx[1][i] -= putvalue;
				return Retirada(valor, notasRetiradas, i);
			} 
			else if (valor - notasRetiradas[0][i] == 3 || valor - notasRetiradas[0][i] == 1)
			{
				i--;
				return Retirada(valor, notasRetiradas, i);
			}
			else if (cx[1][i] > 0 && valor >= notasRetiradas[0][i])
			{
				notasRetiradas[1][i] += 1;
				valor -= notasRetiradas[0][i];
				cx[1][i] -= 1;
	
			}
			else if (valor < notasRetiradas[0][i])
			{
				i--;
			}

		

		return Retirada(valor, notasRetiradas, i);

	}

	public int VerifTotalCx(int[][] cx) {
		int soma=0;
		for (int i=0; i <cx[0].length;i++) {
			soma += cx[1][i]*cx[0][i];
		}
		return soma;
	}

	public void EncherCx(int[][] cx, int quant) {
		for (int i = 0; i < cx[0].length; i++) {
			cx[1][i] = quant;
		}
		;

	}

}

