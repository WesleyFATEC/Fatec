package view;
import javax.swing.JOptionPane;
import br.com.fatec.filaGeneric.Fila;
import controller.ImpressoraController;
import model.Document;

public class Principal {
	public static void main(String args[]) throws Exception {
		ImpressoraController ctrlP = new ImpressoraController();
		
		Fila<Document> fprint = new Fila<>();
		
		
		String opc = "";
		while(true) {
			opc = JOptionPane.showInputDialog("Escolha uma opção"+
					"\n 1- Inserir Documentos"+
					"\n 2- Imprimir"+
					"\n 0- sair");
			switch (opc)
			{
			case "1":
				String input = JOptionPane.showInputDialog("Insira o ID do PC e o nome do arquivo (separados por ponto e vírgula)");

				if (input != null && !input.isEmpty()) 
				{
				    String[] doc = input.split(";");
				    if (doc.length == 2)
				    {	Document document = new Document();
				        document.setId(doc[0]);
				        document.setName(doc[1]);
				        int time = (int) (Math.random() * 2000) + 1000;
				        document.setTime(time);
				        ctrlP.insereDocumento(fprint,document);
				        
				    } else
				    {
				        JOptionPane.showMessageDialog(null, "Entrada inválida. Insira o ID do PC e o nome do arquivo separados por ';' ");
				    }				
				}
				break;
				
			case "2":
				ctrlP.imprime (fprint);
				break;
				
			case "0":
				break;
				
			default: JOptionPane.showMessageDialog(null,"Insira uma opção Válida"); 
			}
			
	}

}
	}