package model;

public class Libro {
   private int id;
   private String nombre;
   private String editorial;
   private int precio;

    public Libro(int id, String nombre, String editorial, int precio) {
        this.id = id;
        this.nombre = nombre;
        this.editorial = editorial;
        this.precio = precio;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

}
