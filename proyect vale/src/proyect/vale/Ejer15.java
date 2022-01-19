package proyect.vale;


import java.util.Scanner;



/*/ *
Realizar un programa que pida dos números enteros positivos por teclado y
muestre por pantalla el siguiente menú:
MENÚ
1. Sumar
2. Restar
3. Multiplicador
4. Dividir
5. Salir
Elija opción:
El usuario deberá elegir una opción y el programa deberá mostrar el resultado por
pantalla y luego volver al menú. El programa ejecutarse hasta que se elija la
opción 5. Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir
del programa siguiente directamente, se debe mostrar el mensaje de confirmación:
¿Está seguro que desea salir del programa (S / N)? Si el usuario selecciona el
carácter 'S' se sale del programa, caso contrario se vuelve a mostrar el menú.

 
}
package proyect.vale;

import java.util.Scanner;

/**
 *
 * @author river
 */
public class Ejer15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer= new Scanner ( System.in).useDelimiter("\n");
        int opc = 0;
    
        
 
        int num1, num2,op;

        String l= "N";

        System.out.println("Ingrese el primer numero luego el segundo");

        num1 =leer.nextInt();

        num2 = leer.nextInt();

        do{

            System.out.println("MENU");

            System.out.println("ELIJA UNA OPCIÓN:\n1 SUMAR \n2 RESTAR \n3 MULTIPLICAR \n4 DIVIDIR \n5 SALIR");

            op = leer.nextInt();

            switch(op){

                case 1:

                     System.out.println(num1+" + "+num2+"= "+(num1+num2));

                break;

                case 2:

                    System.out.println(num1+" - "+num2+"= "+(num1-num2));

                break;

                case 3:

                    System.out.println(num1+" x "+num2+"= "+(num1*num2));

                break;

                case 4:
            
                
                if(num2==0){
                    System.out.println("No se puede realizar la division");
                }else{
                    double resultado=(double)num1/num2;
                    System.out.println(num1+" / "+num2+"= "+ resultado);
            }

                break;

                case 5:

                    System.out.println("Esta seguro que desea salir? S/N");

                    l = leer.nextLine();

                break;

                default:

                     System.out.println("ERROR");

            }
            l = leer.nextLine();
         }while (!l.equalsIgnoreCase("S"));

    }

}

