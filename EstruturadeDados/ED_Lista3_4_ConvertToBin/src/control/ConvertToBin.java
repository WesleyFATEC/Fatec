package control;

public class ConvertToBin {
	public String Revert(int n) {
		String a = Convert_ToBin(n);
		return Invert_Word(a);
	}
	
	public String Convert_ToBin(int n) {
		if(n <= 1) {
			String s = String.valueOf(n);
			return s;
			//condicao de parada: quando n for menor igual 1 retorna n
		}
		else {
			String s = String.valueOf(n%2);
			return s + Convert_ToBin(n/2);
			//seleciona o resto da divisao de n por 2 e chama a funcao com n/2
		}
	}
	
	private String Invert_Word (String a) {
		if (a.length()==1) {
			return a;
			// condicao de parada: Quando a palavra contida em /a/ conter apenas uma letra, retorna a letra.
		}
		else {
			return a.substring(a.length() - 1) + Invert_Word(a.substring(0, a.length()-1));
			// seleciona a ultima letra de /a/ e concatena com o retorno da funcao que é chamada retirando a ultima letra de /a/
		}
	}
}

