/*
 * SERVICIO RAZA
Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo
String. El programa pedirá una raza de perro en un bucle, el mismo se guardará
en la lista y después se le preguntará al usuario si quiere guardar otro perro o si
quiere salir. Si decide salir, se mostrará todos los perros guardados en el ArrayList.
 */
package coleccioneseje1.ServicioRaza;

import coleccioneseje1.Entidad.Entidad;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author river
 */
public class ServicioRaza {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    public ArrayList<String> Razas = new ArrayList();

    public ServicioRaza(ArrayList<String> Razas) {
        this.Razas = Razas;
    }

    public ServicioRaza() {
    }

    public void crearRazas() {
        while (true) {
            System.out.println("Ingrese la raza del perro que desea");
            String raza = leer.next();
            
            String razas = raza;
            Razas.add(razas);
            System.out.println("Ingrese cualquier letra para ingresar otra raza o S para salir ");
            String salir = leer.next();
            if (salir.toUpperCase().equals("S")) {
                break;
            }
        }

        int tamanio1 = Razas.size();
        System.out.println("Las razas de las listas de mascotas son: ");
        for (String aux : Razas) {
            System.out.println(aux);
        }
        System.out.println(" La cantidad de razas son: " + Razas.size());

//Continuando el ejercicio anterior, después de mostrar los perros, al usuario se le
//pedirá un perro y se recorrerá la lista con un Iterator, se buscará el perro en la lista.
//Si el perro está en la lista, se eliminará el perro que ingresó el usuario y se mostrará
//la lista ordenada. Si el perro no se encuentra en la lista, se le informará al usuario
//y se mostrará la lista ordenada.
        System.out.println("Ingrese una nueva raza a nuestra lista: ");
        String razanueva = leer.next();
        //
        //}

       // for (int i = 0; i < Razas.size(); i++) {
         //   String r = Razas.get(i);
           // if (r.equals(razanueva)) {
             //   Razas.remove(r);
            //}
        //}

        Iterator iterator = Razas.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().equals(razanueva)) {
                iterator.remove();
            }
            }
            int tamanio2 = Razas.size();

            if (tamanio1 == tamanio2) {
                System.out.println("No se encontro la raza ingresada");

            }
            Collections.sort(Razas);
            System.out.print("La lista ordenada queda asi: ");
            for (String aux : Razas) {
                System.out.println(aux);
            }
        }
    }

