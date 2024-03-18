package br.com.fatec.wesley.bbsort;

public class Ordenar 
{
	//BobbleSort
	public int [] BbSort (int vet[])
	{
		int tam =  vet.length;
		int a=0;
		int i=0;
		int vezes = 0;
		return SortBbSort (vet,tam,a,i,vezes);
	}
	
	private int [] SortBbSort (int vet[], int tam, int a, int i, int vezes) 
	{
		if(vezes >tam - 2) 
		{
			return vet;
		}
		else if (i>(tam-2))
		{
			i = 0;
			return SortBbSort (vet, tam, a, i , vezes+1);
		}
		else
		{
			if (vet[i] > vet[i+1]) 
			{
				a = vet[i];
				vet[i] = vet[i+1];
				vet[i+1] = a;
			}
			return SortBbSort (vet, tam, a, i+1, vezes);
			}
	}
	
	//MergeSort
	public int [] Merge_Sort (int vet[]) 
	{
		int f = (vet.length)-1;
		int i = 0;
		int [] avet = new int [vet.length];
		Sort(vet, avet, i, f);
		return vet;
		
		
	}
	private static void Sort (int vet [] , int avet[], int i,int f) 
	{
		if ( i < f) {
			
			int meio = (i+f)/2;
			Sort (vet, avet, i , meio);
			Sort (vet, avet, meio+1, f);
			Intercalar(vet, avet, i, meio, f);
		}
	
	}
	private static void Intercalar(int[] vet, int[] avet, int i, int meio, int f)
	{
		for (int index = i; index<=f; index++) 
		{
			avet[index] = vet[index];
		}
		
		int left = i;
		int right = meio+1;
		
		for (int index = i; index<=f; index++) 
		{
			if (left > meio) 
			{
				vet[index] = avet[right++];
			}
			else if (right > f) 
			{
				vet[index] = avet[left++];
			}
			else if (avet[left] < avet[right]) 
			{
				vet [index] = avet [left++];
			}
			else 
			{
				vet [index] = avet [right++];
			}
		}
	}
	
	//QuickSort
	public int [] QuickSort(int vet[])
	{	
		int inicio = 0;
		int fim = vet.length-1;
		SortQuick (vet, inicio, fim);
		return vet;
		
	}
	
	private static void SortQuick (int vet [], int inicio, int fim) 
	{
		if(inicio < fim) 
		{
			int p = partir (vet,inicio,fim);
			SortQuick (vet,inicio,p-1);
			SortQuick (vet, p+1 , fim);
			
		}
	}

	private static int partir(int[] vet, int inicio, int fim) {
		int pivo = vet[inicio];
		int l = inicio+1;
		int r = fim;
		
		while (l<= r) {
			while (l<= r && vet[l]<=pivo) {
				l++;
			}
			while (l<= r && vet[r]>pivo) {
				r--;
			}
			if (l<r) {
				change (vet, l, r);
				l++;
				r--;
			}
		}
		change (vet, inicio, r);
		return r;
	}

	private static void change(int[] vet, int l, int r) {
		int temp = vet[r];
		vet[r] = vet[l];
		vet[l] = temp;
		
	}
}
