/*
 * EJERCICIO 6 PROGRAMA NESPRESS0! CLASE MAIN.
 */
package cafeteraeje6;

import Cafetera.Cafetera;
import java.util.Scanner;
import serviciocafetera.ServicioCafetera;

/**
 *
 * @author river
 */
public class Cafeteraeje6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in).useDelimiter("\n");
     
        ServicioCafetera serv= new ServicioCafetera();
        Cafetera c1= serv.crearCafetera();
        
        serv.llenarCafetera();
         System.out.println("Ingrese en el tamaño de la taza: ");
         int taza=leer.nextInt();
        serv.servirTaza(taza);
        System.out.println("Ingrese la cantidad de cafe que desea agregar: ");
        int cant=leer.nextInt();
        serv.agregarCafe(cant);
    }
    
}
