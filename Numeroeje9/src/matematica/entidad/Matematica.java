/*
CLASE ENTIDAD MATEMATICA
 * Realizar una clase llamada Matemática que tenga como atributos dos números reales
con los cuales se realizarán diferentes operaciones matemáticas. La clase deber tener
un constructor vacío, parametrizado y get y set. En el main se creará el objeto y se
usará el Math.random para generar los dos números y se guardaran en el objeto con
su respectivos set. Deberá además implementar los siguientes métodos:
• Método devolverMayor() para retornar cuál de los dos atributos tiene el mayor
valor
20
• Método calcularPotencia() para calcular la potencia del mayor valor de la clase
elevado al menor número. Previamente se deben redondear ambos valores.
• Método calculaRaiz(), para calcular la raíz cuadrada del menor de los dos valores.
Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.
 */
package matematica.entidad;

/**
 *
 * @author river
 */
public class Matematica {
        private double num1;
        private double num2;

    public Matematica() {
    }

    public Matematica(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }
    

    public double getNum1() {
        return num1;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }
   // Método devolverMayor() para retornar cuál de los dos atributos tiene el mayor
//valor
  public double devolverMayor(Matematica mate){
      if(mate.getNum1()>mate.getNum2()){
          return mate.getNum1();
      }else{
          return mate.getNum2();
      }
      
      
  }
  public double calcularPotencia(Matematica mate){
      double max= Math.max(mate.getNum1(),mate.getNum2());
      double min=Math.min(mate.getNum1(),mate.getNum2());
      return Math.pow(Math.round(max),Math.round(min));
  }
        
public double calcularRaiz(Matematica mate){
        double min = Math.min(mate.getNum1(), mate.getNum2());
        return Math.sqrt(Math.abs(min));
}   
}
