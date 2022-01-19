/*
 * HERENCIA EJERCICIO 2 ELECTRODOMESTICO 
 */
package Herencia2y3;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author river
 */
public class Herencia2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        Lavadora nuevaLavadora = new Lavadora();
//        nuevaLavadora.crearLavadora();
//        nuevaLavadora.precioFinal();
//
//        Televisor nuevoTelevisor = new Televisor();
//        nuevoTelevisor.crearTelevisor();
//        nuevoTelevisor.precioFinal();
//
//        //Vamos a crear una Lavadora y un Televisor y llamar a los métodos necesarios
//        //para mostrar el precio final de los dos electrodomésticos
//        System.out.println("El precio de la lavadora es: " + nuevaLavadora.getPrecio());
//        System.out.println("El precio del televisor es: " + nuevoTelevisor.getPrecio());
//        
//        //Siguiendo el ejercicio anterior, en el main vamos a crear un ArrayList de
//Electrodomésticos para guardar 4 electrodomésticos, ya sean lavadoras o
//televisores, con valores ya asignados.
//Luego, recorrer este array y ejecutar el método precioFinal() en cada
//electrodoméstico. Se deberá también mostrar el precio de cada tipo de objeto,
//es decir, el precio de todos los televisores y el de las lavadoras. Una vez hecho
//eso, también deberemos mostrar, la suma del precio de todos los
//Electrodomésticos. Por ejemplo, si tenemos una lavadora con un precio de 2000
//y un televisor de 5000, el resultado final será de 7000 (2000+5000) para
//electrodomésticos, 2000 para lavadora y 5000 para televisor
   
       //   EJERCICIO 3
   Lavadora lavadora= new Lavadora(5,5500d,"BLANCO",'F', 20d);
   Lavadora lavadora2= new Lavadora(7,9500d,"GRIS", 'a', 30d);
   Televisor tele= new Televisor(30,true, 5500d, "NEGRO", 'A', 25d);
   Televisor tele2= new Televisor(50,false,9800d,"Azul", 'B', 40d);
   
   List<Electrodomestico>listaElectrodomesticos = new ArrayList<>();
   
   Electrodomestico electro= new Electrodomestico();
   
   listaElectrodomesticos.add(lavadora);
   listaElectrodomesticos.add(lavadora2);
   listaElectrodomesticos.add(tele);
   listaElectrodomesticos.add(tele2);
   
   int sumaLavadora=0;
   int sumaTelevisor=0;
        for (Electrodomestico aux : listaElectrodomesticos) {
            aux.precioFinal();
            System.out.println("Precio final: " + aux.getPrecio());
            if( aux instanceof Televisor ){
                sumaTelevisor+= aux.getPrecio();
            }else{
                sumaLavadora+=aux.getPrecio();
            }
        }
        
        System.out.println("La suma de todos los televisores es: " + sumaTelevisor);
        System.out.println("La suma de todas las lavadoras es: " + sumaLavadora);
        System.out.println("El precio final de los electrodomesticos es: "+ (sumaTelevisor+sumaLavadora));
    }

}
