/*
EJERCICIO 2 EXTRA MAIN CANTANTE FAMOSO
 * Crear una clase llamada CantanteFamoso. Esta clase guardará cantantes famosos y
tendrá como atributos el nombre y discoConMasVentas.
Se debe, además, en el main, crear una lista de tipo CantanteFamoso y agregar 5
objetos de tipo CantanteFamoso a la lista. Luego, se debe mostrar los nombres de
cada cantante y su disco con más ventas por pantalla.
Una vez agregado los 5, en otro bucle, crear un menú que le de la opción al usuario de
agregar un cantante más, mostrar todos los cantantes, eliminar un cantante que el
usuario elija o de salir del programa. Al final se deberá mostrar la lista con todos los
cambios. 
 */
package eje_extra_2_colecciones;

import eje_extra_2_colecciones.CantanteFamoso.CantanteFamoso;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author river
 */
public class Main {

    Scanner leer2 = new Scanner(System.in).useDelimiter("\n");

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        ArrayList<CantanteFamoso> cantantes = new ArrayList();
        Main m = new Main();

        for (int i = 0; i < 1; i++) {
            System.out.println("Ingrese el nombre del cantante");
            String nombre = leer.next();
            System.out.println("Ingrese el nombre del disco mas vendido");
            String nombredisco = leer.next();
            cantantes.add(new CantanteFamoso(nombre, nombredisco));
        }
        for (CantanteFamoso cantante : cantantes) {
            System.out.println(cantante);//Implicitamente trae el toString

        }
        int op;
        do {
            m.Menu();
            op = m.opcion();
            switch (op) {
                case 1:
                    m.agregarCantante(cantantes);
                    break;
                case 2:
                    m.mostrarCantante(cantantes);
                    break;
                case 3:
                    m.eliminarCantante(cantantes);
                    break;
                case 4:
                    System.out.println("Vuelva Prontus =) ");
            }
        } while (op != 4);
        System.out.println("----Lista de cantantes----");
        m.mostrarCantante(cantantes);
    }

    public void Menu() {
        System.out.println("-----MENU-----\n"
                + "1- Agregar cantante\n "
                + "2- Mostrar lista de cantante\n"
                + "3-Eliminar cantante\n"
                + "4- Salir\n");
    }

    public int opcion() {
        int opcion;
        do {
            opcion = leer2.nextInt();
            if (opcion < 1 || opcion > 4) {
                System.out.println(" ERROR!!  Ingrese una opcion nuevamente ");
            }
            leer2.next();
        } while (opcion < 1 || opcion > 4);
        return opcion;
    }

    public void agregarCantante(ArrayList<CantanteFamoso> listaCantante) {
        System.out.println("Ingrese el nombre del cantante");
        String nombre = leer2.next();
        System.out.println("Ingrese el nombre del disco mas vendido");
        String disco = leer2.next();
        listaCantante.add(new CantanteFamoso(nombre, disco));
    }

    public void mostrarCantante(ArrayList<CantanteFamoso> listaCantante) {
        for (CantanteFamoso aux : listaCantante) {
            System.out.println(aux);
        }
    }

    public void eliminarCantante(ArrayList<CantanteFamoso> listaCantante) {
        System.out.println("Ingrese el nombre del cantante que desea eliminar");
        String cantanteEliminar = leer2.next();
        Iterator<CantanteFamoso> ite = listaCantante.iterator();
        while (ite.hasNext()) {
            if (ite.next().getNombre().equalsIgnoreCase(cantanteEliminar)) {
                ite.remove();
            }
        }
    }
}
