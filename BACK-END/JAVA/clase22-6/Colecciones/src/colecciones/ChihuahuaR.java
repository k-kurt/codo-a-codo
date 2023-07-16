/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package colecciones;


/**
 *
 * @author genesis
 */
public class ChihuahuaR extends Perro {

    public ChihuahuaR(String ladridoFinito, String nombre, boolean tieneVacunas, String colorPelo) {
        super(nombre, tieneVacunas, colorPelo);//los parametros de la clase padre
        this.ladridoFinito = ladridoFinito;//de la clase actual
    }
        
    
    
    private String ladridoFinito;

    public ChihuahuaR() {
    }

   
    public String getLadridoFinito() {
        return ladridoFinito;
    }

    public void setLadridoFinito(String ladridoFinito) {
        this.ladridoFinito = ladridoFinito;
    }
     
    
    @Override
    public void correrLaPelotita(){
        System.out.println("correr la pelotiuta mas lento...");
    }
    
  }

