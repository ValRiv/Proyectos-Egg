/*
 * GUIA RELACIONES. CLASE ENTIDAD. EJERCICIO 2.JUEGO
Clase Juego: esta clase posee los siguientes atributos: Jugadores (conjunto de
Jugadores) y Revolver
Métodos:
• llenarJuego(ArrayList<Jugador>jugadores, Revolver r): este método recibe los
jugadores y el revolver para guardarlos en los atributos del juego.
• ronda(): cada ronda consiste en un jugador que se apunta con el revolver de agua y
aprieta el gatillo. Sí el revolver tira el agua el jugador se moja y se termina el juego,
sino se moja, se pasa al siguiente jugador hasta que uno se moje. Si o si alguien se
tiene que mojar. Al final del juego, se debe mostrar que jugador se mojó.
Pensar la lógica necesaria para realizar esto, usando los atributos de la clase Juego
 */
package Relaciones2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author river
 */
public class Juego {
    //ArrayList<String> lista = new ArrayList();

    private ArrayList<Jugador> jugadores = new ArrayList<>();
    private RevolverAgua revolver;

    //CONSTRUCTORES
    public Juego() {
    }

    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    public RevolverAgua getRevolver() {
        return revolver;
    }

    public void setRevolver(RevolverAgua revolver) {
        this.revolver = revolver;
    }

    @Override
    public String toString() {
        return "Juego{" + "jugadores=" + jugadores + ", revolver=" + revolver + '}';
    }
    //llenarJuego(ArrayList<Jugador>jugadores, Revolver r): este método recibe los
//jugadores y el revolver para guardarlos en los atributos del juego

    public void llenarJuego(int cantJugadores) {

        for (int i = 0; i < cantJugadores; i++) {           //creamos jugador y lo añadimos al arraylist
            Jugador jugador = new Jugador(i + 1);
            jugadores.add(jugador);
        }
        revolver = new RevolverAgua();
        revolver.llenarRevolver();
    }

    public void ronda() {
        Jugador j = new Jugador();
        boolean rta = false;
        salir:

        do {
            for (Jugador aux : jugadores) {

                System.out.println("El jugador " + aux.getNombre() + " es apuntado...");
                if (aux.disparo(revolver) == false) {
                    System.out.println(aux.getNombre() + " has muerto");
                    break salir;
                } else {
                    System.out.println(aux.getNombre() + " te salvaste!!");
                }

            }
        } while (rta == true);

    }

}
