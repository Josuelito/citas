package recurso;

import java.util.UUID;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MetodosSql {

    Conexion conector = new Conexion();
    Connection con = conector.getConnection();
    public static PreparedStatement sentencia;
    public static ResultSet resultado;
    public static String sql;
    public static int resultadonum = 0;

    public int guardar(
            String Nombres, String Apellidos, String Correo, String Contraseña) {
        int resultado = 0;
        Connection conecta = null;
        String identificacion = UUID.randomUUID().toString();
        String senteciaguardar = ("INSERT INTO usuarios(usuId, usuNombres, usuApellidos, usuCorreo, usuContraseña) VALUES (?,?,?,?,?)");

        try {
            PreparedStatement pps = con.prepareStatement(senteciaguardar);
            pps.setString(1, identificacion);
            pps.setString(2, Nombres);
            pps.setString(3, Apellidos);
            pps.setString(4, Correo);
            pps.setString(5, Contraseña);

            resultado = pps.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(MetodosSql.class.getName()).log(Level.SEVERE, null, ex);
        }
        return resultado;
    }

    public static String buscarnombre(String Correo) {
        String busquedanombre = null;

        try {
            Conexion conecta = new Conexion();
            Connection con = conecta.getConnection();
            String sentaciabuscar = ("SELECT usuNombres, usuApellidos FROM usuarios WHERE usuCorreo ='" + Correo + "'");
            PreparedStatement pps = con.prepareStatement(sentaciabuscar);
            resultado = pps.executeQuery();
            if (resultado.next()) {
                String Nombres = resultado.getString("usuNombres");
                String Apellidos = resultado.getString("usuApellidos");
                busquedanombre = (Nombres + " " + Apellidos);
            }

        } catch (SQLException ex) {
            Logger.getLogger(MetodosSql.class.getName()).log(Level.SEVERE, null, ex);
        }
        return busquedanombre;
    }

    public static String buscarusuarioregistrado(String Correo, String Contraseña) {
        Conexion conector = new Conexion();
        Connection con = conector.getConnection();
        String busquedausuario = null;
        String senteciabuscarusuario = ("SELECT usuId, usuNombres, usuApellidos, usuCorreo, usuContraseña FROM usuarios WHERE usuCorreo = '" + Correo + "' && usuContraseña = '" + Contraseña + "'");

        try {
            PreparedStatement pps = con.prepareStatement(senteciabuscarusuario);
            resultado = pps.executeQuery();
            if (resultado.next()) {
                busquedausuario = "Usuario encontrado";
            } else {
                busquedausuario = "Usuario no encontrado";
            }

        } catch (SQLException ex) {
            Logger.getLogger(MetodosSql.class.getName()).log(Level.SEVERE, null, ex);
        }

        return busquedausuario;
    }
    
    

}
