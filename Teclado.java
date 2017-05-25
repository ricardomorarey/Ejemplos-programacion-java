import java.util.Scanner;

public class Teclado {
    public static void main(String [] args){
        Scanner scn = new Scanner(System.in);
        System.out.println("Escribe tu edad: ");
        int edad = scn.nextInt();
        System.out.println("La edad que nos proporcionaste es: " + edad);
        System.out.println("gracias por darnos la información");
        
    }
    
}
