/*
 * 
 */
package integrador1;

/**
 *
 * @author river
 */
public class Integrador1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Practica p1= new Practica();
        System.out.println( p1.inversa("hola"));
        System.out.println(p1.geringoso("hola"));
        System.out.println(p1.parCieloPiso(5, 1.4, 1236));
        
    }
    
    }
//         public String inversa(String palabra){
//        String invertida="";
//        for (int  i =0; i<palabra.length();i++) {
//            invertida=invertida+palabra.charAt(i);
//            
//        }
//    invertida= invertida.toLowerCase();
//    return invertida;
//    }
//    }
//
////    public static Boolean parCieloPiso(int numEnt, double numReal, long numLargo) {
//////        double auxiliar = numReal + 0.5;
//////        int numero1 = (int) auxiliar;
//////        int numero2 = (int) numReal;
//////
//////        if ((numEnt % 2 == 0) && numero1 == numero2 && (numLargo >= 0)) {
//////
//////            return true;
//////        } else {
//////            return false;
//////        }
////    }
//    
////    public String geringoso(String palabra) {
////        String vocal= palabra;
////        vocal= vocal.replaceAll("a","apa").replaceAll("e","epe").replaceAll("i", "ipi").replaceAll("o", "opo").replaceAll("u","upu");
////        
////        return vocal;
////    }
//    
//   
//}
//