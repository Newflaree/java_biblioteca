package model;

import java.util.ArrayList;
import java.util.List;

public class LibroCRUD {
    private List<Libro> libros = new ArrayList<>();
    private int idActual = 1;
    
    public void agregarLibro(String nombre, String editorial, int precio){
        //Libro libro = Libro(idActual++, nombre, editorial, precio)
        libros.add(new Libro(idActual++, nombre, editorial, precio));
        System.out.println("Nuevo libro agregado");
    }
    
    public void eliminarLibro(int id){
        for(Libro l : libros){
            if(l.getId() == id){
                libros.remove(id-1);
                System.out.println("Libro eliminado");
                return;
            }
        }
        System.out.println("No se encuentra el libro");
    }
    
    public void leerLibros(){
        for(Libro l : libros){
            System.out.println("ID: " + l.getId() + 
                    "\nTitulo: " + l.getNombre() +
                    "\nEditorial: " + l.getEditorial() + 
                    "\nPrecio: " + l.getPrecio() + 
                    "\n\n");
        }
    }
    
    public void leerLibro(int id){
        for(Libro l : libros){
            if(l.getId() == id){
                System.out.println("ID: " + l.getId() + 
                    "\nTitulo: " + l.getNombre() +
                    "\nEditorial: " + l.getEditorial() + 
                    "\nPrecio: " + l.getPrecio() + 
                    "\n\n");
            }
        }
    }
    
    public void actualizarLibro(int id, String nombre, String editorial, int precio){
        for(Libro l : libros){
            if(l.getId() == id){
                l.setNombre(nombre);
                l.setEditorial(editorial);
                l.setPrecio(precio);
                System.out.println("Libro actualizado");
                return;
            }
        }
    }
    
}
