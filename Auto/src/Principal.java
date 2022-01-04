
import java.util.ArrayList;

public class Principal {

    public static void main(String[] args) {
        Auto a1 = new Auto("ABC123", "Verde");
//        Auto a2 = new Auto("DEF456", "Rojo");;
//        Auto a3 = new Auto("GHI789", "Amarillo");

        ArrayList<Auto> misAutos = new ArrayList<>();
        System.out.println(misAutos.size());
        System.out.println(misAutos);

        System.out.println("\n ******************** \n");

        misAutos.add(a1);
        System.out.println(misAutos.size());
        System.out.println(misAutos);

        System.out.println("\n ******************** \n");

        misAutos.add(new Auto("DEF456", "Rojo"));
        System.out.println(misAutos.size());
        System.out.println(misAutos);
        
        System.out.println("\n ******************** \n");

        misAutos.add(new Auto("GHI789", "Amarillo"));
        System.out.println(misAutos.size());
        System.out.println(misAutos);
        
        System.out.println("\n ******************** \n");
        System.out.println("El segundo auto es: " + misAutos.get(1));
        
        System.out.println("\n ******************** \n");
        System.out.println("Mostrando todos los autos de la lista: ");
        for(int i = 0; i < misAutos.size(); i++){
            System.out.println("El auto en la posición " + i + " es: " + misAutos.get(i));
        }
        
        System.out.println("\n ******************** \n");
        
        
        misAutos.remove(0);
        System.out.println(misAutos.size());
        System.out.println(misAutos);
        
        System.out.println("\n \nHola Mundo");
        
        //Sobreescritura de metodos
        System.out.println("La suma de los numeros 2 y 3:  " + a1.Suma(2, 3));
        System.out.println("La suma de los numeros 2, 3 y 4: " + a1.Suma(2, 3, 4));
        System.out.println("La Los valores acumulados con condicion son: " + a1.Suma(4, 3, false));
    }

}
