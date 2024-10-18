package modelo;

public class Autor {
    
    public String nombre;
    public String apellidos;
    public boolean premioPlaneta;
    
    

    public Autor(){

    }


    public Autor(String nombre, String apellidos, boolean premioPlaneta) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.premioPlaneta = premioPlaneta;
    }


    public String getNombre() {
        return nombre;
    }


    public String getApellidos() {
        return apellidos;
    }


    public boolean isPremioPlaneta() {
        return premioPlaneta;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }


    public void setPremioPlaneta(boolean premioPlaneta) {
        this.premioPlaneta = premioPlaneta;
    }

    

    


}
