/*
 *CLASE ENTIDAD CANCION.
Desarrollar una clase Cancion con los siguientes atributos: titulo y autor. Se deberá́
definir además dos constructores: uno vacío que inicializa el titulo y el autor a cadenas
vacías y otro que reciba como parámetros el titulo y el autor de la canción. Se deberán
además definir los métodos getters y setters correspondientes.
 */
package cancion_ejer_extra1.Entidad;

import java.util.Scanner;

/**
 *
 * @author river
 */
public class Cancion {
    Scanner leer= new Scanner(System.in).useDelimiter("\n");
    private String titulo;
    private String autor;

    public Cancion() {
    }

    public Cancion(String titulo, String autor) {
        this.titulo = "";
        this.autor = "";
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
        
    }
    
    public void cargarCancion(){
        System.out.println("Ingrese el titulo de la cancion: ");
        this.titulo= leer.next();
        System.out.println("Ingrese el autor del libro: ");
        this.autor=leer.next();
    }

    @Override
    public String toString() {
        return "Cancion{" + "leer=" + leer + ", titulo=" + titulo + ", autor=" + autor + '}';
    }  
}
