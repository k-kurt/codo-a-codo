/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package colecciones;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author genesis
 */
public class Colecciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Perro p = new Perro("sofi", true, "blanco");

        Perro p2 = new Perro("huesito", true, "negro");

        Perro p3 = new Perro("hueso", true, "blanco");
        System.out.println(p.toString());

        ArrayList<Perro> arrayDePerros = new ArrayList();

        arrayDePerros.add(p);
        arrayDePerros.add(p2);
        arrayDePerros.add(p3);

        //mostrar los elementos de un array
//        for(int i=0;i<arrayDePerros.size();i++){
//            System.out.println(arrayDePerros.get(i));
//        }
//        
//           //mostrar solo nombre
//        for(int i=0;i<arrayDePerros.size();i++){
//            System.out.println(arrayDePerros.get(i).getNombre());
//        }
        //funcion landa
//        arrayDePerros.forEach(h ->{
//            System.out.println(h);
//        });
        //otra forma, no se puede mostrar los parametros por separado
//        arrayDePerros.forEach(System.out::println);
//        
//        
//         HashMap <Integer, String> mapDePalabras=new HashMap();
//         
//         mapDePalabras.put(0, "h");
//         mapDePalabras.put(1, "o");
//         mapDePalabras.put(2, "l");
//         mapDePalabras.put(3, "a");
//         //forEach convencional
//         for(Perro perro: arrayDePerros){
//             System.out.println(perro);
//         }
//         for(int i=0;i<mapDePalabras.size();i++){
//             System.out.println(mapDePalabras.get(i));
//         }
//         
//         //por cada elemento tenemos un k(id), value, este tipo de hasmap no dependeria de un subindice
//         mapDePalabras.forEach((k,v)-> System.out.println(k+" "+v));
        //foreach especial
//         a este entry(asi se llaman, no elementos) lo llamamos entry y lo obtenemos del mapDePalabras
//         la primera parte deciemos en donde lo guardamos y la otra parte de donde lo sacamos
//         practicamente es lo mismo que lo de arriba, tampoco depene de subindice
//          for(Map.Entry<Integer,String> entry:mapDePalabras.entrySet()){
//              System.out.println("key: "+entry.getKey()+" , value: "+entry.getValue());
//          }
        //automatizacion de creacion de objectos por consola
        Scanner sc_menu = new Scanner(System.in);
        Scanner sc_nombre = new Scanner(System.in);
        Scanner sc_vacunas = new Scanner(System.in);
        Scanner sc_color = new Scanner(System.in);

        System.out.println("Hola, usted se encuentra em el sistema de carga de datos de perritos abandonados");
        System.out.println("1-Guardar Perrito.");
        System.out.println("2-Borrar Perrito.");
        System.out.println("3-Modificar Perrito.");
        System.out.println("4-Mostrar Perrito");
        System.out.println("5-Salir.");

        System.out.println("Ingrese la opcion deseadas numerica.");
        int menu = sc_menu.nextInt();
        while (menu != 5) {

            switch (menu) {
                case 1:

                    System.out.println("Ingrese su nombre");
                    String nombre = sc_nombre.nextLine();

                    System.out.println("Ingerese su color de pelo");
                    String color = sc_color.nextLine();

                    System.out.println("Ingrese \"Si\" si esta vacunado y \"no\" si no lo esta");
                    String vacunas = sc_vacunas.nextLine();
                    boolean SitieneVac = false;
                    if (vacunas.equalsIgnoreCase("Si")) {
                        SitieneVac = true;
                    } else {
                        SitieneVac = false;
                    }

                    arrayDePerros.add(new Perro(nombre, SitieneVac, color));

                    break;
                case 2:
                    System.out.println("borrar Perrito");
                    break;
                case 3:
                    System.out.println("Modificar Perrito");
                    break;
                case 4:
                    arrayDePerros.forEach(System.out::println);
                    break;
                default:
                    System.out.println("Ingrese la opcion correcta");
                    throw new AssertionError();
            }

            System.out.println("--------------------------------------");
            System.out.println("Vuelva a seleccionar una opcion");
            System.out.println("1-Guardar Perrito.");
            System.out.println("2-Borrar Perrito.");
            System.out.println("3-Modificar Perrito.");
            System.out.println("4-Mostrar Perrito");
            System.out.println("5-Salir.");

            menu = sc_menu.nextInt();

        }

    }

}
