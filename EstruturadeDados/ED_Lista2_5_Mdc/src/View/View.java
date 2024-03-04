package View;
	import Control.Mdc;
public class View {
	public static void main(String[] args){
		Mdc mdc = new Mdc();
		int x = 20;
		int y = 27;
		int result = mdc.MultDC(x, y);
		
		System.out.println(result);
	}
}
