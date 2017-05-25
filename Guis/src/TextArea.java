
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JTextArea;

/**
 *
 * @author Javier Arturo
 */
public class TextArea extends JFrame{
    
    public TextArea(){
        JTextArea area = new JTextArea(300, 300);
        area.setBounds(10, 30, 300, 300);
        
        area.setBackground(Color.black);
        area.setForeground(Color.CYAN);
        area.setText("Mi nombre es Mauricio");
        area.append("\nMi nombre es javier vazquez");
        
        add(area);
        
        
        
        setSize(400,400);  
        setLayout(null);  
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    
    public static void main(String[] args) {
        TextArea obj = new TextArea();
    }
}
