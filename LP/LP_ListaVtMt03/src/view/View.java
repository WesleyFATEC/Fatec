package view;
import control.Control;
public class View {

	public static void main(String[] args) {
		Control cl = new Control();
		int veta [] = {1,2,3,5};
		int vetb [] = {1,2,3,9,7};
		int result [] = cl.ConcatenaVet(veta, vetb);
		
		
		for (int i = 0; i < result.length; i++)
		{
			System.out.println(result[i]);
		}
	}

}
