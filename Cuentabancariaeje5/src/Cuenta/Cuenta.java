/*Realizar una clase llamada Cuenta (bancaria) que debe tener como mínimo los
atributos: numeroCuenta (entero), el DNI del cliente (entero largo), el saldo actual. Las
operaciones asociadas a dicha clase son:
• Constructor por defecto y constructor con DNI, saldo, número de cuenta e interés.
• Agregar los métodos getters y setters correspondientes
• Metodo para crear un objeto Cuenta, pidiéndole los datos al usuario.
• Método ingresar(double ingreso): el método recibe una cantidad de dinero a
ingresar y se la sumara a saldo actual.
• Método retirar(double retiro): el método recibe una cantidad de dinero a retirar y
se la restará al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar, se
pondrá el saldo actual en 0.
• Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo. Validar
que el usuario no saque más del 20%.
• Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta.
• Método consultarDatos(): permitirá mostrar todos los datos de la cuenta
 * 
 */
package Cuenta;

import java.util.Scanner;

/**
 *
 * @author river
 */
public class Cuenta {
     Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private int numerocuenta;
    private long DNI;
    private double saldoactual;
   
    public void Cuenta() {
    }

    public Cuenta(int numerocuenta, long DNI, double saldoactual) {
        this.numerocuenta = numerocuenta;
        this.DNI = DNI;
        this.saldoactual = saldoactual;
    }  
   
    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public void setSaldoactual(double saldoactual) {
        this.saldoactual = saldoactual;
    }

    public void setNumerocuenta(int numerocuenta) {
        this.numerocuenta = numerocuenta;
    }

    public long getDNI() {
        return DNI;
    }

    public double getSaldoactual() {
        return saldoactual;
    }

    public int getNumerocuenta() {
        return numerocuenta;
    }

   
    }

   

        
   






    





   
    

    

    
    



    


  



    


