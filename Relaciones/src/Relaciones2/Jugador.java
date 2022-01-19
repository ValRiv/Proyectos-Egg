/*
 * GRUIA RELACIONES.  CLASE ENTIDAD. EJERCICIO 2 JUGADOR.
Clase Jugador: esta clase posee los siguientes atributos: id (representa el número del
jugador), nombre (Empezara con Jugador más su ID, “Jugador 1” por ejemplo) y mojado
(indica si está mojado o no el jugador). El número de jugadores será decidido por el
usuario, pero debe ser entre 1 y 6. Si no está en este rango, por defecto será 6.
Métodos:
9
• disparo(Revolver r): el método, recibe el revolver de agua y llama a los métodos de
mojar() y siguienteChorro() de Revolver. El jugador se apunta, aprieta el gatillo y si el
revolver tira el agua, el jugador se moja. El atributo mojado pasa a false y el método
devuelve true, sino false.
 */
package Relaciones2;

/**
 *
 * @author river
 */
public class Jugador {
    //ATRIBUTOS
    private int id;
    private String nombre;
    private boolean mojado;

    //CONSTRUCTORES

    public Jugador() {
    }

    public Jugador(int id) {
        this.id = id;
        this.nombre = "ID Jugador: " + id;
        this.mojado = true;
    }
    //GETTER Y SETTER

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isMojado() {
        return mojado;
    }

    public void setVivo(boolean mojado) {
        this.mojado = mojado;
    }
    // ToString

    @Override
    public String toString() {
        return "\n Jugador: " + "\nID: " + id ;
    }
    
    //METODO DISPARO.
    public boolean disparo(RevolverAgua r){
        r.mojar();
        if (r.mojar()== true) {
            this.mojado = false;  // si el r.mojar() devuelve true---- mojado == false ( de que perdió)
        } else {
            mojado = true;       //sino sigue vivo
        }
        r.siguienteChorro();
        return mojado;
    }
        
    }
