package controller;
import br.edu.fateczl.lista.listaObj.Lista;
public class Intersect {
	
	   public static <T> void Intersect(Lista lista1, Lista lista2) throws Exception {
	        if (lista1.isEmpty() && lista2.isEmpty()) {
	            return;
	        }
	        
	        int newtam = lista1.size() + lista2.size();
	        
	        Lista listaI = new Lista();
	        
	        for (int i=0; i<newtam; i++) {
	        	if (listaI.isEmpty()) {
	        		listaI.addFirst(lista1.get(0));
	        	}
	        	if (i%2 == 0) {
	        		listaI.addLast(lista1.get(i-1));
	        	}
	        	else {
	        		listaI.addLast(lista2.get(i));
	        	}
	        	
	        }
	 
	    
	    		   exibLista(listaI);
	    		   System.out.println("");
	    	   
	       
	     
	    
	     
	   exibLista(listaI);
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
