package Control;

import java.util.Calendar;


public class AnoBi6 
{
	
	public double [] Poup(int ano, int mes)
	{	Calendar c = Calendar.getInstance();
		int anoAt = c.get(Calendar.YEAR);
		int mesAt = c.get(Calendar.MONTH)+1;
		
		
		double jrs = 0.0085;
		double parc = 20;
		double jrsValue;
		double [] result = new double[4];
		int mesesano = 12;
		// 0 investimento, 1 total em juros, 2 total bonificacao
		
		for (int i = ano; i<= anoAt; i++ ) 
		{	
			if (i != ano)
			{
				mes = 1;
			}
			if (i == anoAt) 
			{
				mesesano = mesAt;
			}
			
			for (int index = mes; index <= mesesano; index++ ) 
			{	
				jrsValue = jrs * result[0];
				result[1] += jrsValue;
				result[0] += (jrsValue + parc);
			}
			
			if (Bi6(i)) 
			{
				double bon = 0.03 * result[0];
				result[2] += bon;
				result[0] += bon;
				
			};
			
		}
		
	 result [3] = result[0]-(result[1]+result[2]);
	 return result ;
			
	}
	
	 private boolean Bi6(int ano) {
	        return ano % 4 == 0;
	    }

}
