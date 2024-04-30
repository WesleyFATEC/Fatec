package controller;
import br.edu.fateczl.lista.listaObj.Lista;
public class OrdenarLista {
	
	   public static <T> void ordenar(Lista lista) throws Exception {
	        if (lista.isEmpty() || lista.size() == 1) {
	            return;
	        }

	        int tamanho = lista.size();
	 
	       for (int j =0; j<lista.size();j++) {
	    	   for (int i = 0; i<lista.size()-1; i++) {
	    		   int fixo = (int) lista.get(j);
	    		   int num = (int)lista.get(i);
	    		   if (num>fixo) {
	    			   lista.remove(j);
	    			   lista.add(num, j);
	    			   
	    			   lista.remove(i);
	    			   lista.add(fixo, i);
	    			   
	    		   }
	    		   exibLista(lista);
	    		   System.out.println("");
	    	   }
	       }
	     
	    
	     
	    exibLista(lista);
	    }
	   
	  
	    
	    private static void exibLista(Lista lista)
		{
			for (int i = 0; i< lista.size(); i++) 
			{
				try
				{
					System.out.print(lista.get(i)+" ");
					
				} catch (Exception e)
				{
					System.out.print(e.toString());
				}
			}
		}
	    
}
