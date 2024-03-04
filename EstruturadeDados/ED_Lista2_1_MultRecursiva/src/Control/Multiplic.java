package Control;

public class Multiplic {
	public int Mult (int a, int b) {
		if (a < 1) {
			return 0;
		}
		return b + Mult(a-1, b);
	} 
}
