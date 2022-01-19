/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package integrador1;

/**
 *
 * @author river
 */
public class Practica {
     public String inversa(String palabra){
        String invertida="";
        for (int  i= palabra.length()-1; i>=0; i--) {
            invertida=invertida+palabra.charAt(i);
            
        }
    invertida= invertida.toLowerCase();
    return invertida;
    }
    

    public Boolean parCieloPiso(int numEnt, double numReal, long numLargo) {
        double auxiliar = numReal + 0.5;
        int numero1 = (int) auxiliar;
        int numero2 = (int) numReal;

        if ((numEnt % 2 == 0) && numero1 == numero2 && (numLargo >= 0)) {

            return true;
        } else {
            return false;
        }
    }
    
    public String geringoso(String palabra) {
        String vocal = palabra;
        vocal = vocal.replaceAll("a", "apa").replaceAll("e", "epe").replaceAll("i", "ipi").replaceAll("o", "opo").replaceAll("u", "upu");

        return vocal;
    }

}
