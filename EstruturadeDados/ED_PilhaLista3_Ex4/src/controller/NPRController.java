package controller;
import br.com.fatec.wesley.Pilha.Pilha;
import controller.Erros.*;

public class NPRController {
	Pilha p = new Pilha();
	public void inserevalor(Pilha p, int valor)
	{
		p.push(valor);
	}
	public int npr (Pilha p, String op) throws PilhaVaziaException, DivisaoPorZeroException, OperacaoInvalidaException, Exception
	{
		int result = 0;
		int num1;
		int num2;
		
		try
		{	
			boolean sizeErr=false;
			switch (op)
			{
			
				case "+":
					if (p.size()<2) {sizeErr=true;}
					num1 = p.pop();
					num2 = p.pop();
					result = num1+num2;
					break;
				case "*":
					if (p.size()<2) {sizeErr=true;}
					num1 = p.pop();
					num2 = p.pop();
					result = num1*num2;
					break;
				case "-":
					if (p.size()<2) {sizeErr=true;}
					num1 = p.pop();
					num2 = p.pop();
					result = num2-num1;
					break;
				case "/":
					if (p.size()<2) {sizeErr=true;}
					num1 = p.pop();
					num2 = p.pop();
					if (num1 == 0) 
					{
						throw new DivisaoPorZeroException("Divisão por zero");
		            }
					result = num2/num1;
					break;
				default:
					throw new OperacaoInvalidaException("Operação inválida: " + op +" Insira apenas números ou operações: + - * /");
			}
			
			 
			
			if (sizeErr) 
			{
				throw new PilhaVaziaException("A operação " + op + " espera ao minimo dois valores na pilha que contém apenas um ou nenhum Valor");
			}
			
		}
		
		catch (PilhaVaziaException | DivisaoPorZeroException | OperacaoInvalidaException e)
		{
            throw e; 
        }
		catch (Exception e)
		{
			System.out.println(e);
        }
		p.push(result);
		return result;
	}
}
