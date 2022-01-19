/*Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título,
Autor, Número de páginas, y un constructor con todos los atributos pasados por
parámetro y un constructor vacío. Crear un método para cargar un libro pidiendo los
datos al usuario y luego informar mediante otro método el número de ISBN, el título,
el autor del libro y el numero de páginas.
 */
package libroejer1.entidades;

import java.util.Scanner;

/**
 *
 * @author river
 */
public class Libro {
    Scanner leer=new Scanner(System.in);
    public int ISBN;
    public String titulo;
    public String autor;
    public int numpaginas;
    
    public Libro(){
    
}
    public void rellenarLibro(){
        System.out.println("Ingrese el numero ISBN ");
        this.ISBN=leer.nextInt();
        System.out.println("Ingrese el titulo del libro ");
        this.titulo=leer.nextLine();
        System.out.println("Ingrese el autor del libro");
        this.autor=leer.nextLine();
        System.out.println("Ingrese el numero de paginas");
        this.numpaginas=leer.nextInt();
        
    }
    public void mostrarLibro(){
        System.out.println("El ISBN del libro es:   "  + ISBN);
        System.out.println("El titulo del libro es:  " + titulo);
        System.out.println("El autor del libro es:   " + autor);
        System.out.println("El numero de pagina es:  " + numpaginas);
        
    }
    }