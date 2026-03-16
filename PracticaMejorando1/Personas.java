package PracticaMejorando1;

public class Personas {
    
    private String nombre;
    private int edad;

    // constructor 
    public Personas(String nombre,int edad){
        this.edad= edad;
        this.nombre= nombre;
    }

    // metodo 
    public void mostrarInformacion(){
        System.out.println("la edad de la persona es: "+edad);
        System.out.println("el nombre es "+nombre);
    }
}
