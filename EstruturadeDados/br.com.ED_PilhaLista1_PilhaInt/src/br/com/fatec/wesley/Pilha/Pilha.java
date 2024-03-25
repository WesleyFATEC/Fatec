package br.com.fatec.wesley.Pilha;

public class Pilha
{
	No topo;
	
	public Pilha()
	{
		topo = null;
	}
	
	public boolean isEmpty()
	{
		return (topo == null);
	}
	
	public void push(int valor)
	{
		No elemento = new No();
		elemento.valor = valor;
		elemento.proximo = topo;
		topo = elemento;
	}
	
	public int pop() throws Exception
	{
		if (isEmpty())
			throw new Exception("Pilha vazia");
		int valor = topo.valor;
		topo = topo.proximo;
		return valor;
	}
	
	public int top() throws Exception
	{
		if (isEmpty())
			throw new Exception("Pilha vazia");
		int valor = topo.valor;
		return valor;
	}
	
	public int size()
	{
		int cont = 0;
		No aux = topo;
		
		while (aux != null) {
			cont++;
			aux = aux.proximo; 
		}
		return cont;
	}
}