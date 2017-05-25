/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Javier Arturo
 */
public class Sobreescritura2 extends Sobreescritura{
    @Override
    public String toString(){
        return "Adios";
    }
    
    public static void main(String[] args) {
        Sobreescritura2 obj = new Sobreescritura2();
        
        System.out.println(obj.toString());
    }
}
