package Control;

public class Div {
	public int Divisao(int dividendo , int divisor) {
		if (dividendo<divisor) {
			return dividendo;
		}
		return Divisao(dividendo-divisor,divisor);
	}
}
