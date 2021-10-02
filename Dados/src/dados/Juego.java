/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dados;

import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class Juego {

    private int a, b, c;
    boolean aux = true;

    public Juego() {

    }

    public void inicial(Dado dado1, Dado dado2) {

        a = dado1.getValor();
        b = dado2.getValor();
        c = a + b;
        if ((a + b == 2) || (a + b == 3) || (a + b == 12)) {
            JOptionPane.showMessageDialog(null, "GAME OVER");
            System.exit(0);
        } else if ((a + b == 7) || (a + b == 11)) {
            JOptionPane.showMessageDialog(null, "YOU WIN");
            System.exit(0);
        }
        
    }

    public void continuar(Dado dado1, Dado dado2) {

        if (dado1.getValor() + dado2.getValor() == 7) {
            JOptionPane.showMessageDialog(null, "GAME OVER :(");
            System.exit(0);
        } else if ((dado1.getValor() + dado2.getValor() == c)) {
            JOptionPane.showMessageDialog(null, "YOU WIN :)");
            System.exit(0);
        }

    }
}
