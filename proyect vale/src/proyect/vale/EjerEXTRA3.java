/*Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se trata de una
vocal. Caso contrario mostrar un mensaje. Nota: investigar la función equals() de la
clase String. 
 * 
 */
package proyect.vale;
//package CharUpperLowerCase; 

import java.util.Scanner;
//import static jdk.nashorn.internal.objects.NativeString.toLowerCase;
//import static jdk.nashorn.internal.objects.NativeString.toUpperCase;

/**
 *
 * @author river
 */
public class EjerEXTRA3 {

    /**
     * @param args the command line arguments
     */
    //public class CharUpperLowerCase {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        //char letra= '\u0000';
        String letra;
        System.out.println("Ingrese una letra para saber si es vocal o no ");
        //letra = leer.next().charAt(0);
        letra = leer.next();
        // char letraUpperCase = Character.toUpperCase(letra);
       // leer.nextLine(letra);
        if ("a".equals(letra) || "e".equals(letra) || "i".equals(letra) || "o".equals(letra) || "u".equals(letra)) {
            System.out.println("La letra ingresada " + letra + " es vocal");
        } else {
            System.out.println("La letra ingresada  " + letra + " no es vocal ");
        }
    }
}
