/*
 * EJERCICIO 10. CLASE ENTIDAD.
 */
package Arreglo.Entidades;

/**
 *
 * @author river
 */
public class Arreglo {
    public double[] A;
    public double[] B;

    public Arreglo() {
    }
   

    public Arreglo(double[] A, double[] B) {
        this.A = A;
        this.B = B;
    }

    public double[] getA() {
        return A;
    }

    public void setA(double[] A) {
        this.A = A;
    }

    public double[] getB() {
        return B;
    }

    public void setB(double[] B) {
        this.B = B;
    }
    
    
    
}
