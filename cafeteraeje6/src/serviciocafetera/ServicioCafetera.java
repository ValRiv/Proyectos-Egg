/*
 * SERVICIO CAFETERA
 */
/*
 * Programa Nespresso. Desarrolle una clase Cafetera con los atributos
capacidadMaxima (la cantidad máxima de café que puede contener la cafetera) y
cantidadActual (la cantidad actual de café que hay en la cafetera). Implemente, al
menos, los siguientes métodos:
• Constructor predeterminado o vacío
• Constructor con la capacidad máxima y la cantidad actual
• Métodos getters y setters.
• Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad
máxima.
• Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el
tamaño de la taza y simula la acción de servir la taza con la capacidad indicada. Si la

método le informará al usuario si se llenó o no la taza, y de no haberse llenado en
cuanto quedó la taza.
• Método vaciarCafetera(): pone la cantidad de café actual en cero.
• Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo
recibe y se añade a la cafetera la cantidad de café indicada
 */
package serviciocafetera;

import Cafetera.Cafetera;
import java.util.Scanner;

/**
 *
 * @author river
 */
public class ServicioCafetera {
    Scanner leer= new Scanner(System.in).useDelimiter("\n");
    Cafetera cafeteraNueva= new Cafetera();
    
     public Cafetera crearCafetera(){
            System.out.println("Ingrese la capacidad Maxima de la Cafetera: ");
            cafeteraNueva.setCapacMaxima(leer.nextInt());
            System.out.println("Ingrese la cantidad Actual de cafe: ");
            cafeteraNueva.setCantActual(leer.nextInt());
            return cafeteraNueva;
    }
    public void llenarCafetera(){
        cafeteraNueva.setCapacMaxima(cafeteraNueva.getCantActual());
         
    }
    public void servirTaza(int taza){
        
        if(taza<cafeteraNueva.getCantActual()){
            cafeteraNueva.setCantActual(cafeteraNueva.getCantActual()-taza);
            System.out.println("Se lleno la taza");
            
        }else{
            cafeteraNueva.setCantActual(0);
            System.out.println("No alcanza para llenar la taza faltaron " + cafeteraNueva.getCantActual() +  " recargue la cafetera. ");
        }
    }
    public void vaciarCafetera(){
      cafeteraNueva.setCantActual(0);
        System.out.println("Se vacio la cafetera");
        
    }
    public void agregarCafe(int cant){
        
       if( cafeteraNueva.getCantActual()+cant<cafeteraNueva.getCapacMaxima()){//si la cantidad que se le agrega mas lo que tenia la cafetera no supera la capacidad maxima
           cafeteraNueva.setCantActual(cant);
       }else{
           cafeteraNueva.setCantActual(cafeteraNueva.getCapacMaxima());//si se supera la capacidad maxima, la cafetera queda llena
          
           }
               System.out.println("Se agrego cafe correctamente");
           }
    
        
    }
       
    
     
  
 
        
        
    

