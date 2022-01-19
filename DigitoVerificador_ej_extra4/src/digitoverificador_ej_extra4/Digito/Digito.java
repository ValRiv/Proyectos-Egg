/*
 * CLASE ENTIDAD DIGITO
 */
package digitoverificador_ej_extra4.Digito;

/**
 *
 * @author river
 */
public class Digito {
    private long DNI;
    private String letra;
private long aux;
    public Digito() {
    }

    public Digito(long DNI, String letra) {
        this.DNI = DNI;
        this.letra = letra;
    }

    public long getDNI() {
        return DNI;
    }

    public void setDNI(long DNI) {
        this.DNI = DNI;
    }
    
    public String getLetra() {
        return letra;
    }

    public void setLetra(String letra) {
        this.letra = letra;
    }

    public long getAux() {
        return aux;
    }

    public void setAux(long aux) {
        this.aux = aux;
    }

    @Override
    public String toString() {
        return "Digito{" + "DNI=" + DNI + ", letra=" + letra + ", aux=" + aux + '}';
    }

    
    
    
    
}
