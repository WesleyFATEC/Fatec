package control;

public class InvertWord {
	public String Invert_Word (String a) {
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
