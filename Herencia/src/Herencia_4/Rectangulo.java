/*
 * CLASE RECTANGULO  GUIA HERENCIA EJERCICIO 4
 */
package Herencia_4;

/**
 *
 * @author river
 */
public class Rectangulo implements calculoForma {

    private double base;
    private double altura;

    public Rectangulo() {
    }

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        double aux = this.base * this.altura;
        return aux;
    }

    @Override
    public double calcularPerimetro() {
        double aux = (this.base * this.altura) * 2;
        return aux;

    }

    public void dibujarRectangulo() {
        System.out.println("Esto en un rectangulo");
        System.out.println("Esta es la representacion del rectangulo con los datos ingresados ");
        //System.out.println(" ");
        for (int i = 0; i < this.altura; i++) {
            for (int j = 0; j < this.base; j++) {
                if (i == 0 || i == this.altura - 1) {
                    System.out.print("*");

                } else {
                    if (j == 0 || j == this.base - 1) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println("");

        }
    }

}
