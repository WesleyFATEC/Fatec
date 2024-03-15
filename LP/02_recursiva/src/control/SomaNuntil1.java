package control;

public class SomaNuntil1 {
	public int Soma_N_Until1 (int num) {
		if(num < 1 ) {
			return num;
		}
		else {
			return num + Soma_N_Until1(num-1);
		}
	}
}
