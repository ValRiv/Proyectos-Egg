/*
 * vale

 */
package vale;

import java.util.Scanner;

/**
 *
 * @author river
 */
public class Vale {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       

    public Boolean numeroCapicua(Integer num) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        boolean resultado = false;
        Integer numero;
        System.out.println("Ingresa un numero");
        num = leer.nextInt();

        if (num == null) {
            resultado = false;
            return false;
        }
        if (num < 0) {
            num = num * -1;
        }

        String palabra = String.valueOf(num);
        int suma = 0;
        for (int i = 0; i < palabra.length(); i++) {
            if ((palabra.substring(i, i + 1)).equals(palabra.substring((palabra.length() - (i + 1)), (palabra.length() - (i))))) {
                resultado = true;
            } else {
                resultado = false;
                suma++;
            }
        }


    private Integer largo(Integer num) {
        int largo = 0;
        if (num == 0) {
            largo = 1;
        } else {
            while (num > 0) {   // en el de los digitos para el largo solo divido por 10 y cuento las veces q dividi.
                num /= 10;    // y cuento las veces q dividi. siendo el contador la cantidad de digitos.
                largo++;
            }
        }
        return largo;
    }

    private Integer reverse(Integer num) {
        int rest;
        int invertido = 0;

        while (num > 0) {                          //Suponiendo q |num|= 123
            rest = num % 10;                      // resto de 123/10 = 3    resto 12/10 = 2     resto 1/10=1
            invertido = invertido * 10 + rest;    // 1v -> 0*+3=3           3*10+2=32           32*10+1=321 
            num /= 10;                            // 123/10= 12             12/10=1             1/10=0,1=(int)0
        }                                       // se sale y devuelve el numero invertido.                                    

        return invertido;
    }
}

//        
//        }
//        
//
//        }
//       
//        if (num == null) {
//            resultado= false;
//            System.out.println("FALSO");
//            return resultado;
//            
//        }
//        if (suma >0 || palabra.length() < 1) {
//            resultado = false;
//        } else {
//            resultado = true;
//        }
//            return resultado;
//        }
//
//    }
//
//
