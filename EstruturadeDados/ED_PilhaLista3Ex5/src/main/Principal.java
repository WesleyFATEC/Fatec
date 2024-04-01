package main;

import controller.HistoricoController;
import control.Pilha;
import javax.swing.JOptionPane;

public class Principal {

    public static void main(String[] args) {
        Pilha historico = new Pilha();
        HistoricoController ctrl = new HistoricoController();

        while (true) {
            String escolha = JOptionPane.showInputDialog(null,
                    "Escolha uma opção:\n"
                    + "1) Inserir novo endereço\n"
                    + "2) Remover último endereço\n"
                    + "3) Consultar último endereço\n"
                    + "4) Sair", "Histórico", JOptionPane.PLAIN_MESSAGE
            );

            if (escolha == null || escolha.equals("4")) {
                break;
            }

            try {
                switch (escolha) {
                    case "1":
                        String newadress = JOptionPane.showInputDialog(null,"Digite o novo endereço:\nPor exemplo: http://www.fatec.sp.gov.br","Novo endereço", JOptionPane.PLAIN_MESSAGE);
                        ctrl.inserirEndereco(historico, newadress);
                        break;
                    case "2":
                        ctrl.removerUltimoEndereco(historico);
                        JOptionPane.showMessageDialog(null, "Último endereço removido");
                        break;
                    case "3":
                        String lastAdress = ctrl.consultLastAdress(historico);
                        JOptionPane.showMessageDialog(null, "Último endereço: " + lastAdress, "Histórico", JOptionPane.PLAIN_MESSAGE);
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Opção inválida. Tente novamente.");
                        break;
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}
