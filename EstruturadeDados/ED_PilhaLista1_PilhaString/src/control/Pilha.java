package control;

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
	
	public void push(String valor)
	{
		No elemento = new No();
		elemento.valor = valor;
		elemento.proximo = topo;
		topo = elemento;
	}
	
	public String pop() throws Exception
	{
		if (isEmpty())
			throw new Exception("Pilha vazia");
		String valor = topo.valor;
		topo = topo.proximo;
		return valor;
	}
	
	public String top() throws Exception
	{
		if (isEmpty())
			throw new Exception("Pilha vazia");
		String valor = topo.valor;
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