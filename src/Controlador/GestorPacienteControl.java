
package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.LinkedList;

public class GestorPacienteControl implements ActionListener{
    Modelo.GestorPaciente pacientesModelo;
        vista.ConsPacienteInternalFrame consultarPacienteVista;
        public GestorPacienteControl (vista.ConsPacienteInternalFrame consultarPacienteVista) throws SQLException
        {
            this.consultarPacienteVista=consultarPacienteVista;
            pacientesModelo=new Modelo.GestorPaciente();
       }
    @Override
    
    
    public void actionPerformed(ActionEvent e) 
    {
        String valor=consultarPacienteVista.txt_Valor.getText();
        int parametro=0;
        consultarPacienteVista.getTableModel().setRowCount (0);
        consultarPacienteVista.getTableModel().fireTableDataChanged();
        if (consultarPacienteVista.rbd_Identificacion.isSelected())
            parametro=1;
        if (consultarPacienteVista.rbd_Nombres.isSelected())
             parametro=2;
        if (consultarPacienteVista.rbd_Apellidos.isSelected())
             parametro=3;
        if (consultarPacienteVista.rbd_Sexo.isSelected())
             parametro=4;
        LinkedList<Modelo.Paciente> pacientes = pacientesModelo.getPacientesBy (parametro, valor);
        String registro[] = new String [5];
        for(Modelo.Paciente p:pacientes)
        {
        registro[0]=p.getIdentificacion();
        registro[1]=p.getNombres();
        registro[2]=p.getApellidos();
        registro[3]=p.getFechaNacimiento();
        registro[4]=p.getSexo();
        consultarPacienteVista.getTableModel().addRow (registro);
        consultarPacienteVista.getTableModel().fireTableDataChanged();
    }
  }

}
