/*
 * EJERCICIO EXTRA4 DIGITO VERIFICADOR CLASE MAIN
 */
package digitoverificador_ej_extra4;


import digitoverificador_ej_extra4.ServicioDigito.ServicioDigito;

/**
 *
 * @author river
 */
public class DigitoVerificador_ej_extra4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ServicioDigito serv = new ServicioDigito();
        serv.crearNif();
        serv.mostrarNif();
    }
    
}
