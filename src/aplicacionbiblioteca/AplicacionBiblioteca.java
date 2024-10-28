package aplicacionbiblioteca;

import model.LibroCRUD;

public class AplicacionBiblioteca {

    public static void main(String[] args) {
        LibroCRUD crud = new LibroCRUD();
        
        crud.agregarLibro("Papelucho", "Del Sol", 12990);
        crud.agregarLibro("La buena tierra", "Planeta", 14420);
        crud.agregarLibro("7 evas", "Antartica", 16780);
        crud.agregarLibro("Abogado en casa", "Penguin", 22750);
        
        
        //crud.leerLibro(2);
        
        crud.actualizarLibro(2, "LA BUENA TIERRA", "Santillana", 33980);
        
        crud.leerLibros();
        
        
        
    }
    
}
