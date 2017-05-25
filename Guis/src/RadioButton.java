
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

/**
 *
 * @author Javier Arturo
 */
public class RadioButton extends JFrame{
    
    public RadioButton(){
        JRadioButton radio = new JRadioButton("Opcion1", true);
        JRadioButton radio2 = new JRadioButton("Opcion2", false);
        
        radio.setMnemonic('c');
        radio2.setMnemonic('a');
        
        System.out.println("El valor es: " + radio.isSelected());

        radio.setBounds(70, 100, 100, 30);
        radio2.setBounds(70, 150, 100, 30);
        
        ButtonGroup bg = new ButtonGroup();
        bg.add(radio);
        bg.add(radio2);
        
        add(radio);
        add(radio2);  
  
        setSize(300,300);  
        setLayout(null);  
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);  
    }public static void main(String[] args) {
        RadioButton object = new RadioButton();
    }

}