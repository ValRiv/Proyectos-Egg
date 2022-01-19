/*Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación
solicite números al usuario hasta que la suma de los números introducidos supere
el límite inicial. 

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
public class Ejer14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner (System.in).useDelimiter("\n");
        
           System.out.println("Ingrese un valor limite positivo");
           
           int num1 =leer.nextInt();
            int num2, suma = 0 , i =1;
            
        do{
                 
           System.out.println("Ingrese un nuevo numero" );
           
             num2 = leer.nextInt();
            suma= suma + num2;    
         if (suma >num1 )
                break;
         } while (suma < num1); 
        
                System.out.println("Se supero el limite");

                 }
        }
    
                 
        
    
        

        
        
         
    

