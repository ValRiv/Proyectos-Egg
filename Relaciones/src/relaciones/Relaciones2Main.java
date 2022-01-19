/*
 * GUIA RELACIONES. CLASE MAIN. EJERCICIO 2.
 */
package relaciones;

import Relaciones2.Juego;
import Servicio2.Servicio2;

/**
 *
 * @author river
 */
public class Relaciones2Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Servicio2 serv= new Servicio2();
        Juego juego = new Juego();
                
        juego.llenarJuego(serv.cantJugadores());
        juego.ronda();
    }
    
}
