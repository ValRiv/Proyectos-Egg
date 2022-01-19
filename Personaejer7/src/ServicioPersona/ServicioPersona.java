/*
 * CLASE SERVICIO
 */
package ServicioPersona;

import Persona.Persona;
import java.util.Scanner;

/**
 *
 * @author river
 */
public class ServicioPersona {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Persona crearPersona() {
        Persona x= new Persona();
        System.out.println("Ingrese su nombre: ");
        String nombre = leer.next();
        x.setNombre(nombre);
        System.out.println("Ingrese la edad de: " + x.getNombre());
        int edad = leer.nextInt();
        x.setEdad(edad);
        leer.nextLine();
        char sexo;
        System.out.println("Ingrese el sexo de " + x.getNombre() + ", ('H' hombre, 'M' mujer, 'O' otro),");
        sexo = leer.nextLine().charAt(0);
        sexo = Character.toUpperCase(sexo);
        while (sexo != 'H' && sexo != 'M' && sexo != 'O') {
            System.out.println("El sexo no es correcto, intente nuevamente");
            System.out.println("Ingrese el sexo de " + x.getNombre() + ", ('H' hombre, 'M' mujer, 'O' otro),");
            sexo = leer.nextLine().charAt(0);
            sexo = Character.toUpperCase(sexo);
        }
        System.out.println("Ingrese el  peso de :  " + x.getNombre());
        double peso = leer.nextDouble();
        x.setPeso(peso);

        System.out.println("Ingrese su talla:  ");
        double altura = leer.nextDouble();
        x.setAltura(altura);
        return new Persona(nombre, edad, sexo, peso,altura);
    }

    public int calcularImc(Persona x) {
       
        double imc = (x.getPeso() / Math.pow(x.getAltura(), 2));
        if (imc <= 20) {
            return  -1;
        } else if (imc >= 20 && imc <= 25){
        
            return 0;
        }else{
                    return 1;
            
        }
    }
       
    public boolean  mayordeEdad(Persona x){
        if(x.getEdad()<18){
        return false;
    }else{
    return true;
}
    }
}


    


