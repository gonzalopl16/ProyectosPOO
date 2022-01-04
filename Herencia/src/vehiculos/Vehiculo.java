/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehiculos;

/**
 *
 * @author Luis Gonzalo
 */
public class Vehiculo {
    protected String marca;
    protected String modelo;
    protected String patente;
    
    public String getMarca() {
        return marca;
    }

    public void setMarca(String Nuevamarca) {
        if(Nuevamarca != null)
        this.marca = Nuevamarca;
    }
    
    public void acelerar(){
        System.out.println(marca);
        System.out.println("Acelerando...");
    }
    
    public void frenar(){
        System.out.println("Frenando...");
    }
    
    public void encender(){
        System.out.println("Encendiendo...");
    }
}
