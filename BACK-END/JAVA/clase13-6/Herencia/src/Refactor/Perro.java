/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Refactor;

/**
 *
 * @author genesis
 */
public class Perro {
     private String nombre;
    private boolean tieneVacunas;
    private String colorPelo;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isTieneVacunas() {
        return tieneVacunas;
    }

    public void setTieneVacunas(boolean tieneVacunas) {
        this.tieneVacunas = tieneVacunas;
    }

    public String getColorPelo() {
        return colorPelo;
    }

    public void setColorPelo(String colorPelo) {
        this.colorPelo = colorPelo;
    }

    public Perro(String nombre, boolean tieneVacunas, String colorPelo) {
        this.nombre = nombre;
        this.tieneVacunas = tieneVacunas;
        this.colorPelo = colorPelo;
    }

    public Perro() {
    }
    
    public void correrLaPelotita(){
        System.out.println("esta corriendo la pelotita");
    }
    
}
