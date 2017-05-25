
import javax.swing.JFrame;
import javax.swing.JTextField;

/**
 *
 * @author Javier Arturo
 */
public class TextField extends JFrame{
    
    public TextField(){
        JTextField campo = new JTextField("campo de texto...", 40);
        campo.setBounds(50, 100, 200, 30);
        
        System.out.println("El valor del campo es: " + campo.getText());
        
        
        add(campo);
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setVisible(true);
    }
    
    public static void main(String[] args) {
        TextField campo = new TextField();
    }

}
