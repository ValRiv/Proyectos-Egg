/*
 *EJERCICIO 10 CLASE MAIN ARRAYS
0. Realizar un programa en Java donde se creen dos arreglos: el primero será un arreglo
A de 50 números reales, y el segundo B, un arreglo de 20 números, también reales. El
programa deberá inicializar el arreglo A con números aleatorios y mostrarlo por
pantalla. Luego, el arreglo A se debe ordenar de menor a mayor y copiar los primeros
10 números ordenados al arreglo B de 20 elementos, y rellenar los 10 últimos
elementos con el valor 0.5. Mostrar los dos arreglos resultantes: el ordenado de 50
elementos y el combinado de 20.
 */

import Arreglo.Entidades.Arreglo;
import java.util.Arrays;

/**
 *
 * @author river
 */
public class Arregloeje10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("-----ARREGLO A------");
        //inicializo dos arreglos
        double[] A=new double [50];
        double[] B= new double[20];
        Arreglo A1= new Arreglo();
        for(int i=0; i<50;i++){
            A[i]=(Math.random()*100);
        }
        //muestro el arreglo generado
        System.out.println("Primer arreglo de 50 elementos");
        System.out.println(Arrays.toString(A));
          //ordeno el arreglo de menor a mayor
          Arrays.sort(A);
          
           //copio los primeros 10 elementos del arreglo 1 en el arreglo 2
           
           for(int i=0; i<10;i++){
               B[i]=A[i];    
           }
           
           //relleno el arreglo 2 con el valor 0.5
           for(int i=10; i <20;i++){
               B[i]=0.5;
           }
           //guardo los arreglos en mi objeto nuevoArreglo
           A1.setA(A);
           A1.setB(B);
    //muestro los arreglos guardados en mi objeto nuevoArreglo
        System.out.println("El arreglo A de 50 elementos ordenado de menor a mayor: ");
        System.out.println(Arrays.toString(A1.getA()));
        System.out.println("-------ARREGLO B------");
        System.out.println("Este es el segundo arreglo COMBINADO: ");
        System.out.println(Arrays.toString(A1.getB()));

    }
    
}
