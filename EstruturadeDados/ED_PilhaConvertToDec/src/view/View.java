package view;

import javax.swing.JOptionPane;

import controller.ConverteController;

public class View {

	public static void main(String[] args) {
		
		
		ConverteController cb = new ConverteController() ;
		int a = 1001;
		while (a > 1000 || a < 0) {
	a = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero"));
		}
		
		String result = cb.Convert_ToBin(a);
		System.out.println(result);
		
		
	}

}
