import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Graphics;

/**
 * Desmuestra el uso de colores en un arreglo.
 * @author Javier Arturo
 */
public class DibujoArcoIris extends JPanel{
    
    //Define los colores indigo y violeta
    private final static Color VIOLETA = new Color(128, 0, 128);
    private final static Color INDIGO = new Color(75, 0, 130);
    
    //los colores a usar en el arco iris, empezando desde los más interiores
    // las dos entradas de color blanco producen un arco vacío en el centro.
    private Color[] colores = {Color.WHITE, Color.WHITE, VIOLETA, INDIGO, Color.BLUE, Color.GREEN, Color.YELLOW, Color.ORANGE, Color.RED};
    
    public DibujoArcoIris(){
        setBackground(Color.WHITE);
    }
    
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        
        int radio = 20;
        
        
        
        int centroX = getWidth() /2;
        int centroY = getHeight() - 10;
        
        for ( int contador = colores.length; contador > 0 ; contador--){
            //establecer el color para el arco actual
            g.setColor( colores [contador - 1]);
            
            //rellena el arco desde 0 hasta 180 grados
            int valorX = centroX - contador * radio;
            int valorY = centroY - contador * radio;
            int ancho = contador * radio * 2;
            int alto = contador * radio * 2;
                        
            g.fillArc(valorX, valorY, ancho, alto, 0, 180);
       
        }
        
    }
    
    
}
