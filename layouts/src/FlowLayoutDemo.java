
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


/**
 *
 * @author Javier Arturo
 */
public class FlowLayoutDemo extends JFrame{
    
    private JButton  botonEnviar;
    private JTextField cajaTexto;
    private JLabel etiqueta;
    
    public FlowLayoutDemo(){
        
        botonEnviar = new JButton("Enviar");
        cajaTexto  = new JTextField(12);
        etiqueta= new JLabel("Escribe tu nombre:");
    
        FlowLayout layout = new FlowLayout(FlowLayout.RIGHT);
        
        this.setLayout(layout);
        
        layout.setHgap(20);
        layout.setVgap(20);
        
        this.add(etiqueta);
        this.add(cajaTexto);
        this.add(botonEnviar);
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        pack();
    }
    
    public static void main(String[] args) {
        new FlowLayoutDemo();
    }
}
