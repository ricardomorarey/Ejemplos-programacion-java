package constructores;

/**
 * Clase que muestra el funcionamiento de los constructores
 * @author Javier Arturo
 */
public class Constructores {
    
    
    public Constructores(){
        System.out.println("Hola soy el constructor");
        System.out.println("Hola Mundo!");
    }
    
    public Constructores(int a, int b){
        int suma = a + b;
        System.out.println("La suma es: " + suma);
    }
    
    /** constructor copia*/
    public Constructores(final Constructores c){
    
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Constructores obj = new Constructores();
        Constructores obj2 = new Constructores(5, 6);
        Constructores obj3 = new Constructores(obj2);
        
    }
    
}
