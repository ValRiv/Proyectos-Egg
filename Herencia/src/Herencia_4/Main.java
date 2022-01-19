/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Herencia_4;

/**
 *
 * @author river
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // instancio circulo con un parametro de radio al cual le asigna un 5 
        Circulo nuevoCirculo = new Circulo(5);
        System.out.println("El area del circulo es: " +  nuevoCirculo.calcularArea());
        System.out.println("El perimetro del circulo es: " + nuevoCirculo.calcularArea());
        
        Rectangulo nuevoRectangulo = new Rectangulo(10,5);
        System.out.println("El area del rectangulo es: " +  nuevoRectangulo.calcularArea());
        System.out.println("El perimetro de rectangulo es: " +  nuevoRectangulo.calcularPerimetro());
        nuevoRectangulo.dibujarRectangulo();
        nuevoCirculo.dibujarCirculo();
    }
    
}
