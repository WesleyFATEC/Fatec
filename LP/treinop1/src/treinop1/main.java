package treinop1;
import java.util.Random;
import javax.swing.JOptionPane;

public class main {
static int mat[][]= new int [7][7];
static Double SalarioBruto , SalarioLiquido;
      public static void main ( String args[ ] ) {
    	 
    	  menu();
  }
      
      static void enchermat(int mat[][])
      {
    	 Random rd = new Random();
    	  int z= mat.length-1;
    	  for (int i=0; i<mat.length; i++) 
    	  {
    		  for (int j=0; j < mat[i].length;j++) 
    		  {	
    			  if(j!=z) 
	    		  {	int num;
	    		  	do {
	    		  		num = rd.nextInt(21)+20;
	    		  	}while(num %2 != 0);
	    		  	
	    			mat[i][j]=num;  
	    		  }	
	    		  else {
	    			 mat[i][j]=99;
	    			 z--;
	    		  }
    			  
    			  
    		  }
    	  } 
      }
    	
      private static void Mostrarmat(int[][] mat)
      {		for (int i=0; i <mat.length;i++) {
    	  		for (int j=0; j<mat[i].length;j++)
    	  		{
				System.out.print(mat[i][j] + " ");
    	  		}
    	  	System.out.println("");
			}
      	}
      
      private static int [] CreateVetOrder(int mat [][]){
    	int vet [] = new int [7];
    	for(int i=0; i<vet.length;i++) {
    		vet[i]=mat[0][i];
    		}
    	vet= SortBbSort (vet);
		return vet;
    	  
      }
      
      private static int[] SortBbSort(int vet[]) {
          for (int i = 0; i < vet.length - 1; i++) {
              for (int j = 0; j < vet.length - i - 1; j++) {
                  if (vet[j] > vet[j + 1]) {
                      int temp = vet[j];
                      vet[j] = vet[j + 1];
                      vet[j + 1] = temp;
                  }
              }
          }
          return vet;
      }
      
      
    private static double SomaRecursiva(int n, int div) {
    	       
    	        if (n == 1) {
    	            return 1.0 / div;
    	        } else {
    	      
    	        	  return (double) n /div + SomaRecursiva(n - 1,div+1);
    	        }
    	    }
	  
      static void menu() {
    	 int opc = 0;
    	 while(opc !=4) {
    		 opc = Integer.parseInt(JOptionPane.showInputDialog("Insira uma opc"));
    		 switch(opc){
    		 case 1:
    			enchermat(mat);
    			break;
    		 case 2:
    			 Mostrarmat(mat);
    			 break;
    		 case 3:
    			 int vet[] = CreateVetOrder(mat);
    			 for(int i=0; i<vet.length; i++) {
    				 System.out.println(vet[i]);
    			 }
    			 break;
    		 case 4:
    			break;
    		 case 5:
    			 
    			 double n = SomaRecursiva (3,1);
    			 System.out.print(n);
    			 break;
    		default:
    			JOptionPane.showMessageDialog(null, "Opcao invalida");
    		 }
    	 }
      }



}

