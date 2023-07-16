/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.sql.DataSource;
import org.apache.commons.dbcp2.BasicDataSource;




public class Conexion {
    
    private static final String JDBC_URl="jdbc:mysql://localhost:3306/disqueria?useSSL=false&useTimeZone=true&serverTimeZone=UTC&allowPublicKeyRetrieval=true";
    private static final String JDBC_USR="root";
    private static final String JDBC_Pass="kevin";
    
    public static DataSource getDataSource(){
         try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace(System.out);
        }
       BasicDataSource ds=new BasicDataSource();
       ds.setUrl(JDBC_URl);
       ds.setUsername(JDBC_USR);
       ds.setPassword(JDBC_Pass);
       ds.setInitialSize(50);
       return ds;
       
       
       
    }
    
    
    public static Connection getConexion() throws SQLException{
        //class.forName("com.mysql.cj.jdbc.Driver");
        return getDataSource().getConnection();
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
