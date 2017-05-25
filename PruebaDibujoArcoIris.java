
import javax.swing.JFrame;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Javier Arturo
 */
public class PruebaDibujoArcoIris extends JFrame{
    
    public static void main(String[] args) {
        DibujoArcoIris panel = new DibujoArcoIris();
        JFrame aplicacion = new JFrame();
        aplicacion.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        aplicacion.add(panel);
        aplicacion.setSize(400, 250);
        aplicacion.setVisible(true);
    }
    
}
