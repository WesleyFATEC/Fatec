package view;
import control.Quant_Alg;
import javax.swing.JOptionPane;
public class View {

	public static void main(String[] args) {
		Quant_Alg qa= new Quant_Alg();
		int n = 0;
		while (n<10 || n> 999999) {
			n = Integer.parseInt(JOptionPane.showInputDialog("Digite um número entre 10 e 999999"));
		}
		int a = 10;
		while (a<0 || a>9) {
			a = Integer.parseInt(JOptionPane.showInputDialog("Digite o algarismo a ser buscado, utilize de 0 a 9"));
		}
		int result = qa.QuantAlg(n, a);
		System.out.println(result);
	}

}
