/*Escriba un programa que valide si una nota está entre 0 y 10, sino está entre 0 y 10
la nota se pedirá de nuevo hasta que la nota sea correcta. 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyect.vale;

import java.util.Scanner;

/**
 *
 * @author river
 */
public class Ejer13 {

    /**
     * @param args the command line arguments
     */
   // @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        int num; 
        Scanner leer = new Scanner (System.in).useDelimiter("\n"); 
        
        do {
            System.out.println("Ingrese una nota debe ir de 0 a 10");
        num =  leer.nextInt();
           if (num  >= 0  && num <= 10) {
                System.out.println(" La nota es correcta"); 
                break;
           }else{System.out.println("Intente nuevamente");
           } //break;
        } while (num < 0 &&  num > 10);
         //System.out.println("Intente nuevamente");
    }
}

            
            
        
    
           
           
        
    
    

