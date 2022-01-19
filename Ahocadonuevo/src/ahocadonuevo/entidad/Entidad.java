/*
 *EJERCICO EXTRA 6 CLASE ENTIDAD.
 */
package ahocadonuevo.entidad;

/**
 *
 * @author river
 */
public class Entidad {
    private String buscar[];
    private String letra;
    private int intentos;
    private String palabra;
    private int cant_letras;
    private int longitud_palabra;
    

    public Entidad() {
    }

    public Entidad(String[] buscar, String letra, int intentos, String palabra,int cant_letras,int longitud_palabra) {
        this.buscar = buscar;
        this.letra = letra;
        this.intentos = intentos;
        this.palabra = palabra;
        this.cant_letras= cant_letras;
        this.longitud_palabra=longitud_palabra;
    }

    public int getLongitud_palabra() {
        return longitud_palabra;
    }

    public void setLongitud_palabra(int longitud_palabra) {
        this.longitud_palabra = longitud_palabra;
    }

    public int getCant_letras() {
        return cant_letras;
    }

    public void setCant_letras(int cant_letras) {
        this.cant_letras = cant_letras;
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
