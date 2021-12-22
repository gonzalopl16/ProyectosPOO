
package primerproyectopoo;

/**
 *
 * @author Luis Gonzalo
 */
public class Principal {

    public static void main(String[] args) {
        
        /*Creando Objetos*/
        CuentaBancaria obj1 = new CuentaBancaria();
        CuentaBancaria obj2 = new CuentaBancaria();
        CuentaBancaria obj3 = new CuentaBancaria();
        
        obj1.setAlias("miAlias");
        obj1.setMoneda("Pesos");
        obj1.setTipo("caja de ahorros");
        
        obj2.setAlias("");
    }
    
}
