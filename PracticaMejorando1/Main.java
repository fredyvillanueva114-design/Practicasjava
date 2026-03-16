package PracticaMejorando1;

public class Main {
    public static void main(String[] args) {
        Clientes cli1 = new Clientes("Joaquin", 23, "A12");
        Clientes cli2 = new Clientes("Franco", 12, "A23");

        Productos p1 = new Productos("pelotas ", 5.90, "adidads", "A2");
        Productos p2 = new Productos("basket ", 60.0, "Adidas", "1f2");
        Productos p3 = new Productos("raqueta", 70.9, "Puma", "A23");
        
        cli1.agregarProducto(p1);
        cli1.agregarProducto(p2);

        cli1.agregarProducto(p3);
        cli1.agregarProducto(p3);
        cli1.agregarProducto(p3);
        cli2.agregarProducto(p1);
        System.out.println("Informacion del cliente 1:");
        cli1.mostrarInformacion();
        cli1.mostrarCompras();


    }
     
}
