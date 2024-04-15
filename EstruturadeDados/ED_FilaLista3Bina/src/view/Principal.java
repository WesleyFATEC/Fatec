package view;
import br.com.fatec.filaGeneric.Fila;
import controller.TelefoneController;
import javax.swing.JOptionPane;


public class Principal {
	
	public static void main(String[] args) throws Exception {
		Fila<String> f = new Fila();
		TelefoneController crlt = new TelefoneController();
		String opc="";
		while(opc != "sair") {
			opc = JOptionPane.showInputDialog("Escolha Opção:\n"+
					"1- Inserir ligação perdida\n"+
					"2- Consultar ligações perdidas\n"+
					"3- Sair");
		
			switch (opc)
			{
			case "1":
				
				String tel = JOptionPane.showInputDialog("Insira o número");
				crlt.InsereLigacao(f, tel);
				break;
			
			case "2":
				crlt.consultaLigacoes(f);
				break;
			
			case "3":
				opc= "sair";
				break;
				
			default:
				JOptionPane.showMessageDialog(null, "Insira uma opção Válida");
			}
		}
	}
	


}
