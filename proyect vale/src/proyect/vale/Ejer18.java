/*. Necesitamos mostrar un contador con 3 dígitos (X-X-X), que muestre los números
del 0-0-0 al 9-9-9, con la particularidad que cada vez que aparezca un 3 lo sustituya
por una E. Ejemplo:
0-0-0
0-0-1
0-0-2
0-0-E
0-0-4
.
.
0-1-2
0-1-E
Nota: investigar función equals() y como convertir números a String. 
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
public class Ejer18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Este programa imprime numeros de 000-999 y reemplaza los 3 con E");
        for (int i = 0; i <= 999; i++) {
            if (String.valueOf(i).length() < 2) {
                System.out.println("00" + String.valueOf(i).replaceAll("3", "E"));
            } else if (String.valueOf(i).length() < 3) {
                System.out.println("0" + String.valueOf(i).replaceAll("3", "E"));
            } else {
                System.out.println(String.valueOf(i).replaceAll("3", "E"));

            }

        }
    }
}
