/*
 * Definir una clase llamada Puntos que contendrá las coordenadas de dos puntos, sus
atributos serán, x1, y1, x2, y2, siendo cada x e y un punto. Generar un objeto puntos
usando un método crearPuntos() que le pide al usuario los dos números y los ingresa
en los atributos del objeto. Después, a través de otro método calcular y devolver la
distancia que existe entre los dos puntos que existen en la clase Puntos. Para conocer
como calcular la distancia entre dos puntos consulte el siguiente link:
 */
package puntos_eje_extra1.Puntos;

import java.util.Scanner;

/**
 *
 * @author river
 */
public class Puntos {
    Scanner leer= new Scanner(System.in).useDelimiter("\n");
    
    private double x1;
    private double y1;
    private double x2;
    private double y2;

    public Puntos() {
    }
   
    public Puntos(double x1, double y1, double x2, double y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public Scanner getLeer() {
        return leer;
    }

    public void setLeer(Scanner leer) {
        this.leer = leer;
    }

    public double getX1() {
        return x1;
    }

    public void setX1(double x1) {
        this.x1 = x1;
    }

    public double getY1() {
        return y1;
    }

    public void setY1(double y1) {
        this.y1 = y1;
    }

    public double getX2() {
        return x2;
    }

    public void setX2(double x2) {
        this.x2 = x2;
    }

    public double getY2() {
        return y2;
    }

    public void setY2(double y2) {
        this.y2 = y2;
    }
    
    public void crearPuntos(){
        System.out.println("Ingrese un numero para x1: ");
        x1=leer.nextDouble();
        System.out.println("Ingrese otro numero para y1: ");
        y1=leer.nextDouble();
        System.out.println("Ingrese un numero para x2: ");
        x2=leer.nextDouble();
       System.out.println("Ingrese un numero para y2: ");
       y2=leer.nextDouble();
           
    }
    
    public double calcularDistancia(){
        double x =x2-x1;
        double y =y2-y1;
        double distancia= (double) Math.sqrt(Math.pow(x,2)+Math.pow(y, 2));
        return distancia;
        
    }   
}
    /*
        ublic double calcularDistanciaDesde(Punto parametros) {
double cateto1 = x – parametros.getX();
double cateto2 = y – parametros.getY();
double hipotenusa = Math.sqrt(cateto1*cateto1 + cateto2*cateto2);
return hipotenusa;
    double x=x2-x1;
        double y=y2-y1;
        double distancia= (double) Math.sqrt(Math.pow(x, 2)+ Math.pow(y, 2));
        double truncar = Math.pow(10, 2);
        distancia= Math.round(distancia*truncar)/truncar;
        return distancia;

    }
    */
    

