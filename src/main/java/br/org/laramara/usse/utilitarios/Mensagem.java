package br.org.laramara.usse.utilitarios;

import javax.swing.JOptionPane;

/**
 * @author leone.pizzoli
 */

public class Mensagem {

    public static void exibirMensagem(String mensagem) {
        JOptionPane.showMessageDialog(null, mensagem);
    }

    public static String exibirPergunta(String pergunta) {
        return JOptionPane.showInputDialog(null, pergunta);
    }
}
