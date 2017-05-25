/**
 * Clase que muestra como funcionan los metodos sobrecargados
 * @author Javier Arturo
 */
public class Sobrecargados {
    
    public void sumar(){
        System.out.println("Este método no recibe parámetros");
    }
    
    public void sumar(int x, int y){
        System.out.println("Este método recibe dos enteros");
    }
    
    public void sumar(int x){
        System.out.println("Este método recibe un entero");
    }
    
    public void sumar(double x){
        System.out.println("Este método recibe un decimal");
    }
    
    public static void main(String[] args) {
        Sobrecargados sobreC = new Sobrecargados();
        
        sobreC.sumar(2.0);
    }
        
    
}
