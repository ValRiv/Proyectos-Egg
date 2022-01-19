/*
 * CLASE MAIN RELACIONES EJERCICIO 1
Realizar un programa para que una Persona pueda adoptar un Perro. Vamos a contar de
dos clases. Perro, que tendrá como atributos: nombre, raza, edad y tamaño; y la clase
Persona con atributos: nombre, apellido, edad, documento y Perro.
Ahora deberemos en el main crear dos Personas y dos Perros. Después, vamos a tener
que pensar la lógica necesaria para asignarle a cada Persona un Perro y por ultimo,
mostrar desde la clase Persona, la información del Perro y de la Persona.
 */
package relaciones;

import Entidad.Perro;
import Entidad.Persona;

/**
 *
 * @author river
 */
public class Relaciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       
        Perro perro1 = new Perro("Max", "Beagle", 3, "Mediano");
        Perro perro2 = new Perro("Umma", "Cocker",4, "Mediano");
        Persona persona1 = new Persona("Vale", "Riveros", 34, 32879115, perro1);
        Persona persona2 = new Persona("Marce", "Cristiano", 34, 36589658, perro2);
        
        System.out.println(persona1.toString());
        System.out.println(persona2.toString());
        
    }
    
}
