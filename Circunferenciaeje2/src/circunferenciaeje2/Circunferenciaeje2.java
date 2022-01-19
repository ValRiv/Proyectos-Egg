/*
 * 
 */
package circunferenciaeje2;

import java.util.Scanner;

/**
 *
 * @author river
 */
public class Circunferenciaeje2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer= new Scanner (System.in);
        Circunferencia c1= new Circunferencia();
        
        c1.llenarradio();
        c1.area();
        c1.perimetro();
        System.out.println("Area  " + c1.getA());
        System.out.println("Perimetro  " + c1.getP());
    }
    
}
