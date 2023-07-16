/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

public class Discos {
    
    private int id;
    private String nombre;
    private String autor;
    private int cantCanciones;
    private double precio;
    private int copias;

    public Discos(int id, String nombre, String autor, int cantCanciones, double precio, int copias) {
        this.id = id;
        this.nombre = nombre;
        this.autor = autor;
        this.cantCanciones = cantCanciones;
        this.precio = precio;
        this.copias = copias;
    }

    public Discos(String nombre, String autor, int cantCanciones, double precio, int copias) {
        this.nombre = nombre;
        this.autor = autor;
        this.cantCanciones = cantCanciones;
        this.precio = precio;
        this.copias = copias;
    }

    public Discos() {
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

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getCantCanciones() {
        return cantCanciones;
    }

    public void setCantCanciones(int cantCanciones) {
        this.cantCanciones = cantCanciones;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCopias() {
        return copias;
    }

    public void setCopias(int copias) {
        this.copias = copias;
    }

    @Override
    public String toString() {
        return "Discos{" + " nombre=" + nombre + ", autor=" + autor + ", cantCanciones=" + cantCanciones + ", precio=" + precio + ", copias=" + copias + '}';
    }
    
    
}
