/*
 * CLASE ENTIDAD
 */
package Persona;

/**
 *
 * @author river
 */
public class Persona {
   private String nombre;
   private int edad;
   private char sexo;
   private double peso;
   private double altura;
   private int imc;
   private boolean mayordeedad;
   
    public Persona() {
    }

    public Persona(String nombre, int edad, char sexo, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
        
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setImc(int imc) {
        this.imc = imc;
    }

    public void setMayordeedad(boolean mayordeedad) {
        this.mayordeedad = mayordeedad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public char getSexo() {
        return sexo;
    }

    public double getPeso() {
        return peso;
    }

    public double getAltura() {
        return altura;
    }

    public int getImc() {
        return imc;
    }

    public boolean isMayordeedad() {
        return mayordeedad;
    }

    @Override
    public String toString() {
        return "PersonaEntidad{" + "nombre=" + nombre + ", edad=" + edad + ", sexo=" + sexo + ", peso=" + peso + ", altura=" + altura + ", imc=" + imc + ", mayordeedad=" + mayordeedad + '}';
    }

   
  
        
}
