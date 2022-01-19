/*
 * EJERCICIO EXTRA 2 COLECCIONES "CANTANTE/FAMOSO".
Crear una clase llamada CantanteFamoso. Esta clase guardará cantantes famosos y
tendrá como atributos el nombre y discoConMasVentas.
Se debe, además, en el main, crear una lista de tipo CantanteFamoso y agregar 5
objetos de tipo CantanteFamoso a la lista. Luego, se debe mostrar los nombres de
cada cantante y su disco con más ventas por pantalla.
Una vez agregado los 5, en otro bucle, crear un menú que le de la opción al usuario de
agregar un cantante más, mostrar todos los cantantes, eliminar un cantante que el
usuario elija o de salir del programa. Al final se deberá mostrar la lista con todos los
cambios
 */
package eje_extra2_colecciones;



import eje_extra2_colecciones.Entidad.Cantante;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author river
 */
public class Eje_Extra2_Colecciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ArrayList<Cantante> cantantes = new ArrayList();
        cantanteServicio serv = new CantanteServicio();
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
    

    public void crearFamoso() {
        System.out.println("Ingrese el nombre del cantante");
        String nombre = leer.next();
        System.out.println("Ingrese el disco mas vendido");
        String disco = leer.next();

        String cantante = nombre + " " + disco + " ";
        cantantes.add(cantante);

    }

    public void mostrarCantantes() {
        System.out.println("Los cantantes actuales de la lista son: ");
        for (String aux : cantantes) {
            System.out.println(aux);
        }
        System.out.println("Cantidad  " + cantantes.size());
        int tamanio1 = cantantes.size();
    }

    public void eliminarCantante(String Cantate){
        
        System.out.println("Ingrese el nombre del cantante que desea eliminar: ");
        String nombreeliminar = leer.next();
         for (int i = 0; i < cantantes.size(); i++) {
             String c = cantantes.get(i);
           if(c.equals(nombreeliminar)){
               cantantes.remove(c);
           }
        }
        //mostrar la lista nueva
        System.out.println(cantantes);
    }
}

        /*
        System.out.println("Ingrese el nombre del cantante a eliminar");
    String nombreCantante=leer.nextLine();
    Iterator<Cantante> ite=cantantes.iterator();
    while(ite.hasNext()){
        if(ite.next().getNombre().equalsIgnoreCase(nombreCantante)){
            ite.remove(i);
        }
    }
    
        System.out.println(cantantes);
      // serv.eliminarCantante(cantantes);
    }
    
        //serv.crearFamoso();
        //serv.crearFamoso();
       // serv.crearFamoso();
        //serv.crearFamoso();
        //serv.crearFamoso();
       // serv.mostrarCantantes();
       // serv.eliminarCantante("");
      //serv.mostrarCantantes();
    }
}
