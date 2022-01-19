package Entidades;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author river
 */
@Entity //esta anotacion me indica que es una entidad y avisa que se convertira en una tabla.
public class Autor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
//Cada atributo que yo agregue a la clase entidad se va a convetir en una columna de mi tabla
    private int id;
    private String nombre;
    private boolean alta;
    
    

    public Autor() {
        this.alta = true;
    }

    public Autor(int id, String nombre, boolean alta) {
        this.id = id;
        this.nombre = nombre;
        this.alta = alta;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isAlta() {
        return alta;
    }

    public void setAlta(boolean alta) {
        this.alta = alta;
    }

}
