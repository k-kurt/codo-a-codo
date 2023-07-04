/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencia;

/**
 *
 * @author genesis
 */
public class Pitbull {
   
        private String nombre;
        private boolean tieneVacunas;
        private String colorPelo;
        private boolean hacerPozos;

    public boolean isHacerPozos() {
        return hacerPozos;
    }

    public void setHacerPozos(boolean hacerPozos) {
        this.hacerPozos = hacerPozos;
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

    public String getEscifico() {
        return escifico;
    }

    public void setEscifico(String escifico) {
        this.escifico = escifico;
    }

    public Pitbull(String nombre, boolean tieneVacunas, String colorPelo, String escifico) {
        this.nombre = nombre;
        this.tieneVacunas = tieneVacunas;
        this.colorPelo = colorPelo;
        this.escifico = escifico;
    }
        private String escifico;

    public Pitbull() {
        
    }
        
        
    
}
