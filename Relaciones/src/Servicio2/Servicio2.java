/*
 * SERVICIO 2
 */
package Servicio2;

import java.util.Scanner;

/**
 *
 * @author river
 */
public class Servicio2 {
    Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
    
    public int cantJugadores() {
        
        System.out.println("Ingrese la cantidad de jugadores: ");
        System.out.println("Min: 1 Jugador");
        System.out.println("Max: 6 Jugadores");
        int cantJug= leer.nextInt();
        while(cantJug<1 || cantJug>6){
            System.out.println("Escriba una cantidad correcta: ");
            cantJug= leer.nextInt();
        }
        return cantJug;   
    }
    
}
