package plantasvszombies;

/**
 *
 * @author Javier Arturo
 */
public class BalaPlata extends ObjetoGrafico {
    
    String nombre;
    
    public BalaPlata(String nom){
        nombre = nom;
    }
    
    @Override
    public void mover(){
        System.out.println("Movimiento de bala plata. Yo me llamo" + nombre);
    }
}
