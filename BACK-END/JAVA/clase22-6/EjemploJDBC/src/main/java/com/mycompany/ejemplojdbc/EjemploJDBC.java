/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejemplojdbc;

import java.sql.*;

/**
 *
 * @author genesis
 */
public class EjemploJDBC {

    public static void main(String[] args) {
        
        String url="jdbc:mysql://localhost:3306/codoacodo_com_23046?useSSL=false&useTimeZone=true&serverTimeZone=UTC&allowPublicKeyRetrieval=true";
        try{
            //class.forName("com.mysql.cj.jdbc.Driver");
            Connection conexion=DriverManager.getConnection(url,"root","kevin");//estableciendo la coneccion con la base de datos
            Statement sentencia=conexion.createStatement();//sentencia para guardar la conexion,crea una sentenica, una conexion, hacia la tabla de la base de datos
            String sql="SELECT * FROM usuarios";
            //siempre que hagamos una consulta de select, el resultado va a ser un ResulSet, puede avelgar un registro o varios en formato objeto
            ResultSet resultado= sentencia.executeQuery(sql);//es un tipo de coleccion
            while(resultado.next()){//mientras haya un siguiente resultado,hace tal cosa
            //esto significa que si me consulta trae mas de un registro,voy a traer por cada vuelta del while, cada uno de esos registros
            //el next pregunta si hay un siguiente registro
            System.out.println("-----------------------------");
            System.out.println("Id usuarios: "+resultado.getInt(1));
            System.out.println("Nombre: "+resultado.getString("nombre"));
            System.out.println("Apellido: "+resultado.getString("apellido"));
            System.out.println("-----------------------------");
            
            
          //son 2 formas de las otras que hay, donde indicamos el numero de columna o el nombre si la conocemos
          
          
        }
            //hay que cerrarlos por que cada uno de ellos realiza una apertura de buffer de datos
            //es decir mantiene viva una conexion con la bade de datos, si no cerrarmos va a seguir viva hasta que apagamos la pc
            resultado.close();
            sentencia.close();
            conexion.close();
        }catch(SQLException ex){
            
            ex.printStackTrace(System.out);
            
        }
        
        
        
        
        
    }
}
