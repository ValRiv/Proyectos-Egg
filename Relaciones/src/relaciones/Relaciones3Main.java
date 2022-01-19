/*
 *  EJECICIO 3 MAIN.
 */
package relaciones;

import Entidad.Carta;
import Servicio2.ServicioBaraja3;

/**
 *
 * @author river
 */
public class Relaciones3Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
           
        ServicioBaraja3 serv=new ServicioBaraja3();
        serv.crearBaraja();
        serv.menu();
    }
    
}
