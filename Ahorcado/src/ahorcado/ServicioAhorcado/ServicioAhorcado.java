/*
 * CLASE SERVICIO AHORCADO
 */
package ahorcado.ServicioAhorcado;


import ahorcado.Ahorcado;
import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author river
 */
public class ServicioAhorcado {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Ahorcado datos= new Ahorcado();
    
    public void creaAhorcado(){
        System.out.println("Ingrese la palabra: ");
        String palabra=leer.next();
        String aux[]= new String[palabra.length()];
        
        for(int i=0; i< palabra.length(); i++){
            aux[i]=palabra.substring(i, i+1);
        }
       datos
        
    }
}

            
        
    
    

