package control;

public class Soma_until100 {
	public int SomaUntil100 (int n) {
		if (n >= 100) {
			return n;
		}
		
		return n + SomaUntil100(n+1);
				
	}
}
