
import java.util.InputMismatchException;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Javier Arturo
 */
public class DivisionEntreCero {
    
    //demuestra el lanzamiento de una excepción cuando ocurre una división entre cero
    public static int cociente(int numerador, int denominador)
    
    {
        if(denominador == 0){
            System.out.println("introduce otro número distinto de cero.");
        }
        return numerador / denominador; //posible división entre cero
    }
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int i = Integer.parseInt("2");
        

    }
}
