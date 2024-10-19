
import modelo.*;
import com.coti.tools.Esdia;


public class App {
    public static void main(String[] args) throws Exception {
        
        int opcion=0;
        int tamano;
        Almacen almacen= null;
        int ritmo =1;
        do {
                System.out.println("|-------------------------------------------------------|");
                System.out.println("|MIS LIBROS                                             |");
                System.out.println("|-------------------------------------------------------|");
                System.out.println("    1) Nuevo almacén de libros                  ");
                System.out.println("    2) Establecer ritmo de lectura (páginas por minuto)  ");               
                System.out.println("    3) Añadir un nuevo libro al almacen                   ");
                System.out.println("    4) Mostrar información actual de libros             ");
                System.out.println("    5) Salir (se borrará toda la información)              ");
                System.out.println("|-------------------------------------------------------|");         

                opcion= Esdia.readInt("Introduzca la opción: ",1,5);

                switch(opcion){
                    case 1:
                        tamano=Esdia.readInt("Tamaño del almacen: ",1,50);
                        almacen= new Almacen(tamano,ritmo);
                        System.out.println("El almacen tiene una capacidad para: "+tamano);
                        break;
                    case 2: 
                        ritmo=Esdia.readInt("Establece ritmo de lectura: ",1,10);
                        almacen.setVelLectura(ritmo);
                        break;
                    
                    case 3:
                        if(almacen==null){
                            System.out.println("No hay almacen :(");
                        }
                        else if(almacen.getCantLibros()>=almacen.getCapacidad()){
                            System.out.println("El almacen esta lleno");

                        }
                        else{
                            
                            String nombreAutor=Esdia.readString("Introduce el nombre del autor:");
                            String apellidosAutor=Esdia.readString("Introduce el apellido del autor:");
                            boolean premioPlaneta=Esdia.siOno("Tiene premio planeta? ");

                            Autor NewAutor= new Autor(nombreAutor,apellidosAutor,premioPlaneta);

                            String tituloLibro=Esdia.readString("Introduce el tttulo del librin:");
                            int anioPubli=Esdia.readInt("Introduce el año de publicacion",0,2024);
                            int numeroPaginas=Esdia.readInt("Introduce el numero de paginas",0,10000);
                            float price=Esdia.readFloat("introduce el precio",0,1000);

                            Libro libro =new Libro(NewAutor,tituloLibro,anioPubli,numeroPaginas,price);
                            almacen.añadirLibro(libro);
                        }


                        break;
                    case 4:
                         if(almacen==null){
                        System.out.println("No hay almacen :(");
                        }

                        else{

                            almacen.mostrar();


                        }
                        break;
                    case 5:
                          System.out.println("ADIOOOOOOOOS!!!");

                }
            }
            while(opcion!=5);

        }}


       