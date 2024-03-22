
//Criar e coletar um vetor [50] inteiro. Calcular e exibir:
//a. A média dos valores entre 10 e 200;
//b. A soma dos números ímpares.

package control;
@Overload
public class Control {
	static int quant;
	public int [] Popular (int[] vet) 
	{	
		int tam = vet.length-1;
		for (int i= 0; i<=tam; i++) {
			if(i%3 == 0) 
			{
				vet[i]= i*3;
			}
			else 
			{
				vet[i]= i;
			
			}
		}
		
		//int media = Media(vet, tam);
		//if (media > 0) {
		//	media= media/quant;
		//}
		//int somaimpar = SomaImpar (vet, tam);
		//int result [] = new int [] {media, somaimpar};
		return vet;
		
	}
	
	public int CalcMedia(int[] vet,int tam) 
	{
		int media = Media(vet, tam);
		if (media > 0) {
			media= media/quant;
		}
		return media;
	}
	
	private int Media(int[] vet,int tam)
	{
		if (tam<0)
		{
			return 0 ;
		}
		
		else if (vet[tam]>10 & vet[tam]<200) 
		{
			quant++;
			return vet[tam] + Media(vet, tam-1);
		}
		return  Media(vet ,tam-1);
	}
	
	public int SomaImpar(int [] vet, int tam)
	{
		if (tam<0) 
		{
			return 0;
		}
		else if (vet[tam]%2 != 0)
		{
			return vet[tam]+SomaImpar(vet, tam-1);
		}
		
		return SomaImpar(vet, tam-1);
	}
	
}

