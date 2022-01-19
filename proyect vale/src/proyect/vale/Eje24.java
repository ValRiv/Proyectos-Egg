/*Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito,
cuántos de 2 dígitos, etcétera (hasta 5 dígitos). 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyect.vale;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author river
 */
public class Eje24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese el tamaño del vector que desea");
        int n = leer.nextInt();
      //  System.out.println(" Ingrese numeros a nuestro vector de hasta 5 digitos");
        //int num = leer.nextInt();
        // int contador=0;
        int[] vector = new int[n];

        rellenarYmostrar(vector,n);
        int[]cantidad = cantidadDigitos(vector, n);

        System.out.println("");
    
 System.out.println("El vector tiene [digito1],[digito2],[digito3],[digito4]:" + Arrays.toString(cantidad));
    }
    
    
    static void rellenarYmostrar(int[]vector,int n) {
        for (int i = 0; i < n; i++) {
            vector[i] = (int) (Math.random() * 999);
        }
        for (int i = 0; i < n; i++) {
            System.out.println("[" + vector[i] + "]");
        }
        System.out.println("");
    }
    
    public static int[]cantidadDigitos(int[]vector,int n) {
        int[] aux = new int[4];
        int contador1 = 0;
        int contador2 = 0;
        int contador3 = 0;
        int contador4 = 0;
        for (int i = 0; i < n; i++) {
            if (vector[i] >= 0 && vector[i] < 10) {
                contador1++;
            }else if (vector[i] >= 10 && vector[i] < 100) {
                    contador2++;
            }else if (vector[i] >= 100 && vector[i] < 1000) {
                        contador3++;
                    } else  contador4++;
                    }

                
                aux[0]=contador1;
                aux[1]=contador2;
                aux[2]=contador3;
                aux[3]=contador4;
                return aux;
            }
        }
       
    


        
