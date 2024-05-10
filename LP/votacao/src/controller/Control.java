package controller;
import model.Urna;
import java.util.Random;

public class Control {
	public boolean FCADRASTRAVOTO (int voto) throws Exception{
		Random RD = new Random ();
		Urna urna= new Urna();
		int section = RD.nextInt(10);
		int id = RD.nextInt(300);
		urna.setnumCandidt(id);
		urna.setnumSection(section);
		urna.setnumvote(voto);
		
		boolean votoregistred = true;
		if (! votoregistred) {
			throw new Exception("");
		}
		return votoregistred ;
	}
}
