/*
 * EJERCICIO 2 EXTRA CANTANTES
 */
package eje_extra2_colecciones2;

import eje_extra2_colecciones2.EntidadCantante.Cantante;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author river
 */
public class Eje_Extra2_Colecciones2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in).useDelimiter("\n");
        ArrayList<Cantante>cantantes=new ArrayList();
        
        for (int i = 0; i < 1; i++) {
            System.out.println("Ingrese el nombre del cantante");
            String nombre= leer.next();
            System.out.println("Ingrese el nombre del disco mas vendido");
            String disco= leer.next();
            cantantes.add(new Cantante (nombre,disco));
        }
        for (Cantante aux : cantantes) {
            System.out.println(aux);
        }
         int opcion;
        do{
           op = m opcion;
            
        }
        
        
        
    }
    

    
    
}
