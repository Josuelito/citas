
package recurso;

import java.sql.*;

import javax.swing.JOptionPane;

public class Conexion {
    private static Connection conn;
    private static final String driver = "com.mysql.cj.jdbc.Driver";
    private static final String user = "root";
    private static final String password = "";
    private static final String url = "jdbc:mysql://localhost:3306/Proyecto";
    
   PreparedStatement ps;
   ResultSet rs;
 
    public Conexion(){
       conn = null;
       try  {
           Class.forName(driver);
           conn = DriverManager.getConnection(url, user, password);
           if(conn != null){
         //  System.out.println("Conexion Eestablecida");
           }
   
       }catch(ClassNotFoundException | SQLException e){
           
          JOptionPane.showMessageDialog(null,"Error de Conexion" + e);
           //System.out.println("Error de Conexion" + e);
       }
    }
    
public Connection getConnection(){return conn;}
    
public void desconectar(){conn=null;
if(conn == null){
   JOptionPane.showMessageDialog(null ,"Conexion Terminada");
  //  System.out.println("Conexion Terminada");

}}



    void close() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}