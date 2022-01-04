public class Auto {
    private String patente;
    private String color;
    private int a;
    
    public Auto(String patente, String color){
        this.patente = patente;
        this.color = color;
    }
    
    public Auto(String patente, String color, int a){
        this.patente = patente;
        this.color = color;
        this.a = a;
    }

    @Override
    public String toString() {
        return "Auto{" + "patente=" + patente + ", color=" + color + '}';
    }
    
    //Sobreescritura de metodos
    public int Suma(int a, int b){
        return a + b;
    }
    
    public int Suma(int a, int b, int c){
        return a + b + c;
    }
    
    public String Suma(int a, int b, boolean c){
        String cadena = "" + a + "-" + b;
        if(c == true){
            return cadena;
        }
        else{
            return "Non cumple con la sentencia";
        }
    }
}
