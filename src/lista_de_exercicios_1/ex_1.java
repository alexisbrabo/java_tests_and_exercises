package lista_de_exercicios_1;

import javax.swing.JOptionPane;

/**
 *
 * @author alexisbrabo
 */
public class ex_1 {

    public static void main(String[] args) {
        Integer num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o número 1"));
        Integer num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o número 2"));
        Integer result = num1 + num2;
        JOptionPane.showMessageDialog(null, "O resultado é " + result);
    }
}
