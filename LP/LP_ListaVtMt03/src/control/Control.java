package control;

public class Control {
	public int [] ConcatenaVet(int[] veta, int[] vetb) 
	{
		int tamA = veta.length-1;
		int tamB = vetb.length-1;
		int vetc[] = new int[tamA + tamB+2];
		int a = 0;
		int b = 0;
		EncherVet(veta, vetb, tamA, tamB, vetc, tamA+1, a, b);
		return vetc;
	}

	private int [] EncherVet (int [] veta, int [] vetb, int tamA, int tamB, int [] vetc,int tamAf, int a, int b)
	{
		if(tamA<0 && tamB<0) {
			return vetc;
		}
		else if (tamA >= 0) {
			vetc[a] = veta[a];
			a++;
			return EncherVet(veta,vetb,(tamA-1),tamB,vetc,tamAf, a, b);
		}
		
		vetc[tamAf] = vetb[b];
		b++;
		return EncherVet(veta,vetb,tamA,(tamB-1), vetc, tamAf+1, a, b);
		
	}

}

//Criar e coletar valores inteiros nos vetores VT1[3] e VT2[3]. Concatenar
//esses valores em um 3º vetor (VT3[6]) e mostrar os seus dados. P. ex:
//VT1| 1| 2| 3| |VT2| 4| 5| 6| |VT3| 1| 2| 3| 4| 5| 6