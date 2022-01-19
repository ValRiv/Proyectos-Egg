/*
 *Defina una clase llamada DivisionNumero. En el método main utilice un Scanner
para leer dos números en forma de cadena. A continuación, utilice el método
parseInt() de la clase Integer, para convertir las cadenas al tipo int y guardarlas en
dos variables de tipo int. Por ultimo realizar una división con los dos numeros y
mostrar el resultado.
Todas estas operaciones puede tirar excepciones a manejar, el ingreso por
teclado puede causar una excepción de tipo InputMismatchException, el método
Integer.parseInt() si la cadena no puede convertirse a entero, arroja una
NumberFormatException y además, al dividir un número por cero surge una
ArithmeticException. Manipule todas las posibles excepciones utilizando bloques
try/catch para las distintas excepciones
 */
package Ejercicio3;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author river
 */
public class DivisionNumero1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        try {
            System.out.println("Ingrese un numero en forma de cadena");
            String cadena1 = leer.next();
            System.out.println("Ingrese un segundo numero en forma de cadena");
            String cadena2 = leer.next();

            int numero1 = Integer.parseInt(cadena1);
            int numero2 = Integer.parseInt(cadena2);
            int Division = numero1 / numero2;
        } catch (InputMismatchException e) {
            System.out.println("Error al leer los datos por teclado" + e.toString());
        } catch (NumberFormatException e) {
            System.out.println("La cadena no puede convertirse a entero" + e.toString());
        } catch (ArithmeticException e) {
            System.out.println("No se puede dividir por cero" + e.toString());

        }
    }
}
