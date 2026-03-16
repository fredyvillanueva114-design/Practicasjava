package PracticaMejorando1;

public class Productos {
    private String nombreProducto;
    private double precio;
    private String marca;
    private String codigoProducto;
    private int cantidad;

    public Productos(String nombreProducto,double precio,String marca,String codigoProducto){
        this.nombreProducto=nombreProducto;
        this.marca=marca;
        this.codigoProducto=codigoProducto;
        this.precio=precio;
        this.cantidad=1;
    }

    public void mostrarInformacion(){
        System.out.println("El producto es: "+nombreProducto);
        System.out.println("Precio del producto: "+precio);
        System.out.println("La marca del producto es: "+marca);
        System.out.println("El codigo del producto es: "+codigoProducto);
        System.out.println("La cantidad es: "+cantidad);
    }

    public String getCodigoProducto() {
        return codigoProducto;
    }
    public void setCodigoProducto(String codigoProducto) {
        this.codigoProducto = codigoProducto;
    }public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getNombreProducto() {
        return nombreProducto;
    }
    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }
    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public void aumentarCantidad(){ // lo suma
        this.cantidad+=1; // aumenta la cantidad en 1
        // este aumenta antes del +=
    }
}
