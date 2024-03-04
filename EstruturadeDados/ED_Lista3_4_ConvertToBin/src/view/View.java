package view;
import control.ConvertToBin;
import javax.swing.JOptionPane;
public class View {
	
	public static void main(String[] args) {
		
		ConvertToBin cb = new ConvertToBin();
		int a = 2001;
		while (a > 2000 || a < 0) {
		a = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero"));
		}
		
		String result = cb.Revert(a);
		System.out.println(result);
	}

}
