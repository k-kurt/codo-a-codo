/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

import static data.Conexion.close;
import static data.Conexion.getConexion;
import java.sql.*;
import java.util.*;
import model.Discos;


public class DiscosDAO {
    
    private static final String SQL_SELECT="SELECT * FROM discos";
    private static final String SQL_SELECT_BY_ID="SELECT * FROM discos WHERE id=?";
    private static final String SQL_INSERT="INSERT INTO discos(nombre, autor, cantCanciones, precio, copias) VALUES(?,?,?,?,?)";
    private static final String SQL_UPDATE="UPDATE discos SET nombre=?, autor=?, cantCanciones=?, precio=?, copias=? WHERE id=?";
    private static final  String SQL_DELETE="DELETE FROM discos WHERE id=?";
    
    
    
    public List<Discos> seleccionar(){
        
        Connection conn=null;
        PreparedStatement stmt=null;
        ResultSet rs=null;
        Discos disco=null;
        List<Discos> discos=new ArrayList();
        
        
        try{
            conn=getConexion();
            stmt=conn.prepareStatement(SQL_SELECT);
            rs=stmt.executeQuery();
            
            while(rs.next()){
                int id=rs.getInt(1);
                String nombre=rs.getString("nombre");
                String autor=rs.getNString("autor");
                int cantCanciones=rs.getInt("cantCanciones");
                double precio=rs.getDouble("precio");
                int copias = rs.getInt("copias");
                
                disco=new Discos(id,nombre,autor,cantCanciones,precio,copias);
                
                discos.add(disco);
            }
        }catch(SQLException ex){
            ex.printStackTrace(System.out);
        }finally{
            try{
                close(rs);
                close(stmt);
                close(conn);
            }catch(SQLException ex){
                ex.printStackTrace(System.out);
            }
        }
        
        return discos;
        
    }
    
    
    public int insertar(Discos disco){
        Connection conn = null; 
        PreparedStatement stmt = null;
        
        int registrosMod = 0;
        try {
            conn = getConexion();
            stmt = conn.prepareStatement(SQL_INSERT);
            stmt.setString(1, disco.getNombre());
            stmt.setString(2, disco.getAutor());
            stmt.setInt(3, disco.getCantCanciones());
            stmt.setDouble(4, disco.getPrecio());
            stmt.setInt(5,disco.getCopias());
            registrosMod = stmt.executeUpdate();
        } catch (SQLException ex) {
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
        return registrosMod;
    }
    
    
    public int actualizar(Discos disco){
        Connection conn = null;
        PreparedStatement stmt = null;
        int registrosMod = 0;
        
        try{
            conn = getConexion();
            stmt = conn.prepareStatement(SQL_UPDATE);
            stmt.setString(1, disco.getNombre());
            stmt.setString(2,disco.getAutor());
            stmt.setInt(3, disco.getCantCanciones());
            stmt.setDouble(4, disco.getPrecio());
            stmt.setInt(5, disco.getCopias());
            stmt.setInt(6,disco.getId());
            
            registrosMod = stmt.executeUpdate();
            
        }catch(SQLException ex){
            ex.printStackTrace(System.out);
        }finally{
            try{
                close(stmt);
                close(conn);
            }catch(SQLException ex){
                ex.printStackTrace(System.out);
            }
        }
        
        return registrosMod;
    }
    
    public int eliminar(int id){
        Connection conn = null;
        PreparedStatement stmt = null;
        int registrosMod = 0;
        
        try{
            conn = getConexion();
            stmt = conn.prepareStatement(SQL_DELETE);
            stmt.setInt(1, id);
            
            registrosMod = stmt.executeUpdate();
            
        }catch(SQLException ex){
            ex.printStackTrace(System.out);
        }finally{
            try{
                close(stmt);
                close(conn);
            }catch(SQLException ex){
                ex.printStackTrace(System.out);
            }
        }
        
        return registrosMod;
    }
     
    public Discos seleccionarPorId(int id){
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Discos disco = null;
        
        try{
            conn = getConexion();
            stmt = conn.prepareStatement(SQL_SELECT_BY_ID);
            stmt.setInt(1, id);
            rs = stmt.executeQuery();
            
            while(rs.next()){
                int idlibro = rs.getInt(1);
                String nombre= rs.getString("nombre");
                String autor = rs.getString("autor");
                int cantCanciones = rs.getInt("cantCanciones");
                double precio = rs.getDouble("precio");
                int copias = rs.getInt("copias");
                
                disco = new Discos(idlibro,nombre,autor,cantCanciones,precio,copias);
            }
        }catch(SQLException ex){
            ex.printStackTrace(System.out);
        }finally{
            try{
                close(rs);
                close(stmt);
                close(conn);
            }catch(SQLException ex){
                ex.printStackTrace(System.out);
            }
        }
        
        return disco;
    }
     
     
     
}
