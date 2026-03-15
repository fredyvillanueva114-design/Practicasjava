package Avancejava2;

public class Main {
    public static void main(String[] args) {
      
       Bibliotecario b1 = new Bibliotecario("Recepcion", 18, "Juan");

        Lector a1 = new Lector("Miguel",21,"A12");
        Lector a2 = new Lector("Carlos",19,"A15");

        Libro c1 = new Libro("Que fue lo que dejaron en tus manos", "Franco", "A32");
        Libro c2 = new Libro("Sufrire lo que tenga que sufrir incluyendo tu parte", "Evans", "A34");
        Libro c3 = new Libro("Ya no peleas por ti ", "Jorge", "A13");
        Libro c4 = new Libro("luchas por otros", "joaquin", "A32");

        // agregar libros al lector
        a1.agregarLibro(c1);
        a1.agregarLibro(c2);
        a2.agregarLibro(c3);
        a2.agregarLibro(c4);
        
        System.out.println("===== Bibliotecario ====");
        b1.mostrarInformacion();

        System.out.println("\n===== Lector 1 =====");
        a1.mostrarInformacion();

        System.out.println("\n===== Lector 2 =====");
        a2.mostrarInformacion();

    }
}