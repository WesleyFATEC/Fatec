package View;
import Control.Div;
public class View {

	public static void main(String[] args) {
		Div dv= new Div();
		int dividendo = 11;
		int divisor = 5;
		
		int result = dv.Divisao(dividendo, divisor);
		System.out.println(result);
	}

}
