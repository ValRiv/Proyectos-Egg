/*
 * EJERCICIO 7 PERSONA.
 */
package personaejer7;

import Persona.Persona;
import ServicioPersona.ServicioPersona;

/**
 *
 * @author river
 */
public class Personaejer7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ServicioPersona serv= new ServicioPersona();
        
        //serv.crearPersona(p1);
        //serv.calcularIMC(p1);
        //serv.mayordeEdad(p1);
        
         int peso1, peso2, peso3, peso4, cont1=0, cont2=0, cont3=0, cont4=0, cont5=0;
        boolean edad1, edad2, edad3, edad4;
        
       
        //creos 4 personas
        Persona p1 = serv.crearPersona();
        Persona p2 = serv.crearPersona();
        Persona p3 = serv.crearPersona();
        Persona p4 = serv.crearPersona();
        
        //calculo para cada persona la masa corporal y si es mayor de edad
        System.out.println(p1.getNombre()+":");
        peso1 = serv.calcularImc(p1);
        edad1 = serv.mayordeEdad(p1);
        validarPeso(peso1);
        validarEdad(edad1);
        if (peso1== -1) {
            cont1++;
        }else if(peso1==0){
            cont2++;
        }else{
            cont3++;
        }
        if(edad1==false){
            cont4++;
        }else{
            cont5++;
        }
        System.out.println(p2.getNombre()+":");
        peso2=serv.calcularImc(p2);
        edad2=serv.mayordeEdad(p2);
        validarPeso(peso2);
        validarEdad(edad2);
        if (peso2== -1) {
            cont1++;
        }else if(peso2==0){
            cont2++;
        }else{
            cont3++;
        }
        if(edad2==false){
            cont4++;
        }else{
            cont5++;
        }
       System.out.println(p3.getNombre()+":");
        peso3=serv.calcularImc(p3);
        edad3=serv.mayordeEdad(p3);
        validarPeso(peso3);
        validarEdad(edad3);
        if (peso3== -1) {
            cont1++;
        }else if(peso3==0){
            cont2++;
        }else{
            cont3++;
        }
        if(edad3==false){
            cont4++;
        }else{
            cont5++;
        } 
        System.out.println(p4.getNombre()+":");
        peso4=serv.calcularImc(p4);
        edad4=serv.mayordeEdad(p4);
        validarPeso(peso4);
        validarEdad(edad4);
        if (peso4== -1) {
            cont1++;
        }else if(peso4==0){
            cont2++;
        }else{
            cont3++;
        }
        if(edad4==false){
            cont4++;
        }else{
            cont5++;
        }
        System.out.println("El "+cont1*100/4+"% de las personas estan en su peso ideal");
        System.out.println("El "+cont2*100/4+"% de las personas estan por debajo de su peso ideal");
        System.out.println("El "+cont3*100/4+"% de las personas tienen sobrepeso");
        System.out.println("El "+cont4*100/4+"% de las personas son menores de edad");
        System.out.println("El "+cont5*100/4+"% de las personas son mayores de edad");   
        boolean a[];
    }
     public static void validarPeso( int peso){
        if(peso == -1){
            System.out.println("El peso es ideal");
        }else if(peso == 0){
            System.out.println("Esta por debajo de su peso ideal");
        }else{
            System.out.println("Tiene sobrepeso");
        }
    }
    
    public static void validarEdad(boolean edad){
        if(edad == false){
            System.out.println("Es menor de edad");
        }else{
            System.out.println("Es mayor de edad");
        }
    }

}
        
        
        
       
    
    

