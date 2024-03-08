package view;
	import control.CalcQuad;
public class View {
	public static void main(String[] args) 
	{
		CalcQuad cq= new CalcQuad();
		int [] n = {10,150};
		int tam = n[1]-n[0]+1;
		int [] result = new int [tam]; 
		result = cq.Calc_quad(n, tam);
		for (int i = 0;i < tam; i++) {
			System.out.println(result [i]);
		}
	}
}
