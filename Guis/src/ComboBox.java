
import javax.swing.JComboBox;
import javax.swing.JFrame;

/**
 *
 * @author Javier Arturo
 */
public class ComboBox extends JFrame{
    
    public ComboBox(){
        String [] paises = {"Peru", "Mexico", "USA", "Venezuela"};
        
        JComboBox combo = new JComboBox(paises);
        
        combo.addItem("Argentina");
        combo.addItem("Brasil");
        
        combo.setSelectedItem("Venezuela");
        combo.setEditable(true);
        
        combo.setBounds(50, 50,90,20);  
        add(combo);  
        
       
      
        setLayout(null);  
        setSize(400,500);  
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true); 
    }
    public static void main(String[] args) {
        new ComboBox();
    }
    
}
