package primerproyectopoo;

/**
 *
 * @author Luis Gonzalo
 */
public class CuentaBancaria {

    private String CPU;
    private String alias;
    private double saldo;
    private String moneda;
    private String tipo;

    //Constructor

    public CuentaBancaria(String alias, String moneda, String tipo) {
        this.CPU = generaCPU();
        setAlias(alias);
        setMoneda(moneda);
        setTipo(tipo);
    }
    
    
    public void mostrarDatos() {
        System.out.println(alias + " " + CPU + " " + saldo + " " + moneda + " " + tipo);
    }
    
    private String generaCPU(){
        int x = (int)(Math.random()*100);
        String y = "" + x;
        return y;
    }
    

    public void setAlias(String alias) {
            this.alias = alias;
    }

    public void setMoneda(String moneda) {
            this.moneda = moneda;
    }

    public void setCPU(String CPU) {
        this.CPU = CPU;
    }

    public void setSaldo(double saldo) {
            this.saldo = saldo;
    }

    public void setTipo(String tipo) {
            this.tipo = tipo;
    }
}
