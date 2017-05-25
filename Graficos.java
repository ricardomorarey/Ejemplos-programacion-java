
import javax.swing.JOptionPane;

/**
 * Esta clase crea una calculadora gráfica utilizando los métodos de la clase Operaciones
 * @author Javier Arturo
 */
public class Graficos {
    
    public static void main(String[] args) {
        String n1 = JOptionPane.showInputDialog("Introduzca el primer número");
        String n2 = JOptionPane.showInputDialog("Introduzca el segundo número");
        
        double num1 = Double.parseDouble(n1);
        double num2 = Double.parseDouble(n2);
        
        Operaciones op = new Operaciones();
        
        double suma = op.sumar(num1, num2);
        double resta = op.restar(num1, num2);
        double mult = op.multiplicar(num1, num2);
        double div = op.division(num1, num2);
        
        JOptionPane.showMessageDialog(null, "Suma: " + suma);
        JOptionPane.showMessageDialog(null, "Resta: " + resta);
        JOptionPane.showMessageDialog(null, "Multiplicacion: " + mult);
        JOptionPane.showMessageDialog(null, "Division: " + div);
    }
    
}
