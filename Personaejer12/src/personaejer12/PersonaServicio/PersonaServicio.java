/*
 * EJERCICIO 12  CLASE SERVICIO PERSONA .
Agregar un método de creación del objeto que respete la siguiente firma:
crearPersona(). Este método rellena el objeto mediante un Scanner y le pregunta
al usuario el nombre y la fecha de nacimiento de la persona a crear, recordemos
que la fecha de nacimiento debe guardarse en un Date y los guarda en el objeto.

• Escribir un método calcularEdad() a partir de la fecha de nacimiento ingresada.
Tener en cuenta que para conocer la edad de la persona también se debe
conocer la fecha actual.
• Agregar a la clase el método menorQue(int edad) que recibe como parámetro
otra edad y retorna true en caso de que el receptor tenga menor edad que la
persona que se recibe como parámetro, o false en caso contrario.
• Metodo mostrarPersona(): este método muestra la persona creada en el método
anterior
 */
package personaejer12.PersonaServicio;

import Persona.Entidad.Persona;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author river
 */
public class PersonaServicio {
    Scanner leer= new Scanner(System.in).useDelimiter("\n");
    
    
    public Persona crearPersona(){
        Persona p1= new Persona();
        int mes, dia, anio;
        //Llenar el atributo Date con set
        do{
        System.out.println("Ingrese el nombre de la persona: ");
        p1.setNombre(leer.next());
        System.out.println("Ingrese el dia de su nacimiento con 2 digitos: ");
        dia=leer.nextInt();
        System.out.println("Ingrese el mes de su nacimiento con 2 digitos: ");
         mes=leer.nextInt();
        System.out.println("Ingrese el año de su nacimiento con 4 digitos: ");
         anio=leer.nextInt();
        }while(dia<0||dia>31||mes<1||mes>12||anio<0);//se evalua que los numeros ingresados sean fechas validas
        
        // creo un objeto tipo fecha con los valores ingresados
        Date fecha =new Date(anio-1900,mes-1,dia);
        //guardo la fecha en el objeto
        p1.setFechadenacimiento(fecha); 
        return p1;
    }
    
    public int calcularEdad(Persona persona){
         
       Date fecha_actual= new Date();
        return( fecha_actual.getYear()-persona.getFechadenacimiento().getYear());
    }
  
    public boolean menorEdad(int edad1, int edadRef){
        if(edad1<edadRef){
            return true;
        }else{
            return false;
    }
    }
     public void mostrarEdad(Persona persona ){
           System.out.println("\n<<<<< DATOS USUARIO 1>>>>>");
        System.out.println("-Nombre: " + persona.getNombre());
        System.out.println("-Nacimiento: " + persona.getFechadenacimiento().getDate()+"/"+(persona.getFechadenacimiento().getMonth()+1)+"/" +(persona.getFechadenacimiento().getYear()+1900));
        

     }
        
    }
    

