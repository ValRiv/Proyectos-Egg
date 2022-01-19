/*
 * EJERCICIO EXTRA MAIN
 */
package puntos_eje_extra1;

import puntos_eje_extra1.Puntos.Puntos;

/**
 *
 * @author river
 */
public class Puntos_eje_extra1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Puntos p1=new Puntos();
        p1.crearPuntos();
        p1.calcularDistancia();
        System.out.println("La distancia entre los 2 puntos ingresados es: " + p1.calcularDistancia());
    }
    
}
