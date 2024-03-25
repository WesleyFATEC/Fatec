package controller;
import br.com.fatec.wesley.Pilha.Pilha;
public class ConverteController {
	Pilha pl = new Pilha();

	public String Convert_ToBin(int n) {
		String result = "";
		while (n > 0) 
		{
			int resto = n%2;
			pl.push(resto);
			n /=2;
		}
				
		while (!pl.isEmpty()) {
            try {
            	result = result + pl.top();
                pl.pop();
            } catch (Exception e) {
                
            }
        }

        return result;
		
		
	}
}

