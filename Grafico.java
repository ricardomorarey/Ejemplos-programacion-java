
import javax.swing.JOptionPane;

/**
 *
 * @author Javier Arturo
 */
public class Grafico {
    
    
    public static void main(String[] args) {
        String nombre = JOptionPane.showInputDialog("Escribe tu nombre:");
        String nacionalidad = JOptionPane.showInputDialog("Escribe tu nacionalidad");
        String altura = JOptionPane.showInputDialog("Escribe tu altura");
        String edad = JOptionPane.showInputDialog("Escribe tu edad: ");
        
        double alt = Double.parseDouble(altura);
        int edadPersona = Integer.parseInt(edad);
        
        Persona persona = new Persona();
        persona.setNombre(nombre);
        persona.setNacionalidad(nacionalidad);
        persona.setAltura(alt);
        persona.setEdad(edadPersona);
        
        JOptionPane.showMessageDialog(null, "Nombre: " + persona.getNombre());
        JOptionPane.showMessageDialog(null, "Nacionalidad: " + persona.getNacionalidad());
        JOptionPane.showMessageDialog(null, "Altura: " + persona.getAltura());
        JOptionPane.showMessageDialog(null, "Edad: " + persona.getEdad());
        
    }
    
}
