/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejemplojdbc2;
import data.UsersDAO;
import java.util.*;
import model.Users;

/**
 *
 * @author genesis
 */
public class EjemploJDBC2 {

    public static void main(String[] args) {
        
        //tengo que tener una lista de usuarios donde guardar los users osea los registros que se iban guardando en la clase usersDAO
        //del metodo seleccionar
        List<Users> listaUsuariosBase=new ArrayList<>();
        UsersDAO usersDAO=new UsersDAO();
        
           Users usuario = new Users("Sabri","asd123",24,2);
//        
//        listaUsuariosBase = usersDAO.seleccionar();        
//        listaUsuariosBase.forEach(System.out::println);
//        
//        System.out.println("Usuarios agregados: "+ usersDAO.insertar(usuario));
//        System.out.println("--------------------------Base sin cambios--------------------------");
//        listaUsuariosBase = usersDAO.seleccionar();
//        listaUsuariosBase.forEach(System.out::println);
////            
////        
////        System.out.println("--------------------------Usuario modificado--------------------------");
        Users usuarioAMod = new Users(1,"Mariela","Leguizamon");
//        usersDAO.actualizar(usuarioAMod);
//        listaUsuariosBase = usersDAO.seleccionar();
//        listaUsuariosBase.forEach(System.out::println);
//       System.out.println("-------------------------Usuario borrado---------------------------");
//          usersDAO.eliminar(usuarioAMod);
////        
        listaUsuariosBase = usersDAO.seleccionar();
        listaUsuariosBase.forEach(System.out::println);
       usersDAO.bajaLogica(usuarioAMod);
        listaUsuariosBase = usersDAO.seleccionar();
        listaUsuariosBase.forEach(System.out::println);

//          System.out.println(usersDAO.seleccionarPorNombre("FAKE"));
        //usersDAO.actualizarNombre("CARLOS", "matias");
        //System.out.println("-------------------------Usuario modificado---------------------------");
        //listaUsuariosBase = usersDAO.seleccionar();
        //listaUsuariosBase.forEach(System.out::println);
        
        
        
    }
}
