package main;
//import br.com.fatec.filaGeneric.Fila;
import br.edu.fateczl.fila.Fila;
class Cliente{
	String Nome;
	int Quantidade;
	double Valor;
}

public class Principal {

	public static void main(String[] args) {
		Fila f = new Fila();
		for (int i=0;i<20;i++) {
			Cliente c = new Cliente();
			c.Nome = "";
			c.Quantidade = 1+i;
			c.Valor = 1.1 + i;
		}
		
	}
	
	

}


/*Criar uma classe view (Principal.java) que, na main:
a. Inicialize uma nova fila
b. Insira 20 clientes com suas caracterís�cas, sendo:
i. Nome (Cliente1, Cliente2, Cliente3, ...)
ii. Quan�dade de peças (Número entre 20 e 50)
iii. Valor das Peças (Número entre 5.00 e 100.00)
*/