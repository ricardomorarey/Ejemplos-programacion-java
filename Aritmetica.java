import java.util.Scanner;
/**
 * Esta clase realiza operaciones aritméticas
 * @author Javier Arturo
 */
public class Aritmetica {
    //Inicia el método main
    public static void main(String [] args ){
        int i;
        int j;
        int suma;
        int resta;
        int mult;
        int div;
        int modulo;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa el primer número:");
        i = scanner.nextInt();
        System.out.println("Ingresa el segundo número");
        j = scanner.nextInt();
        
        suma = i + j;
        resta = i - j;
        mult = i * j;
        div = i / j;
        modulo = i % j;
        
        System.out.println("El resultado de la suma es: " + suma);
        System.out.println("El resultado de la resta es: " + resta);
        System.out.println("El resultado de la multiplicación es: " + mult);
        System.out.println("El resultado de la división es: " + div);
        System.out.println("El resultado de el módulo es: " + modulo);
        
        
    }
    
}
