/*
 * CLASE INTERFACE DE HERENCIA EJERCICIO 4
 */
package Herencia_4;

/**
 *
 * @author river
 */
public interface calculoForma {
    public final double calculoPi= Math.PI;
    // EN LAS INTERFACES SON SIEMPRE PUBLIC Y NO PUEDO CAGAR DE METODOS NI ATRIBUTOS, NO PUEDE TENER CUERPO
    //NO PUEDE RECIBIR PARAMETROS NI EJECUTAR UNA SENTENCIA PUNTUAL
    public double calcularArea();
    public double calcularPerimetro();
}
