package br.com.fatec.filaGeneric;

public class No <T>
{
	public T dado;
	public  No<T> proximo;
	
	@Override
	public String toString()
	{
		return String.valueOf(dado);
	}
}

/*

TIPO GENERICO

public class No<T>
{
	public T dado;
	public No<T> proximo;
}

public class Fila<T> ...
	public void insert(T valor) ...
	public T remove() ...
	
	etc.

 */
