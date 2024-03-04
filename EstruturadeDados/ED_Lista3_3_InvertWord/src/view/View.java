package view;
import control.InvertWord;
import javax.swing.JOptionPane;
public class View {

	public static void main(String[] args) {
		InvertWord iw = new InvertWord();
		String a = "";
		while (a.length()== 0) {
		a = JOptionPane.showInputDialog("Digite uma ou mais palavras");
		}
		
		String result = iw.Invert_Word(a);
		System.out.println(result);
	}

}
