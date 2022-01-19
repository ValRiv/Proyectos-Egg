/*
 * CLASE ENTIDAD CARTAS EJERCICIO 3 GUIA RELACIONES
 */
package Entidad;

/**
 *
 * @author river
 */
public class Carta {
    private int numeros;
    private String palo;

    public Carta() {
    }

    public Carta(int numeros, String palo) {
        this.numeros = numeros;
        this.palo = palo;
    }

    public int getNumeros() {
        return numeros;
    }

    public void setNumeros(int numeros) {
        this.numeros = numeros;
    }

    public String getPalo() {
        return palo;
    }

    public void setPalo(String palo) {
        this.palo = palo;
    }

    @Override
    public String toString() {
        return "Carta3{" + "numeros=" + numeros + ", palo=" + palo + '}';
    }
    
    
}
