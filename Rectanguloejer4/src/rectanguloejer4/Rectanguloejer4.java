/*RECTANGULO EJER 4 
 * 
 */
package rectanguloejer4;

/**
 *
 * @author river
 */
public class Rectanguloejer4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Rectangulo r1= new Rectangulo();
        r1.crearrectangulo();
        System.out.println("La superficie del rectangulo con los datos ingresados es:  " + r1.superficie());
        
        System.out.println("El perimetro del rectangulo con los numeros ingresados es: " + r1.perimetro());
        r1.asterisco();
        //System.out.println(r1.toString());
    }
    
}
