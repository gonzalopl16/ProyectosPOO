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

    public void mostrarDatos() {
        System.out.println(CPU + " " + saldo + " " + moneda + " " + tipo);
    }

    public void setAlias(String alias) {
        if (this.alias != null) {
            this.alias = alias;
        }
    }

    public void setMoneda(String moneda) {
        if (moneda != null) {
            this.moneda = moneda;
        }
    }

    public void setCPU(String CPU) {
        if (this.CPU != null) {
            this.CPU = CPU;
        }
    }

    public void setSaldo(double saldo) {
        if (this.saldo != 0.0) {
            this.saldo = saldo;
        }
    }

    public void setTipo(String tipo) {
        if (this.tipo != null) {
            this.tipo = tipo;
        }
    }

}
