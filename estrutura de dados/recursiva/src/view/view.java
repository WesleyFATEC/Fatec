package view;

import control.CalcSoma;
import javax.swing.JOptionPane;

public class view {

	public static void main(String[] args) {
			CalcSoma sc = new CalcSoma();
	        int n = Integer.parseInt(JOptionPane.showInputDialog("Digite um número:"));;

	        int resultado = sc.CalcularSoma(n);

	        System.out.println("O somatório dos primeiros " + n + " números NATURAIS é: " + resultado);
	    
	}

}
