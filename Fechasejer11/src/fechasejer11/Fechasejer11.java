/*EJERCICIO 11 DATE
 * Pongamos de lado un momento el concepto de POO, ahora vamos a trabajar solo con
la clase Date. En este ejercicio deberemos instanciar en el main, una fecha usando la
clase Date, para esto vamos a tener que crear 3 variables, dia, mes y anio que se le
pedirán al usuario para poner el constructor del objeto Date. Una vez creada la fecha
de tipo Date, deberemos mostrarla y mostrar cuantos años hay entre esa fecha y la
fecha actual, que se puede conseguir instanciando un objeto Date con constructor
vacío.
Ejemplo fecha: Date fecha = new Date(anio, mes, dia);
Ejemplo fecha actual: Date fechaActual = new Date();
Si necesiten acá tienen más información en clase Date:
 */
package fechasejer11;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author river
 */
public class Fechasejer11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       
       
        Scanner leer= new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese un año:  ");
        int anio= leer.nextInt();
        
        System.out.println("Ingrese un mes: ");
        int mes= leer.nextInt();
        
        System.out.println("Ingrese un dia: ");
        int dia=leer.nextInt();
        System.out.println("Ingrese una hora: ");
        int hora= leer.nextInt();
        System.out.println("Ingrese los minutos: ");
        int minutos=leer.nextInt();
        System.out.println("Ingrese los segundos: ");
        int segundos=leer.nextInt();
        
        Date fecha_usuario=new Date(anio-1900,mes-1,dia,hora,minutos,segundos);
        System.out.println("----FECHA USUARIO-----\n" + fecha_usuario);
        
        Date fecha_actual= new Date();
        System.out.println("----FECHA ACTUAL-----\n" + fecha_actual );
        
        int diferencia= fecha_actual.getYear()- fecha_usuario.getYear();
        System.out.println("Hay diferencia de: " + diferencia +" años de la fecha actual.");
        
        
        
        
    }

    
    }

   
    

