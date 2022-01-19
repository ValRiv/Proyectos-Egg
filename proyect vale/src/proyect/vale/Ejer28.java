/*Dadas dos matrices cuadradas de números enteros, la matriz M de 10x10 y la matriz
P de 3x3, se solicita escribir un programa en el cual se compruebe si la matriz P está
contenida dentro de la matriz M. Para ello se debe verificar si entre todas las
submatrices de 3x3 que se pueden formar en la matriz M, desplazándose por filas o
columnas, existe al menos una que coincida con la matriz P. En ese caso, el
programa debe indicar la fila y la columna de la matriz M en la cual empieza el
primer elemento de la submatriz P.
 * 
 */
package proyect.vale;

import java.util.Scanner;

/**
 *
 * @author river
 */
public class Ejer28 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Inicializo las variables
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int matrizM[][] = new int[10][10];
        int matrizP[][] = new int[3][3];
        int cont = 0;
        int contmatriz = 0;

        //creo la matriz 10x10 y lo lleno con numeros aleatorios y lo muestro
        for (int i = 0; i < matrizM.length; i++) {
            for (int j = 0; j < matrizM.length; j++) {
                matrizM[i][j] = (int) (Math.random() * 100);
                if (matrizM[i][j] < matrizM.length) {
                    System.out.print("0" + matrizM[i][j] + "  ");
                } else {
                    System.out.print(matrizM[i][j] + "  ");
                }
            }
            System.out.println("");

        }
//creo la mariz 3x3 y la relleno con numeros ingresados por el usuario
        for (int i = 0; i < matrizP.length; i++) {
            System.out.println("Ingrese los numeros de la fila de la matriz que desea encontrar" + (i + 1));
            for (int j = 0; j < matrizP.length; j++) {
                matrizP[i][j] = leer.nextInt();
            }
        }
        //Busco la matrix 3x3 en la matriz 10x10
        int fila = 0;
        int columna = 0;
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                fila = i;
                columna = j;
                for (int k = 0; k < 3; k++) {
                    for (int n = 0; n < 3; n++) {
                        if (matrizP[k][n] == matrizM[fila][columna]) {
                            cont++;
                        }
                        columna++;
                    }
                    columna = j;
                    fila++;
                }
                if (cont == 9) {
                    System.out.println("Se encontro la matriz en la fila " + i + " y en la columna " + j);
                    contmatriz++;
                }

                cont = 0;
            }
        }

        if (contmatriz == 0) {
            System.out.println("La matriz 3x3 no se encontro en la matriz 10x10");
        }
    }
}
