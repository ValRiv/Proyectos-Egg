/*
 * EJERCICIO EXTRA3 RAICES MAIN.
 */
package raices_eje_extra3;

import raices_eje_extra3.Raices.Raices;
import raices_eje_extra3.ServicioRaices.ServicioRaices;

/**
 *
 * @author river
 */
public class Raices_eje_extra3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        ServicioRaices serv= new ServicioRaices();
        Raices R= serv.cargarValores();
        System.out.println(R);
        System.out.println("El valor discrimante es: " + serv.getDiscriminante());
        System.out.println("Tiene raiz? " + serv.tieneRaiz());
        System.out.println("Tiene raices? " + serv.tieneRaices());
        serv.obtenerRaiz();
        serv.obtenerRaices();
        serv.CalcularRaices();
        
    }
    
}
