package modelo;

public class Libro {
    public Autor autor;
    public String titulo;
    public int anioPublicacion;
    public int numPag;
    public float precio;
  
  
    public Libro(Autor autor, String titulo, int anioPublicacion, int numPag, float precio) {
        this.autor = autor;
        this.titulo = titulo;
        this.anioPublicacion = anioPublicacion;
        this.numPag = numPag;
        this.precio = precio;
    }


    public Libro() {
    }


    public Autor getAutor() {
        return autor;
    }


    public String getTitulo() {
        return titulo;
    }


    public int getAnioPublicacion() {
        return anioPublicacion;
    }


    public int getNumPag() {
        return numPag;
    }


    public float getPrecio() {
        return precio;
    }


    public void setAutor(Autor autor) {
        this.autor = autor;
    }


    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }


    public void setAnioPublicacion(int anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }


    public void setNumPag(int numPag) {
        this.numPag = numPag;
    }


    public void setPrecio(float precio) {
        this.precio = precio;
    }
    

    
    
}

