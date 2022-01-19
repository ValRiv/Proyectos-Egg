/*
 * EJERCICIO 1 HERENCIA
 */
package Herencia1;

/**
 *
 * @author river
 */
public class Herencia1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Declaracion del objeto perro
        
        Animal p1 = new Perro("Max" , "croquetas" , 5 , "Beagle");
        p1.Alimentarse();
         //Declaracion de otro objeto perro 
        Animal p2= new Perro("Umma" , "carnivoro", 6, "Cocker");
        p2.Alimentarse();
        
        //Declaracio del objeto gato
        Animal gato= new Gato ("Tadeo", "Whiskas", 2 , "Angora");
        gato.Alimentarse();
        
        //Declaracion del objeto caballo
        Animal caballo= new Caballo("Silver" , "Alfalfa", 7 , "Ponny");
        caballo.Alimentarse();
    }
    
}
