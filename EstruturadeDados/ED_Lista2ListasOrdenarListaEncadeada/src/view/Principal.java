package view;
import br.edu.fateczl.lista.listaObj.Lista;
import controller.OrdenarLista;

public class Principal {

	public static void main(String[] args) throws Exception
	{
		Lista lista = new Lista ();
		OrdenarLista ctrl = new OrdenarLista();
		int vet [] = {10,5,8,1,9,2,4,7,3,6};
		for (int i = 0; i<vet.length;i++)
		{ 	
			if(lista.isEmpty())
			{
			lista.addFirst(vet[i]);
			}
			else {
			lista.addLast(vet[i]);
			}
		}	
		ctrl.ordenar(lista);
		
	}
	
	
}
	

