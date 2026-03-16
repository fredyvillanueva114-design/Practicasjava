package Proyectotienda;

public class Administrador extends Persona{ // usamos extends que es extender un clase ( en este caso la clase de Persona)
    private String codigoEntrada;

    // constructor de Administrador
    public Administrador(String codigoEntrada){
        super("franco", 0, codigoEntrada);// aqui llamamos a la clase de la persona 
        this.codigoEntrada=codigoEntrada;
        
    }

    

}
