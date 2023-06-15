/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package encapsulamiento;

/**
 *
 * @author genesis
 */
public class Persona {
    //ATRIBUTOS
    private String nombre;
    private String apellido;
    private int edad;
    private String colorDePelo;
    private boolean tieneHijos;


    //CONSTRUCTOR
    //Inicializa las variables de instancia 
    public Persona(){
        
    }
    
    public Persona(String nombre){
        this.nombre=nombre;
    }
    
    
    public Persona(String nombre, String apellido, int edad, String color, boolean tieneHijos){
        //el this hace referencia al atributo de la clase y le asignamos el valor de la variable pasado en el constructor
        this.nombre=nombre;
        this.apellido=apellido;
        this.edad=edad;
        colorDePelo=color;
      this.tieneHijos=tieneHijos;
    }
    
    //metodos
    //los metodos son iguales que las funciones
    //un metodo pertenece a una clase y una funcion puede estar en cualquier lado
    
    public void correr(){
        System.out.println("Estoy corriendo... y me llamo "+ nombre);
    } 
    
    public String getNombre(){
        return nombre;
    }
    
    public void setnombre(String nombre){
        this.nombre=nombre;
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

    public String getColorDePelo() {
        return colorDePelo;
    }

    public void setColorDePelo(String colorDePelo) {
        this.colorDePelo = colorDePelo;
    }

    public boolean isTieneHijos() {
        return tieneHijos;
    }

    public void setTieneHijos(boolean tieneHijos) {
        this.tieneHijos = tieneHijos;
    }
    
    
}


