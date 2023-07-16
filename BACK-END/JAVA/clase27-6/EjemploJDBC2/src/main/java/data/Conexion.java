/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

import java.sql.*;

/**
 *
 * @author genesis
 */
public class Conexion {
    
    private static final String JDBC_URl="jdbc:mysql://localhost:3306/codoacodo_com_23046?useSSL=false&useTimeZone=true&serverTimeZone=UTC&allowPublicKeyRetrieval=true";
    private static final String JDBC_USR="root";
    private static final String JDBC_Pass="kevin";
    
    public static Connection getConexion() throws SQLException, ClassNotFoundException{
        
        Class.forName("com.mysql.cj.jdbc.Driver");
        return DriverManager.getConnection(JDBC_URl,JDBC_USR,JDBC_Pass);
    }
    
    
    public static void close(ResultSet rs) throws SQLException{
        rs.close();
    }
    
    public static void close(Statement st) throws SQLException{
        st.close();
    }
    
    public static void close(Connection en) throws SQLException{
        en.close();
    }
    
}
