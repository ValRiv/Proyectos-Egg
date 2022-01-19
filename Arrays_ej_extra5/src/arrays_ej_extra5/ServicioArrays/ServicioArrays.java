/*
 * Crea una clase en Java donde declares una variable de tipo array de Strings que
contenga los doce meses del año, en minúsculas. A continuación declara una variable
mesSecreto de tipo String, y hazla igual a un elemento del array (por ejemplo
mesSecreto = mes[9]. El programa debe pedir al usuario que adivine el mes secreto.
Si el usuario acierta mostrar un mensaje, y si no lo hace, pedir que vuelva a intentar
adivinar el mes secreto. Un ejemplo de ejecución del programa podría ser este:
Adivine el mes secreto. Introduzca el nombre del mes en minúsculas: febrero
No ha acertado. Intente adivinarlo introduciendo otro mes: agosto
No ha acertado. Intente adivinarlo introduciendo otro mes: octubre
¡Ha acertado!
 */
package arrays_ej_extra5.ServicioArrays;

import arrays_ej_extra5.Arrys.Arrays;
import java.util.Scanner;

/**
 *
 * @author river
 */
public class ServicioArrays {
    Scanner leer= new Scanner (System.in).useDelimiter("\n");
     Arrays datos= new Arrays();
    
    public void llenarVector(){
        //String [] meses= new String [12];
        String  aux[]={"enero","febrero","marzo","abril","mayo","junio","julio","agosto","septiembre","octubre","noviembre","diciembre"};
        datos.setMeses(aux);
        String meses[]=datos.getMes_secreto();
       // String mes_secreto= meses[1];
         String mes_secreto = meses[1];

        String adivina="";
        do{
            System.out.println("Ingrese un mes en minuscula");
            adivina=leer.next();
                    if(adivina.equals(mes_secreto)){
                        System.out.println("Usted a acertado");
                    }else{
                        System.out.println("Intente nuevamente");
                    }
        }while (!adivina.equals(mes_secreto));
    }
}
