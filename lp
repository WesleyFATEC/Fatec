package Control;

import java.util.Calendar;


public class AnoBi6 
{
	
	public class Poup(int ano, int mes)
	{
		private boolean Bi6(int ano) 
		{
			if (ano%4 == 0)
			{
				return true;
			}
			else
			{
				return false;
			}
		
		}
	
		Calendar c = Calendar.getInstance();
		int anoAt = c.get(Calendar.YEAR);
		int mesAt = c.get(Calendar.MONTH);
		
		double invst;
		double jrs = 0.0085;
		double parc = 20;
		double boni;
		double totbon;
		double [] result = new double[4];
		
		// 0 investimento, 1 total em juros, 2 total bonificacao
		
		for (int i = ano; i>= anoAt; i++ ) 
		{
		
			for (int index = mes; index >= 12; index++ ) 
			{	
				
				jrs = jrs * result[0];
				result[1] += jrs;
				result[0] += (jrs + parc);
			}
			
			if (Bi6(ano) == true) 
			{
				double bon = 0.03 * result[0];
				result[2] += bon;
				result[0] += bon;
				
			};
			
		}
	
	 return result ;
			
	}	
		

}


/*
public class aplic (int ano, int mes, int anoAt, int mesAt) {
	if (mesAt > mes & anoAt >= ano) {
		return 0;
	}
	
	else if (b6 == true) {
		
	}
	
	else {
		
	}



	double vlr;
	int ent;
	double jrs;*/




package View;
import javax.swing.JOptionPane;
import Control.View;

public class View {
	public static void main(String[] args) {
		AnoBi6 pp = new AnoBi6();
		        int ano = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano de nascimento:"));
		        int mes = Integer.parseInt(JOptionPane.showInputDialog("Digite o mes de nascimento:"));
		        
		        double results = pp.Poup(ano,mes);
		        
		        

		        System.out.println(results);
		    
		}

}
