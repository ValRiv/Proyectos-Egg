/*Implementar un programa que dado dos números enteros determine cuál es el
mayor y lo muestre por pantalla.
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
public class Ejer7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer= new Scanner ( System.in);
        System.out.println("Ingrese un numero ");
        int num1 = leer.nextInt();
        System.out.println("Ingrese otro numero");
        int num2 = leer.nextInt();
        if (num1> num2){
            System.out.println("El primer numero que es " + num1 + " es mayor al segundo que es " +  num2);
        }
        else  if (num2> num1)
            System.out.println("El segundo numero que es " + num2+ " es mayor al primero que es " + num1);
    }
    
}
