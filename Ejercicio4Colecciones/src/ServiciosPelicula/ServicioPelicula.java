/*
 * EJERCICIO 4 CLASE SERVICIO.

Un cine necesita implementar un sistema en el que se puedan cargar peliculas.
Para esto, tendremos una clase Pelicula con el titulo, director y duración de la
película (en horas). Implemente las clases y métodos necesarios para esta
situación, teniendo en cuenta lo que se pide a continuación:
18
En el main deberemos tener un bucle que crea un objeto Pelicula pidiéndole al
usuario todos sus datos y guardándolos en el objeto Pelicula.
Después, esa Pelicula se guarda una lista de Peliculas y se le pregunta al usuario
si quiere crear otra Pelicula o no.
Después de ese bucle realizaremos las siguientes acciones:
• Mostrar en pantalla todas las películas.
• Mostrar en pantalla todas las películas con una duración mayor a 1 hora.
• Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo
en pantalla.
• Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo
en pantalla.
• Ordenar las películas por titulo, alfabéticamente y mostrarlo en pantalla.
• Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla.

 */
package ServiciosPelicula;

import Pelicula.Pelicula;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author river
 */
public class ServicioPelicula {

    Pelicula p1 = new Pelicula();

    public void mostrarPeliculas(ArrayList<Pelicula> Peliculas) {
        System.out.println("La lista de  titulos de  peliculas es : ");
        for (Pelicula aux : Peliculas) {
            System.out.println("Titulo: " + aux.getTitulo() + "  Director: " + aux.getDirector() + "  Duración de la pelicula:  " + aux.getDuracion());

        }
    }

    public void mostrarPeliculaLarga(ArrayList<Pelicula> Peliculas) {
        System.out.println("Peliculas de duracion mayor a 1 hora");
        for (Pelicula aux : Peliculas) {
            if (aux.getDuracion() > 1) {
                System.out.println("Listado de peliculas de duracion mayor a 1 hora: " + aux.getTitulo() + " Director: " + aux.getDirector() + " Duracion de la pelicula: " + aux.getDuracion());
            }

        }
    }

    public void ordenarMayorMenor(ArrayList<Pelicula> Peliculas) {
        System.out.println("Listado de peliculas ordenadas de mayor a menor duracion.");
        Peliculas.sort(ordenarDuracionMayor);
        for (Pelicula aux : Peliculas) {
            System.out.println("Peliculas ordenadas de mayor a menor duracion: " + aux.getTitulo() + " Director: " + aux.getDirector() + " Duracion de la pelicula: " + aux.getDuracion());

        }
    }

    public void ordenarMenorMayor(ArrayList<Pelicula> Peliculas) {
        System.out.println("Listado de peliculas ordenadas de menor a mayor duracion.");
        Peliculas.sort(ordenarDuracionMenor);
        for (Pelicula aux : Peliculas) {
            System.out.println("Peliculas ordenadas de menor a mayor duracion: ");

        }
    }

    public void ordenarPorTitulo(ArrayList<Pelicula> Peliculas) {
        System.out.println("Listado de peliculas ordenadas alfabeticamente: ");
        Peliculas.sort(ordenarPorTitulo);
        for (Pelicula aux : Peliculas) {
            System.out.println("Titulo: " + aux.getTitulo() + " Director:  " + aux.getDirector() + " Duracion: " + aux.getDuracion());
        }
    }

    public void ordenarPorDirector(ArrayList<Pelicula> Peliculas) {
        System.out.println("Listado de peliculas ordenas alfabeticamente por director: ");
        Peliculas.sort(ordenarPorDirector);
        for (Pelicula aux : Peliculas) {
            System.out.println("Titulo : " + aux.getTitulo() + " Director: " + aux.getDirector() + " Duracion: " + aux.getDuracion());
        }
    }

//METODOS COMPARATOR
    public static Comparator<Pelicula> ordenarDuracionMayor = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula o1, Pelicula o2) {
            if (o1.getDuracion() < o2.getDuracion()) {
                return -1;
            }
            if (o2.getDuracion() > o1.getDuracion()) {
                return 1;
            }
            return 0;
        }

    };

    public static Comparator<Pelicula> ordenarDuracionMenor = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula o1, Pelicula o2) {
            if (o1.getDuracion() < o2.getDuracion()) {
                return -1;
            }
            if (o2.getDuracion() < o1.getDuracion()) {
                return 1;
            }
            return 0;
        }

    };
    public static Comparator<Pelicula> ordenarPorTitulo = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula o1, Pelicula o2) {
            return o1.getTitulo().compareTo(o2.getTitulo());
        }
    };
    public static Comparator<Pelicula> ordenarPorDirector = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula o1, Pelicula o2) {
            return o1.getDirector().compareTo(o2.getDirector());
        }
    };

}
