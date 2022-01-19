/*Realizar un algoritmo que rellene un vector con los 100 primeros números enteros y
los muestre por pantalla en orden descendente.
 * 
 */
package proyect.vale;

import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author river
 */
public class Ejer22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in).useDelimiter("\n");
        int[] vector;
        vector= new int [100];

        Comparator<Object> reverseOrder = Collections.reverseOrder();
        
        for( int  i=0; i<100; i++){
            int max = i;
            for(int j =99; j>=0; j--){
                if (vector[j] > vector[max]){
                    max=j;
                }
            }
            if (i!=max){
               int aux= vector[i]; 
               vector[i] = vector[max];
               vector[max]=aux;
            }
            System.out.println("vector[" + i + " ]");
            //vector[i]=leer.nextInt();
                    
        }
    }
    
}
