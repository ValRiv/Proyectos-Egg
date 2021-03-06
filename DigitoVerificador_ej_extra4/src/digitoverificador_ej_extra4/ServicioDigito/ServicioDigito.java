/*
 * CLASE SERVICIO DIGITO.
Métodos getters y setters para el número de DNI y la letra.
• Método crearNif(): le pide al usuario el DNI y con ese DNI calcula la letra que le
corresponderá. Una vez calculado, le asigna la letra que le corresponde según el
resultado del calculo.
• Método mostrar(): que nos permita mostrar el NIF (ocho dígitos, un guion y la letra
en mayúscula; por ejemplo: 00395469-F).
La letra correspondiente al dígito verificador se calculará a traves de un método que
funciona de la siguiente manera: Para calcular la letra se toma el resto de dividir el
número de DNI por 23 (el resultado debe ser un número entre 0 y 22). El método debe
buscar en un array (vector) de caracteres la posición que corresponda al resto de la
división para obtener la letra correspondiente. La tabla de caracteres es la siguiente:
 */
package digitoverificador_ej_extra4.ServicioDigito;

import digitoverificador_ej_extra4.Digito.Digito;

import java.util.Scanner;

/**
 *
 * @author river
 */
public class ServicioDigito {
    Scanner leer=new Scanner(System.in).useDelimiter("\n");
    Digito d1= new Digito();
    
    public void crearNif(){
        System.out.println("Ingrese su DNI: ");
        d1.setDNI(leer.nextLong());
        long DNI= d1.getDNI();
       d1.setAux(d1.getDNI()%23);
    }

    public  void mostrarNif(){
        
        String[] vector = {"T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X", "B", "N", "J", "Z", "S", "Q", "V", "H", "L", "C", "K", "E"};
        int posicion= (int) d1.getAux();
        
        System.out.println(d1.getDNI()+" - " + vector[posicion]);
	}
    }
    

