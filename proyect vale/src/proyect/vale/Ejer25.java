/*   
 */
package proyect.vale;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author river
 */
public class Ejer25 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Random random = new Random();
        int[][] matriz = new int[4][4];
        int[][] matriztraspuesta = new int[4][4];
        System.out.println("Matriz original");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matriz[i][j] = random.nextInt((10 - 0) + 0);
                
                System.out.print("[" + matriz[i][j] + "]");
            }
            System.out.println(" ");
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matriztraspuesta[j][i] = matriz[i][j];

            }
        }
        System.out.println(" Matriz transpuesta");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("[" + matriztraspuesta[i][j] + "]");
            }
            System.out.println(" ");
        }
    }
}
