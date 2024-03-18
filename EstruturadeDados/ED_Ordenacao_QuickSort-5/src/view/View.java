package view;
import control.Control;
public class View {

	public static void main(String[] args) {
		int [][] exerc = {
		{74,20,74,87,81,16,25,99,44,58},
		{44,43,42,41,40,39,38},
		{31,32,33,34,99,98,97,96}
		};
		
		Control or = new Control ();
		int j = 0;
		while (j<3) {
			int vet []= exerc[j];
			
			int result []= or.Quick_Sort(vet);
			System.out.println("\n Exercicio "+ (j+1) + " Ordenado:");
			for (int i=0; i<vet.length ;i++)
			{
				System.out.print(result[i] + " ");
			}
			
			j++;
		}
		
		
	}

}
