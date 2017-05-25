import java.util.Scanner;
/**
 * Clase que muestra el funcionamiento de los métodos en Java
 * @author Javier Arturo
 */

public class Operaciones {
    
        
    /**
     * Este método va a realizar la suma de dos números
     */
    public int sumar(int numero1, int numero2){
        int sumar = numero1 + numero2;
        return sumar;
    }
    
    /**
     * Este método va a realizar la resta de dos números
     */
    public int restar(int numero1, int numero2) {
        int restar = numero1 - numero2;
        return restar;
    }
    
    /**
     * Este método va a realizar la multiplicación de dos números
     */
    public int multiplicar(int numero1, int numero2) {
        int multiplicar = numero1 * numero2;
        return multiplicar;
    }
    
    /**
     * Este método va a realizar la división de dos números
     */
    public int dividir(int numero1, int numero2){
        int dividir = numero1 - numero2;
        return dividir;
    }
    
    public void imprimir(int suma, int resta, int multiplicacion, int division){
        System.out.println("La suma es: " + suma);
        System.out.println("La resta es: " + resta);
        System.out.println("La multiplicacion es: " + multiplicacion);
        System.out.println("La division es: " + division);
    }
    
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca el primer número: ");
        int n1 = sc.nextInt();
        System.out.println("Introduzca el segundo número: ");
        int n2 = sc.nextInt();
        
        Operaciones op = new Operaciones();
        int suma = op.sumar(n1, n2);
        int resta = op.restar(n2, n2);
        int multiplicacion = op.multiplicar(n1, n2);
        int division = op.dividir(n1, n2);
        
        op.imprimir(suma, resta, multiplicacion, division);
        
        
        
      
    }
}
 