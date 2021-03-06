/*
 * Clase Entidad Libro 
 */
package eje_extra_3.EntidadLibro;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;



/**
 *
 * @author river
 */
public class Libro {

    private ArrayList<String> libros;
    
    private HashSet<Integer> numeros; // Puede ser tanto un HashSet como un TreeSet
    
    private HashMap<Integer, String> alumnos; // Puede ser tanto un hashMap como un TreeMap

    public Libro(ArrayList<String> libros, HashSet<Integer> numeros, HashMap<Integer, String> alumnos) {
        this.libros = libros;
        this.numeros = numeros;
        this.alumnos = alumnos;
    }

   public Libro() {
        
        // Se inicializan las colecciones para que no esten en null, si no vacios.
        
        libros = new ArrayList();
        
        numeros = new HashSet();
        
        alumnos = new HashMap();
        
    }
    public ArrayList<String> getLibros() {
        return libros;
    }

    public void setLibros(ArrayList<String> libros) {
        this.libros = libros;
    }

    public HashSet<Integer> getNumeros() {
        return numeros;
    }

    public void setNumeros(HashSet<Integer> numeros) {
        this.numeros = numeros;
    }

    public HashMap<Integer, String> getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(HashMap<Integer, String> alumnos) {
        this.alumnos = alumnos;
    }
    
    
    public void recorrerColecciones(){
        
        for (String libro : libros) {
            System.out.println(libro);
        }
        
        
        
    }
    
    
    
    
    
}