package control;
import control.Control;
import javax.swing.JOptionPane;
public class Menu {
	
	public static void Create () {
		Control cl = new Control ();
		int opcao = 4;
		while (opcao != 0 ) {
			
			boolean vetExist = false;
			int vet [] = new int [50];
			int tam = vet.length-1;
			
			switch (opcao) {
			case 1:
				vet = cl.Popular(vet);
				vetExist = true;
				System.out.println("Vetor criado e populado");
				break;
			case 2:
				if (vetExist) {
					int media = cl.CalcMedia(vet, tam);
					System.out.println(media);
				}
				break;
			case 3:
				if (vetExist) {
					int somaimpar = cl.SomaImpar(vet, tam);
					System.out.println(somaimpar);
				}
				break;
			default: 
				opcao = Integer.parseInt(JOptionPane.showInputDialog("Digite uma opcao: \n 1-Para Popular\n 2- Para gerar a soma dos números entre 10 e 200\n 3- Para gerar a soma dos números Impares \n 0- para Sair  "));
			
		}
		}
		
	}
}
