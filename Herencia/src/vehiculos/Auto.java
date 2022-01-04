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
public class Auto extends Vehiculo{
    boolean tieneAire;
    
    void prenderAire(){
        System.out.println(marca);
        if(tieneAire){
            System.out.println("Prender Aire..."); 
        }
    }
            
}
