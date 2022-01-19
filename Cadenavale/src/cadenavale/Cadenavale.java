/*
 * Ejer 8 MEJORADO
 */
package cadenavale;

import cadenavale.entidad.CadenaEntidad;
import cadenavale.servicio.CadenaServicio;
import java.util.Scanner;

/**
 *
 * @author river
 */
public class Cadenavale {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in).useDelimiter("\n");
        CadenaServicio serv= new CadenaServicio();
        CadenaEntidad c1= new CadenaEntidad();
        
        
 
       serv.mostrarVocales(frase);
      // serv.invertirCadena(frase);
        
    }
        
    }
    