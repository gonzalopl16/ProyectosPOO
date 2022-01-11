/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;
/**
 *
 * @author Luis Gonzalo <https://github.com/gonzalopl16>
 */
public class Rectangulo extends Poligono{
    private double lado1;
    private double lado2;

    public Rectangulo(double lado1, double lado2) {
        super(2);
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    @Override
    public String toString() {
        return "Numero de lados: " + getNumeroLados() +", lado1=" + lado1 + ", lado2=" + lado2;
    }
    
    @Override
    public double Area(){
        return lado1*lado2;
    }
}
