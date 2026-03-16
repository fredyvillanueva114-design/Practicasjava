package PracticaMejorando1;

public class Empleados extends Personas{
    private String areatrabajo;
    private double sueldo;

    public Empleados(String areatrabajo,double sueldo){
        super("Joaquin", 23);
        this.areatrabajo=areatrabajo;
        this.sueldo=sueldo;
    }
    public void mostrarInformacion(){
        System.out.println("Area: "+areatrabajo);
        System.out.println("Sueldo "+sueldo);
    }
}
