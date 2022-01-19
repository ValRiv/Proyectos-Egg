/*Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le
pida al usuario un numero a buscar en el vector. El programa mostrará donde se
encuentra el numero y si se encuentra repetido
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
public class Ejer23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        System.out.println("Ingrese el tamaño del vector");
        int n = leer.nextInt();
        System.out.println("Ingrese el numero que desea buscar");
        int num = leer.nextInt();
        int contador = 0;
        int pos = -1;
        int[] vector = new int[n];

        for (int element : vector) {
            vector[element] = (int) (Math.random() * 10);
            System.out.print("[" + vector[element] + "]");

        }
        for (int i : vector) {
            if (vector[i] == num) {
                contador++;
               pos = i;
            
            System.out.println("\n El numero " + num + " se encuentra en la posicion " + i);
            
            }   
        }
        System.out.println("\n El numero " + num + " se repite " + contador + " veces");

    }
}
