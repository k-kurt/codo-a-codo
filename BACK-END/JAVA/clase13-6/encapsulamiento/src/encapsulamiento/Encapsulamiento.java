/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package encapsulamiento;

/**
 *
 * @author genesis
 */
public class Encapsulamiento {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persona p=new Persona("kevin");
        Persona p2= new Persona("kurt", "sboboda", 26, "negro", false);
       
       p.setApellido("gimenez");
        System.out.println(p.getApellido());
    }
    
}
