package view;
import javax.swing.JOptionPane;


import control.DivSoma;
public class View {

	public static void main(String[] args) {
		DivSoma ds = new DivSoma ();
		int n = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
		double result = ds.Div_Soma(n);
		System.out.println(result);

	}

}
