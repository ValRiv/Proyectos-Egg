/*Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9
donde la suma de sus filas, sus columnas y sus diagonales son idénticas. Crear un
programa que permita introducir un cuadrado por teclado y determine si este
cuadrado es mágico o no. El programa deberá comprobar que los números
introducidos son correctos, es decir, están entre el 1 y el 9.
 * .
 */
package proyect.vale;

import java.util.Scanner;

/**
 *
 * @author river
 */
public class Ejer27 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int matriz[][] = new int[3][3];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                do {
                    System.out.println("Ingrese un numero entre 1 y 9: ");
                    matriz[i][j] = leer.nextInt();

                } while (matriz[i][j] <= 0 || matriz[i][j] > 9);
            }
        }
        for (int i = 0; i < matriz.length; i++) {
            int[] is = matriz[i];
            // for (int i = 0; i < matriz.length; i++) {
            //int[] is = matriz[i];

            for (i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz.length; j++) {
                    System.out.print("[" + matriz[i][j] + "]");
                }
                System.out.println();
            }
            int fila = 0;
            int columna = 0;
            int aux1 = 0;

            int vecC[] = new int[3];
            int vecF[] = new int[3];

            for (i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[i].length; j++) {
                    if (i == aux1) {

                        vecF[i] = vecF[i] + matriz[i][j];
                        vecC[j] = vecC[j] + matriz[j][i];
                    }
                }
                aux1++;

            }
            int diagonalp = 0;
            int diagonals = 0;
            int auxi = 0;
            int auxj = 3;
            for (i = 0; i < matriz.length; i++) {
                if (i == i) {
                    diagonalp = diagonalp + matriz[i][i];
                }

                diagonals = diagonals + matriz[i][auxj - 1];
                auxj--;
            }
            for ( i = 0; i < vecF.length - 1; i++) {
                if (vecF[i] == vecF[i + 1]) {
                    if (vecC[i] == vecF[i + 1]) {
                        if (diagonalp == diagonals) {
                            System.out.println("La matriz es magica");
                            System.exit(0);
                        }
                    }
                }
            }
            System.out.println("La matriz no es magica");
        }
    }
}
