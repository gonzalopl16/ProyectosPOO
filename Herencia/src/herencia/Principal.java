/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

import vehiculos.Vehiculo;
import vehiculos.Auto;
import vehiculos.Moto;

/**
 *
 * @author Luis Gonzalo
 */
public class Principal {
    public static void main(String[] args) {
        Auto a = new Auto();
        
        Moto m = new Moto();
        
        Vehiculo v = new Vehiculo();
        
//        System.out.println(v.marca);
        
        m.acelerar();
    }
}
