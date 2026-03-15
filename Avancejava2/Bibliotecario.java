package Avancejava2;

public class Bibliotecario extends Persona {
    private String areaTrabajo;

       public Bibliotecario(String areaTrabajo,int edad,String nombre){
        super(nombre, edad); // es como llamar las cosas de persona osea en este caso el nombre y la edad 
        this.areaTrabajo=areaTrabajo;
    }
    @Override
    public void mostrarInformacion(){
        super.mostrarInformacion();
        System.out.println("El area del trabajo es: "+areaTrabajo);
    }
}
