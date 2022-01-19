/*1) Escribir un programa que pida dos números enteros por teclado y calcule la suma
de los dos. El programa deberá después mostrar el resultado de la suma
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
public class ProyectVale {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic 
        Scanner leer= new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese un numero y muestro la suma ");
        int num = leer.nextInt();
        int num2 = leer.nextInt();
        System.out.println("La suma: " + (num+num2));
    }
    
}
