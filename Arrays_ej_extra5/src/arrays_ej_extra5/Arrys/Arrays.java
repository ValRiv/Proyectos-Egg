/*
 * EJERCICIO EXTRA 5 ARRAYS CLASE CONTROL.

 */
package arrays_ej_extra5.Arrys;

/**
 *
 * @author river
 */
public class Arrays {
    private String meses[];
    private String mes_secreto[];

    public Arrays() {
    }

    public Arrays(String[] meses, String[] mes_secreto) {
        this.meses = meses;
        this.mes_secreto=mes_secreto;
    }

    public String[] getMes_secreto() {
        return mes_secreto;
    }

    public void setMes_secreto(String[] mes_secreto) {
        this.mes_secreto = mes_secreto;
    }

    public String[] getMeses() {
        return meses;
    }

    public void setMeses(String[] meses) {
        this.meses = meses;
    }
    
    
}
