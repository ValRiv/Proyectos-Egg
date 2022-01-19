/*
 * EJERCICIO 12 CLASE MAIN PERSONA.
 */
package personaejer12;

import Persona.Entidad.Persona;
import java.util.Scanner;
import personaejer12.PersonaServicio.PersonaServicio;

/**
 *
 * @author river
 */
public class Personaejer12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer= new Scanner(System.in).useDelimiter("\n");
        
        PersonaServicio serv= new PersonaServicio();
        Persona persona1= serv.crearPersona();
        System.out.println(persona1.getNombre()+" tiene "+ serv.calcularEdad(persona1)+ " años");
        
       
        System.out.println("Ingrese su edad para comparar: " );
        int edad=leer.nextInt();
        boolean menor =serv.menorEdad(serv.calcularEdad(persona1),edad);
        if(menor == true){
            System.out.println(persona1.getNombre()+" es menor");
        }else{
            System.out.println(persona1.getNombre()+" es mayor");
        }
        
        serv.mostrarEdad(persona1);
    }
    
}
