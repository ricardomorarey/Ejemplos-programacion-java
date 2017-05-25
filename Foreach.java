/**
 * Clase que muestra como usar la instrucción foreach
 * @author Javier Arturo
 */
public class Foreach {
    public static void main(String[] args) {
        int[] arreglo = {87,64,94,100,83,78,100,91,76,87};
        int total = 0;
        
        /*for(int i = 0; i < arreglo.length; i++){
            total += arreglo[i];
        }*/
        
        for(int numero : arreglo){
            total += numero;
        }
        
        System.out.println("El valor de la suma es: " + total);
    }
}
