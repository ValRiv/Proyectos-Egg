/*Realizar un programa que simule el funcionamiento de un dispositivo RS232, este
tipo de dispositivo lee cadenas enviadas por el usuario. Las cadenas deben llegar
con un formato fijo: tienen que ser de un máximo de 5 caracteres de largo, el primer
carácter tiene que ser X y el último tiene que ser una O.
Las secuencias leídas que respeten el formato se consideran correctas, la
secuencia especial “&&&&&” marca el final de los envíos (llamémosla FDE), y toda
secuencia distinta de FDE, que no respete el formato se considera incorrecta.
Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas
correctas e incorrectas recibidas. Para resolver el ejercicio deberá investigar cómo
se utilizan las siguientes funciones de Java Substring(), Length(), equals().
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
public class Ejer17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        String cadena, salir;
        char letra, letra2;
        int contacorrecto, containcorrecto, largo;
        // String letra = "X" ;
        //String letra2 = "O" ;
        contacorrecto = 0;
        containcorrecto = 0;
        salir = "&&&&&";

        System.out.println("Ingrese una cadena de maximo 5 caracteres de largo, el primer caracter tiene que ser X y el ultimo una O");
        do {
            cadena = leer.next();
            largo = cadena.length();
            letra = cadena.charAt(0);
            letra2 = cadena.charAt(largo - 1);

            // System.out.println(n);  
            if (letra == 'x' & letra2 == 'o' & largo < 6) {
                //System.out.println("Los caracteres ingresados con correctos");
                contacorrecto = contacorrecto + 1;
//porque no me toma los correctos??????????????
            } else {
                //System.out.println("Los caracteres ingresados son incorrectos");
                containcorrecto = containcorrecto + 1;

            }
        } while (!cadena.equals(salir));

        System.out.println("La suma de los caracteres correctos son " + contacorrecto);
        System.out.println("La suma de los caracteres incorrectos son " + containcorrecto);
    }
}
