/*
 * ENTIDAD
 */
package coleccioneseje1.Entidad;

/**
 *
 * @author river
 */
public class Entidad {
    private String razas;
    private String nombre;

    public Entidad() {
    }

    public Entidad(String razas, String nombre) {
        this.razas = razas;
        this.nombre = nombre;
    }

    public String getRazas() {
        return razas;
    }

    public void setRazas(String razas) {
        this.razas = razas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
}
