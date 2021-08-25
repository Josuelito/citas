
package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.text.SimpleDateFormat;

public class PacienteControl  implements ActionListener{
    vista.RegPacienteInternalFrame pacienteVista;
    Modelo.Paciente pacienteModelo;
    Modelo.GestorPaciente gestorPacienteModelo;
    
    public PacienteControl (vista.RegPacienteInternalFrame pacienteVista) throws SQLException
    {
        this.pacienteVista = pacienteVista;
        gestorPacienteModelo= new Modelo.GestorPaciente();
    }
    @Override
    public void actionPerformed(ActionEvent e) {
       if(e.getSource().equals(pacienteVista.RegistrarBtn))
       {
           String identificacion=pacienteVista.txt_identificacion.getText();
           String nombres=pacienteVista.txt_nombres.getText();
           String apellidos=pacienteVista.txt_apellidos.getText();
           SimpleDateFormat formato = new SimpleDateFormat ("yyyy-MM-dd");
           String fechaNacimiento=formato.format(pacienteVista.Dtd_fecha_nacimiento.getDate()); 
           
//linea corregida para el formato de la fecha
           
        //  String fechaNacimiento=formato.format(new java.util.Date()); 
          // fechaNacimiento=formato.format(pacienteVista.FechaNacimientoDtc.getDate());
           String sexo=null;
           
           if(pacienteVista.rdb_masculino.isSelected())
               sexo="M";
               else
               sexo="F";
           pacienteModelo=new Modelo.Paciente(identificacion,nombres, apellidos,fechaNacimiento, sexo);
           gestorPacienteModelo.registrarPaciente (pacienteModelo);
       }
       if(e.getSource().equals(pacienteVista.NuevoBtn))
       {
           pacienteVista.txt_identificacion.setText(null);
           pacienteVista.txt_nombres.setText(null);
           pacienteVista.txt_apellidos.setText(null);
           pacienteVista.Dtd_fecha_nacimiento.setDate(null);
           pacienteVista.rdb_masculino.setSelected(false);
           pacienteVista.rdb_femenino.setSelected(false);
           pacienteVista.txt_identificacion.requestFocus();
            
       }
    }
}


