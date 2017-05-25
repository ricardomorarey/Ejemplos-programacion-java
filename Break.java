/**
 *
 * @author Javier Arturo
 */
public class Break {
    
    public static void main(String[] args) {
        int cuenta; //La variable de control tambiénse usa cuando termina el ciclo
        
        for(cuenta = 1; cuenta <= 10; cuenta++ ) //itera 10 veces
        {
            if (cuenta == 5) //Si cuenta es igual a 5
            {
                //break; //Termina el ciclo
            }
            
            System.out.println("Cuenta es: " + cuenta);
        }// fin del for
        
        System.out.println("Salio del ciclo en cuenta = " + cuenta);
    }
    
}
