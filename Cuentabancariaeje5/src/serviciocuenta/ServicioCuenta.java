/*
 * CUENTA BANCARIA SERVICIO.
 */
package ServicioCuenta;

import Cuenta.Cuenta;
import java.util.Scanner;

/**
 *
 * @author river
 */
public class ServicioCuenta {
    Scanner leer= new Scanner(System.in).useDelimiter("\n");
    
    public Cuenta crearCuenta() {
       System.out.println("Ingrese su numero de cuenta:  ");
       int numerocuenta = leer.nextInt();
    
     System.out.println("Ingrese su numero de D.N.I.:    ");
       long DNI = leer.nextLong();
    
       System.out.println("Ingrese el valor a depositar: ");
       double saldoactual = leer.nextDouble();
       return new Cuenta(numerocuenta,DNI, saldoactual);
}
     public void ingreso(Cuenta c) {
         double saldoActual=c.getSaldoactual();
        System.out.println("Introducir el monto que desea depositar:  ");
        double ingreso = leer.nextDouble();
        saldoActual = saldoActual+ ingreso;
        c.setSaldoactual(saldoActual);
}
    public void retiro(Cuenta c) {
       double saldoActual=c.getSaldoactual();
        System.out.println("Introducir el monto que desea retirar: ");
        double retiro = leer.nextDouble();   
        if (saldoActual < retiro) {
            System.out.println("El valor a retirar el superior a su saldo actual.");
            c.setSaldoactual(0);
           } else {
           saldoActual= saldoActual - retiro;
           c.setSaldoactual(saldoActual);
            
        }
    }
    public void extraccionRapida(Cuenta c) {
        double saldoActual=c.getSaldoactual();
        double egreso;
        do{
        System.out.println("Ingrese el monto que sea extraer que debe ser menor al 20%.");
        egreso=leer.nextDouble();
        
        if(egreso> saldoActual*0.2){
            System.out.println("El retiro supera el 20% del saldo actual ingreselo nuevamente.");
        }else{
            saldoActual=saldoActual-egreso;
            c.setSaldoactual(saldoActual);
        }
         }while (egreso> saldoActual*0.2);
         }
    public void mostrarCuenta(Cuenta c){
        System.out.println("Su saldo actual es  " + c.getSaldoactual());
    }
    public void mostrasDatos(Cuenta c){
        System.out.println("Nro de cuenta:  " +c.getNumerocuenta());
        System.out.println("D.N.I. :  " + c.getDNI());
        System.out.println("Saldo actual es:  " + c.getSaldoactual());
        
    }
         }

         
            
        



   

     
