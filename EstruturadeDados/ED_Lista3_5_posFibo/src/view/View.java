package view;
import control.PosFibo;
import javax.swing.JOptionPane;
public class View {
	
	public static void main(String[] args) {
		
		PosFibo pf = new PosFibo();
		int a = 21;
		while (a > 20 || a < 0) {
		a = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero"));
		}
		
		int result = pf.Pos_Fibo(a);
		System.out.println(result);
	}

}
