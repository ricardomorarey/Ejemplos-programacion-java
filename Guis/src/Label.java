import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
/**
 *
 * @author Javier Arturo
 */
public class Label extends JFrame{

    public Label(){
        
        JLabel etiqueta = new JLabel();
        
        etiqueta.setBounds(200, 200, 50, 20);
        etiqueta.setIcon(new ImageIcon("images10XORTKH.jpg"));
        
        add(etiqueta);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 300);
        setVisible(true);
    }
    
    public static void main(String[] args) {
        Label obj = new Label();
    }
   
}
