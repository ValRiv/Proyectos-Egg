/*
 *Inicializar un objeto de la clase Persona ejercicio 7 de la guía POO, a null y tratar
de invocar el método esMayorDeEdad() a través de ese objeto. Luego, englobe el
código con una cláusula try-catch para probar la nueva excepción que debe ser
controlada.
 */
package Ejercicio1;

/**
 *
 * @author river
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ValidarNumero {
        
        Persona personaNueva= new Persona();
        personaNueva=null;
        
        try{
            System.out.println("Es mayor de edad" + personaNueva.mayorDeEdad());
            
        }catch (NullPointerException e){
            System.out.println("Error:" +e.toString());
        }finally{
            System.out.println("Saliendo del programa");
        }
        
    }
    
}
