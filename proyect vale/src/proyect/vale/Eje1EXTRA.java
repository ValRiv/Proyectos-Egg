/*Dado un tiempo en minutos, calcular su equivalente en días y horas. Por ejemplo, si
el usuario ingresa 1600 minutos, el sistema debe calcular su equivalente: 1 día, 2
horas.
 * .
 */
package proyect.vale;

import java.util.Scanner;

/**
 *
 * @author river
 */
public class Eje1EXTRA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer= new Scanner (System.in).useDelimiter("\n");
       System.out.println(" Ingrese una cantidad de minutos que desea saber su equivalente en dias, y horas");
       int minutos= leer.nextInt();
       int dias;
       int horas;
      
       dias =((minutos/60)/24);
       int dia= (int)Math.abs(dias);
       if( dia >=1 ){
       horas= (minutos %60)/20;
       } else{
           horas= minutos/60;
       }
        System.out.println("Los minutos ingresados son   "+ minutos+  " minutos corresponden a " +dias+ " dia/s y  " + horas+ "  hora/s");
    }
    
    
}
