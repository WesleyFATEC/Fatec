package view;
import controller.Control;
import model.Urna;

public class Principal {

	public static void main(String[] args) {
		Control ctrl = new Control();
		try {
			ctrl.FCADRASTRAVOTO(2);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		Urna urna = new Urna();
		System.out.print(urna.getnumvote());
		
	}

}
