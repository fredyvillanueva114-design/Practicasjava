package Proyectotienda;

public class Persona { // aqui ponemos los atributos ( siempre son privados )
    private String nombre;
    private int edad;
    private String genero;

    // constructor de Persona
    public Persona(String nombre,int edad, String genero){
        this.edad = edad;
        this.genero = genero;
        this.nombre = nombre;
    }

    // es un metodo para mostrar la informacion 
    public void mostrarInformacion(){
        System.out.println("El nombre del personal es: "+nombre);
        System.out.println("El genero es: "+genero);
        System.out.println("La edad es: "+edad);
    }



}
