/*
 * EJERCICIO 4  PEICULA MAIN.
 */
package ejercicio4colecciones;

import Pelicula.Pelicula;
import ServiciosPelicula.ServicioPelicula;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author river
 */
public class Ejercicio4Colecciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       ArrayList<Pelicula>Peliculas= new ArrayList();
       ServicioPelicula serv = new ServicioPelicula();
       Scanner leer= new Scanner (System.in).useDelimiter("\n");
       
        while (true) { 
            Pelicula nuevaPelicula= new Pelicula();
            System.out.println("Ingrese el titulo de la pelicula que desea: ");
            String titulo=leer.next();
            System.out.println("Ingrese el nombre del director de la pelicula que eligio previamente: ");
            String director=leer.next();
            System.out.println("Ingrese la duracion de la pelicula: ");
            double  duracion= leer.nextDouble();
            leer.nextLine();
            nuevaPelicula.setTitulo(titulo);
            nuevaPelicula.setDirector(director);
            nuevaPelicula.setDuracion(duracion);
            Peliculas.add(nuevaPelicula);
            System.out.println("Ingrese cualquier tecla para ingresar otra pelicula o S para salir");
            String salir=leer.next();
            if(salir.toUpperCase().equals("S")){
                break;
            }
           
            
        }
        serv.mostrarPeliculas(Peliculas);
        serv.mostrarPeliculaLarga(Peliculas);
        serv.ordenarMayorMenor(Peliculas);
        serv.ordenarPorTitulo(Peliculas);
        serv.ordenarPorDirector(Peliculas);
    }
    
}
