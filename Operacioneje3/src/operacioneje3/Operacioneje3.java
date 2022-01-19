/*EJERCICIO 3 OPERACIONES
 * 
 */
package operacioneje3;

/**
 *
 * @author river
 */
public class Operacioneje3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Operacion o1= new Operacion();
        o1.crearOperacion();
        System.out.println("La suma de los número ingresados es:  " + o1.suma());
        System.out.println("La resta de los números ingresados es " +o1.resta());
        
        if( o1.multiplicacion()!=0){
            System.out.println("La multiplicación de los numeros ingrsados es:  " + o1.multiplicacion());
        }else
            System.out.println("ERROR ");
    
        if (o1.division()!=0){
            System.out.println("La división de los numeros ingresados es:  " + o1.division());
        }else
            System.out.println("ERROR");
    }
    
}
