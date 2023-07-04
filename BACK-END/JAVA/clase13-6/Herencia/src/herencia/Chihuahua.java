/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencia;

/**
 *
 * @author genesis
 */
public class Chihuahua {
    private String nombre;
    private boolean tieneVacunas;
    private String colorPelo;
    private String ladridoFinito;

    public Chihuahua() {
    }

    public Chihuahua(String nombre, boolean tieneVacunas, String colorPelo, String ladridoFinito) {
        this.nombre = nombre;
        this.tieneVacunas = tieneVacunas;
        this.colorPelo = colorPelo;
        this.ladridoFinito = ladridoFinito;
    }

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

    public String getLadridoFinito() {
        return ladridoFinito;
    }

    public void setLadridoFinito(String ladridoFinito) {
        this.ladridoFinito = ladridoFinito;
    }
     
    
    
  }

