package view;
import control.SomaNuntil1;
import javax.swing.JOptionPane;
public class View 
{
	public static void main (String[] args) 
	{
		SomaNuntil1 su = new SomaNuntil1 ();
		int n = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
		int result = su.Soma_N_Until1(n);
		System.out.println(result);
	}
}
