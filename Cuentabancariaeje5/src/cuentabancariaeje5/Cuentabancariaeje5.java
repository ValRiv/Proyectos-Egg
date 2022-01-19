/*
 * EJERCICIO 5 CUENTA BANCARIA.
 */
package cuentabancariaeje5;

import Cuenta.Cuenta;
import ServicioCuenta.ServicioCuenta;
import java.util.Scanner;

/**
 *
 * @author river
 */
public class Cuentabancariaeje5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in).useDelimiter("\n");
        ServicioCuenta serv= new ServicioCuenta();
        Cuenta c1 =serv.crearCuenta();
        serv.ingreso(c1);
        serv.retiro(c1);
        serv.extraccionRapida(c1);
        serv.mostrarCuenta(c1);
        serv.mostrasDatos(c1);
       
    }
    
}
