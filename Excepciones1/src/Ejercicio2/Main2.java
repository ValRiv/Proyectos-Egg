/*
 * EJERCICIO 2
Definir una Clase que contenga algún tipo de dato de tipo array y agregue el
código para generar y capturar una excepción ArrayIndexOutOfBoundsException
(índice de arreglo fuera de rango).
 */
package Ejercicio2;

/**
 *
 * @author river
 */
public class Main2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Arreglo nuevoArreglo = new Arreglo();

        try {
            nuevoArreglo.cargarArreglo();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: no se pueden almacenar mas de dos numeros: " + e.toString());
        } finally {
            System.out.println("Saliendo del programa");
        }

    }

}
