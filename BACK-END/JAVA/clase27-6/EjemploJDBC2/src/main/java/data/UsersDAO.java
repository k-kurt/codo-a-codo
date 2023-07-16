/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;


import static data.Conexion.*;
import model.Users;
import java.sql.*;
import java.util.*;

/**
 *
 * @author genesis
 */
public class UsersDAO {
    
    private static final String SQL_SELECT="SELECT * FROM usuarios WHERE baja=0";
    private static final  String SQL_SELECT_BY_NAME="SELECT id, nombre, apellido, edad, tiene_hijos, baja FROM usuarios WHERE nombre=?";
    
    private static final String SQL_INSERT="INSERT INTO usuarios(nombre, apellido, edad, tiene_hijos, baja) VALUES(?, ?, ?, ?, ?)";
    //como el id es autoincremental , no lo agregamos
    
    
    private static final String SQL_UPDATE="UPDATE usuarios SET nombre=?, apellido=? WHERE id=?";
    
    private static final String SQL_LOGIC_DELETE="UPDATE usuarios set baja = ? WHERE id= ?";
    private static final String SQL_DELETE="DELETE FROM usuarios WHERE id= ?";
    
    
    public List<Users> seleccionar(){
        Connection conn=null;
        PreparedStatement stmt=null;
        ResultSet rs=null;
        Users user=null;
        List<Users> usuarios=new ArrayList();
        
        try {
            conn=getConexion();
            stmt=conn.prepareStatement(SQL_SELECT);
            rs=stmt.executeQuery();
            while (rs.next()) {
            int id=rs.getInt(1);
            String nombre=rs.getNString("nombre");
            String apellido=rs.getString("apellido");
            int edad=rs.getInt("edad");
            int tiene_hijos=rs.getInt("tiene_hijos");
            
            
            user=new Users(id,nombre,apellido,edad,tiene_hijos);
            usuarios.add(user);
                
            }
        } catch (ClassNotFoundException | SQLException ex) {
            ex.printStackTrace(System.out);
        }finally{
                try{
                close(rs);
                close(stmt);
                close(conn);
                }catch (SQLException ex){
                ex.printStackTrace(System.out);
                }
                }
        
        return usuarios;
    }
    
    
    
    
    //no hay un resultSet por que no es necesario, no hay un select
    public int insertar(Users user){//le decimos que reciba un usuario, que tiene cargado los elementos a modificar, en le main instanciaos el users
        Connection conn = null;
        PreparedStatement stmt = null;
        //lo unico que devuelve es la cantidad de registros modificados
        int registros = 0;
        try {
            conn = getConexion();
            stmt = conn.prepareStatement(SQL_INSERT);
            stmt.setString(1, user.getNombre());
            stmt.setString(2, user.getApellido());
            stmt.setInt(3, user.getEdad());
            stmt.setInt(4, user.getTieneHijos());
            stmt.setBoolean(5,false);
            registros = stmt.executeUpdate();
        } catch (ClassNotFoundException | SQLException ex) {
            ex.printStackTrace(System.out);
        }
        finally{
            try {
                close(stmt);
                close(conn);
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
        }
        return registros;
    }
    
    public int actualizar(Users user){
        Connection conn = null;
        PreparedStatement stmt = null;
        int registros = 0;
        try {
            conn = getConexion();
            stmt = conn.prepareStatement(SQL_UPDATE);
            stmt.setString(1, user.getNombre());
            stmt.setString(2, user.getApellido());
            stmt.setInt(3, user.getId());
            registros = stmt.executeUpdate();
        } catch (ClassNotFoundException | SQLException ex) {
            ex.printStackTrace(System.out);
        }
        finally{
            try {
                close(stmt);
                close(conn);
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
        }
        return registros;
    }
    
    public int actualizarNombre(String username,String newname){
        Connection conn = null;
        PreparedStatement stmt = null;
        int registros = 0;
        Users user = seleccionarPorNombre(username);
        user.setNombre(newname);
        try {
            conn = getConexion();
            stmt = conn.prepareStatement(SQL_UPDATE);
            stmt.setString(1, user.getNombre());
            stmt.setString(2, user.getApellido());
            stmt.setInt(3, user.getId());
            registros = stmt.executeUpdate();
        } catch (ClassNotFoundException | SQLException ex) {
            ex.printStackTrace(System.out);
        }
        finally{
            try {
                close(stmt);
                close(conn);
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
        }
        return registros;
    }
    
     public int eliminar(Users user){
        Connection conn = null;
        PreparedStatement stmt = null;
        int registros = 0;
        try {
            conn = getConexion();
            
            stmt = conn.prepareStatement(SQL_DELETE);
            stmt.setInt(1, user.getId());
            
            registros = stmt.executeUpdate();
        } catch (ClassNotFoundException | SQLException ex) {
            ex.printStackTrace(System.out);
        }
        finally{
            try {
                close(stmt);
                close(conn);
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
        }
        return registros;
    }
     
    public Users seleccionarPorNombre(String nombre) {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Users user = null;

        try {
            conn = getConexion();
            stmt = conn.prepareStatement(SQL_SELECT_BY_NAME);
            stmt.setString(1, nombre);
            rs = stmt.executeQuery();
            
            while (rs.next()) {
                int id = rs.getInt("id");
                String nombre2 = rs.getString("nombre");
                String apellido = rs.getString("apellido");
                boolean baja = rs.getBoolean("baja");

                user = new Users(id, nombre2, apellido,baja);

                //usuarios.add(user);
            }
        } catch (ClassNotFoundException | SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            try {
                close(rs);
                close(stmt);
                close(conn);
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
        }

        return user;
    }
    
     public int bajaLogica(Users user){
        Connection conn = null;
        PreparedStatement stmt = null;
        int registros = 0;
        try {
            conn = getConexion();
            stmt = conn.prepareStatement(SQL_LOGIC_DELETE);
            stmt.setBoolean(1, true);
            stmt.setInt(2, user.getId());
            registros = stmt.executeUpdate();
        } catch (ClassNotFoundException | SQLException ex) {
            ex.printStackTrace(System.out);
        }
        finally{
            try {
                close(stmt);
                close(conn);
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
        }
        return registros;
    }
    
    
    
    
}
