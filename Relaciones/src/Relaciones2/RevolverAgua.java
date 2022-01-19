/*
EJERCICIO 2 DE LA GUIA RELACIONES.
 * Clase Revolver de agua: esta clase posee los siguientes atributos: posición actual
(posición del tambor que se dispara, puede que esté el agua o no) y posición agua (la
posición del tambor donde se encuentra el agua). Estas dos posiciones, se generarán
aleatoriamente.
Métodos:
• llenarRevolver(): le pone los valores de posición actual y de posición del agua. Los
valores deben ser aleatorios.
• mojar(): devuelve true si la posición del agua coincide con la posición actual
• siguienteChorro(): cambia a la siguiente posición del tambor
• toString(): muestra información del revolver (posición actual y donde está el agua
 */
package Relaciones2;

/**
 *
 * @author river
 */
public class RevolverAgua {

    //ATRIBUTOS
    private int posicionAgua;
    private int posicionTambor;

    //CONSTRUCTORES
    public RevolverAgua() {
    }

    public RevolverAgua(int posicionAgua, int posicionTambor) {
        this.posicionAgua = posicionAgua;
        this.posicionTambor = posicionTambor;
    }
    // getter y setter
    public int getPosicionAgua() {
        return posicionAgua;
    }

    public void setPosicionAgua(int posicionAgua) {
        this.posicionAgua = posicionAgua;
    }

    public int getPosicionTambor() {
        return posicionTambor;
    }

    public void setPosicionTambor(int posicionTambor) {
        this.posicionTambor = posicionTambor;
    }
    //Metodos:
    public void llenarRevolver() {
        this.posicionAgua = (int) (Math.random() * 6 + 1);
        this.posicionTambor = (int) (Math.random() * 6 + 1);
    }

    public boolean mojar() {
        boolean respuesta = false;
        if (posicionTambor == posicionAgua) {
            respuesta = true;
        }
        siguienteChorro();
        return respuesta;
    }

    public void siguienteChorro() {
        if (posicionAgua == 6) {
            posicionAgua = 1;
        } else {
            posicionAgua++;
        }
    }

    @Override
    public String toString() {
        return "RevolverAgua{" + "posicionAgua=" + posicionAgua + ", posicionTambor=" + posicionTambor + '}';
    }

}
