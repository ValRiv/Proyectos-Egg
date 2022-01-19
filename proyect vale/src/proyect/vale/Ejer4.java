/* 5)Dada una cantidad de grados centígrados se debe mostrar su equivalente en
grados Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).
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
public class Ejer4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner ( System.in);
       double F, C;
        System.out.println("Ingrese los grados centrigrados que desea conventir a fahrenheit");
        C = leer.nextDouble();
        
         F = 9 / 5.0 * C + 32;
         System.out.println(" Los Grados ingresados " + C +  " en fahrenheit son : " + F);
    }
    
}
