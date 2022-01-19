/*
 * EJERCICIO 3 COLECCIONES ALUMNO
Crear una clase llamada Alumno que mantenga información sobre las notas de
distintos alumnos. La clase Alumno tendrá como atributos, su nombre y una lista
de tipo Integer con sus 3 notas.
En el main deberemos tener un bucle que crea un objeto Alumno. Se pide toda la
información al usuario y ese Alumno se guarda en una lista de tipo Alumno y se le
pregunta al usuario si quiere crear otro Alumno o no.
Despues de ese bluce tendremos el siguiente método en la clase Alumno:
Metodo notaFinal(): El usuario ingresa el nombre del alumno que quiere calcular
su nota final y se lo busca en la lista de Alumnos. Si está en la lista, se llama al
método. Dentro del método se usará la lista notas para calcular el promedio final
de alumno. Siendo este promedio final, devuelto por el método y mostrado en el
main.
 */
package coleccioneseje3;

import coleccioneseje3.AlumnoEntidad.Alumno;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author river
 */
public class ColeccionesEje3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        ArrayList<Alumno> alumnos = new ArrayList();

        while (true) {
            Alumno nuevoalumno = new Alumno();
            ArrayList<Integer> notas = new ArrayList();
            System.out.println("Ingrese el nombre del alumno: ");
            String nombre = leer.next();
            for (int i = 0; i < 3; i++) {
                System.out.println("Ingrese las 3 notas del alumno: " + (i + 1));
                notas.add(leer.nextInt());
            }
            nuevoalumno.setNombre(nombre);
            nuevoalumno.setNotas(notas);
            alumnos.add(nuevoalumno);
            leer.nextLine();
            System.out.println("Ingrese un nuevo alumno o S para salir");
            String salir = leer.nextLine();
            if (salir.toUpperCase().equals("S")) {
                break;
            }
        }
         System.out.println("Ingrese el nombre del alumno: ");
        String nombreNotaFinal = leer.nextLine();
        double promedio =0;
        for(Alumno aux: alumnos){
            if(aux.getNombre().equals(nombreNotaFinal)){
                promedio = aux.notaFinal(nombreNotaFinal);
            }
        }
        System.out.println("El promedio de "+nombreNotaFinal+" es: "+promedio);
        
    }
}
