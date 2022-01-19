/*
 * EJERCICIO EXTRA 1 CANCION
Desarrollar una clase Cancion con los siguientes atributos: titulo y autor. Se deberá́
definir además dos constructores: uno vacío que inicializa el titulo y el autor a cadenas
vacías y otro que reciba como parámetros el titulo y el autor de la canción. Se deberán
además definir los métodos getters y setters correspondientes.
 */
package cancion_ejer_extra1;

import cancion_ejer_extra1.Entidad.Cancion;

/**
 *
 * @author river
 */
public class Cancion_ejer_extra1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cancion c1=new Cancion();
        c1.cargarCancion();
        System.out.println(c1);
        
    }
    
}
