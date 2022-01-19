package Servicios;

import Entidades.Autor;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author river
 */
public class AutorServicio {

    GestorServicioVale gestor = new GestorServicioVale();
    Scanner leer = new Scanner(System.in);

    public void ingresarAutor() {
        Autor autor = new Autor();
        System.out.println("Ingresar el nombre del autor: ");
        autor.setNombre(leer.next());
        gestor.ingresarEntidad(autor);
    }

    public void editarAutor() {
        System.out.println("Seleccione el autor a modificar: ");
        listarAutor();
        int opcion = leer.nextInt();
        leer.nextLine();
        Autor autor = buscarAutorID(opcion);
        System.out.println("Escriba el nuevo nombre del autor: ");
        autor.setNombre(leer.next());
        gestor.actualizarEntidad(autor);
    }

    public void eliminarAutor() {
        System.out.println("Ingresar el numero de Id del autor que desea eliminar: ");
        int isbn = leer.nextInt();
        String jpql = "SELECT a FROM Autor a WHERE a.id=" + isbn;
        Autor autor = (Autor) gestor.listarEntidad(jpql);

        if (autor == null) {
            System.out.println("No hay autor para eliminar");
        } else {
            autor.setAlta(false);
            gestor.actualizarEntidad(autor);
        }
    }

    public void listarAutor() {
        String jpql = "SELECT a FROM Autor a";
        List<Autor> list = gestor.listarEntidades(jpql);
        if (list.isEmpty()) {
            System.out.println("La lista esta vacia");

        } else {
            for (Autor aux : list) {
                System.out.println(+aux.getId() + ")Nombre: " + aux.getNombre());
            }
        }
    }

    public Autor buscarAutorID(int id) {
        String jpql = "SELECT a FROM Autor a WHERE a.id= " + id;
        Autor autor = (Autor) gestor.listarEntidad(jpql);
        return autor;
    }

    public void buscarAutorNombre() {
        System.out.println("Indique el nombre completo del autor");
        String nombre = leer.nextLine();
        String jpql = "SELECT a FROM Autor a WHERE  a.nombre IN (' " + nombre + "')";
        List<Autor> list =  gestor.listarEntidades(jpql);

        if (list.isEmpty()) {
            System.out.println("La lista esta vacia");

        } else {
            for (Autor aux : list) {
                System.out.println("Id: " + aux.getId() + "Nombre: " + aux.getNombre());

            }
        }
    }
}
