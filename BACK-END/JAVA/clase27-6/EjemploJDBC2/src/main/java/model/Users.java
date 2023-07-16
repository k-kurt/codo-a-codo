/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author genesis
 */
public class Users {
    
    private int id;
    private String nombre;
    private String apellido;
    private int edad;
    private int tieneHijos;
  
    private boolean baja;

    public boolean isBaja() {
        return baja;
    }

    public void setBaja(boolean baja) {
        this.baja = baja;
    }

    public Users(String nombre, String apellido) {
     
        this.nombre = nombre;
        this.apellido = apellido;
        baja=false;
        
    }

    public Users(int id, String nombre, String apellido, int edad, int tieneHijos) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.tieneHijos = tieneHijos;
       
    }

    public Users(String nombre, String apellido, int edad, int tieneHijos) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.tieneHijos = tieneHijos;
    }

    

    public Users(int id, String nombre, String apellido, boolean baja) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.baja = baja;
    }

    public Users(int id, String nombre, String apellido) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    
    

   
    
    
    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getTieneHijos() {
        return tieneHijos;
    }

    public void setTieneHijos(int tieneHijos) {
        this.tieneHijos = tieneHijos;
    }

 
    
    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Users{" + "id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", tieneHijos="  + tieneHijos +", baja=" + baja + '}';
    }
    
}
