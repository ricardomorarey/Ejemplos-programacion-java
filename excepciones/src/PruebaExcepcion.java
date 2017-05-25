
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author Javier Arturo
 */
public class PruebaExcepcion {
    
    private int numero;
    private Scanner teclado;
    
    private void introducirNumero() throws NumeroCeroException{
        do{
            teclado = new Scanner(System.in);
            System.out.println("Introduzca un número:");
            numero = teclado.nextInt();
            
            if(numero==0){
                throw new NumeroCeroException();
                        
            }
            
        }while(numero!=0);
    }
    
    public static void main(String[] args) {
        
        try {
            
            new PruebaExcepcion().introducirNumero();
            
        } catch (NumeroCeroException ex) {
            
            System.out.println("Es un número cero");
        }
    }
    
}
