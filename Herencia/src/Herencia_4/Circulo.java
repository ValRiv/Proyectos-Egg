/*
 * CLASE CIRCULO GUIA HERENCIA EJERCICIO 4.
Área circulo: PI * radio ^ 2 / Perímetro circulo: PI * diámetro.
Área rectángulo: base * altura / Perímetro rectángulo: (base + altura) * 2
 */
package Herencia_4;

/**
 *
 * @author river
 */
public class Circulo implements calculoForma {

    private double radio;
    private double diametro;

    public Circulo() {
    }

    public Circulo(double radio) {
        this.radio = radio;
        this.diametro = radio * 2;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getDiametro() {
        return diametro;
    }

    public void setDiametro(double diametro) {
        this.diametro = diametro;
    }

    @Override
    public double calcularArea() {
        double aux = (calculoPi * (Math.pow(this.radio, 2)));
        return aux;
    }

    @Override
    public double calcularPerimetro() {
        double aux = calculoPi * this.diametro;
        return aux;
    }
 public void dibujarCirculo(){
     System.out.println("Esta es la representacion grafica de un circulo con los datos ingresados: ");
     System.out.println("   *** ");
     System.out.println("  *   *");
     System.out.println(" *     *");
     System.out.println(" *     *");
     System.out.println(" *     *");
     System.out.println("  *   *");
     System.out.println("   *** ");
 }
}
