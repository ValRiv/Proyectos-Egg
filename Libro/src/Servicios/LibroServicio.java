package Servicios;

import Entidades.Autor;
import Entidades.Editorial;
import Entidades.Libro;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author river
 */
public class LibroServicio {

    Scanner leer = new Scanner(System.in);
    protected GestorServicioVale gestor = new GestorServicioVale();

    public void ingresarLibro() {
        AutorServicio autorServicio = new AutorServicio();
        EditorialServicio editorialServicio = new EditorialServicio();
        Autor autor = new Autor();
        Editorial editorial = new Editorial();
        Libro libroNuevo = new Libro();
        System.out.println("Ingresar el titulo del libro:");
        libroNuevo.setTitulo(leer.next());leer.nextLine();
        System.out.println("Ingrese el año de edicion: ");
        libroNuevo.setAnio(leer.nextInt());leer.nextLine();
        System.out.println("Ingrese la cantidad de ejemplares: ");
        libroNuevo.setEjemplares(leer.nextInt());leer.nextLine();
        System.out.println("Ingresar la cantidad de ejemplares prestados");
        libroNuevo.setEjemplaresPrestados(leer.nextInt());leer.nextLine();

        //Se pide ingresar un autor
        System.out.println("Elija un autor de la lista: ");//un autor puede tener muchos libros
        autorServicio.listarAutor();
         System.out.println("O preesione el número 0 para crear un nuevo autor");
        int opcion = leer.nextInt();
        leer.nextLine();
        if (opcion == 0) {
            System.out.println("Ingrese el nombre del nuevo autor");
            autor.setNombre(leer.nextLine());
            libroNuevo.setAutor(autor);
            gestor.ingresarEntidad(libroNuevo);
        } else {
            autor = autorServicio.buscarAutorID(opcion);
            libroNuevo.setAutor(autor);
        }
        //Se pide ingresar una editorial
        System.out.println("Elija una editorial de la siguiente lista:");  //un editorial puede tener muchos libros     
        editorialServicio.listarEditorial();//se puede elegir una editorial ya existente o crear una nueva
        System.out.println("O presiones el numero 0 para crear una nueva Editorial");
        opcion = leer.nextInt(); leer.nextLine();

        if (opcion == 0) {
            System.out.println("Ingresar el nombre de la nueva Editorial");
            editorial.setNombre(leer.next());
            libroNuevo.setEditorial(editorial);
            gestor.actualizarEntidad(libroNuevo);

        } else {
            editorial = editorialServicio.buscarEditorialID(opcion);
            libroNuevo.setEditorial(editorial);
            gestor.actualizarEntidad(libroNuevo);
        }
    }

    public void editarLibro() {
        System.out.println("Ingresar el numero de ISBN del libro a editar");
        listarLibros();
        int isbn = leer.nextInt();
        leer.nextLine();
        Libro libro = buscarLibroID(isbn);
        System.out.println("¿Quiere modifican el Titulo? y/n");
        String opcion = leer.next().toUpperCase();
        if (opcion.equals("Y")) {
            System.out.println("Escriba el nombre del libro");
            libro.setTitulo(leer.nextLine());
        }
        System.out.println("¿Quieren modificar el año? y/n");
        opcion = leer.next();leer.nextLine();
        if (opcion.equals("Y")) {
            System.out.println("Ingrese el nuevo año");
            libro.setAnio(leer.nextInt());
            leer.nextLine();
        }
        //falta el codigo para modificar los demas atributos, que seria repetir lo mismo de arriba

        gestor.actualizarEntidad(libro);
    }

    public Libro buscarLibroID(int id) {
        String jpql =  "Select a FROM Libro a WHERE a.isbn="+id;
        
        Libro libro = (Libro) gestor.listarEntidad(jpql);
        return libro;
    }

    public void buscarLibroISBN() {
        System.out.println("Ingresa el numero de ISBN del libro a buscar");
        int isbn = leer.nextInt();
        String jpql = "Select a FROM Libro a WHERE a.isbn="+isbn;
        Libro libro = (Libro) gestor.listarEntidad(jpql);
        if (libro == null) {
            System.out.println("No hay autores para mostrar");
        } else {
            System.out.println("Libro: " + libro.getTitulo());
        }

    }

    public void buscarLibroTitulo() {
        System.out.println("Ingrese el nombre del titulo del libro");
        String titulo = leer.nextLine();
        String jpql = "SELECT a FROM Libro a WHERE a.titulo IN ('" + titulo + "')";
        List<Libro> list =  gestor.listarEntidades(jpql);

        if (list.isEmpty()) {
            System.out.println("No hay libro con ese titulo");
        } else {
            for (Libro aux : list) {
                System.out.println("ISBN: " + aux.getIsbn() + "Libro:" + aux.getTitulo() + "Cantidad de ejemplares: " + aux.getEjemplares());

            }
        }
    
    }
    public void buscarLibroAutor(){
        System.out.println("Indique el autor que desea buscar");
        String autor= leer.next();
        String jpql="SELECT a FROM Libro a WHERE a.autor.nombre IN  ('"+autor+"')"; 
        List <Libro>list = gestor.listarEntidades(jpql);
        
        if (list.isEmpty()) {
            System.out.println("No hay libro para mostrar");
            
        } else {
            for (Libro aux : list) {
                System.out.println("Libro: " + aux.getTitulo());
                
            }
        }
    }
    public void buscarLibroEditorial(){
        System.out.println("Indique la editorial de los libros que desea buscar");
        String editorial= leer.next();
        String jpql="SELECT a FROM Libro a WHERE a.editorial.nombre IN ('"+editorial+"')";
        List<Libro>list = gestor.listarEntidades(jpql);
        
        if (list.isEmpty()) {
            System.out.println("No hay libro para mostrar");
            
        } else {
            for (Libro aux : list) {
                System.out.println("Libro: " + aux.getTitulo());
                
            }
        }
    }
    public void eliminarLibro(){
        System.out.println("Ingrese el numero de ISBN del libro que desea eliminar");
        int isbn =leer.nextInt();
         String jpql = "Select a FROM Libro a.isbn :"+isbn;
        Libro libro= (Libro) gestor.listarEntidad(jpql);
        
        if (libro==null) {
            System.out.println("No hay libro para eliminar");  
            } else {
            libro.setAlta(false);
            gestor.actualizarEntidad(libro);
        }
    }

   public void listarLibros(){
        String sql = "Select a FROM Libro a";
        List<Libro> list = gestor.listarEntidades(sql);

        if (list.isEmpty()) {
            System.out.println("No hay libros para mostrar");
        } else {
            for (Libro a : list) {
                System.out.println("ISBN: "+a.getIsbn()+" Titulo:"+a.getTitulo()+" Año: "+a.getAnio()+" Ejemplares: "+a.getEjemplares()+" Ejemplares Prestados: "+a.getEjemplaresPrestados()+" Ejemplares restantes: "+a.getEjemplaresRestantes());
            }
        }
   }
   
}
