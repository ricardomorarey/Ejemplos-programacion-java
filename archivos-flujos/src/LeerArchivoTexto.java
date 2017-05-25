
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class LeerArchivoTexto{
    
    FileReader fr = null;
    BufferedReader br = null;
    
    public LeerArchivoTexto(){
        try {
            fr = new FileReader("C:\\archivos\\datos.txt");
            br = new BufferedReader(fr);
            
            String contenido = br.readLine();
            while(contenido != null){
                System.out.println(contenido);
                contenido = br.readLine();
            }
            
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    
    public static void main(String[] args) {
        LeerArchivoTexto archivo = new LeerArchivoTexto();
    }
}
