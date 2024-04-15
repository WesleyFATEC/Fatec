package controller;

import br.com.fatec.filaGeneric.Fila;
import model.Cliente;

public class OperacaoController {
    public void caixa(Fila<Cliente> fila) throws Exception {
        while (!fila.isEmpty()) {
            Cliente cliente = fila.remove();
            double valueTot = cliente.getQuantidade() * cliente.getValor();
            System.out.println("Nome Cliente: " + cliente.getNome() + ", Valor Total: " + valueTot);
            
        }
    }
}
