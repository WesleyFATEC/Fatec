package View;
import Control.QuantDig;
import javax.swing.JOptionPane;

public class View {

	public static void main(String[] args) {
		QuantDig qd = new QuantDig();
		int n = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
		int result = qd.Quant_Dig(n); 
		System.out.println(result);
	}

}
