/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Luis Gonzalo <https://github.com/gonzalopl16>
 */
public class Principal {
    
    static Scanner holi = new Scanner(System.in);
    static ArrayList<Poligono> Poligonos = new ArrayList<>();
    
    public static void main(String[] args) {
        LlenarPoligonos();
        mostrarResultados();
    }
    
    public static void LlenarPoligonos(){
        char respuesta;
        int opcion;
        do{
            do{
                System.out.println("Digite una opción:");
                System.out.println("1. Triangulo");
                System.out.println("2. Rectangulo");
                System.out.print("Opción: ");
                opcion = holi.nextInt();
            }while(opcion < 1 || opcion > 2);
            
            switch(opcion){   
                case 1:
                    LlenarTriangulo();
                    break;
                
                case 2:
                    LlenarRectangulo();
                    break;
            }
            
            System.out.println("Desea continuar? (S/N)");
            respuesta = holi.next().charAt(0);
            
        }while(respuesta == 'S' || respuesta == 's');
    }
    
    public static void LlenarTriangulo(){
        double lado1, lado2, lado3;
        
        System.out.println("Digite lado 1 del triangulo");
        lado1 = holi.nextDouble();
        System.out.println("Digite lado 2 del triangulo");
        lado2 = holi.nextDouble();
        System.out.println("Digite lado 3 del triangulo");
        lado3 = holi.nextDouble();
        
        Triangulo tri = new Triangulo(lado1,lado2,lado3);
        Poligonos.add(tri);
    }
    
    public static void LlenarRectangulo(){
        double lado1, lado2;
        
        System.out.println("Digite lado 1 del rectangulo");
        lado1 = holi.nextDouble();
        System.out.println("Digite lado 2 del rectangulo");
        lado2 = holi.nextDouble();
        
        Rectangulo rec = new Rectangulo(lado1,lado2);
        Poligonos.add(rec);
    }
    
    public static void mostrarResultados(){
        for(Poligono poli:Poligonos){
            System.out.println(poli.toString());
            System.out.println("Area: " + poli.Area());
        }
    }
}
