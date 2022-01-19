/*Declarar una clase llamada Circunferencia que tenga como atributo privado el radio
de tipo real. A continuación, se deben crear los siguientes métodos:
a) Método constructor que inicialice el radio pasado como parámetro.
b) Métodos get y set para el atributo radio de la clase Circunferencia.
c) Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo
del objeto.
d) Método area(): para calcular el área de la circunferencia (Area = π ∗ radio!).
e) Método perimetro(): para calcular el perímetro (Perimetro = 2 ∗ π ∗ radio).
 .
 */
package circunferenciaeje2;

import java.util.Scanner;

/**
 *
 * @author river
 */
public class Circunferencia {
    Scanner leer= new Scanner (System.in); 
    private double radio;
    private double A;
    private double P;
    
    public Circunferencia(){
}
    public void llenarradio(){
        System.out.println("Ingrese el numero del radio ");
        this.radio=leer.nextDouble();
        
      }
    
    public void setRadio(double radio){
        this.radio= radio;
    }
    public void setA(double A){
        this.A=A;
    }
    public double getRadio(){
        return radio;
    }
    public double getA(){
        return A;
    }
    public double area(){
        A=3.1416*(radio*radio);
        return A;
        
    }
    public double perimetro(){
        P=2*3.1416*radio;
        return P;
    }
   public double getP(){
       return P;
   }   
    }
    


    

    

    
