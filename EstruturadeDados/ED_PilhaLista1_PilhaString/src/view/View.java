package view;

import control.Pilha;

public class View
{
	public static void main(String[] args)
	{
		Pilha p = new Pilha();
		
		for (int i = 0; i < 30; i++) {
			if (p.isEmpty() || i % 3 == 0)
				p.push("a");
			else if (i % 2 == 0 && p.size() == 2) {
				
				try {
					p.push("oba");
					p.push("oba2");
				} catch (Exception e) {
					e.printStackTrace();
				}
				String dado3 = "jiop";
				p.push(dado3);
			} else
				p.push("oba");
		}
		System.out.println(p.size());
	}
}