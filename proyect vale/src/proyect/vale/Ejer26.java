/*Realice un programa que compruebe si una matriz dada es anti simétrica. Se dice
que una matriz A es anti simétrica cuando ésta es igual a su propia traspuesta, pero
cambiada de signo. Es decir, A es anti simétrica si A = -AT
. La matriz traspuesta de
una matriz A se denota por A
T y se obtiene cambiando sus filas por columnas (o
viceversa).
 * 
 */
package proyect.vale;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author river
 */
public class Ejer26 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in).useDelimiter("\n");
        Random random= new Random();
        int[][] matriz = new int[4][4];
        int[][] matriztraspuesta = new int[4][4];
        int[][] mantisimetrica= new int[4][4];
        boolean teste=false;
        System.out.println("Matriz original");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matriz[i][j] = random.nextInt((10 - 0) + 0);
                mantisimetrica[i][j]=matriz[i][j]*(-1);
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
      // System.out.println("Matriz asimetrica");
    
           for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
               mantisimetrica[i][j] = -mantisimetrica[i][j]*(-1);
            }
           }
         System.out.println(" Matriz negativa de original");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
             System.out.print("[" + mantisimetrica[i][j] + "]");
            }
            System.out.println(" ");
        
        }
    
           for(int i=0; i<4 ; i++){
               for(int j=0; j<4; j++){
                   if((matriztraspuesta[j][i])==(mantisimetrica[i][j])){
                       teste= true;
                        
                   }
                       else{ teste=false;
               }
           }
           }
           if (teste==true){
               System.out.println("La matriz es antisimetrica");
           }
           else{
               System.out.println("La matriz NO es antisimetrica");
           }
    }
}

           

   
    

