package View;
import Control.FatDuplo;
import javax.swing.JOptionPane;

public class View {

	public static void main(String[] args) {
		FatDuplo fd = new FatDuplo();
		int n=0;
		while (n%2 == 0) {
			n= Integer.parseInt(JOptionPane.showInputDialog("Digite um número Impar"));
		}
		int result = fd.FatDup(n);
		System.out.println(result);

	}

}
