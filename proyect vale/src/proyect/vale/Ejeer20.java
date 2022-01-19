/*Realizar un programa que lea 4 números (comprendidos entre 1 y 20) e imprima el
número ingresado seguido de tantos asteriscos como indique su valor. Por ejemplo:
5 *****
3 ***
11 ***********
2 **
 * e 
 */
package proyect.vale;

import java.util.Scanner;

/**
 *
 * @author river
 */
public class Ejeer20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        for ( int i =0 ; i < 4; i++) {
            System.out.println("Ingrese 4 numeros comprendidos entre 1 y 20 ");
           int num1;
            num1 = leer.nextInt();
            if (num1 >= 20 || num1 <= 1) {
                System.out.println(" El número " + num1 + " esta fuera del rango ");
                break;
            } else {
                for (int j = 1; j <= num1; j++) {
                    System.out.print(" * ");
                    System.out.print("");
                }
            }
        }
    }
}

            
        
