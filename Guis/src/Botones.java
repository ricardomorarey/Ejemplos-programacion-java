
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author Javier Arturo
 */
public class Botones extends JFrame{
    public Botones(){
        JButton b = new JButton();
        
        b.setBounds(100, 100, 400, 200);
        
        b.setText("Hello");
        //System.out.println("Texto del boton "+ b.getText());
        b.setEnabled(true);
        b.setIcon(new ImageIcon("untitled.png"));
        b.setMnemonic('c');
        
        add(b);
        setSize(500, 500);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    
    public static void main(String[] args) {
        Botones obj = new Botones();
    }

    
}
