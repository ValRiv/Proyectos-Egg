/*Crear una clase llamada Operacion que tenga como atributos privados numero1 y
numero2. A continuación, se deben crear los siguientes métodos:
a) Método constructor con todos los atributos pasados por parámetro.
b) Metodo constructor sin los atributos pasados por parámetro.
c) Métodos get y set.

d) Método para crearOperacion(): que le pide al usuario los dos números y los
guarda en los atributos del objeto.
e) Método sumar(): calcular la suma de los números y devolver el resultado al main.
f) Método restar(): calcular la resta de los números y devolver el resultado al main
g) Método multiplicar(): primero valida que no se haga una multiplicación por cero,
si fuera a multiplicar por cero, el método devuelve 0 y se le informa al usuario el
error. Si no, se hace la multiplicación y se devuelve el resultado al main
h) Método dividir(): primero valida que no se haga una división por cero, si fuera a
pasar una división por cero, el método devuelve 0 y se le informa al usuario el
error se le informa al usuario. Si no, se hace la división y se devuelve el resultado
al main.
 *
 */
package operacioneje3;

import java.util.Scanner;

/**
 *
 * @author river
 */
public class Operacion {
    Scanner leer= new Scanner(System.in).useDelimiter("\n");
    private double num1;
    private double num2;
    
    public Operacion(){    
    }
   
    public void setNum1(double num1){
        this.num1 = num1;
    }
    public void setNum2(double num2){
        this.num2=num2;
    } 
    
    public double getNum1(){
        return num1;
    }
    public double getNum2(){
        return num2;
    }
    public void crearOperacion(){
    System.out.println("Ingrese un número que desee ");
    this.num1= leer.nextDouble();
    System.out.println("Ingrese otro número que desee ");
    this.num2= leer.nextDouble();
    }
    
    public double suma(){
     return num1 + num2;
    }
    
    public double resta(){
      return num1-num2;
    }
     
    public double multiplicacion(){
        
    if (this.num1==0 && this.num2 == 0){
        return 0;
        
    
    }else
        return num1*num2;
        
    }

    public double division(){
        if( this.num1==0 || this.num2==0){
            return 0;
            //System.out.println(" ERROR ");
    }else
      return this.num1/this.num2;
    }
        
    }





    

