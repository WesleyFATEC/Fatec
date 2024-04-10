package main;
import javax.swing.JOptionPane;
import control.Controller;


public class Principal{
	public static int quantSaque = 100;
	public static int  cx[][] = {{2,5,10,20,50,100,200},new int[7]};
	
	public static void main (String args[]) throws Exception {
		
		Controller crlt = new Controller();
		while(true) 
		{
			String opc = JOptionPane.showInputDialog(null, 
					"Escolha uma opção:\n"
					+ "1) Encher Caixa\n"
					+ "2) Retirar Valores\n"
					+ "3) Imprimior Estatísticas\n"
					+ "4) Sair"
					);
		
			if (opc == null || opc.equals("4"))
			{
	            break;
	        }
			
			switch(opc)
			{
			
				case "1":
					int quant = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a quantidade de notas que ser�o Carregadas", "Saque", JOptionPane.PLAIN_MESSAGE));
					crlt.EncherCx(Principal.cx,quant);
					break;
				
				case "2":
					try {
						int [][] notasRetiradas = {{2,5,10,20,50,100,200},{0,0,0,0,0,0,0}};
					int valor = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o Valor a ser retirado", "Saque", JOptionPane.PLAIN_MESSAGE));
					if (valor > 1 && valor != 3) 
					{
						crlt.Retirada(valor, notasRetiradas,6);
						String msg = "Notas a serem Sacadas:\n";
						for(int i=6; i>=0;i--) 
						{
							if(notasRetiradas[1][i]>0)
							{
								msg += notasRetiradas[1][i]+ "de: "+ notasRetiradas[0][i]+"\n";	
							}
						}
						JOptionPane.showMessageDialog(null, msg);
					}
					else
					{
						 JOptionPane.showMessageDialog(null, "Não é possível realizar o saque de valor de: "+valor+" com as notas disponíveis.\n Insira outro Valor ENTRE = 3 OU -= 1 NÃO SÃO ACEITOS");
					}
					break;
					}catch (Exception e) {
						JOptionPane.showMessageDialog(null, e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
					}
					
					
					
								
				default:
			        JOptionPane.showMessageDialog(null, "Op��o inv�lida. Tente novamente.");
			        break;
				
			}
		}	
	}
}
