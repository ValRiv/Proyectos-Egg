/*
 * Cantante Servicio
 */
package eje_extra2_colecciones.cantanteServicio;

import java.util.ArrayList;

/**
 *
 * @author river
 */
public class cantanteServicio 

    public void crearFamoso(ArrayList<Cantante>peliculas) {
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

   

        /*
        System.out.println("Ingrese el nombre del cantante a eliminar");
    String nombreCantante=leer.nextLine();
    Iterator<Cantante> ite=cantantes.iterator();
    while(ite.hasNext()){
        if(ite.next().getNombre().equalsIgnoreCase(nombreCantante)){
            ite.remove(i);
        }
    }
    
}
