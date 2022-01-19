/*
 * EJERCICIO 1 EXTRA COLECCIONES
Diseñar un programa que lea una serie de valores numéricos enteros desde el teclado
y los guarde en un ArrayList de tipo Integer. La lectura de números termina cuando se
introduzca el valor -99. Este valor no se guarda en el ArrayList. A continuación, el
programa mostrará por pantalla el número de valores que se han leído, su suma y su
media (promedio).
 */
package eje_extra_colecciones;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author river
 */
public class Eje_Extra_Colecciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Integer> numeros= new ArrayList();
        Scanner leer= new Scanner(System.in).useDelimiter("\n");
        int suma=0;
       //int numeroNuevo=0;
        //realizo un while para pedir los numeros a usuario.
      
       System.out.println("Ingrese un numero:");
        int num=leer.nextInt();
       while (num!=-99) {
         System.out.println("Ingrese un numero: ");
           num=leer.nextInt();
            if(num!=-99){     
               numeros.add(num);      
        } 
       }
        for (int i = 0; i < numeros.size(); i++) {
           suma= suma + numeros.get(i);
        }
        double promedio = 0;
        promedio = (double) suma / numeros.size();
        System.out.println("El promedio del ArrayList es: "+ promedio);
    
}
}


    

