
import java.io.EOFException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author Javier Arturo
 */
public class ThrowsClass {
    
    public void readFiles()
    throws FileNotFoundException
    {
        File file=new File("E://file.txt");
        FileReader fr = new FileReader(file);
    }
    
    public void aritmetica(){
        int a[]=new int[5];  
        a[5]=30/0;   //Arithmetica, Array
    }
    
    public void aritmetica2(){
        try{
            aritmetica();
        }
        catch(ArithmeticException e){
            System.out.println("Runtime");
        }
        catch(ArrayIndexOutOfBoundsException ex){
        
        }
        
    }
    
    public void readFiles2()
    {
        try{
            readFiles();
        }
        catch(FileNotFoundException e){
            try{
            
            }
            catch(Exception exe){
            
            }
        }
        catch(IOException ex){
        
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null, "El archivo no se encuentra en esa ubicación");
            ex.printStackTrace();
        }
        
    }
    
    
    public static void main(String args[]){		
         ThrowsClass obj = new ThrowsClass();
         obj.aritmetica2();
    }
}
