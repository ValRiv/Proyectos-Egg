/*
 * EJERCICIO EXTRA 3  RAICES. CLASE SERVICIO.
Vamos a realizar una clase llamada Raices, donde representaremos los valores de una
ecuación de 2o grado. Tendremos los 3 coeficientes como atributos, llamémosles a, b
y c. Hay que insertar estos 3 valores para construir el objeto a través de un método
constructor. Luego, las operaciones que se podrán realizar son las siguientes:
• Método getDiscriminante(): devuelve el valor del discriminante (double). El
discriminante tiene la siguiente formula: (b^2)-4*a*c
• Método tieneRaices(): devuelve un booleano indicando si tiene dos soluciones, para
que esto ocurra, el discriminante debe ser mayor o igual que 0.
• Método tieneRaiz(): devuelve un booleano indicando si tiene una única solución,
para que esto ocurra, el discriminante debe ser igual que 0.
• Método obtenerRaices(): llama a tieneRaíces() y si devolvió́true, imprime las 2
posibles soluciones.
• Método obtenerRaiz(): llama a tieneRaiz() y si devolvió́true imprime una única raíz.
Es en el caso en que se tenga una única solución posible.
• Método calcular(): esté método llamará tieneRaices() y a tieneRaíz(), y mostrará por
pantalla las posibles soluciones que tiene nuestra ecuación con los métodos
obtenerRaices() o obtenerRaiz(), según lo que devuelvan nuestros métodos y en
caso de no existir solución, se mostrará un mensaje.
Nota: Formula ecuación 2o grado: (-b±√((b^2)-(4*a*c)))/(2*a) Solo varia el signo
delante de -b
 */
package raices_eje_extra3.ServicioRaices;

import java.util.Scanner;
import raices_eje_extra3.Raices.Raices;

/**
 *
 * @author river
 */
public class ServicioRaices {
    Scanner leer= new Scanner(System.in).useDelimiter("\n");
    Raices r1=new Raices();
    
    public Raices cargarValores(){
        System.out.println("Ingrese un valor para a:  ");
        r1.setA(leer.nextDouble());
        double a=r1.getA();
        System.out.println("Ingrese un valor para b: ");
        r1.setB(leer.nextDouble());
        double b=r1.getB();
        System.out.println("Ingrese un valor para c: ");
        r1.setC(leer.nextDouble());
        double c=r1.getC();
        return new Raices(a,b,c);
                
    }
    
    public double getDiscriminante(){
        //(b^2)-4*a*c
        double discriminante=((double) Math.pow (r1.getB(), 2))-4*r1.getA()*r1.getC();
        r1.setAux(discriminante);
        return discriminante;
    }
      public boolean tieneRaiz(){
          if (r1.getAux()>0){
              return true;
          }else{
              return false;   
          }  
      }
      public boolean tieneRaices(){
          if (r1.getAux()==0){
              return true;    
          }else{
              return false;
          }
      }
      public void obtenerRaiz(){
          //-b±√((b^2)-(4*a*c)))/(2*a)
          double a= r1.getA();
          double b= r1.getB();
          double c= r1.getC();
          double b2= Math.pow(b,2);
          if (tieneRaices()){
              double raiz1= (-b)/(2*a);  
              System.out.println("Raiz: " +raiz1);
          }else{
              System.out.println("No tiene raices o tiene 2 raices");
          }
      }
      public void obtenerRaices(){
          double a=r1.getA();
          double b=r1.getB();
          double c = r1.getC();
          double b2=Math.pow(b, 2);
          if(tieneRaices()){
              double raiz1= (-b-Math.sqrt(b2-4*a*c))/(2*a);
              double raiz2=(-b+Math.sqrt(b2-4*a*c))/(2*a);
              System.out.println("La raiz 1 es : "+ raiz1);
              System.out.println("La raiz 2 es: " + raiz2);
          }else{
              System.out.println("No tiene raices o tiene o solo tiene 1 raiz");
          }
      }
         
      public void CalcularRaices(){
          if (tieneRaices()){
              obtenerRaices();
          }else{
              if(tieneRaiz()){
                  obtenerRaiz();
              }else{
                  System.out.println("No tiene raices");
              }
          }
      }
}
      
       
