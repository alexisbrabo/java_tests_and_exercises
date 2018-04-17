package lista_de_exercicios_1;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author alexisbrabo
 */
public class ex_2 {

    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("0.00");
        Float valorMetros = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor em metros"));
        Float valorMilimetros = valorMetros * 1000;
        JOptionPane.showMessageDialog(null, "O valor em milimetros é " + df.format(valorMilimetros));
    }

}
