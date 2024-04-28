package view;
import br.com.wesley.fatec.Lista.Lista;
import controller.Controller;

public class Principal {

	public static void main(String[] args) throws Exception
	{
		Lista lista = new Lista ();
		Controller ctrl = new Controller();
		int vet [] = {3,5,18,12,9,7,6,2,13,4,16};
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
		ctrl.inverter(lista);
		
	}
	
	
}
	


