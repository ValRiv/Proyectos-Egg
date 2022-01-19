/*
 * EJERCICIO EXTRA 6 ENTIDAD
 */
package ahorcadoextra.Entidad;

/**
 *
 * @author river
 */
public class Entidad {
    private String buscar[];
    private String letra;
    private int intentos;
    private String palabra;

    public Entidad() {
    }

    public Entidad(String[] buscar, String letra, int intentos, String palabra) {
        this.buscar = buscar;
        this.letra = letra;
        this.intentos = intentos;
        this.palabra = palabra;
    }

    public String[] getBuscar() {
        return buscar;
    }

    public void setBuscar(String[] buscar) {
        this.buscar = buscar;
    }

    public String getLetra() {
        return letra;
    }

    public void setLetra(String letra) {
        this.letra = letra;
    }

    public int getIntentos() {
        return intentos;
    }

    public void setIntentos(int intentos) {
        this.intentos = intentos;
    }

    public String getPalabra() {
        return palabra;
    }

    public void setPalabra(String palabra) {
        this.palabra = palabra;
    }
    
    
}
