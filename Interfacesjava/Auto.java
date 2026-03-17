package Interfacesjava;

public class Auto implements Vehiculo {  // implementes es para interfaces 
    private String marca;
    private String modelo;
    private int velocidad;
    private boolean encendido;


    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public boolean getEncendido(){
        return encendido;
    }

    @Override
    public void encender(){}
    @Override
    public void apagar(){}
    @Override
    public void acelerar(int velocidad){}
    @Override
    public void frenar(){}

}
 
