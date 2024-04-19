package controller;

import java.util.Random;

public class Controller {
	public void ordena(int [][] mat ) {
		int vet [] = new int [100];
		int k=0;
		for (int a=0; a< mat.length; a++)
		{
			for (int i=0; i<mat[a].length;i++) 
			{
									 
				vet[k]=mat[a][i];
				k+=1;
				
			}
		}
			for (int j=0; j<vet.length;j++) {
				for (int i=0; i<vet.length-1;i++)
				{
					if(vet[i] > vet[i+1])
					{
				 		int aux = vet[i];
				 		vet[i]= vet[i+1];
				 		vet[i+1]=aux;
					}
				}
			}
			k=0;
			
			
				for (int i=0; i<mat.length;i++)
				{
					for (int j = 0; j<mat[i].length;j++)
					{
						mat[i][j]=vet[k];
						k+=1;
					}
				}
			
		
		
		for (int i=0; i<mat.length;i++) {
			for (int j=0; j<mat[0].length;j++) {
				System.out.print(mat[i][j] + " ");
			}
			System.out.println("");
			}
		
		}
	
	
	public void carrega(int [][] mat) {
			Random rd = new Random();
			int num;
			for (int i=0; i<mat.length; i++) {
				for (int j=0; j<mat[0].length;j++) {
					
					num = rd.nextInt(301);
					mat[i][j]=num;
					if (num %4==0 & num %5==0) {
						System.out.print(num + " ");
					}
				}
			}
			
		}
	
	public static int Rec(int n) {
		if(n == 1)
		{
			return 2;
			
		}
		else
		{
			int pot = Pot(n);
			return pot+Rec(n-1);
		}
	}
	
	private static int Pot(int n) {
		if(n<=1) {
			return 2;
		}
		else {
			return 2*Pot(n-1);
		}
	}
}
