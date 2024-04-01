package controller;

import br.com.fatec.wesley.Pilha.Pilha;

public class Control {
	public int AIter(int[] vet) 
	{	Pilha stack = new Pilha();

		for (int i = 0; i < vet.length; i++) 
		{
			if (vet[i] >= 0) 
			{
				stack.push(vet[i]);
			} 
			else 
			{
				if (stack.size() >= 2) 
				{
					try 
					{
						int num1 = stack.pop();
						int num2 = stack.pop();
						int soma = num1 + num2;
						stack.push(vet[i]);
						stack.push(soma);
					}
					catch (Exception e)
					{
						System.out.println(stack.size());
					}

				}

			}
		}
		return stack.size();

	}

}
