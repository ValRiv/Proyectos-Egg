/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eje_extra2_colecciones2.EntidadCantante;

/**
 *
 * @author river
 */
public class Cantante {
    private String nombre;
    private String discos;

    public Cantante() {
    }

    public Cantante(String nombre, String discos) {
        this.nombre = nombre;
        this.discos = discos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDiscos() {
        return discos;
    }

    public void setDiscos(String discos) {
        this.discos = discos;
    }

    @Override
    public String toString() {
        return "Cantante{" + "nombre=" + nombre + ", discos=" + discos + '}';
    }
    
}
