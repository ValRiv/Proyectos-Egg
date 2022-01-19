/*
 * CLASE ENTIDAD CANTANTE.
 */
package eje_extra_2_colecciones.CantanteFamoso;

/**
 *
 * @author river
 */
public class CantanteFamoso {
    private String nombre;
    private String discosConMasVentas;

    public CantanteFamoso() {
    }

    public CantanteFamoso(String nombre, String discosConMasVentas) {
        this.nombre = nombre;
        this.discosConMasVentas = discosConMasVentas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDiscosConMasVentas() {
        return discosConMasVentas;
    }

    public void setDiscosConMasVentas(String discosConMasVentas) {
        this.discosConMasVentas = discosConMasVentas;
    }

    @Override
    public String toString() {
        return "Cantante{" + "nombre=" + nombre + ", discosConMasVentas=" + discosConMasVentas + '}';
    }
    
    
}
