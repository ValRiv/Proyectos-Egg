/*
 *                   EJERCICIO 8.CLASE MAIN.
Realizar una clase llamada Cadena que tenga como atributos una frase (de tipo de
String) y su longitud. En el main se creará el objeto y se le pedirá al usuario que ingrese
una frase que puede ser una palabra o varias palabras separadas por un espacio en
blanco y a través de los métodos set, se guardará la frase y la longitud de manera
automática según la longitud de la frase ingresada. Deberá además implementar los
siguientes métodos:
 */
package cadenaejer8;

import Cadena.Cadena;
import CadenaServicio.CadenaServicio;
import java.util.Scanner;

/**
 *
 * @author river
 */
public class Cadenaejer8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer= new Scanner (System.in).useDelimiter("\n");
        
       CadenaServicio serv= new CadenaServicio();//se crea el objeto cadenaService
        Cadena c1=new Cadena();//se crea el objeto cadena1
         //Se ingresa la frase por teclado y se setean los atributos
      System.out.println("Ingrese una frase de 2 o mas palabras ");
        String frase=leer.next();
        //String frase=new String("");
              c1.setFrase(frase);
              c1.setLongitud(frase.length());
              
             
 
       serv.mostrarVocales(frase);
       serv.invertirCadena(frase);
       
      
       // System.out.println("Ingrese un caracter");
        //char letra = leer.next().charAt(0);
        serv.vecesRepetido();
        
              
        System.out.println("Ingrese una nueva frase para comparar la longitud con la primer frase");
        String frase2 = leer.next();
        serv.compararLongitud(frase, frase2);
        
        //System.out.println("Ingrese una nueva frase para unirla a la frase: "+ frase);
        //String frase3 = leer.next();
        serv.unirFrases(frase, frase2);
       
         System.out.println("Ingrese un caracter para reemplazarlo por la letra: a");
        char letra2 = leer.next().charAt(0);
        serv.reemplazar(frase,letra2);
       
         System.out.println("Ingrese un caracter para averiguar si esta en la frase");
        String caracter = leer.next();
        boolean contiene = serv.contiene(frase, caracter);
        if(contiene == true){
            System.out.println("La frase contiene el caracter: "+caracter);
        }else{
            System.out.println("La frase no contiene el caracter: "+caracter);
        }
     
       
    }
}
   
    
        
       
      
       