/*  
EJERCICIO 6 COLECCIONES TIENDA
 * Se necesita una aplicación para una tienda en la cual queremos almacenar los
distintos productos que venderemos y el precio que tendrán. Además, se necesita
que la aplicación cuente con las funciones básicas.
Estas las realizaremos en el main. Como, introducir un elemento, modificar su
precio, eliminar un producto y mostrar los productos que tenemos con su precio
(Utilizar Hashmap). El HashMap tendrá de llave el nombre del producto y de valor
el precio. Realizar un menú para lograr todas las acciones previamente
mencionadas.
 */
package ejercicio_6_colecciones;

import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author river
 */
public class Ejercicio_6_Colecciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        HashMap<String, Double> productos = new HashMap<String, Double>();
        menu(productos);
    }
    public static void menu(HashMap<String, Double> productos) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        while (true) {
            int salir = 0;
            System.out.println("------MENU------");
            System.out.println("1-Agregar productos\n 2-Modificar el precio \n 3-Eliminar un producto \n 4-Mostrar la lista de produccto con el precio\n 5-Salir:S ");
            int opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    agregarProductos(productos);
                    break;
                case 2:
                    modificarPrecio(productos);
                    break;
                case 3:
                    eliminarProducto(productos);
                    break;
                case 4:
                    mostrarLista(productos);
                    break;
                case 5:
                    salir =1;
                    break;
                default:
                   System.out.println("Ingrese una opcion valida");
            }
            if(salir==1){
                break;
            }
        }
    }

    public static void agregarProductos(HashMap<String, Double> productos) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        while (true) {
            System.out.println("Ingrese un producto: ");
            String nombre = leer.next();
            System.out.println("Ingrese el precio del producto: ");
            double precio = leer.nextDouble();
            productos.put(nombre, precio);
            System.out.println("Ingrese cualquier letra para ingresar otro producto o S para salir");
            String salir = leer.next();
            if (salir.toUpperCase().equals("S")) {
                break;
            }
        }
    }
    public static void modificarPrecio(HashMap<String, Double> productos) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese el nombre del producto que desea modificar");
        String productocambiarprecio = leer.next();
        if (productos.containsKey(productocambiarprecio)) {
            System.out.println("Ingrese el precio nuevo");
            double precioNuevo = leer.nextDouble();
            productos.put(productocambiarprecio, precioNuevo);
        } else {
            System.out.println("El producto no se ha encontrado en la lista");
        }
    }
    public static void eliminarProducto(HashMap<String, Double> productos) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese el producto que desea eliminar de la lista");
        String productoeliminado = leer.next();
        if (productos.containsKey(productoeliminado)) {
            productos.remove(productoeliminado);
        } else {
            System.out.println("El producto no se encuentra en la la lista");
        }
    }
    public static void mostrarLista(HashMap<String, Double> productos){
        Scanner leer= new Scanner (System.in).useDelimiter("\n");
        System.out.println("Los productos de la lista son: ");
        for (String aux : productos.keySet()) {
            System.out.println("producto: " +aux + "precio: "+ productos.get(aux));
        }
    }
}
