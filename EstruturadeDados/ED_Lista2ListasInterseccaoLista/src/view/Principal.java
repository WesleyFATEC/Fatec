package view;
import br.edu.fateczl.lista.listaObj.Lista;
import controller.Intersect;

public class Principal {

	public static void main(String[] args) throws Exception
	{
		Lista lista1 = new Lista ();
		Lista lista2 = new Lista ();
		Intersect ctrl = new Intersect();
		int vet [] = {10,5,8,1,9,2,4,7,3,6};
		int vet2 [] = {1,2,4,6};
		for (int i = 0; i<vet.length;i++)
		{ 	
			if(lista1.isEmpty())
			{
			lista1.addFirst(vet[i]);
			}
			else {
			lista1.addLast(vet[i]);
			}
		}
		for (int i = 0; i<vet2.length;i++)
		{ 	
			if(lista2.isEmpty())
			{
			lista2.addFirst(vet[i]);
			}
			else {
			lista2.addLast(vet[i]);
			}
		}	
		ctrl.Intersect(lista1,lista2);
		
	}
	
	
}
	

