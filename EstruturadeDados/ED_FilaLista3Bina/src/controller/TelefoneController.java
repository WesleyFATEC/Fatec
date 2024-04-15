package controller;
import br.com.fatec.filaGeneric.Fila;

public class TelefoneController {
	
	public static void InsereLigacao(Fila f, String tel) {
		f.insert(tel);
	}
	
	public static void consultaLigacoes(Fila f) throws Exception {
		if (f.isEmpty()) {
			throw new Exception("Não há ligações a serem exibidas");
		}
		String show = (String) f.remove();
		System.out.println(show);
	}
}
