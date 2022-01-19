/*
 * CLASE SERVICIO BARAJA EJERCICIO 3 GUIA.
Las operaciones que podrá realizar la baraja son:
• barajar(): cambia de posición todas las cartas aleatoriamente.
• siguienteCarta(): devuelve la siguiente carta que está en la baraja, cuando no
haya más o se haya llegado al final, se indica al usuario que no hay más cartas.
• cartasDisponibles(): indica el número de cartas que aún se puede repartir.
• darCartas(): dado un número de cartas que nos pidan, le devolveremos ese
número de cartas. En caso de que haya menos cartas que las pedidas, no
devolveremos nada, pero debemos indicárselo al usuario.
• cartasMonton(): mostramos aquellas cartas que ya han salido, si no ha salido
ninguna indicárselo al usuario
• mostrarBaraja(): muestra todas las cartas hasta el final. Es decir, si se saca una
carta y luego se llama al método, este no mostrara esa primera carta.
 */
package Servicio2;

import Entidad.Carta;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author river
 */
public class ServicioBaraja3 {

    ArrayList<Carta> Cartas = new ArrayList<>();

    public ServicioBaraja3() {
    }

    public ArrayList<Carta> getCartas() {
        return Cartas;
    }

    public void setCartas(ArrayList<Carta> Cartas) {
        this.Cartas = Cartas;
    }

    //METODO CREAR BARAJA
    public void crearBaraja() {
        String palo = "BASTO";
        for (int i = 1; i <= 4; i++) {
            if (i == 2) {
                palo = "ESPADA";
            } else if (i == 3) {
                palo = "ORO";
            } else if (i == 4) {
                palo = "COPAS";
            }
            for (int j = 1; j <= 10; j++) {
                Carta nuevaCarta = new Carta();
                if (j == 8) {
                    nuevaCarta.setNumeros(10);
                    nuevaCarta.setPalo(palo);
                } else if (j == 9) {
                    nuevaCarta.setNumeros(11);
                    nuevaCarta.setPalo(palo);
                } else if (j == 10) {
                    nuevaCarta.setNumeros(12);
                    nuevaCarta.setPalo(palo);
                } else {
                    nuevaCarta.setNumeros(j);
                    nuevaCarta.setPalo(palo);
                }

                this.Cartas.add(nuevaCarta);

            }
        }
    }
    //• barajar(): cambia de posición todas las cartas aleatoriamente.

    public void barajar() {
        Collections.shuffle(this.Cartas);
    }
    //siguienteCarta(): devuelve la siguiente carta que está en la baraja, cuando no
//haya más o se haya llegado al final, se indica al usuario que no hay más cartas.

    public void siguienteCarta() {
        if (this.Cartas.isEmpty()) {
            System.out.println("No hay mas cartas en la baraja");
        } else {
            System.out.println("Carta: " + Cartas.get(0).getNumeros() + " De: " + Cartas.get(0).getPalo());
        }
    }

    //cartasDisponibles(): indica el número de cartas que aún se puede repartir.
    public void cartasDisponibles() {
        System.out.println("Las cartas disponibles son: " + this.Cartas.size());
    }
    //darCartas(): dado un número de cartas que nos pidan, le devolveremos ese
//número de cartas. En caso de que haya menos cartas que las pedidas, no
//devolveremos nada, pero debemos indicárselo al usuario.

    public void darCartas(ArrayList<Carta> CartasMonton, int numCartas) {
        if (numCartas > this.Cartas.size()) {
            System.out.println("No hay cartas disponibles");
        } else {
            for (int i = 0; i < numCartas; i++) {
                Carta nuevaCartaMonton = new Carta();
                nuevaCartaMonton.setNumeros(this.Cartas.get(i).getNumeros());
                nuevaCartaMonton.setPalo(this.Cartas.get(i).getPalo());
                CartasMonton.add(nuevaCartaMonton);
                this.Cartas.remove(i);
            }
        }
    }
    //cartasMonton(): mostramos aquellas cartas que ya han salido, si no ha salido
    //ninguna indicárselo al usuario

    public void cartasMonton(ArrayList<Carta> CartasMonton) {
        if (this.Cartas.isEmpty()) {
            System.out.println("No ha salido ninguna carta");
        } else {
            for (Carta aux : CartasMonton) {
                System.out.println("Cartas: " + aux.getNumeros() + "de: " + aux.getPalo());
            }
        }

    }
    // mostrarBaraja(): muestra todas las cartas hasta el final. Es decir, si se saca una
    //carta y luego se llama al método, este no mostrara esa primera carta.    

    public void mostrarBaraja() {
        for (Carta aux : this.Cartas) {
            System.out.println("Cartas: " + aux.getNumeros() + "de: " + aux.getPalo());
        }
    }

    //MENU DE OPCIONES.
    public void menu() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        ArrayList<Carta> CartasMonton = new ArrayList();
        boolean salir = true;
        while (salir) {
            System.out.println("------MENU------\n 1-BARAJAR\n 2- SIGUIENTE CARTA\n 3-CARTAS DISPONIBLES\n 4-DAR CARTAS\n 5-MOSTRAR CARTAS REPARTIDAS\n6-MOSTRAR BARAJA \n7-SALIR");
            int opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    barajar();
                    break;
                case 2:
                    siguienteCarta();
                    break;
                case 3:
                    cartasDisponibles();
                    break;
                case 4:
                    System.out.println("Ingrese cuantas cartas desea: ");
                    int numCartas = leer.nextInt();
                    darCartas(CartasMonton, numCartas);
                    break;
                case 5:
                    cartasMonton(CartasMonton);
                    break;
                case 6:
                    mostrarBaraja();
                    break;
                case 7:
                    salir = false;
                default:
                    System.out.println("Ingrese una opcion valida");

            }

        }
    }

}
