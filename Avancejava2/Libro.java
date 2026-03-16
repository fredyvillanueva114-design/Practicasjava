package Avancejava2;

public class Libro {
    private String titulo;
    private String autor;
    private String codigo;

    public Libro(String titulo,String autor,String codigo){
        this.titulo=titulo;
        this.autor=autor;
        this.codigo=codigo;
    }
    public void mostrarInformacion(){
        System.out.println("");
        System.out.println("El titulo es: "+titulo);
        System.out.println("El autor es: "+autor);
        System.out.println("el codigo es: "+codigo);
    }

    public String getAutor() {     
        return autor;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setAutor(String autor) {  
        this.autor = autor;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

}
