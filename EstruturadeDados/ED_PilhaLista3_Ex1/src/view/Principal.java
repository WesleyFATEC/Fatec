package view;

import controller.Control;

public class Principal {

	public static void main(String[] args) {
		Control ctrl = new Control();
		int[] vet = { 0, 5, 7, -4, 3, 5, -2, -1, 10, 4, 3, -6, 2, -9, 1, -5 };
		int result = ctrl.AIter(vet);
		System.out.println(result);
	}

}
