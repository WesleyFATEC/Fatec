package view;

import controller.Erros;
import controller.NPRController;
import br.com.fatec.wesley.Pilha.Pilha;
import javax.swing.JOptionPane;

public class Principal {
	
    public static void main(String[] args) throws Erros.DivisaoPorZeroException, Erros.OperacaoInvalidaException, Exception {
        NPRController ctrl = new NPRController();
        Pilha stack = new Pilha();
        
        while (true) {
            String entrada = JOptionPane.showInputDialog(null, "Digite um número ou operação + - * / \nOu sair para finalizar", "Calculadora NPR", JOptionPane.PLAIN_MESSAGE);

            if (entrada == null || entrada.equals("sair"))
            {
                break;
            }

            try 
            {
                if (isNumeric(entrada)) {
                    int valor = Integer.parseInt(entrada);
                    ctrl.inserevalor(stack, valor);
                } else {
                    int resultado = ctrl.npr(stack, entrada);
                    JOptionPane.showMessageDialog(null, "Resultado: " + resultado);
                }
            } 
            catch (Erros.OperacaoInvalidaException e) 
            {
                JOptionPane.showMessageDialog(null, e.getMessage());
            } 
            catch (Erros.PilhaVaziaException e) 
            {
                JOptionPane.showMessageDialog(null, e.getMessage());
            } 
            catch (Erros.DivisaoPorZeroException e) 
            {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        }
        
    }

    private static boolean isNumeric(String str) {
        if (str.isEmpty()) 
        {
            return false;
        }
        
        for (int i = 0; i < str.length(); i++) 
        {
            char ch = str.charAt(i);
            if (!Character.isDigit(ch) && !(i == 0 && ch == '-'  && str.length() > 1))
            {
                return false;
            }
        }
        
        return true;
    }

}
