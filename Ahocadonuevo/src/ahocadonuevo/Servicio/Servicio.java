/*
 * EJERCICIO EXTRA 6 CLASE SERVICIO.
 */
package ahocadonuevo.Servicio;

import ahocadonuevo.entidad.Entidad;
import java.util.Scanner;

/**
 *
 * @author river
 */
public class Servicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Entidad datos = new Entidad();

    //Metodo crearJuego(): le pide la palabra al usuario y cantidad de jugadas máxima.
//Con la palabra del usuario, pone la longitud de la palabra, como la longitud del vector.
//Después ingresa la palabra en el vector, letra por letra, quedando cada letra de la
//palabra en un índice del vector. Y también, guarda en cantidad de jugadas máximas,
//el valor que ingresó el usuario y encontradas en 0.
    public void creaAhorcado() {

        System.out.println("Ingrese la palabra: ");
        String palabra = leer.next();
        String aux[] = new String[palabra.length()];

        for (int i = 0; i < palabra.length(); i++) {
            aux[i] = palabra.substring(i, i + 1);
            //buscar[i]= nuevo;
            System.out.print("[" + aux[i] + "]");
        }
        datos.setBuscar(aux);

        System.out.println("La palabra es : " + palabra);
        // System.out.println(" La cantidad de letras de la palabra es: "+ palabra.length());

        //datos.setBuscar(aux);
        System.out.println("Ingrese la cantidad intento");
        datos.setIntentos(leer.nextInt());

        System.out.println("Sus intentos son " + datos.getIntentos());
        datos.setCant_letras(0);
        datos.setLongitud_palabra(datos.getBuscar().length);
        System.out.println("➤Longitud de la palabra: " + datos.getLongitud_palabra());

    }

    //Método longitud(): muestra la longitud de la palabra que se debe encontrar. Nota:
//buscar como se usa el vector.length.
    public void longitud() {
        datos.setLongitud_palabra(datos.getBuscar().length);
        System.out.println("Longitud de la palabra es: " + datos.getLongitud_palabra());
    }
    //Método buscar(letra): este método recibe una letra dada por el usuario y busca sila
//letra ingresada es parte de la palabra o no. También informará si la letra estaba o no

    public void buscarLetra() {
        System.out.println("Ingrese una letra: ");
        datos.setLetra(leer.next());
        longitud();
        boolean valor = false;

        String buscar[] = datos.getBuscar();
        // System.out.println("caca" + datos.getLongitud_palabra());
        for (int i = 0; i < datos.getLongitud_palabra(); i++) {
            if (buscar[i].equals(datos.getLetra())) {
                valor = true;
            }
        }
        if (valor == true) {
            System.out.println("La letra: " + datos.getLetra() + " pertenece a la palabra");
        } else {
            System.out.println("La letra: " + datos.getLetra() + " NO pertenece a la palabra");

        }
    }
    //Método encontradas(letra): que reciba una letra ingresada por el usuario y muestre
//cuantas letras han sido encontradas y cuantas le faltan. Este método además deberá
//devolver true si la letra estaba y false si la letra no estaba, ya que, cada vez que se
//busque una letra que no esté, se le restará uno a sus oportunidades.

    public boolean encontradas() {
        String buscar[] = datos.getBuscar();
        boolean encontrada = false;
        for (int i = 0; i < datos.getLongitud_palabra(); i++) {
            if (buscar[i].equals(datos.getLetra())) {
                datos.setCant_letras(datos.getCant_letras() + 1);
                encontrada = true;
            } else {
                encontrada = false;

            }
        }
        System.out.println("El numero de letra encontradas es:  " + datos.getCant_letras() + "  El numero de letras faltantas es: " + (datos.getLongitud_palabra() - datos.getCant_letras()));
        return encontrada;
    }
    //Método intentos(): para mostrar cuantas oportunidades le queda al jugador.

    public void intentos() {
        int intentos = datos.getIntentos();
        datos.setIntentos(intentos - 1);

        System.out.println("Numero de oportunidades restantes:  " + datos.getIntentos());
    }

    // Método juego(): el método juego se encargará de llamar todos los métodos
//previamente mencionados e informará cuando el usuario descubra toda la palabra o
//se quede sin intentos. Este método se llamará en el main.
    public void juego() {
        creaAhorcado();
        do {
            buscarLetra();
            encontradas();
            intentos();

        } while (datos.getIntentos() != 0 && (datos.getLongitud_palabra() - datos.getCant_letras()) != 0);
        if (datos.getIntentos() == 0) {
            System.out.println(" Usted, No tiene mas jugadas");
        } else {
            System.out.println("FELICITACIONES, usted GANO");
        }
    }
}
