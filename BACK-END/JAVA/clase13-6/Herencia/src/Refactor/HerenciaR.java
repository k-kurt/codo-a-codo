/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Refactor;



/**
 *
 * @author genesis
 */
public class HerenciaR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
       Perro p=new Perro("patas",false,"blanco");
       
       ChihuahuaR c2=new ChihuahuaR();
       Perro p1=new Perro();
   
       p1.correrLaPelotita();
       c2.correrLaPelotita();
        System.out.println("hola");
    }
    
    
    
}
