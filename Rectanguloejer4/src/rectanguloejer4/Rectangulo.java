/*Crear una clase Rectángulo que modele rectángulos por medio de un atributo
privado base y un atributo privado altura. La clase incluirá un método para crear el
rectángulo con los datos del Rectángulo dados por el usuario. También incluirá un
método para calcular la superficie del rectángulo y un método para calcular el
perímetro del rectángulo. Por último, tendremos un método que dibujará el
rectángulo mediante asteriscos usando la base y la altura. Se deberán además definir
los métodos getters, setters y constructores correspondientes.
Superficie = base * altura / Perímetro = (base + altura) * 2
 
 */
package rectanguloejer4;

import java.util.Scanner;

/**
 *
 * @author river
 */
public class Rectangulo {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private int base;
    private int altura;

    public void Rectangulo() {
    }

    public void crearrectangulo() {
        System.out.println(" Ingrese la base y la altura del rectangulo que desea crear ");
        this.base = leer.nextInt();
        this.altura = leer.nextInt();
    }

    public void setBase(int base) {
        this.base = base;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getBase() {
        return base;
    }

    public int getAltura() {
        return altura;
    }

    public int superficie() {
        return base * altura;
    }

    public int perimetro() {
        return (base + altura) * 2;
    }

    public void  asterisco() {
        
        System.out.println("Esta es la representacion del rectangulo con los datos ingresados: ");
        //System.out.println(" ");
        for (int i = 0; i <this.altura; i++) {
           for (int j = 0; j < this.base; j++) {
               if (i==0 || i==this.altura-1){
                System.out.print("*");
                
           }else{
                   if(j==0 || j==this.base-1){
                   System.out.print("*");
                   }else{
                    System.out.print(" ");
        }
    }
    }
           System.out.println("");

    }
}
}



      
