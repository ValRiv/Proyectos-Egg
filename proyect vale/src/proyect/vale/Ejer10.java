/*Realizar un programa que solo permita introducir solo frases o palabras de 8 de
largo. Si el usuario ingresa una frase o palabra de 8 de largo se deberá de imprimir
un mensaje por pantalla que diga “CORRECTO”, en caso contrario, se deberá
imprimir “INCORRECTO”. Nota: investigar la función Lenght() en Java.
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
public class Ejer10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer= new Scanner (System.in);
        String frase;
        System.out.println("Ingrese una palabra o frase de 8 letras");
        frase= leer.next();
        int n = frase.length();
       
           System.out.println(n);  
           if (frase.length() == 8 ){
               System.out.println("La frase ingresada es correcta");
           }
           else{
               System.out.println("La frase ingresada es incorrecta");
           }
    }
}


        
    



