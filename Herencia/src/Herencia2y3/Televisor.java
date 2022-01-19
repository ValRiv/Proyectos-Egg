/*
 * GUIA HERENCIA EJERCICIO 2 SUBCLASE  TELEVISOR
 */
package Herencia2y3;

import java.util.Scanner;

/**
 *
 * @author river
 */
public class Televisor extends Electrodomestico {
    //atributos: resolución (en pulgadas) y sintonizador TDT (booleano), además de los
    // atributos heredados
    private int pulgadas;
    private boolean TDT;

    //Un constructor vacio.
    public Televisor() {
    }
    //Un constructor con la resolución, sintonizador TDT y el resto de atributos
    //heredados. Recuerda que debes llamar al constructor de la clase padre.

    public Televisor(int pulgadas, boolean TDT) {
        this.pulgadas = pulgadas;
        this.TDT = TDT;
    }

    public Televisor(int pulgadas, boolean TDT, double precio, String color, char consumo, double peso) {
        super(precio, color, consumo, peso);
        this.pulgadas = pulgadas;
        this.TDT = TDT;
    }
    //Método get y set de los atributos resolución y sintonizador TDT

    public int getPulgadas() {
        return pulgadas;
    }

    public void setPulgadas(int pulgadas) {
        this.pulgadas = pulgadas;
    }

    public boolean isTDT() {
        return TDT;
    }

    public void setTDT(boolean TDT) {
        this.TDT = TDT;
    }
    // Método crearTelevisor(): este método llama a crearElectrodomestico() de la
    //clase padre, lo utilizamos para llenar los atributos heredados del padre y
    //después llenamos los atributos del televisor

    public void crearTelevisor() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        super.crearElectrodomestico();
        System.out.println("Ingrese las pulgadas de su televisor");
        int pulgadas = leer.nextInt();
        this.pulgadas = pulgadas;
        System.out.println("Indique si el televisor tiene sintonizador TDT ");
        String res = leer.next();
        res = res.toUpperCase();
        if (res.equals("SI")) {
            this.TDT = true;
        } else {
            this.TDT = false;
        }
    }
    //Método precioFinal(): este método será heredado y se le sumará la siguiente
//funcionalidad. Si el televisor tiene una resolución mayor de 40 pulgadas, se
//incrementará el precio un 30% y si tiene un sintonizador TDT incorporado,
//aumentará $500. Recuerda que las condiciones que hemos visto en la clase
//Electrodomestico también deben afectar al precio

    @Override
    public void precioFinal() {
        super.precioFinal();
        if (this.pulgadas > 40) {
            super.setPrecio(super.getPrecio() * 1.4);
        }
        if (this.TDT = true) {
            super.setPrecio(super.getPrecio() + 500);
        }
    }

    @Override
    public String toString() {
        
        return super.toString() + " Televisor: " + "  pulgadas:  " + pulgadas + ", TDT: " + TDT + '}';
    }

    

}
