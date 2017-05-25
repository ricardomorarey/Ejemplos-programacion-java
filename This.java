package pkgthis;

/**
 * Uso de la palabra this
 * @author Javier Arturo
 */
public class This extends This2{
    
    int variable = 5;
    Clase2 obj2 = new Clase2();
    
    public This(){
        /*this("javier");
        System.out.println("Constructor sin parámetros");*/
    }
    
    public This(String nombre){
        System.out.println("El nombre es: " + nombre);
    }

    public void metodo(int variable){
        System.out.println("El valor de variable es: " + this.variable);
        System.out.println("El valor de la variable es: " + variable);
    }
    
    public void metodo2(){
        obj2.metodo(10);
        this.metodo(10);
    }
    
    public void metodo3(This2 obj){
    
    }
    
    public void metodo4(){
        this.metodo3(this);
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        This obj = new This();
        obj.metodo2();
        
     }
    
}
