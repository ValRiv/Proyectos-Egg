/*
 * Superclase ELECTRODOMESTICO.
Crear una superclase llamada Electrodoméstico con los siguientes atributos:
precio, color, consumo energético (letras entre A y F) y peso.
Los constructores que se deben implementar son los siguientes:
• Un constructor vacío.
• Un constructor con todos los atributos pasados por parámetro.
Los métodos a implementar son:
• Métodos getters y setters de todos los atributos.
 */
package Herencia2y3;

import java.util.Scanner;

/**
 *
 * @author river
 */
public class Electrodomestico {

    protected double precio;
    protected String color;
    protected char consumo;
    protected double peso;

    //Contructorvacio
    public Electrodomestico() {
    }

    //Constructor con todos los atributos pasados por parametros
    public Electrodomestico(double precio, String color, char consumo, double peso) {
        this.precio = precio;
        this.color = color;
        this.consumo = consumo;
        this.peso = peso;
    }
    //Metodo getters y setters de todos los atributos

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsumo() {
        return consumo;
    }

    public void setConsumo(char consumo) {
        this.consumo = consumo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    //Método comprobarConsumoEnergetico(char letra): comprueba que la letra
    //es correcta, sino es correcta usara la letra F por defecto. Este método se debe
    //invocar al crear el objeto y no será visible.

    public void comprobarConsumoEnergetico(char letra) {
        letra = Character.toUpperCase(letra);
        int ascii = letra;
        if (ascii > 70) {
            this.consumo = 'F';
        } else {
            this.consumo = letra;
        }
    }
    //Método comprobarColor(String color): comprueba que el color es correcto, y
    //si no lo es, usa el color blanco por defecto. Los colores disponibles para los
//electrodomésticos son blanco, negro, rojo, azul y gris. No importa si el nombre
//está en mayúsculas o en minúsculas. Este método se invocará al crear el
//objeto y no será visible.

    public void comprobarColor(String color) {
        color = color.toUpperCase();
        if (!color.equals("BLANCO") && !color.equals("NEGRO") && !color.equals("ROJO") && !color.equals("AZUL") && !color.equals("GRIS")) {
            this.color = "BLANCO";
        } else {
            this.color = color;
        }
    }
    // Metodo crearElectrodomestico(): le pide la información al usuario y llena el
    //electrodoméstico, también llama los métodos para comprobar el color y el
    //consumo. Al precio se le da un valor base de $1000.

    public void crearElectrodomestico() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese el color del electrodomestico");
        String color = leer.next();
        comprobarColor(color);
        System.out.println("Ingrese el consumo energetico, una letra de 'a' a la 'f'");
        char consumo = leer.next().charAt(0);
        comprobarConsumoEnergetico(consumo);
        System.out.println("Ingrese el peso del electrodomestico");
        double peso = leer.nextInt();
        this.peso = peso;
        this.precio = 1000;
    }
    // Método precioFinal(): según el consumo energético y su tamaño, aumentará
    //el valor del precio. Esta es la lista de precios:

    public void precioFinal() {
        if (this.consumo == 'A') {
            this.precio += 1000;
        } else if (this.consumo == 'B') {
            this.precio += 800;
        } else if (this.consumo == 'C') {
            this.consumo += 600;
        } else if (this.consumo == 'D') {
            this.consumo += 500;
        } else if (this.consumo == 'E') {
            this.consumo += 300;
        }
        if (this.peso >= 1 && this.peso <= 19) {
            this.precio += 100;
        } else if (this.peso >= 20 && this.peso <= 49) {
            this.precio += 500;
        } else if (this.peso >= 50 && this.peso <= 79) {
            this.precio += 800;
        } else {
            this.precio += 1000;
        }
    }

    @Override
    public String toString() {
        return "Electrodomestico { " + " precio= " + precio + "  color= " + color + " consumo= " + consumo + " peso= " + peso + '}';
    }
}
