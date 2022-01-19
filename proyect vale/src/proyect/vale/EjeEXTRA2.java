/*Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor diferente a
cada una. A continuación, realizar las instrucciones necesarias para que: B tome el
valor de C, C tome el valor de A, A tome el valor de D y D tome el valor de B.
Mostrar los valores iniciales y los valores finales de cada variable. Utilizar sólo una
variable auxiliar.
 * 
 */
package proyect.vale;

import java.util.Scanner;

/**
 *
 * @author river
 */
public class EjeEXTRA2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer= new Scanner (System.in).useDelimiter("\n");
        System.out.println("Ingrese un valor para asignarle a la variable A");
        int A=leer.nextInt();
        System.out.println("Ingrese un valor para asignarle a la variable B ");
        int B= leer.nextInt();
        System.out.println("Ingrese un valor para asignarle a la variable C");
        int C=leer.nextInt();
        System.out.println("Ingrese un valor para asignarle a la variable D");
        int D= leer.nextInt();
        
        int aux =A;
        A=A+D;
        D=A-D;
        A=A-D;
        
        B=B+C;
        C=B-C;
        B=B-C;
       
        D=C;
        
        C=aux+C;
        aux=C-aux;
        C= C-aux;
        
         System.out.println(" El nuevo valor de A es:  " + A);
         System.out.println(" El nuevo valor de B es:  " +B);
         System.out.println("El nuevo valor de C es:  " + C); 
         System.out.println("El nuevo valor de D es:  " + D);
    }
}

       
    
         
         
        