/*Crear un programa que dado un numero determine si es par o impar.
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
public class Ejer8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer= new Scanner (System.in);
        System.out.println("Ingrese un numero");
        int num = leer.nextInt();
        if ( num % 2==0)
        { 
            System.out.println("El numero ingresado es Par ");
        }
        else 
        { System.out.println(" El numero ingresado es Impar ");
    
}
    }
}

