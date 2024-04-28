package controller;

import br.com.wesley.fatec.Lista.Lista;

public class Controller {
    public static <T> void inverter(Lista<Integer> lista) throws Exception {
        if (lista.isEmpty() || lista.size() == 1) {
            return;
        }

       int tamanho = lista.size();
       
        
        while (tamanho!=0) {
            lista.addLast(lista.get(tamanho-1));
            lista.remove(tamanho-1);
            tamanho --;
        }
        
    exibLista(lista);
    }
    
    private static void exibLista(Lista<Integer> lista)
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


