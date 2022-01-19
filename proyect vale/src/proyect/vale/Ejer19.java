/*Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. Por ejemplo,
si el cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:
* * * *
*     *
*     *
* * * *
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
public class Ejer19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int numerodelados;
        System.out.println("Ingrese un numero para determinar la longitud de los lados: ");
        numerodelados = leer.nextInt();

        for (int i = 0; i < numerodelados; i++) {

            //if (i == 1 || i == numerodelados || j == 1 || j == numerodelados) {
            System.out.print("*");
        }
        System.out.println();
        for (int i = 0; i < numerodelados-2; i++) {
            System.out.print("*");
            for (int j = 0; j < numerodelados - 2; j++) {
                //if (i == 1 || i == numerodelados || j == 1 || j == numerodelados) {
                System.out.print(" ");
            } //else
            System.out.println("*");
        }

        for (int i = 0; i < numerodelados; i++) {
            System.out.print("*");
        }
        System.out.println(" ");
    }
}
