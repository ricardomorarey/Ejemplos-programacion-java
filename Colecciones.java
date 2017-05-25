import java.util.ArrayList;
/**
 *
 * @author Javier Arturo
 */
public class Colecciones {
    
    public static void main(String[] args) {
        
       ArrayList< String > array = new ArrayList<String>();
       
       array.add("rojo");
       array.add("azul");
       array.add("verde");
       
       for(String elemento : array){
           System.out.println("Valor: " + elemento);
       }
       
       if(array.contains("verde")){
           System.out.println("Si tengo el elemento verde");
       }
       
       if(array.contains("amarillo")){
           System.out.println("Si contiene un elemento amarillo");
       }
       else{
           System.out.println("no tiene amarillo");
       }
       
        System.out.println("El array está vacío? " + array.isEmpty());
        
        array.clear();
        
        System.out.println("El array está vacío ahora? " + array.isEmpty());
        
        
    }
    
}
