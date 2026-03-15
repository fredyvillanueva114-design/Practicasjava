package Avancejava2;

import java.util.ArrayList;

public class Lector extends Persona{
    private String codigoLector;
    private ArrayList<Libro> librosPrestados; // el ArrayLista sirve para    ex

    public Lector(String codigoLector,int edad,String nombre){
        super(nombre, edad); // es como llamar las cosas de persona osea en este caso el nombre y la edad 
        this.codigoLector=codigoLector;
        librosPrestados = new ArrayList<>();    // ex 
    }
    
    // agregamos un metodo                     expli
    public void agregarLibro(Libro libro){
        librosPrestados.add(libro);
    }

    @Override               //ex 
    public void mostrarInformacion(){
        super.mostrarInformacion();
        System.out.println("Codigo del Lector: " + codigoLector);
        System.out.println("");
        System.out.println("==== El libro prestados ==== ");
        
        for(Libro libro :librosPrestados){
            libro.mostrarInformacion();
        }
    }
}
