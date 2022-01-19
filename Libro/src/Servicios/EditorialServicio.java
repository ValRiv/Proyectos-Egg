package Servicios;

import Entidades.Editorial;
import java.util.List;
import java.util.Scanner;

/*
 *
 * @author river
 */
public class EditorialServicio {

    GestorServicioVale gestor = new GestorServicioVale();
    Scanner leer = new Scanner(System.in);

    public void ingresarEditorial() {
        Editorial editorial = new Editorial();
        System.out.println("Ingrese el nombre de la Editoral: ");
        editorial.setNombre(leer.next());
        gestor.ingresarEntidad(editorial);

    }

    public void editarEditorial() {
        System.out.println("Ingresar el nombre de la editorial que desea modificar: ");
        listarEditorial();
        int opcion = leer.nextInt();
        leer.nextLine();
        Editorial editorial = buscarEditorialID(opcion);
        System.out.println("Ingrese el nuevo nombre de la editorial");
        editorial.setNombre(leer.next());
        gestor.actualizarEntidad(editorial);
    }

    public void eliminarEditorial() {
        System.out.println("Ingresar el numero de Id de la editorial que desea eliminar: ");
        int isbn = leer.nextInt();
        String jpql = "SELECT a FROM Editorial a WHERE a.id" + isbn;
        Editorial editorial = (Editorial) gestor.listarEntidad(jpql);

        if (editorial == null) {
            System.out.println("No hay editorial para eliminar");

        } else {
            editorial.setAlta(false);
            gestor.actualizarEntidad(editorial);
        }
    }

    public void listarEditorial() {
        String sql = "SELECT a FROM Editorial a";
        List<Editorial> list = gestor.listarEntidades(sql);

        if (list.isEmpty()) {
            System.out.println("No hay editoriales para mostrar");
        } else {
            for (Editorial aux : list) {
                System.out.println(+aux.getId() + " )Nombre: " + aux.getNombre());

            }
        }
    }

    public Editorial buscarEditorialID(int id) {
        String sql = "Select a FROM Editorial a WHERE a.id=" +id;
        Editorial editorial =(Editorial) gestor.listarEntidad(sql);
        return editorial;
    }
}
