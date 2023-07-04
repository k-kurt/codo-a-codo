/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Refactor;

import herencia.*;

/**
 *
 * @author genesis
 */
public class PitbullR extends Perro{

    public PitbullR(boolean hacerPozos, String nombre, boolean tieneVacunas, String colorPelo) {
        super(nombre, tieneVacunas, colorPelo);
        this.hacerPozos = hacerPozos;
    }

    public PitbullR(boolean hacerPozos) {
        this.hacerPozos = hacerPozos;
    }
   
      
        private boolean hacerPozos;

    public boolean isHacerPozos() {
        return hacerPozos;
    }

    public void setHacerPozos(boolean hacerPozos) {
        this.hacerPozos = hacerPozos;
    }

    public PitbullR() {
        
    }
        
        
    
}
