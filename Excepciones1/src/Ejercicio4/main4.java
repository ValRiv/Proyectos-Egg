/*
 * Escribir un programa en Java que juegue con el usuario a adivinar un número. La
computadora debe generar un número aleatorio entre 1 y 500, y el usuario tiene
que intentar adivinarlo. Para ello, cada vez que el usuario introduce un valor, la
computadora debe decirle al usuario si el número que tiene que adivinar es mayor
o menor que el que ha introducido el usuario. Cuando consiga adivinarlo, debe
indicárselo e imprimir en pantalla el número de veces que el usuario ha intentado
adivinar el número. Si el usuario introduce algo que no es un número, se debe
controlar esa excepción e indicarlo por pantalla. En este último caso también se
debe contar el carácter fallido como un intento.
 */
package Ejercicio4;

import java.util.Scanner;

/**
 *
 * @author river
 */
public class main4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int num = 0;
        int contador = 0;
        int numAl = (int) Math.floor(Math.random() * (499) + 1);
        System.out.println(numAl);
        while (num != numAl) {
            try {
                System.out.println("Ingrese un numero");
                num = leer.nextInt();

            } catch (Exception e) {
                System.out.println("Error: debe ingresar un numero" + e.toString());
                break;
            }
            if (num < numAl) {
                System.out.println("El numero es muy bajo");
            } else if (num > numAl) {
                System.out.println("El numero es muy alto");
            } else {
                System.out.println("Adivino el numero");
            }

            contador++;
        }
        System.out.println("Intentos" + contador);
    }
}
