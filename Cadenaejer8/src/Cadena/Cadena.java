/*
 *                  CLASE CADENA ENTIDAD/CONTROL

 */
package Cadena;

//import java.util.Scanner;

/**
 *
 * @author river
 */
public class Cadena {
    //Scanner leer=new Scanner(System.in).useDelimiter("\n");
private String frase;
private int longitud;
private char letra;
    public Cadena() {
    }

    public Cadena(String frase, int longitud, char letra) {
        this.frase = frase;
        this.longitud = longitud;
        this.letra=letra;
    }

    public String getFrase() {
        return frase;
    }

    public int getLongitud() {
        return longitud;
    }
    public char getLetra(){
        return letra;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }
    public void setLetra(char letra){
        this.letra=letra;
    }
  
    }

