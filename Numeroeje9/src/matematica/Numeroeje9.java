/*
 * EJERCICIO 9 MATEMATICAS
 */
package matematica;

import matematica.entidad.Matematica;

/**
 *
 * @author river
 */
public class Numeroeje9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Matematica m1=new Matematica();
        
        double num1=Math.random()*10;
        System.out.println("El numero 1 ingresado es:  " + num1);
        double num2 =Math.random()*100;
        System.out.println("El numero 2 ingresado es: "+num2);
        m1.setNum1(num1);
        m1.setNum2(num2);
        
        System.out.println("El mayor de los dos números es ingresadps " + m1.getNum1() + " y "+ m1.getNum2()+" es : " + m1.devolverMayor(m1));
        
        System.out.println("La potencia del numero mayor elevado al menor numero: " + m1.calcularPotencia(m1));
        
        System.out.println("La raiz cuadrada del numero menor es: "+ m1.calcularRaiz(m1));
       // m1.calcularPotencia();
    }
    
}
