/*
 * EJERCICIO EXTRA 6 SERVICIO.
 */
package ahorcadoextra.Servicio;

import ahorcadoextra.Entidad.Entidad;
import java.util.Scanner;

/**
 *
 * @author river
 */
public class Servicio {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Entidad datos =new Entidad();
    
    //Metodo crearJuego(): le pide la palabra al usuario y cantidad de jugadas máxima.
//Con la palabra del usuario, pone la longitud de la palabra, como la longitud del vector.
//Después ingresa la palabra en el vector, letra por letra, quedando cada letra de la
//palabra en un índice del vector. Y también, guarda en cantidad de jugadas máximas,
//el valor que ingresó el usuario y encontradas en 0.
    
    public void crearJuego(){
        System.out.println("Ingrese la palabra: ");
        String palabra=leer.next();
        String aux[]= new String[palabra.length()];
       
        for(int i=0; i< palabra.length(); i++){
            aux[i]=palabra.substring(i, i+1);
            //buscar[i]= nuevo;
            System.out.print("[" + aux[i] + "]");
        }
         //Método longitud(): muestra la longitud de la palabra que se debe encontrar. Nota:
//buscar como se usa el vector.length.
  
        System.out.println("La palabra es : "+ palabra);
        System.out.println(" La cantidad de letras de la palabra es: "+ palabra.length());
    
        
       //datos.setBuscar(aux);
        System.out.println("Ingrese la cantidad de jugadas maximas");
         int intentos= leer.nextInt();
        
        System.out.println("Sus jugadas maximas son: " + intentos);
    }
    //Método buscar(letra): este método recibe una letra dada por el usuario y busca sila
//letra ingresada es parte de la palabra o no. También informará si la letra estaba o no
   
    public void buscarLetra(){
        
        
    }
        
    }

