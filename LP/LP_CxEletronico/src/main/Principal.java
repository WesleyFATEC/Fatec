package main;
import javax.swing.JOptionPane;
import control.Controller;

public class Principal{
	static Controller crlt = new Controller();
	static int quantSaque = 100;
	static int [] cx = new int [7];
	
	public static void main (String args[]) throws Exception {
		
		int [][] notasRetiradas = {{200,100,50,20,10,5,2}};
		
		
		
		while(true) {
			String opc = JOptionPane.showInputDialog(null, "Escolha uma opção:"
					+ "1) Encher Caixa\n"
					+ "2) Retirar Valores\n"
					+ "3) Imprimior Estatístiocas");
		
			if (opc == null || opc.equals("4")) {
	            break;
	        }
			
			switch(opc){
			
			case "1":
				int quant = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a quantidade de notas que serão Carregadas", "Saque", JOptionPane.PLAIN_MESSAGE));
				crlt.EncherCx(cx,quant);
				break;
			
			case "2":
				int valor = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o Valor a ser retirado", "Saque", JOptionPane.PLAIN_MESSAGE));
				if (valor > 0 && valor != 3) 
					{
						crlt.Retirada( cx,quantSaque,valor, notasRetiradas,6);
					
					}
				break;
				
							
			default:
		        JOptionPane.showMessageDialog(null, "Opção inválida. Tente novamente.");
		        break;
				
			}
		}
		
	}

}
