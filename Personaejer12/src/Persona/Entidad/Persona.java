/*
 * CLASE CONTROL EJERCICIO 12 PERSONA.
Implemente la clase Persona. Una persona tiene un nombre y una fecha de
nacimiento (Tipo Date), constructor vacío, constructor parametrizado, get y set. Y los
siguientes métodos:
 */
package Persona.Entidad;

import java.util.Date;

/**
 *
 * @author river
 */
public class Persona {
    private String nombre;
    private Date fechadenacimiento;
    

 
    public Persona(String nombre, Date fechadenacimiento, Date fecha_actual, int edad) {
        this.nombre = nombre;
        this.fechadenacimiento = fechadenacimiento;
        
    }

    public Persona() {
    }
    
      
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechadenacimiento() {
        return fechadenacimiento;
    }

    public void setFechadenacimiento(Date fechadenacimiento) {
        this.fechadenacimiento = fechadenacimiento;
    }

    
}

    

