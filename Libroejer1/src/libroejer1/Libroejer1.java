/*Ejercicio 1 GUIA POO
 * 
 */
package libroejer1;

import java.util.Scanner;
import libroejer1.entidades.Libro;

/**
 *
 * @author river
 */
public class Libroejer1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer= new Scanner (System.in);
        Libro l1 = new Libro();
      
        l1.rellenarLibro();
       
        l1.mostrarLibro();
    }
    
}
