/*
 * Implemente un programa para una Librería haciendo uso de un HashSet para evitar
datos repetidos. Para ello, se debe crear una clase llamada Libro que guarde la
información de cada uno de los libros de una Biblioteca. La clase Libro debe guardar
el título del libro, autor, número de ejemplares y número de ejemplares prestados.
También se creará en el main un HashSet de tipo Libro que guardará todos los libros
creados.
En el main tendremos un bucle que crea un objeto Libro pidiéndole al usuario todos
sus datos y los seteandolos en el Libro. Despues, ese Libro se guarda en el conjunto y
se le pregunta al usuario si quiere crear otro Libro o no.
La clase Librería contendrá además los siguientes métodos:
• Constructor por defecto.
• Constructor con parámetros.
• Métodos Setters/getters
• Método prestamo(): El usuario ingresa el titulo del libro que quiere prestar y se lo
busca en el conjunto. Si está en el conjunto, se llama con ese objeto Libro al
método. El método se incrementa de a uno, como un carrito de compras, el
atributo ejemplares prestados, del libro que ingresó el usuario. Esto sucederá
cada vez que se realice un préstamo del libro. No se podrán prestar libros de los
que no queden ejemplares disponibles para prestar. Devuelve true si se ha
podido realizar la operación y false en caso contrario.
20
• Método devolucion(): El usuario ingresa el titulo del libro que quiere devolver y se
lo busca en el conjunto. Si está en el conjunto, se llama con ese objeto al método.
El método decrementa de a uno, como un carrito de compras, el atributo
ejemplares prestados, del libro seleccionado por el usuario. Esto sucederá cada
vez que se produzca la devolución de un libro. No se podrán devolver libros
donde que no tengan ejemplares prestados.Devuelve true si se ha podido
realizar la operación y false en caso contrario.
• Método toString para mostrar los datos de los libros.
 */
package eje_extra_3;

import eje_extra_3.EntidadLibro.Libro;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * @author river
 */
public class Eje_EXTRA_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       Libro c1 = new Libro();

        ArrayList<String> libros = new ArrayList();

        libros.add("La Odisea");

        c1.setLibros(libros); // Se guarda la lista        
        
        // Conjuntos 

        HashSet<Integer> numeros = new HashSet();

        numeros.add(10);
        numeros.add(86);
        // Fua el Diego

        c1.setNumeros(numeros); // Se guarda el conjunto
        
        // Mapas

        HashMap<Integer, String> alumnos = new HashMap();

        alumnos.put(40234123, "Nacho");

        c1.setAlumnos(alumnos); // Se guarda el mapa

        for (String libro : c1.getLibros()) {
            System.out.println(libro); // Mostrar el conjunto usando el get
        }

        for (Integer numero : c1.getNumeros()) {
            System.out.println(numero); // Mostrar el conjunto usando el get
        }
        
        c1.recorrerColecciones(); // Mostramos la lista a traves del objeto
        
        
    }

}