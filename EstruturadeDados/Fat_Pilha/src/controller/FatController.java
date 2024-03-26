package controller;
import br.edu.fateczl.pilhaint.*;

public class FatController {
	Pilha stack = new Pilha();
	public int Fatorial(int valor) {
		while (valor > 1) {
			int n1;
			
			if (stack.isEmpty()) 
			{
				stack.push(valor);
				valor--;
			}
			
			else 
			{
			  try 
			  {
	           n1 = stack.pop();
	           stack.push(valor*n1);
	               
	          } 
			  catch (Exception e)
			  {
	                System.out.println("erro");
	          }
			  
			 valor--;
			} 
		}
		
		int result=0;
		try 
		  {
	           result = stack.top();
	          	               
	          } 
			  catch (Exception e)
			  {
	                System.out.println("erro");
	          }
		
		return result;
	}
}
