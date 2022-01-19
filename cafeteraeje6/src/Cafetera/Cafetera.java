/*
 * Programa Nespresso. Desarrolle una clase Cafetera con los atributos
capacidadMaxima (la cantidad máxima de café que puede contener la cafetera) y
cantidadActual (la cantidad actual de café que hay en la cafetera). Implemente, al
menos, los siguientes métodos: 
18
• Constructor predeterminado o vacío
• Constructor con la capacidad máxima y la cantidad actual
• Métodos getters y setters.

 */
package Cafetera;

import java.util.Scanner;

/**
 *
 * @author river
 */
public class Cafetera {
     Scanner leer = new Scanner(System.in).useDelimiter("\n");
   private int capacMaxima;
   private int cantActual;

    public Cafetera() {
    }

    public Cafetera(int capacMaxima, int cantActual) {
        this.capacMaxima = capacMaxima;
        this.cantActual = cantActual;
    }

    public Scanner getLeer() {
        return leer;
    }

    public void setLeer(Scanner leer) {
        this.leer = leer;
    }

    public int getCapacMaxima() {
        return capacMaxima;
    }

    public void setCapacMaxima(int capacMaxima) {
        this.capacMaxima = capacMaxima;
    }

    public int getCantActual() {
        return cantActual;
    }

    public void setCantActual(int cantActual) {
        this.cantActual = cantActual;
    }
   
   
}
  