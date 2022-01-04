
package primerproyectopoo;

/**
 *
 * @author Luis Gonzalo
 */
public class Principal {

    public static void main(String[] args) {
        
        /*Creando Objetos*/
        CuentaBancaria obj1 = new CuentaBancaria("miAlias", "Pesos", "caja de ahorros");
        CuentaBancaria obj2 = new CuentaBancaria("Cuenta_123","Dolar","caja de ahorros");
        CuentaBancaria obj3 = new CuentaBancaria("caja3","Euro","cuenta corriente");
        
        obj1.mostrarDatos();                                                  
        obj2.mostrarDatos();
        obj3.mostrarDatos();
    }    
}
