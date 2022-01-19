/*
 * CADENA SERVICIO
 */
package cadenavale.servicio;

import cadenavale.entidad.CadenaEntidad;
import java.util.Scanner;

/**
 *
 * @author river
 */
public class CadenaServicio {
    Scanner leer= new Scanner(System.in).useDelimiter("\n");
   CadenaEntidad c1= new CadenaEntidad();
       //*
   
     public CadenaEntidad mostrarVocales(){
          System.out.println("Ingrese una frase de 2 o mas palabras: ");
        String frase=leer.next();
        //String frase=new String("");
              c1.setFrase(frase);
              c1.setLongitud(frase.length());
            // CadenaEntidad c1=new CadenaEntidad();
         int cont=0;
         frase=frase.toUpperCase();
            
        for(int i=0; i<frase.length();i++){
            if(frase.charAt(i)=='A'||frase.charAt(i)=='E'||frase.charAt(i)=='I'||frase.charAt(i)=='O'||frase.charAt(i)=='U');
            cont++;
        }
         System.out.println("La frase tiene: " + cont+ "  caracteres");
        //return new CadenaEntidad(frase,longitud);
     }     
       public void invertirCadena(String frase){
          
          for(int i= 0;i<frase.length()-1;i--){
              System.out.println(frase.charAt(i));
   
       }
           System.out.println("");
       } 

       public void vecesRepetido(String frase,char letra){
           frase=frase.toLowerCase();
           int repetido=0;
          
           for (int i = 0; i < frase.length(); i++) {
               if(frase.charAt(i)==letra){
                   repetido++;
                   
               }   
           }
           System.out.println("La letra "+letra+", esta repetida "+repetido+" veces");
          
       }
      
       public void compararLongitud(String frase1, String frase2){
           if(frase1.length()<frase2.length()){
               System.out.println("La frase ingresada tiene mas caracteres que la frase 2 : " + frase1);
           }else{
               System.out.println("la frase ingresada tiene menos caracteres que la frase 1: "+ frase1);
           }
          
      }
       public String unirFrases(String frase1, String frase2){
           String frases=  frase1+ "" + frase2;
           return frases;
       }
       public void reemplzar(String frase, char letra){
           System.out.println(frase.replace('a',letra));
       }
       public boolean comprobarFrase(String frase, String letra){
           if(frase.contains(letra)){
               return true;
           }else{
               return false;
           }
       }
}


    
       

