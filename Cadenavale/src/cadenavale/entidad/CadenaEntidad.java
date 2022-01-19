/*
 * CADENA ENTIDAD
 */
package cadenavale.entidad;

/**
 *
 * @author river
 */
public class CadenaEntidad {
     private String frase;
     private int longitud;
    
        public CadenaEntidad() {
    }

        public CadenaEntidad(String frase, int longitud) {
        this.frase = frase;
        this.longitud = longitud;
    }

    public String getFrase() {
        return frase;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }
  
    }


    
    



