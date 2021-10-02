/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dados;

import java.util.Random;
import javax.swing.ImageIcon;

/**
 *
 * @author Usuario
 */
public class Dado {

    private int valor;
    private static Random r;
    private static ImageIcon[] caras;

    public int getValor() {
        return valor;
    }

    public ImageIcon getCara() {
        return caras[this.valor - 1];
    }

    public void lanzar() {
        valor = r.nextInt(6) + 1;
    }

    public Dado() {
        r = new Random();
        this.lanzar();
        caras = new ImageIcon[6];
        for (int i = 0; i < 6; i++) {

            caras[i] = new ImageIcon(getClass().getResource((i + 1) + ".png"));
        }
    }

}
