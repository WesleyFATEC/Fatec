package view;

import javax.swing.JOptionPane;

import controller.FatController;

public class Principal {

	public static void main(String[] args) {
		
		FatController fp = new FatController() ;
		int a = 11;
		while (a > 10 || a < 0) 
		{
			a = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero"));
		}
		
		int result = fp.Fatorial(a);
		System.out.println(result);
	}	
		
	}