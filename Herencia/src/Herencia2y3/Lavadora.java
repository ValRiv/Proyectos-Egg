/*
 *CLASE LAVADORA.
 */
package Herencia2y3;

import java.util.Scanner;

/**
 *
 * @author river
 */
public class Lavadora extends Electrodomestico {

    private int carga;
    // Un constructor vacío.
    //Un constructor con la carga y el resto de atributos heredados. Recuerda que
    //debes llamar al constructor de la clase padre

    public Lavadora() {
    }

    public Lavadora(int carga) {
        this.carga = carga;
    }

    public Lavadora(int carga, double precio, String color, char consumo, double peso) {
        super(precio, color, consumo, peso);
        this.carga = carga;
    }
    //Método get y set del atributo carga

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }
    //Método crearLavadora (): este método llama a crearElectrodomestico() de la
    //clase padre, lo utilizamos para llenar los atributos heredados del padre y
    //después llenamos el atributo propio de la lavadora
    public void crearLavadora() {
        Scanner leer = new Scanner(System.in);//.useDelimiter("\n");
        super.crearElectrodomestico();
        System.out.println("Ingrese la carga de la lavadora");
        int carga = leer.nextInt(); leer.nextLine();
        this.carga = carga;
    }
//Método precioFinal(): este método será heredado y se le sumará la siguiente
//funcionalidad. Si tiene una carga mayor de 30 kg, aumentará el precio en $500,
//si la carga es menor o igual, no se incrementará el precio. Este método debe
//llamar al método padre y añadir el código necesario. Recuerda que las
//condiciones que hemos visto en la clase Electrodoméstico también deben
//afectar al precio.

    @Override
    public void precioFinal() {
        super.precioFinal();
        if (this.carga > 30) {
            super.setPrecio(super.getPrecio() + 500);
        }
    }

    @Override
    public String toString() {
        return super.toString()+ "Lavadora: " + "carga: " + carga + '}';
    }

    
   
}
