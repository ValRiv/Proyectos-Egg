/*
 * CLASE CADENA SERVICIO.
Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la
frase ingresada.
• Método invertirFrase(), deberá invertir la frase ingresada y mostrar la frase invertida
por pantalla. Por ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".
• Método vecesRepetido(String letra), deberá recibir por parámetro un carácter
ingresado por el usuario y contabilizar cuántas veces se repite el carácter en la
frase, por ejemplo:
Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.
• Método compararLongitud(String frase), deberá comparar la longitud de la frase
que compone la clase con otra nueva frase ingresada por el usuario.
• Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena
con una nueva frase ingresada por el usuario y mostrar la frase resultante.
• Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se
encuentren en la frase, por algún otro carácter seleccionado por el usuario y
mostrar la frase resultante.
• Método contiene(String letra), deberá comprobar si la frase contiene una letra que
ingresa el usuario y devuelve verdadero si la contiene y falso si no
 */
package CadenaServicio;

import Cadena.Cadena;
import java.util.Scanner;

/**
 *
 * @author river
 */
public class CadenaServicio {
    Scanner leer= new Scanner(System.in).useDelimiter("\n");
    Cadena c1=new Cadena();
    
     public String mostrarVocales(String frase){
         int cont=0;
         frase=frase.toUpperCase();   
        for(int i=0; i<frase.length();i++){
            if((frase.charAt(i)=='A' || frase.charAt(i)=='E' || frase.charAt(i)=='I' || frase.charAt(i)=='O' || frase.charAt(i)=='U')){
            cont++;
            }
            //System.out.println(" la variable cont vale : " +cont);
            //System.out.println(" la variable i vale : " +i);
        }
         System.out.println("La frase tiene: " + cont+ " vocales");
         return frase;
     }     
       public void invertirCadena(String frase){
            //String str = "frase" ;
	   // System.out.println(frase);
	    char[] ch = frase.toCharArray();
	    int begin = 0;
	    int end = ch.length-1;
	    char temp;
	    while(end>begin){
	        temp = ch[begin];
	        ch[begin] = ch[end];
	        ch[end] = temp;
	        end--;
	        begin++;
	    }
	    frase = new String(ch);
	    //System.out.println(str);
          //for(int i= 0;i<frase.length();i--){
              System.out.println("La frase invertida es: " + frase);
   
       }
           
       public void  vecesRepetido( ){
           //char letra
           String frase="";
           String caracter="";
           int cont=0;
          System.out.println("Ingresa el texto nuevamente o algun otro texto que desee.");
           frase = leer.next();

System.out.println("¿Que caracter deseas contar? ");
caracter = leer.next();
for (int i = 0; i < frase.length(); i++) {
if(frase.charAt(i)== caracter.charAt(0) ){
 cont++;
}
}

if (cont != 0) {
System.out.println("El caracter "+caracter.charAt(0)+ " se repite " + cont + " veces");
}else{
System.out.println("El caracter no se encuentra en este texto");
}    
       }
      
       public void compararLongitud(String frase1, String frase2){
          // System.out.println("Ingrese una nueva frase para comparar la longitud con la primer frase");
           //frase2 = leer.next();
           if(frase1.length()<frase2.length()){
               System.out.println("La frase ingresada tiene mas caracteres que la frase 2 : " + frase1);
           }else{
               System.out.println("La frase ingresada tiene menos caracteres que la frase 1: "+ frase1);
           }
          
      }
       public String unirFrases(String frase1, String frase2){
           System.out.println("Ingrese una nueva frase para unirla a la frase: "+frase1);
           String frase3 = leer.next();
           //String frases=  frase1 + "" + frase2;
           System.out.println("La nueva frase unida es:  "  + frase1 + " " + frase3);
           return frase3;
       }
       public void reemplazar(String frase, char letra){
           
           System.out.println( frase.replace('a',letra));
           //System.out.println("La frase reemplazada quedaria asi: " + frase);
           
       }
       public boolean contiene(String frase, String letra){
           System.out.println("Ingrese un caracter para averiguar si esta en la frase");
        String caracter = leer.next();
        //boolean contiene = cadenaService.contiene(frase, caracter);
        
           if(frase.contains(letra)){
               System.out.println("La frase contiene el caracter: "+caracter);
               return true;
           }else{
               System.out.println("La frase no contiene el caracter: "+caracter);
               return false;
           }
       }
}
/*
        
       private void mostrarMenu(){
            System.out.println("-----Menú------\n"
            + "1- Método Mostrar Vocales\n"
            + "2- Método invertir Frase\n"
            +"3-Método veces Repetido/n"
            +"4-Método comparar Longitud\n"
            +"5-Método unir Frases\n"
            +"6-Método reemplazar\n"
            +"7-Método contiene letra\n "
            + "8 -  SALIR"
            +"9------ELIJE UNA OPCION-----");
        }
        private int elegirOpcion(){
            int sel;
            do{
                sel=leer.nextInt();
                if(sel<1||sel>8)
                    System.out.println("Opcion invalida, intente nuevamente");
                
            }while(sel<1 || sel>8);
            return sel;
                    
        }
        public void ejecutarMenu(){
            Cadena c1= elegiropcion();
            
         
        }
        }
*/
        




    
       