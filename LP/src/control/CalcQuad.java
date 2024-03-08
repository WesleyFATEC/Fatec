package control;

public class CalcQuad {
	public int [] Calc_quad (int n[], int tam) 
	{	int [] result= new int [tam];
		int index = 0;
		for (int i= n[0]; i<=n[1]; i++) 
		{	
			result[index] = i*i;
			index ++;
		}
		return result;
	}
	
	
	
/*	
	
	public int Calc_quadrec (int [] result, int [] n) {
			if (n < 10 || n > 150) {
			return 0;
		}
		else {
			return Calc_quad(result , n-1);
		}
		 
			
			
		}
	}*/
}
