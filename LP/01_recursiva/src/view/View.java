package view;
import control.Soma_until100;
public class View 
{
	public static void main (String[] args) 
	{
		Soma_until100 sc = new Soma_until100 ();
		int result = sc.SomaUntil100(1);
		System.out.println(result);
	}
}
