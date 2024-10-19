package modelo;

public class Almacen {
    

    private Libro[] libros;
    private int CantLibros;
    private int VelLectura;
  

    public Almacen(){
        
    }
  
    public Almacen(int capacidad, int velLectura) {
        libros = new Libro[capacidad];
        CantLibros = 0;
        this.VelLectura = velLectura;
    }

    public void setVelLectura(int velLectura) {
        VelLectura = velLectura;
    }

    public int getCantLibros() {
        return CantLibros;
    }

    public void añadirLibro(Libro newLibro) {

        if(CantLibros<libros.length){

            libros[CantLibros]=newLibro;
            CantLibros++;
            return;
        }
        System.out.println("Almacen full");
        
    }

    public int getCapacidad(){


        return libros.length;
    }
    
    public void mostrar(){

        if(CantLibros==0){
            System.out.println("El almacén esta vacio. ");

        }
        float timepoTot=0;
        float precioTotal=0;

        System.out.println("|-----------------------------------------------------------------------------------------------------------------|");
        System.out.println("| Título           | Año Publicación | Autor        | Premio Planeta | Páginas   | Tiempo lectura (min) | Precio  |");
        System.out.println("|-----------------------------------------------------------------------------------------------------------------|");

        for(int i =0;i<CantLibros;i++){

            Libro libroActual=libros[i];
            float tiempo= libroActual.getNumPag()/VelLectura;
            timepoTot=timepoTot+tiempo;
            precioTotal=precioTotal+libroActual.getPrecio();

            System.out.printf("|%-18s | %-15d | %-10s %-10s | %-8s | %-7d | %-15.2f | %.2f $ | \n   ", 
            libroActual.getTitulo(),libroActual.getAnioPublicacion(),(libroActual.getAutor()).getNombre(),(libroActual.getAutor()).getApellidos(),(libroActual.getAutor()).isPremioPlaneta(),libroActual.getNumPag(),tiempo,libroActual.getPrecio());

        }
        System.out.println("|--------------------------------------------------------------------------------------------------------------|");
        System.out.println("|Tiempo de lectura total del almacén: " + timepoTot+ " min | Valor total del almacén: " + precioTotal+ " $       |");
        System.out.println("|--------------------------------------------------------------------------------------------------------------|");

        }
        
    }


