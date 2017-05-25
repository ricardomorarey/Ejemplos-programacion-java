import javax.swing.JFrame;
import javax.swing.JButton;
/**
 *
 * @author Javier Arturo
 */
public class PrimerEjemploSwing extends JFrame{
    
    public PrimerEjemploSwing(){
        
          
        JButton b = new JButton("click");//creando una instancia de JButton  
        b.setBounds(130,100,100, 40);//ejes x e y. Ancho y alto

        add(b);//Añadiendo el boton al JFrame

        setSize(400,500);//El JFrame tiene un tamaño de 400 x 500
        setLayout(null);//No usamos layouts managers 
        setVisible(true);//hacemos el frame visible 
    }
    
    public static void main(String[] args) {
        PrimerEjemploSwing obj = new PrimerEjemploSwing();
    }
    
}
