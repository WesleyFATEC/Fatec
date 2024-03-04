package view;
import control.Soma1FatN;
import javax.swing.JOptionPane;
public class View {
	
	public static void main(String[] args) {
		
		Soma1FatN sf = new Soma1FatN();
		
		int a = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero"));
		
		
		double result = sf.Soma_1FatN(a);
		System.out.println(result);
	}

}
