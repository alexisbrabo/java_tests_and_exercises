package programming_challenges;

import javax.swing.JOptionPane;

/**
 *
 * @author alexisbrabo
 */
public class stringReversor {

    public static void main(String[] args) {
        String s = JOptionPane.showInputDialog("Digite a palavra a ser revertida:");
        String novas = new StringBuilder(s).reverse().toString();
        JOptionPane.showMessageDialog(null, "A String revertida é " + novas);

    }

}
