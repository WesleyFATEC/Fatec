package provap1;
import java.util.Random; // erro nao utilizei java mas javax
import javax.swing.JOptionPane;///ERRO nao coloquei swing
public class Principal {
static int mat [][]=new int [10][10];

	public static void main(String[] args) {
		int opc = 9;
		while(opc != 6) {
			opc = Integer.parseInt(JOptionPane.showInputDialog("inisra opc\n"+
					"1- carrega e mostra divisiveis por4 e 5\n"+
					"2- ordenar e mostra\n"+
					"5- exercício recursiva com n valendo 5\n"+
					"9- Sair"));
			switch(opc) // dúvida se tive a atenção de colocar opc dentro de ()
			{
			case 1:
				carrega();
			break;
			case 2:
				ordena();
			break;
			case 5:
				int result = Rec(5);
				System.out.println(result);
			case 6:
			break;
			default: 
				System.out.println("insira valor valido");
			}
		}
		
		

	}

	static void ordena() {
		for (int a=0; a< mat.length; a++) {
			for (int i=0; i<mat.length-1;i++) {
				for (int j = 0; j<mat.length-i-1;j++) {
					if (mat[a][j] > mat[a][j+1]) {
						int aux = mat[a][j];
						mat[a][j] = mat [a][j+1];
						mat[a][j+1] = aux;
					}
				}
			}
		}
		
		for (int col=0; col< mat.length; col++) {
			for (int i=0; i<mat.length-1;i++) {
				for (int j = 0; j<mat.length-i-1;j++) {
					if (mat[j][col] > mat[j+1][col]) {
						int aux = mat[j][col];
						mat[j][col] = mat [j+1][col];
						mat[j+1][col] = aux;
					}
				}
			}
		}
		for (int i=0; i<mat.length;i++) {
			for (int j=0; j<mat[0].length;j++) {
				System.out.print(mat[i][j] + " ");
			}
			System.out.println("");
			}
		}
	
	static void carrega() {
			Random rd = new Random();
			int num;
			for (int i=0; i<mat.length; i++) {
				for (int j=0; j<mat[0].length;j++) {
					
					num = rd.nextInt(301);
					mat[i][j]=num;
					if (num %4==0 & num %5==0) {
						System.out.print(num);
					}
				}
			}
			
		}
	
	public static int Rec(int n) {
		if(n == 1)
		{
			return 2;// nao retornei 2 apaguei e retornei 0
			
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