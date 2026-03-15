package Avancejava2;

public class Persona {
    private String nombre;
    private int edad;


    public Persona(String nombre,int edad){
        this.nombre=nombre;
        this.edad=edad;
    }

    public void mostrarInformacion(){
        System.out.println("El nombre es "+nombre);
        System.out.println("La edad es: "+edad);
    }

    // usa getter  
    public String getNombre() {
        return nombre;
    }
    
    public int getEdad() {
        return edad;
    }
}
