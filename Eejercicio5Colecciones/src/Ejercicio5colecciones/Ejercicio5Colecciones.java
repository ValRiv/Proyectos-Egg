/*
          EJERCICIO 5 COLECCIONES EN EL MAIN.
 *Se requiere un programa que lea y guarde países, y para evitar que se ingresen
repetidos usaremos un conjunto. El programa pedirá un país en un bucle, se
guardará el país en el conjunto y después se le preguntará al usuario si quiere
guardar otro país o si quiere salir, si decide salir, se mostrará todos los países
guardados en el conjunto.
Después deberemos mostrar el conjunto ordenado alfabéticamente para esto
recordar como se ordena un conjunto.
Y por ultimo, al usuario se le pedirá un país y se recorrerá el conjunto con un
Iterator, se buscará el país en el conjunto y si está en el conjunto se eliminará el
país que ingresó el usuario y se mostrará el conjunto. Si el país no se encuentra
en el conjunto se le informará al usuario.
 */
package Ejercicio5colecciones;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author river
 */
public class Ejercicio5Colecciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        HashSet<String> paises = new HashSet();

        while (true) {
            System.out.println("Ingrese un pais que desea: ");
            String pais = leer.next();
            paises.add(pais);
            System.out.println("Ingrese cualquier tecla para ingresar otro pais o S para salir");
            String salir = leer.next();
            if (salir.toUpperCase().equals("S")) {
                break;
            }

        }
        //mostrar los paises guardados
        System.out.println("Paises guardados \n" + paises);

        //mostrar el conjunto ordenado alfabeticamente.
        ArrayList<String> paisesOrdenados = new ArrayList(paises); //lo guarda en una lista
        Collections.sort(paisesOrdenados);//lo ordena alfabeticamente
        System.out.println("Paises ordenados alfabeticamente: " + paisesOrdenados);// los muestra ordenados alfabeticamente

        // se recorre el conjunto con un iterator
        System.out.println("Ingrese un nuevo pais para ver si esta en la lista: ");
        String paisNuevo = leer.next();
        Iterator iterator = paises.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().equals(paisNuevo)) {
                iterator.remove();
            }
        }
        //borrar el pais ingresado si ya se encuentra en la lista
        if (!paises.contains(paisNuevo)) {
            System.out.println("El pais no se ha encontrado");
        
        }

        //mostrar la lista nueva
        System.out.println(paises);

    }
}
