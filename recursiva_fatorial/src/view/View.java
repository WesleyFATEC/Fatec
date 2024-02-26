package view;

import javax.swing.JOptionPane;

import control.Fatorial;
public class View {

	public static void main(String[] args) {
		Fatorial ft = new Fatorial();
		int n = Integer.parseInt(JOptionPane.showInputDialog("Digite um número:"));
		
		int resultado = ft.CalcFatorial(n);
		System.out.println("O fatorial de " + n + " é: " + resultado);

	}

}
