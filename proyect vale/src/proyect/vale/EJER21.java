
import java.util.Scanner;

/*Crea una aplicación que a través de una función nos convierta una cantidad de
euros introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o
libras. La función tendrá como parámetros, la cantidad de euros y la moneda a
converir que será una cadena, este no devolverá ningún valor y mostrará un
mensaje indicando el cambio (void).
El cambio de divisas es:
* 0.86 libras es un 1 €
* 1.28611 $ es un 1 €
*  yenes es un 1 €
 * 
package proyect.vale;

/**
 *
 * @author river
 */
public class EJER21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese la cantidad de euros que desea convertir ");
        int euros;

        euros = leer.nextInt();
        System.out.println("Ingrese el tipo de cambio que desee: yenes,libras o dólares");
        String tipodemoneda = leer.next();
    
        cambio(euros,tipodemoneda);
    }

    public static void cambio(int euros1, String tipodemoneda1) {
        if (tipodemoneda1.equalsIgnoreCase("Libra")) {
            double cambiolibra = euros1 * 0.86;
            System.out.println(euros1 + "son" + cambiolibra + "libras");
        }
        if (tipodemoneda1.equalsIgnoreCase("Dolar")) {
            double cambiodolar = euros1 * 1.28611;
            System.out.println(euros1+"son"+cambiodolar+"dolar");
        }
        if (tipodemoneda1.equalsIgnoreCase("yenes")) {
            double cambioyenes = euros1 * 129.852;
            System.out.println(euros1+"son"+cambioyenes+"yenes");
        }
    }
}

        
    




