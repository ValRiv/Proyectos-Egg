/* 6)Escribir un programa que lea un número entero por teclado y muestre por pantalla
el doble, el triple y la raíz cuadrada de ese número. Nota: investigar la función
Math.sqrt().
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
public class Ejer5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer =  new Scanner (System.in); 
        System.out.println("Ingrese un numero entero");
        int num = leer.nextInt();
        
        System.out.println("El doble del numero ingresado es: " + num * 2);
        System.out.println("El triple del numero ingresado es: " + num * 3);
        System.out.println("La raiz cuadrada del numero ingresado es :  "  + Math.sqrt(num));
    }
    
}
