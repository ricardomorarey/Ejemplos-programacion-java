/**
 * Esta clase muestra las operaciones que se pueden realizar con los Strings
 * @author Javier Arturo
 */
public class OperacionesStrings {
    
    public static void main(String [] args ){
        
        //Variables String
        String cadena1 = "Hola";
        String cadena2 = "Mundo!";
        
        //Variables numéricas.
        int enteroAUnir = 20;
        double decimal = 15.32;
        
        //concatenar
        /*String concatenacion = cadena1 + " " + cadena2;
        String concatenacion2 = cadena1 + enteroAUnir;
        String concatenacion3 = cadena1.concat(cadena2);
        System.out.println("La concatenacion es: " + concatenacion);
        System.out.println("La concatenacion es: " + concatenacion2);
        System.out.println("La concatenacion es: " + concatenacion3);*/
        
        //contar caracteres
        /*String cadena3 = "Java";
        int contarCadena = cadena3.length();
        System.out.println("La dimension es: " + "Java".length()  );*/
        
        //extraer una porción de una cadena
        String cadena3 = "Mi lenguaje favorito es Java";
        String extraer = cadena3.substring(24, 28);
        System.out.println("La extracción es: " + extraer);
        
        

    }
    
}
