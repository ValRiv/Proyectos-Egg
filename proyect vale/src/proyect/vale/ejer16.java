/*Escriba un programa que lea 20 números. Si el número leído es igual a cero se debe
salir del bucle y mostrar el mensaje "Se capturó el numero cero". El programa
deberá calcular y mostrar el resultado de la suma de los números leídos, pero si el
número es negativo no debe sumarse. Nota: recordar el uso de la sentencia break
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyect.vale;

import java.util.Scanner;

/**
 *
 * @author river
 */
public class ejer16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer=new Scanner (System.in).useDelimiter("\n");
       int num;
       int suma =0;
       for (int i=1; i<=40; i++){
           System.out.println("Ingrese un numero");
           num =leer.nextInt();
           if (num ==0 ){
               System.out.println("El numero ingresado es cero ha sido capturado");
               break;
           }else{
               if(num>0){
                   suma = suma+num;
               } i = i +1;
           
       System.out.println(" La suma de los numeros ingresados es: " + suma);
       }
    }
    }
}


                
               
          
       
       
    
    
    

