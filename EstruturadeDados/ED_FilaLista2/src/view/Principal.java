package view;

import java.util.Random;
import br.com.fatec.filaGeneric.Fila;
import model.Cliente;
import controller.OperacaoController;


		public class Principal {
		    public static void main(String[] args) throws Exception {
		    	Random rd = new Random();
		    	
		        Fila<Cliente> f = new Fila<>();
		        for (int i = 0; i < 20; i++) {
		            Cliente c = new Cliente();
		            c.setNome("Cliente"+i);
		            c.setQuantidade(rd.nextInt(20,50));
		            c.setValor(Math.round((rd.nextDouble(5.0,100.0)) * 100.0) / 100.0);
		                      
		            f.insert(c);
		        }

		        OperacaoController ctrl = new OperacaoController();
		        ctrl.caixa(f);
		    }
		}

