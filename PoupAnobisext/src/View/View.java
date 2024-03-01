package View;
import javax.swing.JOptionPane;
import Control.AnoBi6;

public class View {
	public static void main(String[] args) {
		AnoBi6 pp = new AnoBi6();
		        int ano = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano de nascimento:"));
		        int mes = Integer.parseInt(JOptionPane.showInputDialog("Digite o mes de nascimento:"));
		        
		        double [] results = pp.Poup(ano, mes);
		        
		        

		        System.out.println("Investimento final: " + results[0]);
		        System.out.println("Total em juros: " + results[1]);
		        System.out.println("Total de bonificação: " + results[2]);
		        System.out.println("Total de bonificação: " + results[3]);
		}

}