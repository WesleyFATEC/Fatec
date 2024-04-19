package main;
import java.util.Random; // erro nao utilizei java mas javax
import javax.swing.JOptionPane;///ERRO nao coloquei swing
import controller.Controller;
public class Principal {
static int mat [][]=new int [10][10];


		public static void main(String[] args) {
			Controller ctrl = new Controller();
			String opc = "";
			while(opc!="6") {
				opc = JOptionPane.showInputDialog("inisra opc\n"+
						"1- carrega e mostra divisiveis por4 e 5\n"+
						"2- ordenar e mostra\n"+
						"5- exercício recursiva com n valendo 5\n"+
						"6- Sair");
				switch(opc) 
				{
				case "1":
					ctrl.carrega(mat);
				break;
				case "2":
					ctrl.ordena(mat);
				break;
				case "5":
					int result = ctrl.Rec(5);
					System.out.println(result);
				case "6":
					opc="6";
				break;
				default: 
					System.out.println("insira valor valido");
				}
			}
			
			

		}

	

	
	
}
