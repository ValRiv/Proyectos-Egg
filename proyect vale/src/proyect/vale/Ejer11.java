/*Escriba un programa que pida una frase o palabra y valide si la primera letra de esa
frase es una ‘A’. Si la primera letra es una ‘A’, se deberá de imprimir un mensaje por
pantalla que diga “CORRECTO”, en caso contrario, se deberá imprimir
“INCORRECTO”. Nota: investigar la función Substring y equals() de Java.
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
public class Ejer11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String frase;
        String letra = "A" ;
        System.out.println("Ingrese una frase ");
        frase = leer.next();
        String letra1 = frase.substring(0,1);
        if (letra.equals(letra1) == true) {
       
            System.out.println("La frase  es correcta");
                }
        else 
            { System.out.println("La frase es incorrecta ");
        }
    }

   // private static (int boolean Substring i) {
      //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    

