package PracticaMejorando1;

import java.util.ArrayList;

public class Clientes extends Personas{
    private String codigoCliente;
    ArrayList<Productos> productosComprados;
    // 
    public Clientes(String nombre, int edad, String codigoCliente){
        super(nombre, edad);
        this.codigoCliente = codigoCliente;
        this.productosComprados = new ArrayList<>();
    }

    public String getCodigoCliente(){
        return codigoCliente;
    }

    public void agregarProducto(Productos producto){ // set  cambia y modifica valores de variables es un set aparte agegar = set
     for(Productos p : productosComprados){ // recorre la lista for auto for de clases
            if (p.getCodigoProducto().equals(producto.getCodigoProducto())) { // 
                p.aumentarCantidad();
                return ;
            } 
        }
        productosComprados.add(producto);
    }

    public void eliminarProducto(Productos productos){
    productosComprados.remove(productos);   // remode quita cosas si existe 
    }

    public void mostrarCompras(){
        for(Productos productos : productosComprados){
            productos.mostrarInformacion();
        }
    }
}
