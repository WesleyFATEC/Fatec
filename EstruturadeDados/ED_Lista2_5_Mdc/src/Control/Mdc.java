package Control;

public class Mdc {
	public int MultDC(int x,int y) {
		if (x < 1) {
            return y;
        } else if (x >= y) {
            return MultDC(x - y, y);
        } else {
            return MultDC(y,x);
        }
	}
}
