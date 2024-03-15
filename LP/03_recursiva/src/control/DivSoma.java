package control;

public class DivSoma {
	
	public DivSoma() {
		super();
	}
	
	public double Div_Soma (int num) {
		if (num >= 1) {
			return 1/num +  Div_Soma(--num);
		}
		else {
			return 1;
		}
	}
}
