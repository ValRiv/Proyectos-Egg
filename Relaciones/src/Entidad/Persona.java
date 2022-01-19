/*
 *CLASE ENTIDAD PERSONA.
nombre, apellido, edad, documento y Perro.
 */
package Entidad;


/**
 *
 * @author river
 */
public class Persona {
    
    private String nombre;
    private String apellido;
    private int edad;
    private long Dni;
    private Perro perrito;

    public Persona() {
    }

    public Persona(String nombre, String apellido, int edad, long Dni, Perro perrito) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.Dni = Dni;
        this.perrito = perrito;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public long getDni() {
        return Dni;
    }

    public void setDni(long Dni) {
        this.Dni = Dni;
    }

    public Perro getPerrito() {
        return perrito;
    }

    public void setPerrito(Perro perrito) {
        this.perrito = perrito;
    }

    @Override
    public String toString() {
        return "Persona:" + "Nombre:" + nombre + " Apellido:" + apellido + "\n Edad:" + edad + " \n DNI:" + Dni + "\n Perrito=" + perrito + '}';
    }

    
    }

  
    
    
    

