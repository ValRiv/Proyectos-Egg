/*
 * GUIA RELACIONES EJERCICIO 1 CLASE MAIN. PERSONA/PERRO.

 */
package guiarelaciones;

import guiarelaciones.Entidades.Perro;
import guiarelaciones.Entidades.Persona;




/**
 *
 * @author river
 */
public class GuiaRelaciones_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         
       Perro perro1= new Perro ("Max" +  " Beagle"+ " mediano " + 4 );
        Perro perro2= new Perro( "Umma" + "Cocker" +" mediano " + 5 );
        
        
        Persona p1 = new Persona (" vale" + "Riveros" + 34 + 32879115 + perro1);
       Persona p2=new Persona ( " marce" + " Cristiano" + 34 + 33895479 + perro2);
       
        System.out.println(p1.toString());
        System.out.println(p2.toString());
    }
    
}
// 